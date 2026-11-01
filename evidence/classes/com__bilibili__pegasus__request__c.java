package com.bilibili.pegasus.request;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
@retrofit2.http.BaseUrl("https://app.bilibili.com")
public interface c {
    @retrofit2.http.GET("/x/v2/feed/second/interest")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<LE0.d>> a(@retrofit2.http.Query("oaid") java.lang.String str, @retrofit2.http.Query("interest_id") long j, @retrofit2.http.Query("interest_result") java.lang.String str2, @retrofit2.http.Query("interest_type") java.lang.String str3, @retrofit2.http.Query("device_type") long j2);

    @retrofit2.http.GET("/x/v2/feed/index")
    @com.bilibili.okretro.anno.RequestInterceptor(com.bilibili.pegasus.request.e.class)
    p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> b(@retrofit2.http.Query("idx") long j, @retrofit2.http.Query("pull") boolean z, @retrofit2.http.Query("login_event") int i, @retrofit2.http.Query("open_event") java.lang.String str, @retrofit2.http.Query("banner_hash") java.lang.String str2, @retrofit2.http.Query("interest_result") java.lang.String str3, @retrofit2.http.Query("flush") int i2, @retrofit2.http.Query("interest_id") long j2, @retrofit2.http.Query("splash_id") java.lang.String str4, @retrofit2.http.Query("splash_ids") java.lang.String str5, @retrofit2.http.Query("splash_creative_id") long j3, @retrofit2.http.Query("interest_pos_ids") java.lang.String str6, @retrofit2.http.Query("cny_info") java.lang.String str7, @retrofit2.http.Query("clipboard_video_id") java.lang.String str8, @retrofit2.http.Query("clipboard_unique_k") java.lang.String str9, @retrofit2.http.Query("window_size_type") int i3, @retrofit2.http.Query("raw_window_size_type") int i4);

    @retrofit2.http.GET("/x/v2/feed/index/interest")
    @com.bilibili.okretro.anno.RequestInterceptor(AB0.a.class)
    p165vB0.a<com.bilibili.okretro.GeneralResponse<LE0.d>> c(@retrofit2.http.Query("oaid") java.lang.String str, @retrofit2.http.Query("cny_info") java.lang.String str2, @retrofit2.http.Query("action") int i);
}
