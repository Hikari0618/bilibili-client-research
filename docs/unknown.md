# 未确认项

按「能不能验证」分三类。每一项都给出验证方法，方便后续抓包或真机实验时逐条划掉。

---

## A. 服务端行为（客户端侧无法证明）

| # | 问题 | 现状 | 怎么验证 |
|---|---|---|---|
| A1 | `progress` 多少才算「已看」 | 客户端只负责上报绝对秒数；官方自己的「看完」判定是 `position+5s >= duration → progress=-1`，但服务端用什么阈值影响推荐**未知** | 用同一账号对同一稿件做 1s / 50% / 90% / 100% 四种观看，间隔数天后观察该稿件在推荐流中的出现频次；或抓官方客户端在不同时长下的上报差异 |
| A2 | `scene=background` 与 `front` 是否等价 | 只知官方在后台播放时发 `report_scene=4`，语义未知 | 后台听 10 分钟 vs 前台看 10 分钟，对比后续推荐 |
| A3 | 心跳的 36 个具名字段哪些是必填 | 客户端全量发送，无分支；只有 `aid`/`cid` 有本地门槛 | 抓官方包对比不同场景（会员/非会员、番剧/UGC、后台/前台）的字段差异 |
| A4 | `/x/click-interface/web/heartbeat` 是否仍生效 | 反编译只能证明**官方不再请求它**；服务端是否处理、是否计入历史**未知** | 客户端同时打旧接口和新接口，观察历史记录/推荐变化；或对比只打旧接口时的播放量 |
| A5 | 推荐是否因上报而不再推已看 | 三条上报都已 code=0，但效果需要数天观察，且无法区分「服务端重新学习」和「本来就会重复推」 | 分两组：只报 history / 只报心跳 / 全报，固定账号跑 7 天，统计已看稿件复现率 |
| A6 | 曝光上报对召回的影响 | 官方走 InfoEyes，客户端未接 | 接与不接各跑 7 天对比；成本高，优先级低 |
| A7 | `report_scene` 除 4 以外的取值 | 只观察到 4（进后台） | 抓官方包在起播/切P/退出时的 `report_scene` |
| A8 | 负反馈（`/x/feed/dislike`）多久生效 | 提交返回 0，但当前列表是否立即改写未知 | 提交后立刻刷新 vs 隔 10 分钟刷新，看该 UP/该类目占比 |
| A9 | `/x/v2/feed/uinterest/mng` 的 `action` 取值与标签串格式 | 代码里直接透传 int，无枚举 | 抓官方「减少此类推荐」操作的请求 |

## B. 代码里能推断但未运行验证

| # | 问题 | 依据 | 风险 |
|---|---|---|---|
| B1 | 进详情页未播放也会写 `progress=0` 历史 | `TheseusHistoryService$runReport$2` 在 `PlayerAvailability` 变化时无条件调 `a()`，但 `a()` 开头有「媒体状态为 null 就 return」的保护 | 若播放器未就绪就退出，不会写；实际取决于首帧速度 |
| B2 | `AW.b.j/k` 的 `reason_id`/`feedback_id` 形参名 | 调用点传参顺序 + 广告侧同族实现命名 | 字段名可能不同 |
| B3 | `AB0.c` 拦截器给 VV 请求补了哪些 header | 接口挂了该拦截器，类未反编译 | 可能缺设备指纹头导致风控 |

## C. 已知但刻意没做

| # | 问题 | 原因 |
|---|---|---|
| C1 | 动态抓包 | 分析环境无 adb/设备；客户端侧已由使用者真机验证关键接口 |
| C2 | 服务端排序/召回模型 | 不可观测；不做猜测 |
| C3 | 风控/签名绕过 | 只做只读分析，不构造请求打线上接口 |

---

## 已解决（从上一版划掉）

| 问题 | 结论 | 证据 |
|---|---|---|
| VV 上报的加密实现 | AES-256-CBC/PKCS5 + SHA-256 签名，key/iv/salt 已解出 | [vv-report.md](vv-report.md) |
| `three_point_v2` 结构 | title/subtitle/type/id/reasons[]，reasons 为 {id,name,extra,extend,toast} | [recommendation-feedback.md](recommendation-feedback.md) |
| `report_data` / `tag_id` 来源 | 来自卡片 `dislike_report_data` / `args.tid`，不是 `three_point_v2` | 同上 |
| 推荐流是否有过滤已看参数 | 没有；请求 17 个参数与响应卡片字段都无此开关 | [feed-request.md](feed-request.md) §5 |
| `/x/v2/history/report` 能否用 web 凭证 | 能（真机 form + csrf，四时机均 code=0） | README §4 |
| 撤销负反馈接口参数 | 官方只在广告路径实现；参数集见文档，UGC 是否生效未知 | [recommendation-feedback.md](recommendation-feedback.md) §3 |
