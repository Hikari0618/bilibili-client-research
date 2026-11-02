# 推荐流：`GET /x/v2/feed/index`

官方首页（Pegasus）用的不是 web 的 `/x/web-interface/wbi/index/top/feed/rcmd`，而是 App 域的 `/x/v2/feed/index`。两者的参数语义完全不同，不能混用。

---

## 1. 接口

```java
// com.bilibili.pegasus.request.c
@BaseUrl("https://app.bilibili.com")
public interface c {
    @GET("/x/v2/feed/index")
    @RequestInterceptor(com.bilibili.pegasus.request.e.class)
    vB0.a<GeneralResponse<FE0.f>> b(
        @Query("idx")          long idx,
        @Query("pull")         boolean pull,
        @Query("login_event")  int loginEvent,
        @Query("open_event")   String openEvent,
        @Query("banner_hash")  String bannerHash,
        @Query("interest_result") String interestResult,
        @Query("flush")        int flush,
        @Query("interest_id")  long interestId,
        @Query("splash_id")    String splashId,
        @Query("splash_ids")   String splashIds,
        @Query("splash_creative_id") long splashCreativeId,
        @Query("interest_pos_ids")   String interestPosIds,
        @Query("cny_info")     String cnyInfo,
        @Query("clipboard_video_id") String clipboardVideoId,
        @Query("clipboard_unique_k") String clipboardUniqueK,
        @Query("window_size_type")     int windowSizeType,
        @Query("raw_window_size_type") int rawWindowSizeType);
}
```

证据：`evidence/classes/com__bilibili__pegasus__request__c.java:11-14`

## 2. 参数表

| 参数 | 类型 | 语义 | 官方取值 |
|---|---|---|---|
| `idx` | long | **分页游标** = 当前列表**最后一张卡的 `idx`**（不是页码） | 刷新时 0 |
| `pull` | bool | `true`=刷新，`false`=加载更多 | 下拉/切 tab = true |
| `login_event` | int | 登录态事件 | 静态状态 `N.b` |
| `open_event` | string | 打开场景：`""`(NORMAL) / `"cold"` / `"hot"` | `N.c`，用后重置 |
| `banner_hash` | string | 顶部 banner 内容 hash（增量更新） | `N.a` |
| `interest_result` | string | 兴趣选择结果 | `LE0.e.b()` |
| `flush` | int | 刷新场景枚举（见下） | 由触发动作决定 |
| `interest_id` | long | 兴趣 id | `LE0.e.a` |
| `splash_id` / `splash_ids` / `splash_creative_id` | string/long | 开屏广告归因 | 开屏 SDK |
| `interest_pos_ids` | string | 兴趣卡位置 | `LE0.e.c` |
| `cny_info` | string | 春节活动信息 | 活动配置 |
| `clipboard_video_id` / `clipboard_unique_k` | string | 剪贴板口令 | 实际调用传 `null` |
| `window_size_type` / `raw_window_size_type` | int | 窗口尺寸类型（折叠屏/分屏） | 页面配置 |

公共参数由拦截器注入：`access_key`、`appkey`、`ts`、`sign`、`build`、`channel`、`platform=android`、`mobi_app`、`buvid`、`device_id`、`c_locale`、`s_locale`。

证据：`com/bilibili/pegasus/request/a.java:106`（实参顺序）、`AB0/a.java:82-112`（公共参数）

## 3. 翻页规则

两条路径共用同一个入口 `PegasusViewModel.y0`：

```java
// PegasusViewModel.java:695-701
PegasusHolderData last = (PegasusHolderData) x.k0(getState().a.a);   // 列表最后一张
long idx = last != null ? last.getIdx() : 0L;
this.j = new ME0.f(idx, pull, flush, splashId, splashIds, splashCreativeId,
                   interestInfo, queryBannerAction, cnyInfo, windowSizeType, rawWindowSizeType);

// PegasusViewModel.java:733
I(this, pull ? new RefreshAction(fVar4, gVar) : new LoadMoreAction(fVar4, gVar));
```

| 场景 | `idx` | `pull` | `flush` |
|---|---|---|---|
| 冷启动首屏 | `0`（列表为空） | `false` | `NORMAL(0)` |
| 下拉刷新 | **列表最后一张卡的 `idx`** | `true` | `PULL_DOWN(6)` |
| 上滑加载更多 | **列表最后一张卡的 `idx`** | `false` | `PULL_UP(8)` |
| 切 tab / 回前台自动刷新 | 列表最后一张卡的 `idx` | `true` | `TAB_CLICK(5)` / `AUTO_BACK_FROM_BACKGROUND(1)` 等 |

**注意**：`idx` 不是页码，也不是「刷新就传 0」。只有列表为空（冷启动）时才传 0；下拉刷新同样传当前列表最后一张卡的 `idx`，服务端据此接着下发下一段，客户端拿到响应后**清空旧列表**再填入。这解释了官方客户端每次下拉都是全新一批内容、不会重复看到刚才那批卡片。

## 3.1 下拉刷新：先预加载，松手再提交

```java
// PegasusViewModel.z0()（preloadPullDownRefresh，:1239-1256）
ME0.f req = ME0.f.a(current, lastIdx, /*refresh=*/true, PegasusFlush.PULL_DOWN, splashCreativeId, null, 1624);
this.m = req;                                  // 记住这次的参数
this.l = launch { preloadPullDownRefresh(req) };   // 手势阶段就把请求发出去

// PegasusViewModel.y0()（:706-714）
if (pull && flush == PULL_DOWN && preloadJob != null && preloadJob.param == newParam) {
    dispatch(new CommitPreloadedRefreshAction(newParam, parser, preloadJob));  // 直接复用预加载结果
    return;   // 不再发第二次请求
}
```

- 手势下拉时（还没松手）就发起请求，结果挂在 `this.l`
- 松手后 `PegasusFragment` 调 `y0(vm, true, PULL_DOWN, ...)`（`PegasusFragment.java:597`）
- 参数完全一致 → `CommitPreloadedRefreshAction`，**复用预加载结果，零额外请求**
- 参数不一致（如刷新期间登录态变了）→ 取消旧 job，走正常 `RefreshAction`

`RefreshAction` 的守卫与副作用（`RefreshAction.java`）：

```kotlin
if (store.getState().c()) return l("refresh isLoading")   // 正在加载直接丢弃
dispatch(ME0.e(true))                                      // 进入 refreshing 状态
val resp = request.a.b(param, parser)                      // GET /x/v2/feed/index
// 响应 pull=true 且 resp.i()=true → 清空列表后插入新卡
```

## 3.2 上滑加载：距底部不足 2 个 span 触发

`PegasusFragment.onViewCreated` 给 RecyclerView 挂了两个监听（`PegasusFragment.java:536-538`）：

```java
var h = new com.bilibili.pegasus.widget.h(new Df.g(this, 14));
rv.addOnScrollListener(h);
rv.addOnChildAttachStateChangeListener(h);
```

`com.bilibili.pegasus.widget.h`（`widget/h.java`）：

```java
public void onScrolled(RecyclerView rv, int dx, int dy) {
    if (dy > 0) b(rv);            // 只在「向下滚」时检查
}
public void onChildViewAttachedToWindow(View v) { b(parentRecycler(v)); }

void b(RecyclerView rv) {
    View lastChild = rv.getChildAt(rv.getChildCount() - 1);
    int pos = rv.getChildAdapterPosition(lastChild);
    int budget = this.c << 1;      // c 默认 1 → 2
    int span = 0;
    for (int i = pos + 1; i < itemCount; i++) {
        span += spanSizeLookup.getSpanSize(i);
        if (span > budget) return;  // 离底部还远，不触发
    }
    if (rv.isComputingLayout()) post(() -> listener.invoke());
    else listener.invoke();         // 触发加载更多
}
```

- 阈值：最后一个可见 child 之后剩余的 span 数 ≤ 2（2 列布局下约 1 行），不是「滚到最底」
- `onScrolled` 只在 `dy > 0` 时检查；新 child 挂载时也检查一次
- 回调体（`Df.g` case 14）：`y0(vm, false, PULL_UP, ..., windowSizeType, rawWindowSizeType)`

`LoadMoreAction` 的守卫（`LoadMoreAction.java:44-56`）：

```kotlin
if (store.getState().c()) return l("loadMore isLoading")          // 去重
if (state.feeds.size >= vm.u.a) return l("loadMore feeds size is max")  // 列表上限
dispatch(vm.i(0))                                                  // 尾部插入 footer_loading 卡片
val resp = request.a.b(param, parser)
// 响应追加到列表尾部；若返回空或 d()=true → dispatch(vm.e(...)) 显示"没有更多"
```

列表上限 `com.bilibili.pegasus.vm.u.a` 是一个懒加载配置（`BA1.c(13)`），默认值未在代码中直接可见，运行时可被下发覆盖。

## 3.3 页大小

请求里**没有** `ps` / `page_size` / `page` 参数，每页返回多少张卡完全由服务端决定。客户端只负责把 `idx` 游标回传。

## 4. `flush` 枚举

```java
// com.bilibili.pegasus.data.request.PegasusFlush
NORMAL(0)                        AUTO_BACK_FROM_BACKGROUND(1)     SWITCH_STYLE(2)
INTEREST(3)                      SWITCH_PEGASUS_RECOMMEND_MODE(4) TAB_CLICK(5)
PULL_DOWN(6)                     TOP_REFRESH_BUTTON_CLICK(7)      PULL_UP(8)
AUTO_BACK_FROM_OTHER_PAGE(9)     SWITCH_RECOMMEND_MODE_FROM_SETTINGS(11)
SWITCH_RECOMMEND_MODE_FROM_GUIDANCE(12)                           TAB_CLICK_WITH_OFFSET(14)
TAB_DOUBLE_CLICK(15)             BOTTOM_REFRESH_BUTTON_CLICK(16)  VIDEO_MODE_CHANGE(17)
REFRESH_GUIDANCE(18)             HOME_TAB_REFRESH_GUIDANCE(19)    AUTO_BACK_FROM_BEHAVIOR(20)
LOGIN_CHANGE(21)                 FLUSH_TAB_SWITCH_COLUMN(22)      FLUSH_ON_BACK_PRESS(23)
```

这个枚举是**服务端区分刷新意图**的主要信号：下拉刷新、切 tab、从别的页面返回、登录态变化、返回键刷新……都会带不同的 `flush`。第三方客户端如果永远发 0，服务端就无法区分"用户主动刷新"和"被动回填"。

## 5. 没有任何「过滤已看」参数

逐项核对过接口签名与 `ME0.f` 的字段（`a`–`k`），**不存在** `filter` / `hide_watched` / `unwatched` 之类的开关。

- 请求侧：无
- 响应侧：卡片模型 `BasicIndexItem` 的字段里**没有** `is_watched` / `progress` / `has_viewed`（全 dex 搜 `is_watched`、`has_viewed`、`played_seconds` 均为 0 命中；`watched` 只命中了番剧/直播的其他模型）
- 客户端侧：`pegasus` 模块没有「已看过滤」逻辑

结论：**服务端是否过滤已看，只看它自己掌握的观看历史**（来自 `/x/v2/history/report`），不通过这些参数控制。第三方客户端如果想影响推荐，唯一的抓手就是把历史报准。

## 6. 响应模型要点

`BasicIndexItem`（feed 卡片）关键字段：

```
idx, id, param, goto, card_goto, card_type, card_position,
cover, square_cover, title, subtitle,
args { aid, rid, tid, up_id, up_name, rname, tname, track_id, ... },
player_args { ... },
three_point_v2[], three_point_v3[], three_point_v4,
dislike_report_data, track_id, request_id, av_feature, dalao_feature,
show_url, click_url, extra_rpt_fields, ...
```

- `three_point_v2` 是负反馈面板的数据源，结构见 [recommendation-feedback.md](recommendation-feedback.md)
- `dislike_report_data` 会原样作为 `report_data` 参数回传给 `/x/feed/dislike`
- `track_id` 会作为 `track_id` 参数回传
- 卡片同时提供 **protobuf 构造路径**（`BasicIndexItem(m7.b0 b0Var)`），说明服务端可下发 `bapis.bilibili.app.card.v1.*` 的 protobuf 卡；JSON 与 protobuf 字段一一对应

## 7. 关于 `fresh_idx / fresh_type / ps / feed_version / homepage_ver / brush / y_num`

这些是 **web 端** `/x/web-interface/wbi/index/top/feed/rcmd` 的参数，两个官方 APK 的 dex 里**一个都没有**（`fresh_type` 的命中全是 `refresh_type` 的子串误匹配）。

| 参数 | 推断语义 | 置信度 |
|---|---|---|
| `fresh_idx` | 本次刷新内的第几屏 | 中 |
| `fresh_type` | 刷新类型 | 中 |
| `ps` | 每页条数 | 高 |
| `brush` | 防重复刷新的浏览器标记 | 低 |
| `y_num` | 已展示条数，控制下发节奏 | 低 |
| `feed_version` / `homepage_ver` | 实验分组 / 首页版本 | 低 |

**没有证据**表明其中任何一个能让服务端过滤已看。不要基于这些猜测做实现。

## 8. 证据

| 内容 | 文件 | 行 |
|---|---|---|
| 接口签名 | `evidence/classes/com__bilibili__pegasus__request__c.java` | 11–14 |
| 实参映射 | `evidence/classes/com__bilibili__pegasus__request__a.java` | 106 |
| 参数容器 | `evidence/classes/com__bilibili__pegasus__request__d.java` | 1–40 |
| 翻页 idx | `evidence/classes/com__bilibili__pegasus__vm__PegasusViewModel.java` | 695–701 |
| flush 枚举 | `evidence/classes/com__bilibili__pegasus__data__request__PegasusFlush.java` | 1–45 |
| open_event 枚举 | `evidence/classes/com__bilibili__pegasus__data__request__OpenEvent.java` | 1–20 |
| 卡片字段 | `evidence/classes/com__bilibili__pegasus__api__model__BasicIndexItem.java` | 1–200 |
| 请求参数对象 | `evidence/classes/ME0__f__RequestParam.java` | 1–40 |
| 下拉刷新预加载 | `evidence/classes/com__bilibili__pegasus__vm__PegasusViewModel.java` | 706–735, 1239–1256 |
| 刷新 Action | `evidence/classes/com__bilibili__pegasus__vm__RefreshAction.java` | 40–230 |
| 加载更多 Action | `evidence/classes/com__bilibili__pegasus__vm__LoadMoreAction.java` | 30–70 |
| 上滑触发阈值 | `evidence/classes/com__bilibili__pegasus__widget__h__loadmore_trigger.java` | 1–68 |
| 加载更多回调体 | `evidence/classes/Df_g__loadmore_lambda.java` | 1–8 |
