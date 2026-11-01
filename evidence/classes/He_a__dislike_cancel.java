package He;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes10.dex */
public final class a implements Dd0.o {
    public static final He.a a = new He.a();

    public static androidx.collection.a g(java.lang.String str, Hg.d dVar, java.lang.String str2, java.lang.String str3) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (!android.text.TextUtils.isEmpty(str)) {
            aVar.put("access_key", str);
        }
        if (dVar != null && dVar.getCreativeId() != 0) {
            aVar.put("id", java.lang.String.valueOf(dVar.getCreativeId()));
        }
        if (dVar != null && !android.text.TextUtils.isEmpty(dVar.getAdCb())) {
            aVar.put("ad_cb", dVar.getAdCb());
        }
        aVar.put("buvid", com.bilibili.adcommon.utils.d.c());
        if (str2 != null) {
            if (kotlin.text.u.b0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                aVar.put("spmid", str2);
            }
        }
        if (str3 != null) {
            if (kotlin.text.u.b0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                aVar.put("track_id", str3);
            }
        }
        java.lang.String strA = A5.E.a();
        if (strA != null) {
            java.lang.String str4 = kotlin.text.u.b0(strA) ? null : strA;
            if (str4 != null) {
                aVar.put("action_id", str4);
            }
        }
        return aVar;
    }

    public final void a(java.lang.String str, Hg.d dVar, java.lang.Integer num, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, boolean z2) {
        java.util.Map<java.lang.String, java.lang.String> mapG = g(str, dVar, "tm.recommend.0.0", str4);
        if (!android.text.TextUtils.isEmpty(str2)) {
            mapG.put("goto", str2);
        }
        if (z) {
            mapG.put("nature_ad", "1");
            mapG.put(str3, java.lang.String.valueOf(num));
            if (!android.text.TextUtils.isEmpty(str5)) {
                mapG.put("extra", str5);
            }
        } else {
            mapG.put("cm_reason_id", java.lang.String.valueOf(num));
        }
        mapG.put("is_light_panel", java.lang.String.valueOf(z2));
        ((com.bilibili.ad.core.dislike.DislikeApiService) uB0.d.b(com.bilibili.ad.core.dislike.DislikeApiService.class)).cancelFeedDislike(mapG).c();
    }

    public final void b(java.lang.String str, Hg.d dVar, java.lang.Integer num, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5) {
        java.util.Map<java.lang.String, java.lang.String> mapG = g(str, dVar, str4, str5);
        if (!android.text.TextUtils.isEmpty(str2)) {
            mapG.put("goto", str2);
        }
        if (z) {
            mapG.put("cm_reason_id", "0");
            mapG.put("nature_ad", "1");
            mapG.put(str3, java.lang.String.valueOf(num));
        } else {
            mapG.put("cm_reason_id", java.lang.String.valueOf(num));
            mapG.put("reason_id", java.lang.String.valueOf(num));
        }
        ((com.bilibili.ad.core.dislike.DislikeApiService) uB0.d.b(com.bilibili.ad.core.dislike.DislikeApiService.class)).cancelVideoDislike(mapG).c();
    }

    public final void c(java.lang.String str, Hg.d dVar, java.lang.Integer num, java.lang.Long l, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5) {
        java.util.Map<java.lang.String, java.lang.String> mapG = g(str, dVar, str4, str5);
        if (!android.text.TextUtils.isEmpty(str2)) {
            mapG.put("goto", str2);
        }
        if (l != null) {
            mapG.put("avid", java.lang.String.valueOf(l.longValue()));
        }
        if (z) {
            mapG.put("cm_reason_id", "0");
            mapG.put("nature_ad", "1");
            mapG.put(str3, java.lang.String.valueOf(num));
        } else {
            mapG.put("cm_reason_id", java.lang.String.valueOf(num));
        }
        ((com.bilibili.ad.core.dislike.DislikeApiService) uB0.d.b(com.bilibili.ad.core.dislike.DislikeApiService.class)).videoDislike(mapG).c();
    }

    public final void d(java.lang.String str, Hg.d dVar, java.lang.Integer num, java.lang.String str2, java.lang.String str3, boolean z, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, Zx1.o> function1, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z2) {
        java.util.Map<java.lang.String, java.lang.String> mapG = g(str, dVar, str4, str5);
        if (!android.text.TextUtils.isEmpty(str2)) {
            mapG.put("goto", str2);
        }
        if (z) {
            mapG.put("nature_ad", "1");
            mapG.put(str3, java.lang.String.valueOf(num));
            if (!android.text.TextUtils.isEmpty(str6)) {
                mapG.put("extra", str6);
            }
        } else {
            mapG.put("cm_reason_id", java.lang.String.valueOf(num));
        }
        mapG.put("is_light_panel", java.lang.String.valueOf(z2));
        if (function1 != null) {
            function1.invoke(mapG);
        }
        ((com.bilibili.ad.core.dislike.DislikeApiService) uB0.d.b(com.bilibili.ad.core.dislike.DislikeApiService.class)).feedDislike(mapG).c();
    }
}
