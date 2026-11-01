package p114iC1;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
@retrofit2.http.BaseUrl("https://app.bilibili.com")
public interface a {
    @retrofit2.http.GET("/x/feed/dislike")
    vB0.a<java.lang.String> a(@retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> map);

    @retrofit2.http.GET("/x/v2/feed/nf")
    vB0.a<com.bilibili.okretro.GeneralResponse<tv.danmaku.bili.dislikefeedback.remote.NfResponse>> b(@retrofit2.http.Query("goto") java.lang.String str, @retrofit2.http.Query("id") long j, @retrofit2.http.Query("title") java.lang.String str2, @retrofit2.http.Query("from") long j2, @retrofit2.http.Query("up_name") java.lang.String str3, @retrofit2.http.Query("dislike_info") java.lang.String str4, @retrofit2.http.Query("is_second_panel") boolean z);

    @retrofit2.http.GET("/x/feed/dislike/cancel")
    vB0.a<java.lang.String> cancelDislike(@retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> map);
}
