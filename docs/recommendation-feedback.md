# 负反馈：不感兴趣 / 原因面板 / 减少此类推荐

推荐流里的「不感兴趣」不是单一接口，而是三层：

1. 卡片自带的 `three_point_v2` 提供**面板数据**（分组 + 原因列表）
2. `/x/feed/dislike` 提交**具体原因**
3. `/x/v2/feed/uinterest*` 管理**长期偏好标签**（减少此类推荐）

---

## 1. `three_point_v2` 结构

卡片字段名：`three_point_v2`（JSON），对应 `BasicIndexItem.threePoint`。

```json
"three_point_v2": [
  {
    "id": 0,
    "type": "dislike",
    "title": "不感兴趣",
    "subtitle": "",
    "default_id": 0,
    "selected": 0,
    "toast": "将减少此类内容",
    "url": "",
    "icon": "",
    "icon_night": "",
    "selected_icon": "",
    "selected_title": "",
    "reasons": [
      { "id": 1, "name": "不想看此UP主", "extra": "", "extend": "", "toast": "" },
      { "id": 2, "name": "看过类似内容",   "extra": "", "extend": "", "toast": "" }
    ]
  },
  {
    "id": 0,
    "type": "feedback",
    "title": "内容反馈",
    "reasons": [ { "id": 11, "name": "标题党" } ]
  }
]
```

| 字段 | 类型 | 语义 |
|---|---|---|
| `type` | string | 分组类型：`dislike`（不感兴趣）/ `feedback`（内容反馈）/ `like` / `watch_later` / `h5` / `switch_to_single` / `switch_to_double` / `why_content` |
| `id` | long | 面板 id |
| `title` / `subtitle` | string | 面板标题/副标题 |
| `reasons[]` | array | 原因列表，见下 |
| `default_id` | int | 默认选中的原因 id |
| `selected` | int | 当前选中项 |
| `toast` | string | 提交后的提示文案 |
| `url` | string | `h5` 类型跳转地址 |
| `icon` / `icon_night` / `selected_icon` / `selected_title` | string | 皮肤资源 |

原因对象（App 模型 `DislikeReason`）：

| 字段 | 类型 | 语义 |
|---|---|---|
| `id` | long | 原因 id，提交时作为 `reason_id` |
| `name` | string | 显示文案 |
| `extra` | string | 额外参数 |
| `extend` | string | 扩展串，提交时作为 `extra` |
| `toast` | string | 单项提示 |

> protobuf 版本更精简：`ThreePointV2 { 1:title, 2:subtitle, 3:repeated DislikeReason, 4:type, 5:id }`，`DislikeReason { 1:id, 2:name }`。JSON 多出的 `extra`/`extend`/`toast` 是 App 侧补充字段。

证据：`evidence/classes/ThreePointV2.java`、`evidence/classes/DislikeReason_pb.java`、`evidence/classes/ThreePointItem.java`、`evidence/classes/DislikeReason_app.java`

**关键结论**：`three_point_v2` 只提供**原因 id 和文案**。请求里的 `report_data`、`tag_id`、`rid`、`mid` **不来自它**，而是来自卡片和其它字段（见下）。

---

## 2. 提交不感兴趣：`GET /x/feed/dislike`

`QueryMap` 形式，所有参数拼在 URL 上。

| 参数 | 来源 | 说明 |
|---|---|---|
| `access_key` | 账号 | 登录态 |
| `id` | `BasicIndexItem.param` | 稿件标识（实测传 `BV...` 可用） |
| `goto` | `card_goto` | `av` 等 |
| `mid` | `args.up_id` | UP 主 id |
| `rid` | `args.rid` | 分区 id |
| `tag_id` | `args.tid` | tag id |
| `report_data` | `dislike_report_data` | 卡片自带的埋点串，原样回传 |
| `spmid` | 固定 | `tm.recommend.0.0` |
| `track_id` | `track_id` | 推荐链路 id |
| `action_id` | 埋点 | `A5.E.a()` |
| `is_light_panel` | 卡片 | 面板样式 |
| `old_pegasus` | 常量 | 兼容标记 |
| `extra` | `reason.extend` | 扩展串 |
| `reason_id` | 选中的 `reason.id` | `type=dislike` 组 |
| `feedback_id` | 选中的 `reason.id` | `type=feedback` 组（二选一） |
| `ad_cb` / `nature_ad` | 广告卡片 | 仅广告 |

构造逻辑：`com.bilibili.pegasus.api.y.a()/b()`（`evidence/classes/com__bilibili__pegasus__api__y.java:19-110`）

```java
map.put("id", String.valueOf(item.param));
map.put("goto", item.cardGoto);
map.put("mid", String.valueOf(args.upId));
map.put("rid", String.valueOf(args.rid));
map.put("tag_id", String.valueOf(args.tid));
map.put("report_data", item.dislikeReportData);
map.put("spmid", "tm.recommend.0.0");
map.put("track_id", item.trackId);
map.put("action_id", A5.E.a());
map.put("is_light_panel", String.valueOf(item.isLightPanel));
map.put("old_pegasus", "1");
if (extra != null) map.put("extra", extra);
AW.b.j(reasonId, feedbackId, from, null, map);   // 具体请求封装在 AW.b（未反编译）
```

> `AW.b.j/k` 的形参名是**推断**（该类在未反编译的 dex 中）；`reason_id` / `feedback_id` 的依据是调用点传参顺序 + 广告侧同族实现的命名。

**实测**：带 `goto=av`、`id=BV...`、`spmid=tm.recommend.0.0`、`track_id=all_0.router-pegasus-...`、`mid`、`reason_id=1` 时返回 `code=0`。

`track_id` 格式：`all_0.router-pegasus-<moduleId>-<instanceId>.<timestamp>.<random>`，来自 rcmd 响应每张卡的 `track_id`。

---

## 3. 撤销：`GET /x/feed/dislike/cancel`

官方**只在广告负反馈**路径调用它，UGC（Pegasus）路径没有实现撤销。

参数（`evidence/classes/He_a__dislike_cancel.java:8-62`）：

| 参数 | 说明 |
|---|---|
| `access_key` | 登录态 |
| `id` | 广告 `creativeId` |
| `ad_cb` | 广告回调串 |
| `buvid` | 设备 buvid |
| `spmid` | `tm.recommend.0.0` |
| `track_id` | 推荐链路 id |
| `action_id` | 埋点 id |
| `goto` | 卡片类型 |
| `nature_ad` | 是否原生广告 |
| `cm_reason_id` | 广告原因 id |
| `reason_id` | 非广告分支才带 |
| `extra` | 扩展串 |
| `is_light_panel` | 面板样式 |

做 UGC 撤销时，把 `/x/feed/dislike` 的参数集照搬、路径换成 `/x/feed/dislike/cancel`，是当前唯一有依据的推断（**C 级**）。

---

## 4. 原因面板：`GET /x/v2/feed/nf`

两处用途：
- 卡片 `three_point_v2` 不够用时，拉完整原因列表
- 广告负反馈的二次面板

| 参数 | 说明 |
|---|---|
| `goto` | 卡片类型 |
| `id` | 稿件 id |
| `title` | 卡片标题（服务端用于生成选项） |
| `from` | 来源 |
| `up_name` | UP 名 |
| `dislike_info` | 已有的负反馈信息 |
| `is_second_panel` | 是否二级面板 |

证据：`evidence/classes/p114iC1__a.java:11-13`

---

## 5. 减少此类推荐：`/x/v2/feed/uinterest*`

| 接口 | 方法 | 参数 | 用途 |
|---|---|---|---|
| `/x/v2/feed/uinterest` | GET | `need_all_label`(int) | 拉取当前兴趣标签 |
| `/x/v2/feed/uinterest/more` | GET | — | 更多可管理标签 |
| `/x/v2/feed/uinterest/mng` | POST form | `fixed_label` / `unfixed_label` / `changed_label` / `action` | 提交标签调整 |

证据：`evidence/classes/com__bilibili__pegasus__recommendlabel__api__RecommendLabelApiService.java`

`action` 的取值未在代码中枚举（直接透传 int），需实测。

---

## 6. 三者的关系

```
卡片 three_point_v2
   ├─ type=dislike  → reasons[] → 选中 reason.id → GET /x/feed/dislike?reason_id=...
   ├─ type=feedback → reasons[] → 选中 reason.id → GET /x/feed/dislike?feedback_id=...
   └─ type=h5       → 跳 url（站内问卷/反馈页）

长期偏好（"减少此类推荐"）
   └─ /x/v2/feed/uinterest/mng（按标签，不按单条视频）
```

点「不感兴趣」只影响**单条**；要影响**类目**必须走 uinterest。

---

## 7. 未确认

- `AW.b` 里 `reason_id` / `feedback_id` 的精确形参名（**推断**）
- `uinterest/mng` 的 `action` 取值与标签串格式（**未知**）
- 撤销接口对 UGC 是否生效（**未知**，未见官方实现）
- 负反馈提交后服务端多久生效、是否立即改写当前列表（**未知**）
