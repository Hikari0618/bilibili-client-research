package com.bilibili.playerbizcommonv2.api;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
@retrofit2.http.BaseUrl("https://api.bilibili.com")
public interface c {
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("/x/v2/history/report_scene")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<java.lang.Object>> a(@retrofit2.http.Field(p158uC0.a.d) java.lang.String str, @retrofit2.http.FieldMap java.util.Map<java.lang.String, java.lang.String> map, @retrofit2.http.Field("cid") long j, @retrofit2.http.Field("aid") long j2, @retrofit2.http.Field("source") java.lang.String str2, @retrofit2.http.Field("duration") long j3, @retrofit2.http.Field("progress") long j4, @retrofit2.http.Field("type") int i, @retrofit2.http.Field("device_ts") long j5, @retrofit2.http.Field("start_ts") long j6, @retrofit2.http.Field("scene") java.lang.String str3, @retrofit2.http.Field("report_scene") long j7);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("/x/v2/history/report")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<java.lang.Object>> b(@retrofit2.http.Field(p158uC0.a.d) java.lang.String str, @retrofit2.http.FieldMap java.util.Map<java.lang.String, java.lang.String> map, @retrofit2.http.Field("cid") long j, @retrofit2.http.Field("aid") long j2, @retrofit2.http.Field("source") java.lang.String str2, @retrofit2.http.Field("duration") long j3, @retrofit2.http.Field("progress") long j4, @retrofit2.http.Field("type") int i, @retrofit2.http.Field("device_ts") long j5, @retrofit2.http.Field("start_ts") long j6, @retrofit2.http.Field("scene") java.lang.String str3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("/x/v2/history/report_list")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<java.lang.Object>> c(@retrofit2.http.Field(p158uC0.a.d) java.lang.String str, @retrofit2.http.Field("cid") java.lang.String str2, @retrofit2.http.Field("aid") java.lang.String str3, @retrofit2.http.Field("parent_type") java.lang.String str4, @retrofit2.http.Field("parent_id") java.lang.String str5, @retrofit2.http.Field("source") java.lang.String str6);
}
