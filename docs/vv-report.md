# VV 播放计数：`POST /x/report/click/android2`

这是官方客户端用来给「一次播放」计数（播放量 / VV）的接口。它不走常规的 form + appkey 签名，而是**参数串先签名、再整体 AES 加密**后作为二进制 body 发送。

本文的加密参数已从字节码完整解出，可以直接复现。

---

## 1. 接口定义

```java
// tv.danmaku.biliplayerimpl.report.heartbeat.c
@BaseUrl("https://api.bilibili.com")
public interface c {
    @POST("/x/report/click/android2")
    @RequestInterceptor(AB0.c.class)
    vB0.a<String> a(@Body RequestBody requestBody);   // Content-Type: application/octet-stream

    @FormUrlEncoded @POST("/x/report/heartbeat/mobile")
    vB0.a<GeneralResponse<String>> b(@FieldMap HeartbeatParams params);
}
```

证据：`evidence/classes/tv__danmaku__biliplayerimpl__report__heartbeat__c.java:5-14`

## 2. 触发时机

| 条件 | 说明 |
|---|---|
| 播放器状态 = 3（真正起播） | `onPlayerStateChanged(3)`，且当前没有 `ReportContext`（新会话） |
| 同一会话只发一次 | 有 `ReportContext` 后不再触发；切 P / 换视频会重置 |
| 进详情页不播放 | **不触发**（只走 InfoEyes 埋点） |

证据：`f.java:206-296`（state 分支）、`f.java:270-300`（构造 `ReportContext` 后调 VV）

## 3. 参数表（29 个）

按 key 字典序排列（`TreeMap`），值为 `Uri.encode()` 后的字符串。

| 参数 | 语义 | 来源 / 说明 |
|---|---|---|
| `aid` | 稿件 avid | `Video.g.a` |
| `cid` | 分 P cid | `Video.g.b` |
| `part` | 第几个分 P | `Video.g.o` |
| `mid` | 用户 id | 账号信息 |
| `lv` | 用户等级 | 账号信息 |
| `ftime` | **该设备首次播放时间**（epoch 秒） | `SharedPreferences["first_play_time"]`，不存在则写入当前时间 |
| `stime` | 本次播放时间（epoch 秒） | `now/1000` |
| `did` | 设备播放 id（rpdid） | 本地 `rpdid`，首次为空，服务端回填 |
| `type` | 视频类型（3=UGC，4=番剧） | `Video.g.h` |
| `sub_type` | 子类型 | `Video.g.i` |
| `sid` | 番剧 season id | `Video.g.g` |
| `epid` | 番剧 ep id | `Video.g.j` |
| `platform` | 平台 | `Mg.a.j()` → `android` |
| `auto_play` | 是否自动起播 | `Video.g.k` |
| `access_key` | 登录态（仅登录时带） | 账号 |
| `play_mode` | 播放模式（非空才带） | `Video.g.q` |
| `cur_language` | 当前语言 | 播放器上下文 |
| `perfer_type` | 偏好类型 | 播放器上下文 |
| `is_auto_qn` | `1`/`0` 自动清晰度 | 播放器 |
| `is_audio_play` | `1`/`0` 音频播放 | 播放器 |
| `build` | 客户端 build 号 | `Mg.a.d()` |
| `mobi_app` |  App 标识 | `Mg.a.j()` |
| `spmid` | 当前页 spmid | `Video.g.e` |
| `from_spmid` | 来源页 spmid | `Video.g.f` |
| `track_id` | 推荐 track id | `Video.g.r` |
| `session` | 播放会话 id | `f.getSession()` |
| `oaid` | OAID | 设备 |
| `polaris_action_id` | 埋点 action id | `rI0.b.b()` |
| `statistics` | 统计串（JSON） | `Mg.a.a()` 生成；含 `appId`/`platform` 等，具体取值未逆向 |
| `sign` | 签名（见下） | 追加在末尾 |

此外 `chronos` 实验参数会以任意 key 平铺进来（`com.bilibili.common.chronoscommon.effects.q.h(...)`）。

证据：`f.java:346-400`

## 4. 加密流程

```
1) 参数放入 TreeMap（按 key 升序）
2) 拼串：  k1=v1&k2=v2&...&kn=vn        （值做 Uri.encode，null → ""）
3) 签名：  sign = lower(hex(SHA256( query_bytes || salt_bytes )))
4) 追加：  plain = query + "&sign=" + sign
5) 加密：  body  = AES/CBC/PKCS5Padding( key, iv ).encrypt( plain_bytes )
6) 发送：  POST，Content-Type: application/octet-stream，body 为第 5 步的原始字节
```

**没有 Base64**，body 是裸密文。

### 4.1 常量

```java
// hJ1.b（p005hJ1.b）静态初始化
key  = ConfigManager["videodetail.report_click_secret_key"] ?: "fd6b639dbcff0c2a1b03b389ec763c4b"
iv   = ConfigManager["videodetail.report_click_iv"]         ?: "77b07a672d57d64c"
salt = ConfigManager["videodetail.report_click_salt"]       ?: "9cafa6466a028bfb"
```

| 常量 | 默认值 | 长度 | 用途 |
|---|---|---|---|
| key | `fd6b639dbcff0c2a1b03b389ec763c4b` | 32 ASCII 字节 → **AES-256** | 对称加密 |
| iv | `77b07a672d57d64c` | 16 字节 | CBC 初始向量 |
| salt | `9cafa6466a028bfb` | 16 字节 | 拼在 query 后做 SHA-256 |

三者都可被服务端配置覆盖——**写死默认值只能保证「当前版本可用」，客户端应在失败时回退或从配置读取**。

证据：`evidence/classes/hJ1_b__VV加密.java`、`evidence/classes/vb0_a__AES_CBC_PKCS5.java`、`evidence/classes/La0_a__SHA256签名.java:151-163`

### 4.2 关键源码

```java
// hJ1.b  （静态字段：a=key, b=iv, c=salt；静态方法 a(String) 用 key+iv 加密）
public static byte[] a(String str) {
    String key = a;                    // "fd6b639dbcff0c2a1b03b389ec763c4b"
    String iv  = b;                    // "77b07a672d57d64c"
    return a.b(new SecretKeySpec(key.getBytes(UTF8), "AES"),
               new IvParameterSpec(iv.getBytes(UTF8)),
               str.getBytes(UTF8));
}

// vb0.a
public static byte[] b(SecretKeySpec k, IvParameterSpec iv, byte[] data) {
    Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
    c.init(Cipher.ENCRYPT_MODE, k, iv);
    return c.doFinal(data);
}

// La0.a（签名）
public static String g(byte[] data, byte[] salt) {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(data);
    if (salt != null) md.update(salt);     // 直接拼接，无分隔符
    return hex(md.digest());               // 小写
}
```

### 4.3 参考实现（Python）

```python
import hashlib, urllib.parse
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad

KEY  = b"fd6b639dbcff0c2a1b03b389ec763c4b"
IV   = b"77b07a672d57d64c"
SALT = b"9cafa6466a028bfb"

def build_body(params: dict) -> bytes:
    q = "&".join(
        f"{k}={urllib.parse.quote(str(v), safe='')}"
        for k, v in sorted(params.items())
    )
    sign = hashlib.sha256(q.encode() + SALT).hexdigest()
    plain = (q + "&sign=" + sign).encode()
    return AES.new(KEY, AES.MODE_CBC, IV).encrypt(pad(plain, 16))
```

以上参数已用 `openssl enc -aes-256-cbc` 独立跑过往返（同一 key/iv，加密后再解密与原文逐字节一致），确认「32 字节 ASCII key → AES-256-CBC + PKCS7」这一组合正确。签名未对服务端验证。

调用：

```python
body = build_body({
    "aid": "114514", "cid": "22334455", "part": "1",
    "mid": "0", "lv": "0", "ftime": str(first_play_ts), "stime": str(now),
    "did": rpdid, "type": "3", "sub_type": "0", "sid": "0", "epid": "0",
    "platform": "android", "auto_play": "1", "access_key": AK,
    "build": "9110200", "mobi_app": "android",
    "spmid": "main.videodetail.0.0", "from_spmid": "tm.recommend.0.0",
    "track_id": TRACK, "session": SESSION, "oaid": OAID,
    "polaris_action_id": ACTION_ID,
    "statistics": '{"appId":1,"platform":3}',   # 占位：实际由 Mg.a.a() 生成
})
```

## 5. 响应

```json
{"code":0,"message":"0","data":{"rpdid":"..."}}
```

客户端会读 `data.rpdid` 并写回本地 `rpdid`，作为**下一次** VV 的 `did`（`f.java:423-450`）。首次请求 `did` 为空是正常的。

失败处理：`code != 0` 时上报 `player.vv_error` 埋点（avid/cid/seasonId/epId/spmid），不重试。

## 6. 证据

| 内容 | 文件 | 行 |
|---|---|---|
| 接口定义 | `evidence/classes/tv__danmaku__biliplayerimpl__report__heartbeat__c.java` | 5–14 |
| 参数拼装 / 签名 / 加密 / 发送 | `evidence/classes/tv__danmaku__biliplayerimpl__report__heartbeat__f.java` | 346–460 |
| 密钥 / IV / salt | `evidence/classes/hJ1_b__VV加密.java` | 22–40 |
| AES 实现 | `evidence/classes/vb0_a__AES_CBC_PKCS5.java` | 43–52 |
| SHA-256 签名 | `evidence/classes/La0_a__SHA256签名.java` | 151–163 |
| 触发时机 | `f.java` | 206–300 |

## 7. 未确认

- `AB0.c` 拦截器是否额外改了 header（该类在未反编译的 dex 中）——**B 级推断**：大概率补 `Buvid` / `fp_local` / `session_id` 等设备指纹头。
- 服务端是否强校验 `did`/`ftime`（去重维度）——**C 级未知**。
- `statistics` 的确切内容随 `Mg.a.a()` 变化（含 `appId`/`platform` 等），未逐项逆向。
- 加密常量被服务端配置覆盖后，硬编码实现会失效——**这是这套方案最大的脆弱点**。
