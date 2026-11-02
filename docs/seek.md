# 手动拖动进度条：seek 算法（全屏 / 非全屏）

样本：`com.bilibili.app.in` 6.5.0（classes17 / classes26）。
核心类：`com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3`（下称 PSW3）。

---

## 0. 结论

**全屏和非全屏用的是同一个控件、同一套判定，没有两套算法。**

`ScreenModeType` 只有三个值：

```
THUMB                  非全屏（竖屏详情页的小窗）
LANDSCAPE_FULLSCREEN   横屏全屏
VERTICAL_FULLSCREEN    竖屏全屏
```

三个模式共用 `PlayerSeekWidget3`，`onStopTrackingTouch` 走的是同一个 `R()`。
差别只在 UI：竖屏的进度条更细、拖动时的样式实验（`SeekExpConfig`）、以及竖屏没有左右滑动手势快进。

---

## 1. 三个阶段

### 1.1 按下（onStartTrackingTouch）

```java
// PSW3.java:363-370
parent.requestDisallowInterceptTouchEvent(true);   // 防止父容器（ViewPager/列表）抢事件
L(widget, true);
```

`L()`（PSW3.java:448-504）做的事：

```java
setSeeking(true);                       // 本地状态
seekService.j(true);                    // 通知所有监听者：进入 seeking（弹幕层据此暂停）
int progress = getProgress();
bVar.b(progress);                       // 通知 thumb 控制器
// 创建/复用预览气泡 widget（k 类，带 ThumbnailLoader2）
seekService.d();
wasPlaying = seekService.i.d;           // 记住拖动前是否在播
```

**没有 pause、没有 seek**。视频继续播，只是弹幕层被通知"正在 seek"。

### 1.2 移动（onProgressChanged，fromUser=true）

```java
// PSW3.java:349-358
if (fromUser) C(widget, progress);
```

`C()`（PSW3.java:421-444）：

```java
seekService.k(progress, max);           // 广播 (progress, max)，只给预览用
if (previewBubble == null || !previewShown) return;
previewShown = false;
previewBubble.update(progress, max, rect, type);
```

**整个拖动过程里没有任何 `seekTo`。** 全类只有一处 `seekTo`，在 `R()` 里。

预览气泡的类型：`aVar.b = Y() ? 1 : 2`（`Y()` 与免流卡/小窗相关）。

### 1.3 松手（onStopTrackingTouch）——真正决定 seek 的地方

```java
// PSW3.java:507-540
if (!seeking) { log("cancel stopTrackingTouch cause of not seeking"); return; }

hidePreviewBubble();
if (wasPlaying) seekService.p();        // 恢复播放
seekService.j(false);                   // 退出 seeking
bVar.c();                               // thumb 复位

int state = playerCore.getState();
if (!edgeTouch && (state == 4 || state == 5 || state == 6)) {
    int current = playerCore.getCurrentPosition();
    int delta   = getProgress() - current;

    if (delta > 2000 || delta < -500) {
        playerCore.seekTo(getProgress());   // 真 seek
    } else {
        setProgress(current);               // 回弹，不 seek
    }
}
setSeeking(false);
```

`state` 取值：`4`=播放中、`5`=暂停、`6`=播放完成（`RH1/p.java:1828` 把 100→4、101→5）。
准备中/缓冲时不处理。

---

## 2. 死区算法（核心）

```
delta = 目标位置 - 当前位置

delta > +2000ms   → seek
delta <  -500ms   → seek
-500 ≤ delta ≤ 2000 → 不 seek，进度条回弹到当前位置
```

非对称：**往前让 2 秒，往后只让 0.5 秒**。

合理之处：往前拖 1.9 秒，正常播放 1.9 秒也就到了，seek 反而会卡一下；往后拖 0.4 秒，用户多半是误触，回弹比跳回去更自然。

这个判定对进度条拖动和全屏手势快进**是同一个出口**（见 §4）。

---

## 3. 点击 vs 拖动

`f.onTouchEvent`（`seek/v3/f.java:246-320`）重写了触摸分发：

```java
ACTION_DOWN:
    // 判断落点是否在 thumb 附近
    float p = (getProgress()/getMax()) - ((x - paddingLeft)/width);
    if (|p * width| > thumbOffset) p = 0;
    onThumb = |p| > 0;

    // 把 DOWN 点挪到 thumb 的位置
    motionEvent.setLocation(thumbX, y);
    super.onTouchEvent(...);

ACTION_MOVE:
    if (!dragging && |downX - x| >= touchSlop) dragging = true;
    if (!onThumb) motionEvent.setLocation((x - downX) + thumbX, y);
    super.onTouchEvent(...);

ACTION_UP:
    if (dragging) { ... super ... }           // 正常拖动结束 → onStopTrackingTouch
    else {
        // 没拖动 = 点击：只检查有没有点中「精彩片段」标记
        hit = findWatchPoint(x);
        super.onTouchEvent(...);
        if (hit != null) hit.callback(hit.centerX);
    }
```

两个结论：

1. **点击进度条空白处不会跳转**。DOWN 被挪到 thumb 位置，SeekBar 认为你没动，进度不变；松手时 delta≈0，落在死区里，回弹。
2. **只有点中精彩片段（watch point）标记才会跳**，走的是 `r.f.invoke(centerX)` 回调。

这和原生 `SeekBar` 的默认行为（点哪跳哪）不一样，是有意为之。

---

## 4. 全屏手势快进走同一个出口

`PlayerSeekWidget3` 里注册了手势回调（`p063hG0.r`）：

```java
p()        // 手势开始
    controlContainer.i4();
    L(this, false);                      // 注意是 false

a(f, pair) // 手势移动
    progress = (int)(ratio * f + base);
    setProgress(progress);
    C(this, progress);                   // 同样的预览

b()        // 手势结束
    controlContainer.V1();
    setProgress(target);
    R(this);                             // 同一个 R()

onCancel()
    R(this);
```

所以：**手势快进和进度条拖动共用同一套死区判定**。

---

## 5. 全屏 / 非全屏的实际差异

| | THUMB（非全屏） | 全屏 |
|---|---|---|
| 控件 | PlayerSeekWidget3 | 同一个 |
| 松手判定 | `R()` 死区 | 同一个 `R()` |
| 预览气泡 | 有（`k` 类 + 缩略图） | 有 |
| 左右滑动手势快进 | 无（`onSeekGestureEnableChange` 里被置 null） | 有 |
| 拖动时样式 | `SeekExpConfig` 实验：ONLINE / PLAN_A / PLAN_B | 不参与 |

`SeekExpConfig`（`playerbizcommonv2/utils/SeekExpConfig.java`）从 `sp_seek_ratio_experiment` 读 A/B 配置：

- `PLAN_A`：进度条两侧留白 12dp，thumb 隐藏
- `PLAN_B`：留白 0，thumb 换成透明图
- `ONLINE`：默认

注意这段只在 `L(z=false)`（手势开始）时生效，进度条拖动（`L(z=true)`）不触发。也就是说竖屏拖进度条时并没有额外的样式动画，**行为与全屏一致**。

---

## 6. 伪代码

```kotlin
fun onStartTrackingTouch() {
    seeking = true
    seekService.setSeeking(true)      // 弹幕层暂停
    wasPlaying = player.isPlaying
    showPreviewBubble()
}

fun onProgressChanged(progress: Int, fromUser: Boolean) {
    if (!fromUser) return
    seekService.preview(progress, max)   // 只更新气泡，不 seek
}

fun onStopTrackingTouch() {
    if (!seeking) return
    hidePreviewBubble()
    if (wasPlaying) player.resume()
    seekService.setSeeking(false)

    if (state in setOf(PLAYING, PAUSED, COMPLETED)) {
        val delta = progress - player.currentPosition
        if (delta > 2000 || delta < -500) player.seekTo(progress)
        else progress = player.currentPosition      // 回弹
    }
    seeking = false
}
```

---

## 7. 未确认

- 预览气泡里缩略图的加载策略（`ThumbnailLoader2` 的取帧间隔/缓存）未展开。
- `seekService.d()` / `p()` 的具体副作用（隐藏/恢复哪个 widget）未逐行确认，只确认了「按拖动前状态恢复」这一层。
- 服务端下发的 `SeekExpConfig` 具体实验比例未知。

---

## 8. 证据

| 内容 | 文件 | 行 |
|---|---|---|
| 三个回调 | `evidence/classes/PlayerSeekWidget3.java` | 349-381 |
| 拖动中只更新预览 | 同上 | 421-444 |
| 开始拖动 | 同上 | 448-504 |
| 松手 + 死区 | 同上 | 507-540 |
| 触摸分发（点击/拖动） | `evidence/classes/com__bilibili__playerbizcommonv2__widget__seek__v3__f.java` | 246-320 |
| 手势结束调 R() | `PlayerSeekWidget3.java` | 223-233 |
| seek 服务 | `evidence/classes/tv__danmaku__biliplayerv2__service__C0.java` | 406-459 |
| 屏幕模式枚举 | `evidence/classes/ScreenModeType.java` | 1-20 |
| UI 实验 | `evidence/classes/SeekExpConfig.java` | 1-80 |
| 状态映射 | `RH1/p.java` | 1828-1837 |
