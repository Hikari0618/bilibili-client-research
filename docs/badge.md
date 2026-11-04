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

## 6. 未确认

- `BadgeEvent` 的完整枚举（Refresh / Clear 之外是否还有别的分支）未展开。
- `h` / `i` 两个 StateFlow 的具体语义（哪个是系统通知、哪个是花火）未逐行确认。
- `bffSwitch`（`p078n70.a.a()`）对应的服务端开关名未追。
