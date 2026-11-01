package tv.danmaku.biliplayerimpl.report.heartbeat;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
@retrofit2.http.BaseUrl("https://api.bilibili.com")
public interface c {
    @retrofit2.http.POST("/x/report/click/android2")
    @com.bilibili.okretro.anno.RequestInterceptor(AB0.c.class)
    vB0.a<java.lang.String> a(@retrofit2.http.Body okhttp3.RequestBody requestBody);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("/x/report/heartbeat/mobile")
    vB0.a<com.bilibili.okretro.GeneralResponse<java.lang.String>> b(@retrofit2.http.FieldMap tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams heartbeatParams);
}
