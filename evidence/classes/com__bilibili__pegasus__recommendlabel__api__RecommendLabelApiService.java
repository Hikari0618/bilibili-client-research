package com.bilibili.pegasus.recommendlabel.api;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
@retrofit2.http.BaseUrl("https://app.bilibili.com")
public interface RecommendLabelApiService {
    @retrofit2.http.GET("/x/v2/feed/uinterest/more")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<com.bilibili.pegasus.recommendlabel.data.RecommendLabelMoreResponse>> getMoreRecommendLabelList();

    @retrofit2.http.GET("/x/v2/feed/uinterest")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<com.bilibili.pegasus.recommendlabel.data.RecommendLabelResponse>> getRecommendLabelList(@retrofit2.http.Query("need_all_label") int i);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("/x/v2/feed/uinterest/mng")
    p165vB0.a<com.bilibili.okretro.GeneralResponse<com.bilibili.okretro.BaseResponse>> managerRecommendLabel(@retrofit2.http.Field("fixed_label") java.lang.String str, @retrofit2.http.Field("unfixed_label") java.lang.String str2, @retrofit2.http.Field("changed_label") java.lang.String str3, @retrofit2.http.Field("action") int i);
}
