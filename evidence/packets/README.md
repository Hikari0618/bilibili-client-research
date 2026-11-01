# 抓包样本

本目录用于存放验证用的请求样本。**提交前必须打码**。

## 允许保留

- 接口路径、HTTP 方法、`Content-Type`
- 参数名与参数结构
- 值：`aid` / `cid` / `bvid` 可以保留（公开内容标识），`duration` / `progress` / `type` / `scene` / `flush` / `idx` 等行为参数保留
- 时间戳可以保留到「秒」，但不要带设备时区/地理位置

## 必须打码

| 字段 | 处理 |
|---|---|
| `access_key` | 全部替换为 `AK_REDACTED` |
| `csrf` / `bili_jct` | `CSRF_REDACTED` |
| `mid` | `MID_REDACTED` |
| `buvid` / `buvid3` / `buvid4` | `BUVID_REDACTED` |
| `device_id` / `did` / `rpdid` | `DEVICE_REDACTED` |
| `oaid` / `idfa` | `OAID_REDACTED` |
| `fp_local` / `fp_remote` | `FP_REDACTED` |
| `session_id` / `session` | `SESSION_REDACTED` |
| Cookie / Set-Cookie | 整行删除 |
| `sign` / `w_rid` | 保留格式，值替换为 `SIGN_REDACTED` |

## 文件命名

```
<日期>-<场景>-<接口>.txt
2026-11-01-pause-history-report.txt
2026-11-01-exit-history-report.txt
2026-11-01-dislike.txt
```

## 建议记录的场景

1. 冷启动进首页（feed 请求参数）
2. 点进视频不播放就退出（是否有 history=0）
3. 播放 3 秒退出（history progress）
4. 播放 30 秒后暂停（心跳 END + history）
5. 播满全片（progress=-1）
6. 切后台继续播（report_scene=4）
7. 点「不感兴趣」（dislike 参数）
