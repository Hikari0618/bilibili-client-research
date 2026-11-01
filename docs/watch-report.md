# B 站官方 Android 客户端「观看行为 → 推荐系统」上报机制

反编译分析报告 · 2026-11-01

分析对象：

| 文件 | 包名 | versionName / versionCode | minSdk / targetSdk |
|---|---|---|---|
| `哔哩哔哩HD_2.5.1.apk` | `tv.danmaku.bilibilihd` | 2.5.1 / 2051100 | 23 / 35 |
| `bilibili_6.5.0.apks` → `base.apk` | `com.bilibili.app.in` | 6.5.0 / 9110200 | 24 / 36 |

两个包内部类名完全一致（`tv.danmaku.biliplayerimpl.*`、`com.bilibili.pegasus.*`），是同一套代码的不同 flavor，可交叉验证。

---

## 0. 结论速览

1. **官方客户端根本不请求 `/x/click-interface/web/heartbeat`。** 这个字符串在两个 APK 的所有 dex 里都不存在（只在 H5 播放器 JS 里出现 `/x/click-interface/click/web/h5` 这类"点击"接口）。当前官方用的是三套接口：
   - `POST /x/report/click/android2` —— VV 点击（播放开始）
   - `POST /x/report/heartbeat/mobile` —— 心跳（开始 / 结束）
   - `POST /x/v2/history/report`（+ `/report_scene`、`/report_list`）—— **观看进度历史**
2. **「看过」的主信号是 `/x/v2/history/report`，不是心跳。** 心跳只承载 VV 与播放时长统计；推荐系统过滤已看，靠的是历史进度接口。
3. **官方心跳不是固定 30 秒轮询。** 老播放器只在「开始播放」发一次（所有累计字段清零），在「暂停 / 停止 / 切 P / seek」发一次（带累计值）；观看进度则走独立的 `/x/v2/history/report`，同样是**事件驱动**（`onPause` / 播放器可用性变化 / 离开页面 / 进后台），只用「进度变化 ≤1 秒不重复报」做去重，没有定时器。
4. **看 3 秒就退也会上报。** `onPause` 与「Leaving」路径都无条件调用上报，代码里没有任何最小时长门槛（只有"进度变化 ≤1 秒不重复报"的去重）。
5. **看完的判定是 `position + 5000ms >= duration`，此时 `progress` 上报为 `-1`。**
6. **首页推荐走 `/x/v2/feed/index`（app 协议），不是 wbi web 接口。** 参数里没有 `fresh_idx` / `feed_version` / `homepage_ver` / `brush` / `y_num`；翻页游标是 `idx` = 当前列表最后一张卡的 `idx` 值，不是页码。
7. **曝光上报走 InfoEyes 埋点**（`https://data.bilibili.com/log/mobile?android`），不是 JSON 接口；卡片可见比例默认 0.8 才计曝光。
8. **客户端本地不做"已看"过滤**，`pegasus`（首页推荐）模块里没有已看字段、没有已看过滤逻辑；feed 卡片模型 `BasicIndexItem` 也没有 `is_watched` / `progress` 字段。

---

## 1. 样本、方法与局限

### 1.1 工具链

- `jadx 1.5.6`（headless），按 dex 定向反编译：先用 `grep -a` 在 dex 里定位字符串，再只反编译命中 dex（单 dex 8–15 MB，几分钟出结果），避免全量 33/39 个 dex 的巨量输出。
- `androguard` 读 `AndroidManifest.xml` 取包名/版本。
- 直接读 APK 内 `assets/.../h5_common/wplayer.js`（官方 H5 播放器）。

### 1.2 加固情况

未发现梆梆 / 爱加密 / 腾讯御安全等壳。dex 可直接反编译，`libbili*.so` 只承担签名（`com.bilibili.nativelibrary.SignedQuery`），不影响 Java 层阅读。**未做脱壳**。

### 1.3 局限（重要）

- **没有做动态抓包**：当前环境无 adb、无连接设备，所有结论来自静态代码 + APK 内置 JS。服务端是否仍处理某些旧接口，静态分析无法证明。
- 两个样本分别是「HD 平板版」和「国际版」，不是大陆手机版 `tv.danmaku.bili`；但类名/接口/参数完全一致，且 HD 版与手机版同后端，可作为等价证据。
- 下文凡属推断的地方都会标注「推断」，未验证的标注「未确认」。

---

## 2. 上报时机（时间线）

### 2.1 官方客户端

| # | 用户操作 | 触发请求 | 关键参数 / 行为 | 证据 |
|---|---|---|---|---|
| 1 | 冷启动进首页 | `GET https://app.bilibili.com/x/v2/feed/index` | `idx=0`、`pull=true`、`open_event=cold`、`flush=0`、`login_event` | `com/bilibili/pegasus/request/c.java:11`；`OpenEvent.COLD("cold")` |
| 2 | 首页下拉刷新 / 上拉加载 | 同上 | 刷新：`pull=true` + `flush=6(PULL_DOWN)`；加载更多：`pull=false` + `idx=列表最后一张卡的idx` + `flush=8(PULL_UP)` | `PegasusViewModel.java:698`；`PegasusFlush.java` |
| 3 | 卡片进入可视区（≥80%） | InfoEyes 埋点 `POST https://data.bilibili.com/log/mobile?android` | 曝光事件（非 JSON feed 接口） | `ExposeComponent$onViewCreated$2.java:46-57`（`setExposeStartRatio` 默认 0.8）；`p530rp0/a.java` |
| 4 | 点击卡片 | InfoEyes 埋点 `tm.recommend.main-card.0.click` | spmid 体系 | `PE0/a.java:102`、`XE0/r.java:229` |
| 5 | 进详情页、播放器就绪 | `POST /x/v2/history/report`（**可能**，见 2.2） | `progress=0`、`duration`、`type=3`、`source=player-old`、`scene=front` | `TheseusHistoryService$runReport$2.java:353-356`（Availability 变化即上报） |
| 6 | 首帧播放开始（player state = 3） | ① `POST /x/report/click/android2`（VV）<br>② `POST /x/report/heartbeat/mobile`（START） | ① 见 §4.2<br>② `played_time=0`、`actual_played_time=0`、`total_time=0`、`start_ts=0`（**所有累计字段清零**） | `f.java:206`（state 分支）、`f.java:741 Z7()`、`f.java:643 V7(ctx,true)` |
| 7 | 播放中（前台） | **无固定心跳** | 老播放器不发；新播放器只在进度变化 >1s 时发历史 | `f.java` 全文无定时器；`b.java:135` 去重 |
| 8 | 暂停 | ① `/x/report/heartbeat/mobile`（END，带累计）<br>② `/x/v2/history/report` | `played_time`/`paused_time`/`actual_played_time` 累计值；`progress=当前位置` | `f.java:206` state 4 → `P7()`；`runReport$2.java:294-295` |
| 9 | 切 P / 换视频 | 先 END 再新 START | `T4()` → `X7()`（END）+ 新会话 | `VideosPlayDirectorService.java:604`；`f.java:683 X7()` |
| 10 | 拖动进度条（seek） | END 心跳 | `onPlayerStateChanged(7)` → `T4()` → `X7()` | `f.java:206`（`i == 7` 分支）、`f.java:683` |
| 11 | 退出详情页 | `/x/v2/history/report` | `progress=当前位置`、`scene=front` | `runReport$2.java:517-518`（"Leaving."） |
| 12 | 切到后台继续播 | `/x/v2/history/report_scene` | `report_scene=4`、`scene=background` | `runReport$2.java:433`（`a(4L)`）、`b.java:192` |
| 13 | 后台播放（可选） | `/x/v2/history/report` 定时 | 间隔 = 服务端配置 `videodetail.player_history_report_interval`（秒），**默认 "0" 即关闭** | `runReport$2.java:562-567` |
| 14 | 点「不感兴趣」 | `GET /x/feed/dislike` | 见 §4.4 | `com/bilibili/pegasus/api/y.java:19-60` |

### 2.2 关于「进详情页没播放会不会上报」

代码路径存在：`TheseusHistoryService` 在播放器 `PlayerAvailability` 变化时会调用 `a(Long.MIN_VALUE)` 立即上报（`runReport$2.java:353-356`）。但 `a()` 开头有一道保护：

```java
// com/bilibili/ship/theseus/united/player/history/b.java:96-99
com.bilibili.ship.theseus.united.player.history.b.a aVar = this.k;
if (aVar == null) {
    BLog.i("TheseusHistoryService", "State is null.");
    return;      // 媒体还没就绪 → 不上报
}
```

`this.k` 只有在拿到 `jVar.l().m()`（媒体时长/位置状态）后才被赋值。所以：

- **播放器已拿到媒体信息**（点开就能秒开的情况）→ 会在 `progress=0` 时写一条历史；
- **媒体信息还没回来就退出** → 不上报。

这条路径**没有运行验证**，属于代码推断。但可以确定的是：**官方并不要求"必须先按播放键"才写历史**，只要播放器就绪就会报。

### 2.3 对比：H5 播放器（APK 内置 `wplayer.js`）

官方 App 里的 H5 播放器（webview 场景）用的是另一套：

```js
// assets/.../h5_common/wplayer.js
this.store.effect(function(){
  n.store.state.videoEvents.firstPlayTime && !n.heartbeatTimer &&
  ( n.heartBeat(1),
    n.heartbeatTimer = window.setInterval(function(){ n.enableHeartBeat && n.heartBeat() }, 15e3) )
})
```

- **首帧立即发一次（`play_type=1`），之后每 15 秒一次**；
- 暂停发 `play_type=2`，续播发 `3`，退出/销毁发 `4`；
- 暂停时 `enableHeartBeat=false`，定时器空转但**不发请求**；
- 目标接口是 `POST /x/report/web/heartbeat`（**不是** `/x/click-interface/web/heartbeat`）。

---

## 3. 心跳接口规格

### 3.1 原生客户端：`POST https://api.bilibili.com/x/report/heartbeat/mobile`

`FormUrlEncoded`，`FieldMap` 直接展开 `HeartbeatParams`（继承 `ParamsMap`）。

接口定义：`tv/danmaku/biliplayerimpl/report/heartbeat/c.java:12-14`
参数构造：`.../heartbeat/HeartbeatParams.java:7-56`
调用点：`.../heartbeat/f.java:741 Z7()`（开始）、`f.java:683 X7()`（结束）

| 字段 | 类型 | 语义 | 首次(START) | 结束(END) | 示例 |
|---|---|---|---|---|---|
| `start_ts` | long | 会话开始时间（秒级 epoch）。构造时 = `now/1000` | **0** | 会话开始时间 | `1762000000` |
| `session` | string | 播放会话 id（UUID / 跨播放器共享时复用） | 有 | 有 | `a1b2c3d4-...` |
| `mid` | long | 用户 id | 有 | 有 | `12345678` |
| `aid` | long | 稿件 avid | 有 | 有 | `114514` |
| `cid` | long | 分 P cid | 有 | 有 | `22334455` |
| `sid` | string | 番剧 season id（UGC 为空/0） | 有 | 有 | `""` |
| `epid` | long | 番剧 ep id | 有 | 有 | `0` |
| `type` | string | 视频类型：`3`=UGC，`4`=番剧/OGV | 有 | 有 | `"3"` |
| `sub_type` | int | 子类型（0=普通） | 有 | 有 | `0` |
| `quality` | int | 清晰度 qn | 有 | 有 | `80` |
| `total_time` | long | 会话总时长（秒） | **0** | 累计 | `312` |
| `paused_time` | long | 暂停累计（秒） | **0** | 累计 | `18` |
| `played_time` | long | 播放态累计（秒，不含暂停） | **0** | 累计 | `294` |
| `video_duration` | long | 视频总时长（秒） | 有 | 有 | `600` |
| `play_type` | string | 播放方式标识（取 `Video.l`） | 有 | 有 | `"1"` |
| `network_type` | int | 1=WiFi，2=移动，3=免流 | 有 | 有 | `1` |
| `last_play_progress_time` | long | 本次起播的进度（秒） | **0** | 有 | `120` |
| `max_play_progress_time` | long | 本次会话最大进度（秒） | **0** | 有 | `430` |
| `from` | int | 跳转来源（默认 6） | 有 | 有 | `6` |
| `from_spmid` | string | 来源页 spmid | 有 | 有 | `tm.recommend.0.0` |
| `spmid` | string | 当前页 spmid | 有 | 有 | `main.videodetail.0.0` |
| `epid_status` | string | 番剧集状态 | 有 | 有 | `""` |
| `play_status` | string | 播放状态（取 `Video.n`） | 有 | 有 | `""` |
| `user_status` | string | `1`=有效大会员，否则 `0` | 有 | 有 | `"0"` |
| `actual_played_time` | long | **实际观看时长**（秒，按倍速加权：`+ Δ×播放倍率`） | **0** | 累计 | `588` |
| `auto_play` | int | 是否自动起播 | 有 | 有 | `1` |
| `list_play_time` | long | 列表连播累计（秒） | **0** | 累计 | `0` |
| `miniplayer_play_time` | long | 小窗播放累计（秒） | **0** | 累计 | `0` |
| `play_mode` | string | 播放模式（非空才带） | 可选 | 可选 | `"1"` |
| `cur_language` | string | 当前语言 | 有 | 有 | `"zh-Hans"` |
| `perfer_type` | string | 偏好类型 | 有 | 有 | `""` |
| `track_id` | string | 推荐 track id（与 feed 卡片同源） | 有 | 有 | `tm.recommend...` |
| `oaid` | string | OAID | 有 | 有 | `xxxx` |
| `polaris_action_id` | string | 埋点 action id | 有 | 有 | `xxxx` |
| `is_auto_qn` | string | `1`/`0` 是否自动清晰度 | 有 | 有 | `"0"` |
| `is_audio_play` | string | `1`=音频/后台播放，`2`=视频播放 | 有 | 有 | `"2"` |
| 其他 | map | `chronos` 实验参数，逐条平铺 | 可选 | 可选 | — |

> **注意字段名**：官方原生用的是 `actual_played_time`，**没有** `real_played_time`；`real_played_time` 是 H5/web 侧字段名（见 3.2）。你当前用的 `real_played_time` 属于 web 语义，不是 app 语义。

**首次清零逻辑**（`f.java:643 V7(ctx, boolean z)`，`z=true` 表示 START）：

```java
long mServerTime      = z ? 0L : ctx.getMServerTime();
long mTotalTime       = z ? 0L : ctx.getMTotalTime();
long mPausedTime      = z ? 0L : ctx.getMPausedTime();
long mPlayedTime      = z ? 0L : ctx.getMPlayedTime();
long mLastProcessTime = z ? 0L : ctx.getMLastProcessTime();
long mMaxPlayProgress = z ? 0L : ctx.getMMaxPlayProgressTime();
long mActualPlayed    = z ? 0L : ctx.getMActualPlayedTime();
long mListPlayTime    = z ? 0L : ctx.getMListPlayTime();
long mMiniPlayTime    = z ? 0L : ctx.getMMiniPlayTime();
```

**倍速加权**（`f.java:547-560 S7()`）：

```java
long mLastActionMills = now - ctx.getMLastActionMills();
ctx.setMPlayedTime(ctx.getMPlayedTime() + mLastActionMills);
ctx.setMActualPlayedTime(ctx.getMActualPlayedTime() + (long)(mLastActionMills * this.h)); // h = 播放倍率
```

也就是说 2 倍速看 10 分钟：`played_time=600`，`actual_played_time=1200`。

**失败重试**：END 心跳失败会把整个 `ReportContext` 序列化成 JSON 落盘（`HeartBeatCacheManager`），下次启动时由 `b.c` 这个 Runnable 重发（`b.java:64-77`、`a.java`）。

### 3.2 H5 / web 播放器：`POST https://api.bilibili.com/x/report/web/heartbeat`

`Content-Type: application/x-www-form-urlencoded`

```js
// wplayer.js  heartBeat(e)
{ aid, cid, bvid, mid, csrf,
  played_time,          // = 当前播放位置(秒)
  realtime,             // = 位置 - 累计 seek 偏移(秒)
  real_played_time,     // = realtime（同值）
  start_ts,             // 首帧时间戳
  type,                 // 3=UGC / 4=番剧
  dt: 7,
  play_type,            // 1=首播 2=暂停 3=续播 4=退出 0=定时
  refer, quality, video_duration,
  last_play_progress_time, max_play_progress_time,
  session, statistics: {appId:100, platform:6},
  mobi_app: "web", device: "h5", platform: "web",
  spmid, from_spmid,
  no_history            // 可选，1=不写历史
}
```

节奏：`play_type=1` 首帧立即发 → `setInterval(15s)` 定时发（`play_type=0`）→ 暂停 `2`、续播 `3`、退出 `4`。

### 3.3 你正在用的 `/x/click-interface/web/heartbeat`

**两个 APK 的全部 dex 里都没有 `click-interface/web/heartbeat` 这个字符串。**

- `click-interface` 只在 APK 内置的两个 H5 JS（`wplayer.js`、`nanoPlayer.*.js`）里出现，且都是**点击**接口：
  - `/x/click-interface/click/web/h5`
  - `/x/click-interface/click/h5`
  - `/x/click-interface/click/h5/outer`
- 当前官方 H5 播放器的心跳接口是 `/x/report/web/heartbeat`。
- 官方原生心跳是 `/x/report/heartbeat/mobile`。

结论：`/x/click-interface/web/heartbeat` 至少不是当前官方客户端在用的路径（**推断**：属于旧版 web 接口）。它是否仍被服务端接受、是否计入观看历史，**静态分析无法证明**——这正是最需要你实测的一点（见 §7 建议 0）。

### 3.4 签名

| 接口 | 签名方式 | 证据 |
|---|---|---|
| `/x/report/heartbeat/mobile` | 走统一拦截器：公共参数 `platform=android`、`mobi_app`、`appkey`、`build`、`channel`、`access_key`、`c_locale`、`s_locale` + `ts` + `sign`。`sign` 由 **native 库** `com.bilibili.nativelibrary.SignedQuery` 生成，Java 层不可见 | `AB0/a.java:82-112`、`AB0/a.java:301` |
| `/x/report/click/android2` | 参数按 key 排序拼成 `k=v&...` → 用固定 key 计算签名并转小写附在末尾 → **整个串再加密成二进制**，`Content-Type: application/octet-stream` | `f.java:405-423`（`La0.a.g(...).toLowerCase()`、`hJ1.b.a(...)`） |
| `/x/v2/history/report` | 同上统一拦截器（form + appkey/sign） | `playerbizcommonv2/api/c.java` + `AB0.c` |
| H5 `/x/report/web/heartbeat` | web 侧 cookie/wbi，JS 内完成 | `wplayer.js` |
| **`w_rid` / `wts`（wbi）** | **两个 APK 的 native 代码里没有 wbi 签名实现**；`w_rid` 仅在 HD 的一个 JSON 模型字段名里出现一次，与本链路无关 | `hd/classes31.dex` 字符串表 |

> 所以：官方 app 用 `appkey + ts + sign`（native），web 用 wbi。你在第三方里走的是 web 侧 wbi 方案，与官方 app 不是同一条链路。

---

## 4. 其他上报路径

### 4.1 观看历史 / 进度：`POST /x/v2/history/report`

接口定义（`com/bilibili/playerbizcommonv2/api/c.java`）：

```java
@FormUrlEncoded @POST("/x/v2/history/report")
a(access_key, FieldMap, cid, aid, source, duration, progress, type, device_ts, start_ts, scene);

@FormUrlEncoded @POST("/x/v2/history/report_scene")
b(access_key, FieldMap, cid, aid, source, duration, progress, type, device_ts, start_ts, scene, report_scene);

@FormUrlEncoded @POST("/x/v2/history/report_list")
c(access_key, cid, aid, parent_type, parent_id, source);
```

调用点（`com/bilibili/ship/theseus/united/player/history/b.java:216`）：

```java
cVar3.b(strD, mapD, j8, j4, "player-old", jY2, jY, iIntValue, now/1000, this.i/1000, str3)
//      access_key, map, cid, aid, source,   duration, progress, type, device_ts, start_ts, scene
```

| 字段 | 类型 | 语义 | 取值 |
|---|---|---|---|
| `cid` | long | 分 P cid | — |
| `aid` | long | 稿件 avid | — |
| `source` | string | 上报来源 | `player-old`（Theseus 主播放器）、`player-window`（小窗） |
| `duration` | long | 视频总时长（**秒**） | `kotlin.time.y(duration, SECONDS)` |
| `progress` | long | 观看进度（**秒**）；**`-1` = 已看完** | 见下 |
| `type` | int | 视频类型 | `3` = UGC（小窗硬编码 3；H5 同为 3/4） |
| `device_ts` | long | 设备当前时间（秒） | `now/1000` |
| `start_ts` | long | 进入播放页的时间（秒），服务启动时赋值一次 | `this.i/1000` |
| `scene` | string | 前台/后台 | `front` / `background` |
| `report_scene` | long | 场景码（仅 `/report_scene`） | `4` = 切到后台 |

**「看完」判定**（`b.java:66,108`）：

```java
m = 5000ms;                                  // TfCode.MOBILE_TF_RULES_NO_MATCH_VALUE == 5000
long jS = position + m;
int iC  = compare(jS, duration);
bVar = (iC >= 0) ? Finished : Progress(position);   // Finished → progress = -1
```

即 **剩最后 5 秒就算看完**，`progress=-1`。

**去重**（`b.java:120-140`）：

```java
if (previous instanceof Finished && current instanceof Finished)  return;  // 已报过看完
if (previous instanceof Progress && current instanceof Progress
    && |current.position - previous.position| <= 1s)               return;  // "Has reported same history."
```

**触发点**（`TheseusHistoryService$runReport$2.java`）：

| 行 | 触发 |
|---|---|
| 294-295 | `Lifecycle.Event.ON_PAUSE` → `a(Long.MIN_VALUE)` |
| 353-356 | `PlayerAvailability == COMPLETED / FORBIDDEN` 变化 → `a(Long.MIN_VALUE)` |
| 433 | 进入后台（`isBackgroundRunning && lifecycle == CREATED`）→ `a(4L)` → `report_scene=4` |
| 517-518 | 协程取消（"Leaving."，退出页面）→ `a(Long.MIN_VALUE)` |
| 562-567 | 可选定时器：间隔 = `videodetail.player_history_report_interval` 秒（默认 `"0"` = 关闭） |

> **没有任何最小时长门槛**。看 3 秒退出，`ON_PAUSE` 和 `Leaving` 都会走到 `a()`，`progress=3` 直接发出。

**本地落库**：同一次调用里还会写 `CommonVideoPlayerDBData`（`b.java:165-191`），字段 cid/aid/type=3/source/progress/device_ts/start_ts —— 这是本地续播用的 DB，不是推荐过滤用的。

### 4.2 VV 点击：`POST /x/report/click/android2`

- 触发：播放器 state 3（真正起播），且当前没有 `ReportContext`（即新会话）
- 请求体：排序后的 `k=v&...` + `&sign=...`，再整体加密为 `application/octet-stream`
- 参数（`f.java:346-400`）：`aid, cid, part, mid, lv, ftime, stime, did(rpdid), type, sub_type, sid, epid, platform, auto_play, access_key, play_mode, cur_language, perfer_type, is_auto_qn, is_audio_play, build, mobi_app, spmid, from_spmid, track_id, session, oaid, polaris_action_id, statistics`
- 其中 `ftime` = 该设备**首次播放时间**（持久化在 `first_play_time`），`stime` = 本次会话时间 —— 服务端据此做 VV 去重
- 响应里的 `data.rpdid` 会被写回本地，作为后续 `did`

> 这是「播放」的计数上报，**进详情页不播放不会触发**。

### 4.3 曝光 / 点击埋点（InfoEyes）

- 端点：`https://data.bilibili.com/log/mobile?android`（`p530rp0/a.java:7`，继承 `com.bilibili.lib.infoeyes.l`）
- 曝光判定：`ExposeComponent` 给 RecyclerView 设置可见比例，`setExposeStartRatio` 默认 **0.8**、`setDismissExposeRatio` 默认 0.8（`ExposeComponent$onViewCreated$2.java`）
- 点击埋点示例：`tm.recommend.main-card.0.click`（`PE0/a.java:102`）
- 相关 spmid：`tm.recommend.0.0`（首页推荐）、`tm.recommend.three-point.*`（三点菜单）

**没有** 类似 `/x/feed/exposure` 的 JSON 曝光接口；dex 里 `/x/...expo...` 只有 `/x/v1/contract/expose`（合同）和 `/x/v2/dm/exposure/report`（弹幕），都与推荐曝光无关。

### 4.4 负反馈

**首页推荐「不感兴趣」**：`GET https://app.bilibili.com/x/feed/dislike`（QueryMap）

参数（`com/bilibili/pegasus/api/y.java:19-60`）：

| 参数 | 语义 |
|---|---|
| `access_key` | 登录态 |
| `id` | 卡片 `param`（= avid） |
| `goto` | 卡片类型（`av` 等） |
| `mid` | UP 主 id |
| `rid` | 分区 id |
| `tag_id` | tag id |
| `report_data` | 卡片自带 `dislike_report_data`（服务端下发的上报串） |
| `ad_cb` / `nature_ad` | 广告相关 |
| `extra` | 额外信息 |
| `spmid` | 固定 `tm.recommend.0.0` |
| `track_id` | 推荐 track id |
| `action_id` | 埋点 action id |
| `is_light_panel` / `old_pegasus` | 面板样式标记 |
| `reason_id` / `feedback_id` | 原因 id（二选一，取决于面板类型）* |

\* `reason_id` / `feedback_id` 由 `y.a(item, str, str2, ...)` 的前两个参数传入，最终交给 `AW.b.j(...)`（该类在未反编译的 dex 中，参数名按调用约定与同族实现推断）。

**原因面板**：`GET /x/v2/feed/nf?goto&id&title&from&up_name&dislike_info&is_second_panel`（`p114iC1/a.java:11-13`）

**「减少此类推荐」标签管理**：`/x/v2/feed/uinterest`（列表）、`/x/v2/feed/uinterest/more`、`POST /x/v2/feed/uinterest/mng`（`fixed_label` / `unfixed_label` / `changed_label` / `action`）（`recommendlabel/api/RecommendLabelApiService.java`）

**取消**：`GET /x/feed/dislike/cancel`

---

## 5. rcmd 请求参数表

### 5.1 官方原生：`GET https://app.bilibili.com/x/v2/feed/index`

接口：`com/bilibili/pegasus/request/c.java:11-14`
参数映射：`com/bilibili/pegasus/request/a.java:106`

| 参数 | 语义 | 官方取值 | 我方（web 接口）当前取值 |
|---|---|---|---|
| `idx` | **分页游标** = 当前列表**最后一张卡的 `idx`**（不是页码） | 刷新 0；加载更多 = `PegasusHolderData.getIdx()` | `fresh_idx`（页码语义） |
| `pull` | `true`=刷新，`false`=加载更多 | 见上 | 无 |
| `login_event` | 登录态事件（0/1/2） | `N.b` 静态状态 | 无 |
| `open_event` | 打开场景：`""`=NORMAL、`"cold"`=冷启动、`"hot"`=热门 | `N.c`，用后重置为 NORMAL | 无 |
| `banner_hash` | 顶部 banner 内容 hash（增量更新） | `N.a` | 无 |
| `interest_result` | 兴趣选择结果 | `LE0.e.b()` | 无 |
| `flush` | **刷新场景枚举**（0–23） | 见下表 | 无 |
| `interest_id` | 兴趣 id | `LE0.e.a` | 无 |
| `splash_id` / `splash_ids` / `splash_creative_id` | 开屏广告归因 | 开屏 SDK | 无 |
| `interest_pos_ids` | 兴趣卡位置 | `LE0.e.c` | 无 |
| `cny_info` | 春节活动信息 | 活动配置 | 无 |
| `clipboard_video_id` / `clipboard_unique_k` | 剪贴板口令 | 实际调用传 `null` | 无 |
| `window_size_type` / `raw_window_size_type` | 窗口尺寸类型（折叠屏/分屏） | 页面配置 | 无 |
| 公共参数 | `access_key`、`appkey`、`ts`、`sign`、`build`、`channel`、`platform=android`、`mobi_app`、`buvid`、`device_id`、`c_locale`、`s_locale` | 拦截器注入 | wbi 参数 |

`flush` 枚举（`com/bilibili/pegasus/data/request/PegasusFlush.java`，节选）：

```
0 NORMAL            1 AUTO_BACK_FROM_BACKGROUND   2 SWITCH_STYLE
3 INTEREST          4 SWITCH_PEGASUS_RECOMMEND_MODE 5 TAB_CLICK
6 PULL_DOWN         7 TOP_REFRESH_BUTTON_CLICK     8 PULL_UP
9 AUTO_BACK_FROM_OTHER_PAGE                       11/12 SWITCH_RECOMMEND_MODE_FROM_SETTINGS/GUIDANCE
14 TAB_CLICK_WITH_OFFSET   15 TAB_DOUBLE_CLICK     16 BOTTOM_REFRESH_BUTTON_CLICK
17 VIDEO_MODE_CHANGE  18 REFRESH_GUIDANCE          19 HOME_TAB_REFRESH_GUIDANCE
20 AUTO_BACK_FROM_BEHAVIOR  21 LOGIN_CHANGE         22 FLUSH_TAB_SWITCH_COLUMN
23 FLUSH_ON_BACK_PRESS
```

**翻页规则**（`PegasusViewModel.java:698`）：

```java
PegasusHolderData last = (PegasusHolderData) list.last();
long idx = last != null ? last.getIdx() : 0L;
...
this.j = new ME0.f(idx, pull, flush, ..., );
this.I(this, pull ? new RefreshAction(...) : new LoadMoreAction(...));
```

### 5.2 关于 `fresh_idx / fresh_type / ps / feed_version / homepage_ver / brush / y_num`

**这两个 APK 的 dex 里都不存在这些字符串**（`grep -a` 全量 dex 验证；`fresh_type` 的命中全部是 `refresh_type` 的子串误匹配）。

它们是 **web 端** `/x/web-interface/wbi/index/top/feed/rcmd` 的参数，不在官方 Android 原生客户端里。按字段名与 web 行为，**推断**语义如下（**未验证**，不要当成结论写进代码注释）：

| 参数 | 推断语义 | 置信度 |
|---|---|---|
| `fresh_idx` | 本次刷新内的第几屏/第几页（递增） | 中 |
| `fresh_type` | 刷新类型（下拉/切 tab/冷启） | 中 |
| `ps` | 每页条数（page size） | 高 |
| `brush` | 防重复刷新的标记（浏览器侧） | 低 |
| `y_num` | 已展示条数，用于服务端控制下发节奏 | 低 |
| `feed_version` / `homepage_ver` | 推荐实验分组 / 首页版本号 | 低 |

> 结论：**没有任何证据表明这些参数能让服务端过滤已看**。官方过滤已看的依据是服务端的观看历史（由 `/x/v2/history/report` 写入），而不是 rcmd 的请求参数。

---

## 6. 与第三方客户端的差异清单

> 「我方」一列按你提供的实现描述填写（未读到你的源码）。

| # | 项目 | 官方客户端 | 我方 | 影响 |
|---|---|---|---|---|
| 1 | **观看进度上报** | `POST /x/v2/history/report`（+`report_scene`/`report_list`），`progress` 秒级，`-1`=看完 | **完全没有** | 🔴 服务端拿不到"看过/看到哪"，这是「看过了还推」最可能的主因 |
| 2 | 心跳接口 | `/x/report/heartbeat/mobile`（native）或 `/x/report/web/heartbeat`（H5） | `/x/click-interface/web/heartbeat` | 🔴 官方不用的旧路径，是否计数未知 |
| 3 | 心跳触发 | 首帧 START（全零）+ 暂停/停止/切P/seek END（累计） | 首帧 + 每 30 秒 | 🟠 官方无固定轮询；30s 轮询反而可能产生大量噪声 |
| 4 | 首次心跳参数 | 累计字段**全部清零**（`played_time=0`、`actual_played_time=0`、`total_time=0`、`start_ts=0`） | `played_time=0` | 🟢 基本一致 |
| 5 | 退出补报 | `ON_PAUSE` + `Leaving` 都补报，**无最小时长门槛** | `isPlaying && !isInBackground` 才报 → 3 秒退出无信号 | 🔴 短观看完全丢失 |
| 6 | 后台播放 | 进后台发 `report_scene=4`；可选定时上报（服务端配置） | 后台完全不报 | 🟠 后台收听/小窗行为丢失 |
| 7 | 实际观看时长 | `actual_played_time`（按倍速加权） | `real_played_time`（web 字段名） | 🟠 字段语义/名称都不是 app 侧 |
| 8 | 播放类型/场景 | `play_type`、`scene=front/background`、`source=player-old` | 无 | 🟠 服务端无法区分前台/后台/小窗 |
| 9 | VV 点击 | `POST /x/report/click/android2`（首帧，`ftime`/`stime` 去重） | 无 | 🟠 影响 VV 统计，间接影响推荐热度 |
| 10 | 负反馈 | `/x/feed/dislike` + `/x/v2/feed/nf` + `/x/v2/feed/uinterest*` | 未接 | 🔴 用户无法主动纠正推荐 |
| 11 | 曝光上报 | InfoEyes（0.8 可见比例）+ spmid 埋点 | 未接 | 🟡 影响推荐冷启/探索，短期收益低 |
| 12 | 已看本地过滤 | **不做**（无此逻辑） | 不做 | 🟡 官方不做，但第三方可作兜底 |
| 13 | feed 已看标记 | 响应模型无 `is_watched`/`progress` 字段 | — | — 服务端不下发已看标记，只能靠历史接口 |
| 14 | 推荐接口 | `/x/v2/feed/index`（app，`idx` 游标 + `flush` 场景） | `/x/web-interface/wbi/index/top/feed/rcmd`（web） | 🟡 不同链路；web 链路本身可用，但参数语义不同 |
| 15 | 签名 | `appkey + ts + sign`（native） | wbi（`w_rid`/`wts`） | 🟢 各自链路正确即可 |

---

## 7. 可落地的改进建议（按 收益/成本 排序）

### 建议 0（先做，成本最低）：确认 `/x/click-interface/web/heartbeat` 到底还算不算数

用你自己的账号，在官方 web 播放页抓一次包，对比：
- 官方 web 现在打的是 `/x/report/web/heartbeat`，不是你用的路径；
- 抓包看这个旧路径返回码与是否影响"历史记录"。

**依据**：两个 APK 全量 dex 无此字符串；官方 H5 用 `/x/report/web/heartbeat`（`wplayer.js`）。
**为什么排第一**：如果这个接口已废弃，后面所有优化都是在给一个不记账的接口发数据。

### 建议 1（收益最高）：接入 `/x/v2/history/report`

这是官方"看过"的唯一直接信号。

```
POST https://api.bilibili.com/x/v2/history/report
form: cid, aid, source, duration(秒), progress(秒, -1=看完),
      type=3, device_ts(秒), start_ts(秒), scene=front|background
```

落地要点（全部有代码依据）：
- **进页面就报一次** `progress=0`（`runReport$2.java:353-356` 的 Availability 路径）；
- **每 5 秒或进度变化 >1 秒报一次**（`b.java:135` 的去重阈值是 1 秒，官方是事件驱动；你做成 5 秒节流即可，比官方还保守）；
- **`onPause` / 退出 / 切后台 必须补报**（`runReport$2.java:294,433,517`）；
- **`position + 5s >= duration` 时传 `progress=-1`**（`b.java:66,108`）；
- `start_ts` = 进入播放页的时间，整个会话不变（`b.java:66` + `run$2` 里 `this.i = now`）；
- `duration` 单位是**秒**，不是毫秒（`b.java:206-216` 里 `/1000`）。

**风险**：该接口在 app 域（`api.bilibili.com` + appkey/sign）。web 凭证是否被接受需实测；若被拒，退而求其次用 web 的 `/x/report/web/heartbeat` 并把 `played_time` 打准（服务端会从心跳推导历史）。

### 建议 2：把心跳改成"事件驱动 + 退出补报"

- 首次：所有累计字段清零（你已做对）；
- 暂停/退出/切 P/seek：立即补一次，带累计 `played_time` / `actual_played_time`；
- 定时：如果保留，改成 **15 秒**（与官方 H5 一致，`wplayer.js` 的 `15e3`），而不是 30 秒；
- **去掉 `!isInBackground` 的硬门槛**：官方在后台会发 `report_scene=4`，并且可选定时上报（`runReport$2.java:433`）。

**依据**：`f.java:206`（state 4/5/6/7 分支）、`f.java:683 X7()`、`runReport$2.java:294/433/517`、`wplayer.js` 的 15s。
**收益**：短观看、后台播放不再丢信号；成本：一个 `onPause`/`onStop` 钩子 + 一个定时器改参数。

### 建议 3：补齐参数语义（低成本）

| 现在 | 应改为 | 依据 |
|---|---|---|
| `real_played_time` | web 心跳用 `real_played_time`；如果改走 app 心跳，字段是 `actual_played_time` | `HeartbeatParams.java:30` |
| 无 `play_type` | `1`=首播、`2`=暂停、`3`=续播、`4`=退出 | `wplayer.js` `heartBeat(e)` |
| 无 `type` | `3`=UGC、`4`=番剧 | `wplayer.js`、`N51/c.java:82` |
| 无 `scene`/`source` | `scene=front/background`、`source=player-old` | `b.java:192,216` |
| 无 `duration` | 心跳里带 `video_duration`（秒） | `HeartbeatParams.java:21` |

### 建议 4：接负反馈（中等成本，直接改善体验）

- 「不感兴趣」→ `GET /x/feed/dislike`，参数见 §4.4（`id`=avid、`goto`、`spmid=tm.recommend.0.0`、`track_id`、`reason_id`）；
- 原因面板 → `GET /x/v2/feed/nf`；
- 「减少此类推荐」→ `POST /x/v2/feed/uinterest/mng`。

**依据**：`pegasus/api/y.java`、`p114iC1/a.java`、`RecommendLabelApiService.java`。
**收益**：用户能主动纠正，立竿见影；成本：一个菜单 + 三个请求。

### 建议 5：本地已看兜底过滤（低成本，官方不做）

- 本地维护 `已看 aid/bvid + 时间戳`（播放超过 N 秒或 `progress>=-1` 时写入）；
- 首页列表渲染前过滤最近 7 天已看项（保留"再看一次"入口）。

**依据**：官方 `pegasus` 模块**没有**任何已看过滤逻辑（全模块 grep `watched/hasWatch` 无命中），说明官方完全依赖服务端；但第三方无法保证服务端认得你的上报，本地兜底是确定性收益。
**注意**：这会改变信息流内容，属于产品决策，建议做成开关。

### 建议 6：曝光上报（低优先级）

- 若要接，走 InfoEyes 的 spmid 体系（`tm.recommend.0.0` + `main-card`），可见比例 0.8；
- 不要自己造 `/x/feed/exposure` —— 官方没有这个接口。

**依据**：`ExposeComponent`、`p530rp0/a.java`、`PE0/a.java:102`。

---

## 8. 未确认项（明确说明）

| # | 问题 | 状态 |
|---|---|---|
| 1 | `/x/click-interface/web/heartbeat` 服务端是否仍处理、是否计入历史 | **未确认**（需抓包/实测） |
| 2 | `/x/v2/history/report` 是否接受 web 凭证（cookie/wbi）而非 appkey 签名 | **已验证**：真机表单（含 `csrf`）返回 `code=0`，四个时机均成功 |
| 3 | 官方是否在"进详情页未播放"时就写 `progress=0` 历史 | **代码路径存在，未运行验证**（取决于播放器就绪时机） |
| 4 | `fresh_idx/fresh_type/brush/y_num/feed_version/homepage_ver` 的确切语义 | **未确认**（APK 中不存在，属 web 侧） |
| 5 | `report_scene` 除 `4` 以外的取值 | **未确认**（只观察到 4=进后台） |
| 6 | `AW.b`（dislike 参数封装）的 `reason_id`/`feedback_id` 精确形参名 | **推断**（该类在未反编译 dex） |
| 7 | 动态抓包验证 | **未做**（静态分析；客户端侧真机验证见 README §4） |
| 8 | `/x/report/click/android2` 的加密实现 | **已解出**，见 [vv-report.md](vv-report.md) |
| 9 | `three_point_v2` 结构与 `report_data`/`tag_id` 来源 | **已解出**，见 [recommendation-feedback.md](recommendation-feedback.md) |
| 10 | 推荐流是否有「过滤已看」参数 | **已确认没有**，见 [feed-request.md](feed-request.md) §5 |

---

## 附录 A：证据文件索引

反编译产物保留在 `/home/cheny/work/bili/`（关键文件已复制到 `evidence/`）：

| 结论 | 文件 | 行 |
|---|---|---|
| 心跳全字段 | `outB/sources/tv/danmaku/biliplayerimpl/report/heartbeat/HeartbeatParams.java` | 7–56 |
| 心跳/点击接口定义 | `outB/.../heartbeat/c.java` | 5–14 |
| START 清零 / END 累计 | `outB/.../heartbeat/f.java` | 643–683, 683–740, 741–757 |
| 播放状态机触发 | `outB/.../heartbeat/f.java` | 206–296 |
| VV 点击上报体 | `outB/.../heartbeat/f.java` | 346–460 |
| 心跳字段初始化 | `outB/.../heartbeat/ReportContext.java` | 400–430 |
| 历史上报接口 | `out17/sources/com/bilibili/playerbizcommonv2/api/c.java` | 5–18 |
| 历史上报逻辑/去重/5s 判定 | `outA/sources/com/bilibili/ship/theseus/united/player/history/b.java` | 66, 108, 120–140, 192–225 |
| 历史上报触发点 | `outA/.../history/TheseusHistoryService$runReport$2.java` | 294, 353, 433, 517, 562 |
| 5000ms 常量 | `outA/sources/com/bilibili/lib/tf/TfCode.java` | `MOBILE_TF_RULES_NO_MATCH_VALUE = 5000` |
| feed 接口与参数 | `out17/sources/com/bilibili/pegasus/request/c.java` | 11–14 |
| feed 参数映射 | `out17/sources/com/bilibili/pegasus/request/a.java` | 106 |
| 翻页 idx | `out17/sources/com/bilibili/pegasus/vm/PegasusViewModel.java` | 698 |
| flush 枚举 | `out17/.../data/request/PegasusFlush.java` | 1–40 |
| open_event 枚举 | `out17/.../data/request/OpenEvent.java` | 1–20 |
| 负反馈参数 | `out17/sources/com/bilibili/pegasus/api/y.java` | 19–60 |
| 负反馈接口 | `outB/sources/p114iC1/a.java` | 5–19 |
| uinterest 接口 | `out17/.../recommendlabel/api/RecommendLabelApiService.java` | 7–18 |
| 曝光 0.8 比例 | `out17/.../components/ExposeComponent$onViewCreated$2.java` | 46–57 |
| InfoEyes 端点 | `outA/sources/p530rp0/a.java` | 7 |
| 卡片点击埋点 | `out17/sources/PE0/a.java` | 102 |
| H5 心跳 15s/参数 | `wplayer.js` | `heartBeat=function` |
| 公共参数/签名 | `out17/sources/AB0/a.java` | 82–112, 301 |

## 附录 B：复现步骤

```bash
# 1. 解包 split APK
python3 -c "import zipfile; zipfile.ZipFile('bilibili_6.5.0.apks').extract('base.apk','.')"

# 2. 定位字符串在哪个 dex
grep -l -a -F "history/report" dex/*.dex

# 3. 只反编译命中的 dex（比全量快一个数量级）
JAVA_OPTS="-Xmx3g" jadx -d out --no-res --no-imports -j 4 dex/classes17.dex

# 4. 顺藤摸瓜
grep -rn "history/report" out/sources
```

---

## 9. 第二轮补充（VV 与负反馈细节）

### 9.1 VV（播放量）上报已完整解出

`/x/report/click/android2` 不是普通 form：参数串 `query + "&sign=" + sign` 整体 **AES-256-CBC/PKCS5** 加密后作为 `application/octet-stream` body 发送。

- `sign = lower(hex(SHA256(query + salt)))`
- key / iv / salt 均有硬编码默认值，且可被服务端配置覆盖

完整实现与参考代码见 [vv-report.md](vv-report.md)。

### 9.2 心跳的"必填字段"

代码层面只有一个硬门槛：`Z7()` 在发起前检查 `aid > 0 && cid > 0`，否则直接 return（日志 `request block: a video report heartbeat without avid`）。其余 36 个具名字段客户端**总是全量发送**，`HeartbeatParams` 里没有任何条件分支（只有 `play_mode` 为空时不带）。

因此"哪些字段必填"只能由服务端定义；客户端侧能确定的是：**aid、cid 不发就一定没有心跳**。另有一条线索：重试队列遇到 `code == -400` 会直接丢弃缓存（`a.java`），说明服务端对参数有校验，但具体字段未知。

### 9.3 负反馈的结构

`three_point_v2` 只提供「原因 id + 文案」；`report_data` / `tag_id` / `rid` / `mid` 来自卡片本身的 `dislike_report_data`、`args.tid`、`args.rid`、`args.up_id`，不是从 `three_point_v2` 里取的。详见 [recommendation-feedback.md](recommendation-feedback.md)。

### 9.4 推荐流没有「过滤已看」参数

`/x/v2/feed/index` 的 17 个参数里没有任何 filter 类开关，响应卡片也没有 `is_watched` / `progress` 字段。过滤完全依赖服务端掌握的观看历史。详见 [feed-request.md](feed-request.md) §5。
