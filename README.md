# B 站推荐链路接口文档

从官方 Android 客户端（`tv.danmaku.bilibilihd` 2.5.1 / `com.bilibili.app.in` 6.5.0）反编译整理出的、与「推荐 → 观看 → 反馈」闭环相关的接口清单。

本文只描述**客户端实际发出的请求**和**能从代码里读到的字段语义**。服务端的排序/召回逻辑不在可观测范围内，凡涉及服务端行为的结论都会标成「推断」或「未知」。

---

## 样本版本

本仓库所有结论均来自以下两个 APK（分析日期 2026-11-01）：

| 文件 | 包名 | versionName | versionCode | minSdk | targetSdk | 说明 |
|---|---|---|---|---|---|---|
| `哔哩哔哩HD_2.5.1.apk` | `tv.danmaku.bilibilihd` | 2.5.1 | 2051100 | 23 | 35 | 大陆 HD 平板版，39 个 dex |
| `bilibili_6.5.0.apks` → `base.apk` | `com.bilibili.app.in` | 6.5.0 | 9110200 | 24 | 36 | 国际版，33 个 dex（arm64_v8a split 另带 so） |

两点说明：

1. 两个包的内部类名完全一致（`tv.danmaku.biliplayerimpl.*`、`com.bilibili.pegasus.*`、`com.bilibili.ship.theseus.*`），是**同一套代码的不同 flavor**，可交叉验证；关键接口在两边都能找到相同实现。
2. 样本不是大陆手机版 `tv.danmaku.bili`。HD 版与手机版同后端、同接口族，参数一致；但版本号不同，字段可能随版本增删。**复现请用上表版本**，换版本后先按 [tools/decompile-notes.md](tools/decompile-notes.md) 重新核对字段。

反编译工具：jadx 1.5.6（`--single-class` 用于规避仅大小写不同的混淆类互相覆盖）。

---

## 0. 阅读约定

每个结论都带证据等级，不要混用：

| 等级 | 含义 | 例子 |
|---|---|---|
| **A · 代码事实** | 反编译源码里能逐行读到，或在真机上验证过响应 `code=0` | 「心跳参数有 36 个具名字段」「history/report 返回 0」 |
| **B · 代码推断** | 由代码路径推导，但没有运行时验证（分支可能不触发） | 「进详情页未播放也会写 progress=0」 |
| **C · 未知** | 服务端行为，客户端侧无法证明 | 「progress=1 和 progress=80 对推荐的影响是否相同」 |

字段名、类名、方法名保留原样（它们是公开 API 的镜像）；`access_key`、`buvid`、`mid`、`device_id`、`oaid` 等一律用占位符，不要提交真实值。

---

## 1. 接口总表

### 1.1 推荐流

| 用途 | 方法 | 路径 | 宿主 |
|---|---|---|---|
| 首页推荐流 | GET | `/x/v2/feed/index` | `app.bilibili.com` |
| 频道流 | GET | `/x/channel/feed/index` | `app.bilibili.com` |
| 热门 | gRPC | `bilibili.app.show.popular.v1.Popular` | — |

详见 [docs/feed-request.md](docs/feed-request.md)。

### 1.2 观看上报（三套并存）

| 用途 | 方法 | 路径 | 触发 | 载体 |
|---|---|---|---|---|
| **观看进度历史** | POST | `/x/v2/history/report` | 暂停 / 离开 / 可用性变化 / 进后台 | form |
| 同上（带场景码） | POST | `/x/v2/history/report_scene` | 切后台（`report_scene=4`） | form |
| 批量历史 | POST | `/x/v2/history/report_list` | 多 P / 列表 | form |
| **VV 播放计数** | POST | `/x/report/click/android2` | 起播（player state 3） | 加密二进制 |
| **心跳** | POST | `/x/report/heartbeat/mobile` | 起播（全零）/ 暂停 / 停止 / 切P / seek | form |
| H5 心跳 | POST | `/x/report/web/heartbeat` | 首帧 + 每 15s + 暂停/续播/退出 | form |

详见 [docs/watch-report.md](docs/watch-report.md) 与 [docs/vv-report.md](docs/vv-report.md)。

### 1.3 负反馈

| 用途 | 方法 | 路径 | 宿主 |
|---|---|---|---|
| 不感兴趣 | GET | `/x/feed/dislike` | `app.bilibili.com` |
| 撤销不感兴趣 | GET | `/x/feed/dislike/cancel` | `app.bilibili.com` |
| 原因面板 | GET | `/x/v2/feed/nf` | `app.bilibili.com` |
| 兴趣标签列表 | GET | `/x/v2/feed/uinterest` | `app.bilibili.com` |
| 更多标签 | GET | `/x/v2/feed/uinterest/more` | `app.bilibili.com` |
| 标签管理（减少此类推荐） | POST | `/x/v2/feed/uinterest/mng` | `app.bilibili.com` |

详见 [docs/recommendation-feedback.md](docs/recommendation-feedback.md)。

### 1.4 曝光 / 埋点

| 用途 | 方法 | 路径 |
|---|---|---|
| InfoEyes 埋点（曝光、点击） | POST | `https://data.bilibili.com/log/mobile?android` |
| VV 汇总（服务端内部） | — | `https://data.bilibili.com/vv/app` |

没有 `/x/feed/exposure` 之类的 JSON 曝光接口；曝光走 spmid 埋点体系。

---

## 2. 一次完整观看的时序

```
[首页]
  GET /x/v2/feed/index            idx=0 pull=true open_event=cold flush=0
    → 卡片进入可视区 ≥80%  → InfoEyes log/mobile（spmid=tm.recommend.0.0）
    → 点击卡片            → InfoEyes tm.recommend.main-card.0.click
[详情页]
  → 播放器就绪            → POST /x/v2/history/report  progress=0  (B 级推断)
  → 首帧                  → POST /x/report/click/android2         (VV)
                          → POST /x/report/heartbeat/mobile       (START，累计字段全 0)
[播放中]
  → 无固定心跳（原生）；H5 每 15s
[暂停 / 退出 / 切P / seek]
  → POST /x/report/heartbeat/mobile  (END，带累计 played_time)
  → POST /x/v2/history/report        progress=当前位置，看完则 -1
[切后台]
  → POST /x/v2/history/report_scene  report_scene=4, scene=background
[不感兴趣]
  → GET /x/feed/dislike             id=aid, goto=av, reason_id, track_id, spmid=tm.recommend.0.0
```

---

## 3. 鉴权与签名

| 链路 | 参数 | 算法 | 证据 |
|---|---|---|---|
| 原生 app | `appkey` + `ts` + `sign` + `access_key` | `sign` 由 native 库 `com.bilibili.nativelibrary.SignedQuery` 生成，Java 层不可见 | A |
| VV 专用 | `sign` + AES body | `sign = SHA256(query + salt)`；body = `AES-256-CBC-PKCS5(query + "&sign=" + sign)` | **A（已解出）** |
| Web / H5 | `w_rid` + `wts`（wbi） | JS 侧实现，APK 内无 Java 实现 | A |

VV 的密钥/IV/salt 三个常量都可被服务端配置覆盖（`videodetail.report_click_secret_key` / `_iv` / `_salt`），默认值见 [docs/vv-report.md](docs/vv-report.md)。

> 注意：`/x/click-interface/web/heartbeat`（部分第三方客户端在用）在两个官方 APK 的全部 dex 里都不存在。官方 H5 用的是 `/x/report/web/heartbeat`。这是「代码事实」，但「该接口已失效」是推断——见 [docs/unknown.md](docs/unknown.md)。

---

## 4. 已确认 / 未确认

**真机已验证（code=0）**

- `/x/v2/history/report`：暂停、退出、切 P、切视频四个时机各报一次均成功；45 秒视频播 6 秒退出也上报；播满报 `progress=-1`。
- `/x/feed/dislike`：补 `spmid` / `track_id` / `mid` / `rid` 后可成功。
- 心跳：补齐 `video_duration` / `last_play_progress_time` / `max_play_progress_time` / `total_time` / `actual_played_time` / `session` 后仍返回 0。

**未确认**：推荐是否因此不再推已看、`/x/click-interface/web/heartbeat` 是否仍生效、曝光上报对召回的影响、`progress` 的服务端阈值。完整清单见 [docs/unknown.md](docs/unknown.md)。

---

## 5. 目录

```
docs/
  feed-request.md               推荐流请求参数与翻页
  watch-report.md               观看上报机制（history/report + 心跳 + H5）
  vv-report.md                  VV 点击上报与加密实现
  recommendation-feedback.md    负反馈与 three_point_v2
  unknown.md                    未确认项
  seek.md                       拖动进度条的 seek 算法（全屏/非全屏）
  badge.md                      首页消息角标的数据源与刷新机制
evidence/
  classes/                      关键反编译类（不含用户标识）
  packets/                      抓包样本（需打码后放入）
tools/
  decompile-notes.md            反编译流程（定位 dex → 单 dex 反编译）
```

---

## 免责声明

本项目仅用于学习与研究，记录的是公开客户端的行为与公开 API 的字段结构。接口、字段与密钥常量归哔哩哔哩所有，可能随版本变更。

请勿将本文内容用于绕过风控、批量请求、爬取或任何违反服务条款的用途。
