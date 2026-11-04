# 首页消息角标：数据源与刷新机制

样本：`com.bilibili.app.in` 6.5.0（classes13）。
核心类：`com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore`、`com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore`。

---

## 0. 结论

角标**不是轮询出来的**，是事件驱动 + 长连接推送。两个独立的数据源各管一半：

| 数据源 | 管什么 | 协议 | 存储 |
|---|---|---|---|
| `IMBadgeUnreadDataStore` | 私信未读总数 | MOSS gRPC `KimMoss.getTotalUnread` | `StateFlow g/h/i` |
| `UnreadCountDataStore` | 消息中心：回复 / @ / 点赞 / 通知 | MOSS gRPC `GetTotalUnreadReq`（im-moss） | `StateFlow c/d/e` |

UI 只是 collect 这两个 StateFlow，没有自己算。

---

## 1. 私信角标：IMBadgeUnreadDataStore

### 1.1 拉取

```java
// IMBadgeUnreadDataStore.java:566-653  refreshBadge()
if (restrictedMode) { log("Restricted mode, no request needed"); return; }   // 青少年模式
if (!loggedIn)      { log("Not login, no request needed"); return; }         // 未登录

KimMoss moss = new KimMoss(null, 1, null);
b1 resp = moss.getTotalUnread(new c1());          // gRPC
if (resp is success) {
    log("Updating badge: " + resp);
    g.value = c(resp.getTotal());                 // StateFlow 更新
} else {
    log("Fail to refresh im unread badge");
}
```

### 1.2 显示规则

```java
// c(e3 total)  : 677-689
KUnreadStyle.DOT    → RedPoint(1)
KUnreadStyle.NUMBER → Number(total)
其他                → None
```

服务端直接下发"用红点还是用数字"，客户端不自己判断。

### 1.3 触发时机

四个事件源，通过 `gripper` 的 Producer 注册（`SingletonUnreadEventRegisterKt`）：

| 事件 | 注册方法 | 行为 |
|---|---|---|
| App 回前台 | `registerForegroundNotifier` | `BadgeEvent.Refresh` |
| 账号切换/登录 | `registerAccountNotifier` | 登录 → Refresh；登出 → Clear |
| 广播 | `registerBroadcastNotifier` | 视广播内容 |
| 青少年模式切换 | `registerRestrictedModeNotifier` | 进入 → Clear；退出 → Refresh |
| IM 长连接推送 | socket 事件（SingleUnRead / MyGroupUnread） | 更新对应 StateFlow |

### 1.4 频率控制（关键）

```java
// IMBadgeUnreadDataStore.java:524-556  static {}
boolean freqCtrl = DeviceDecision.getBoolean("im.socket_login_request_switch", true);
Duration window = Duration(DeviceDecision.dd(
        "im.socket_login_request_threshold_duration_seconds", "5"), SECONDS);

d = MutableSharedFlow(replay = 1, extraBufferCapacity = 0,
                      onBufferOverflow = DROP_LATEST);
if (freqCtrl) d = d.throttleLatest(window);     // 5 秒内只放行一次
e = d.onEach { log("Fire refresh event: " + it) };
```

也就是说：**socket 连着推 20 条未读，客户端 5 秒内最多打一次 `getTotalUnread`**。

另外还有进程/开关门槛：

```java
if (!isMainProcess) return;      // 只在主进程工作
if (!bffSwitch) return;          // BFF 开关关闭则整个新角标不启用
```

---

## 2. 消息中心角标：UnreadCountDataStore

### 2.1 拉取

```java
// p101r70/n.java:5
GetTotalUnreadReq req = GetTotalUnreadReq.newBuilder()
        .setUnreadType(type)          // 0/1
        .setShowUnfollowList(z ? 1 : 0)
        .setShowDustbin(z2 ? 1 : 0)
        .build();
bplus.im.pblink.g.a("im-moss", new Df.d(req, 8));   // MOSS 调用
```

返回 `SysNotificationUnreadCount`：

```
replyCount, atCount, likeCount, notifyCount,
messageCount, huahuoCount, recvReply, recvLike, newFollow, notifyStyle
```

### 2.2 去重与刷新

```java
// UnreadCountDataStore.java:60-73  e()
if (PerformanceConfigKey.NET_REQUEST_OPT) { log("skip for net opt"); return; }
if (b) return;          // 已有请求在飞，直接丢弃
b = true;
n.a(type, !h(), false).subscribe(new a());   // a() 里把 b 复位
```

只有一个 `b` 布尔做 in-flight 去重，没有节流窗口。

### 2.3 触发时机

调用 `UnreadCountDataStore.e()` 的地方：

- `p078n70/c.java:81` — 启动/前台
- `com/bilibili/bplus/im/service/b.java:106` — IM 服务就绪
- `d0.java:138` — 账号状态变化
- `HomeCommunicationFragment.java:370` — 进入消息页
- `BaseConversationListFragment.java:256` — 会话列表加载
- `IMTopHint.java:24` / `CommunicationUnreadCountHelper.java:333` — 顶部提示/未读助手

### 2.4 单类已读清零

```java
// UnreadCountDataStore.java:75-79  c(int type)
1=回复 2=@ 3=点赞 4=通知 → 对应计数清零，其余保持不变
```

标记已读时**本地先清零**，不等服务端回包，属于乐观更新。

---

## 3. 从数据到角标

```
事件（前台/账号/广播/青少年/socket）
      │
      ├─→ IMBadgeUnreadDataStore.d (SharedFlow, replay=1, DROP_LATEST)
      │        └─ throttleLatest(5s) → refreshBadge() → KimMoss.getTotalUnread
      │                                                  └→ StateFlow g/h/i
      │
      └─→ UnreadCountDataStore.e() → GetTotalUnreadReq (im-moss)
                                     └→ StateFlow c/d/e

UI: collect(g / c) → 数字或红点
```

`IMGetUnReadServiceImplKt.syncImBadgeToLive` 还把 IM 未读同步给直播模块（广播 action `liveIM`，extra `unreadnum`）。

---

## 3.1 数字到底怎么算：服务端算好，客户端不累加

这一点容易误解。客户端**没有**把「回复 + @ + 点赞 + 通知」加起来，也没有把私信和消息中心相加。

```java
// UnreadCountDataStore.a.onNext  (UnreadCountDataStore.java:87-101)
e.value = kVar.d;          // 服务端响应里直接给一个 a(count, displayType)
c.value = kVar.a;          // 分类明细，只用于分栏显示，不参与总数
```

- `k.d` = 服务端算好的**总数 + 显示形式**
- `k.a` = `SysNotificationUnreadCount` 分类计数（回复/@/点赞/通知…），只给消息中心内部用

私信那一半同理：`KimMoss.getTotalUnread` 返回 `total` + `KUnreadStyle`，客户端直接用。

客户端唯一做的一次「计算」是隐藏逻辑：

```java
// CommunicationUnreadCountHelper$1$2  (combine 的最后一个参数是 hidden 标志)
if (hidden) return new a(count, UnreadCountDisplayType.None);   // 数字还在，但不显示
return a;                                                        // 原样透传
```

## 3.2 首页那个入口的角标：G0.a()

```java
// com.bilibili.bplus.im.communication.G0.a  (G0.java:19-45)
G0.b = 0; G0.c = false;

if (im 被屏蔽 || 青少年模式 LESSONS) return 无;          // 直接不显示
if (!用户开启消息通知)              return 无;          // isMsgNotify() == false

if (displayType == Number) {
    G0.b = count;                                       // 记住数字
    return dh0.a.a(count, LOCAL_MESSAGE_TYPE, 2);       // 数字角标
}
if (displayType == RedPoint) {
    G0.c = true;
    return dh0.a.b();                                   // 红点
}
return 无;
```

所以同一个 count，可能显示成数字、红点、或完全不显示，取决于：

1. 服务端下发的 `displayType`
2. 用户是否开了消息通知
3. 是否青少年模式 / 该入口是否被屏蔽

## 3.3 点进去再退出来，发生了什么

| 动作 | 发生什么 | 依据 |
|---|---|---|
| 进入消息页 | `onResume()` → `UnreadCountDataStore.e()` **重新拉一次**，不清零 | `HomeCommunicationFragment.java:347-370` |
| 读了某个会话 | `conversation.markRead()`：本地会话未读清零 + 通知服务端 | 同上 `:474`、`:590` |
| 点「一键已读」 | gRPC `UpdateUnreadScope.All` → 成功后 `UnreadCountDataStore.b()` 本地全部清零 | 同上 `:443`、`:460` |
| 退出回首页 | 没有「退出时重算」的特殊逻辑；StateFlow 一直是最新的 | — |
| 期间来新消息 | socket 推送 → `onNewSingleMsgUnreadEvent` → `a(false)` 重新拉取 | `CommunicationUnreadCountHelper.java:348-355` |

**结论**：进入页面本身不会让角标消失。只有真正读掉（单会话或一键已读）才会清零。
清零是**先本地、后服务端**（一键已读是先服务端成功后本地清零；单会话是本地先清）。

如果看到「点进去角标没了、退出来又回来」，说明本地清了但服务端没同步成功，下次 `onResume` 拉取又把数字带回来了。

## 3.4 两套实现，由开关切换

```java
// CommunicationUnreadCountHelper static {}  (CommunicationUnreadCountHelper.java:288-293)
if (p078n70.a.a()) {                 // BffSwitch
    log("BffSwitch is true, old badge will not work");
    return;                          // 老实现不启动
}
```

- 老实现：`CommunicationUnreadCountHelper` → `sendBadge()` → Handler 广播
- 新实现：`IMBadgeUnreadDataStore` → StateFlow

同一时间只有一套生效。

## 4. 和「轮询」的区别

- 没有固定间隔的 Timer / delay / repeat
- 冷启动、回前台、登录态变化各触发一次
- 长连接推送触发的刷新被 5 秒窗口合并
- 失败不重试，只打日志（`Fail to refresh im unread badge`）

---

## 5. 证据

| 内容 | 文件 | 行 |
|---|---|---|
| 私信角标刷新 | `evidence/classes/IMBadgeUnreadDataStore.java` | 566-653 |
| 显示规则 | 同上 | 677-689 |
| 节流配置 + 静态初始化 | 同上 | 524-556 |
| 事件源注册 | `evidence/classes/SingletonUnreadEventRegisterKt.java` | 75-181 |
| 消息中心拉取 | `evidence/classes/p101r70__n.java` | 5 |
| 消息中心 store | `evidence/classes/UnreadCountDataStore.java` | 41-79 |
| 同步到直播 | `evidence/classes/IMGetUnReadServiceImplKt.java` | 8-77 |
| 首页入口角标 | `evidence/classes/G0.java` | 19-45 |
| 总显示合成 / 隐藏 | `evidence/classes/CommunicationUnreadCountHelper.java` | 14-98, 288-355 |
| 消息页进入/退出 | `HomeCommunicationFragment.java` | 347-370, 443-475, 560-600 |

## 6. 未确认

- `BadgeEvent` 的完整枚举（Refresh / Clear 之外是否还有别的分支）未展开。
- `h` / `i` 两个 StateFlow 的具体语义（哪个是系统通知、哪个是花火）未逐行确认。
- `bffSwitch`（`p078n70.a.a()`）对应的服务端开关名未追。
