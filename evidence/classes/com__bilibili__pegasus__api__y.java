package com.bilibili.pegasus.api;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public final class y {
    public static java.lang.String a = "cold";
    public static volatile boolean b = true;
    public static long c;
    public static boolean d;

    public static void a(com.bilibili.pegasus.api.model.BasicIndexItem basicIndexItem, @androidx.annotation.Nullable java.lang.String str, java.lang.String str2, @androidx.annotation.Nullable java.lang.String str3, @androidx.annotation.Nullable java.lang.String str4) {
        java.util.HashMap map = new java.util.HashMap(11);
        java.lang.String strB = B9.Q.b();
        if (strB != null) {
            map.put(p158uC0.a.d, strB);
        }
        map.put("id", java.lang.String.valueOf(basicIndexItem.param));
        java.lang.String str5 = basicIndexItem.cardGoto;
        if (str5 != null) {
            map.put("goto", str5);
        }
        com.bilibili.pegasus.api.modelv2.Args args = basicIndexItem.args;
        if (args != null) {
            long j = args.upId;
            if (j > 0) {
                map.put("mid", java.lang.String.valueOf(j));
            }
            long j2 = args.rid;
            if (j2 > 0) {
                map.put("rid", java.lang.String.valueOf(j2));
            }
            long j3 = args.tid;
            if (j3 > 0) {
                map.put("tag_id", java.lang.String.valueOf(j3));
            }
        }
        java.lang.String str6 = basicIndexItem.dislikeReportData;
        if (str6 != null) {
            map.put("report_data", str6);
        }
        com.bilibili.adcommon.data.model.FeedAdInfo feedAdInfo = basicIndexItem.adInfo;
        if (feedAdInfo != null && !android.text.TextUtils.isEmpty(feedAdInfo.getAdCb())) {
            map.put("ad_cb", basicIndexItem.adInfo.getAdCb());
        }
        if ((basicIndexItem instanceof nd0.d) && ((nd0.d) basicIndexItem).isNatureAd()) {
            map.put("nature_ad", "-1");
        }
        if (str3 != null && !str3.isEmpty()) {
            map.put("extra", str3);
        }
        map.put("spmid", "tm.recommend.0.0");
        if (!android.text.TextUtils.isEmpty(basicIndexItem.trackId)) {
            map.put("track_id", basicIndexItem.trackId);
        }
        java.lang.String strA = A5.E.a();
        if (!android.text.TextUtils.isEmpty(strA)) {
            map.put("action_id", strA);
        }
        map.put("is_light_panel", java.lang.String.valueOf(basicIndexItem.isLightPanel));
        map.put("old_pegasus", com.bilibili.pegasus.api.modelv2.UGCInlineMenusConfig.FLAG_VISIBLE);
        AW.b.j(str, str2, str4, (java.lang.String) null, map);
    }

    public static void b(com.bilibili.pegasus.api.model.BasicIndexItem basicIndexItem, @androidx.annotation.Nullable java.lang.String str, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable java.lang.String str3, @androidx.annotation.Nullable java.lang.String str4) {
        java.util.HashMap map = new java.util.HashMap(15);
        map.put("id", java.lang.String.valueOf(basicIndexItem.param));
        java.lang.String str5 = basicIndexItem.cardGoto;
        if (str5 != null) {
            map.put("goto", str5);
        }
        com.bilibili.pegasus.api.modelv2.Args args = basicIndexItem.args;
        if (args != null) {
            long j = args.upId;
            if (j > 0) {
                map.put("mid", java.lang.String.valueOf(j));
            }
            long j2 = args.rid;
            if (j2 > 0) {
                map.put("rid", java.lang.String.valueOf(j2));
            }
            long j3 = args.tid;
            if (j3 > 0) {
                map.put("tag_id", java.lang.String.valueOf(j3));
            }
        }
        java.lang.String str6 = basicIndexItem.dislikeReportData;
        if (str6 != null) {
            map.put("report_data", str6);
        }
        com.bilibili.adcommon.data.model.FeedAdInfo feedAdInfo = basicIndexItem.adInfo;
        if (feedAdInfo != null && !android.text.TextUtils.isEmpty(feedAdInfo.getAdCb())) {
            map.put("ad_cb", basicIndexItem.adInfo.getAdCb());
        }
        if ((basicIndexItem instanceof nd0.d) && ((nd0.d) basicIndexItem).isNatureAd()) {
            map.put("nature_ad", "-1");
        }
        if (str3 != null && !str3.isEmpty()) {
            map.put("extra", str3);
        }
        map.put("spmid", "tm.recommend.0.0");
        if (!android.text.TextUtils.isEmpty(basicIndexItem.trackId)) {
            map.put("track_id", basicIndexItem.trackId);
        }
        java.lang.String strA = A5.E.a();
        if (!android.text.TextUtils.isEmpty(strA)) {
            map.put("action_id", strA);
        }
        map.put("is_light_panel", java.lang.String.valueOf(basicIndexItem.isLightPanel));
        map.put("old_pegasus", com.bilibili.pegasus.api.modelv2.UGCInlineMenusConfig.FLAG_VISIBLE);
        AW.b.k(str, str2, str4, (java.lang.String) null, map);
    }

    public static java.lang.String c() {
        int iC = Mo.c.b().c();
        if (iC == 1) {
            return "wifi";
        }
        if (iC != 2) {
            return iC != 5 ? "" : "wifi";
        }
        return "mobile";
    }

    public static void d(int i, long j, @androidx.annotation.Nullable java.lang.String str, final long j2, @androidx.annotation.Nullable java.lang.String str2, int i2, @androidx.annotation.Nullable java.lang.String str3, java.lang.String str4, int i3, @androidx.annotation.Nullable com.bilibili.pegasus.api.l lVar, final p157uB0.b<com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse> bVar) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(lVar);
        if (Lo.j.a() == null) {
            return;
        }
        com.bapis.bilibili.app.show.popular.v1.PopularResultReq.b idx = com.bapis.bilibili.app.show.popular.v1.PopularResultReq.newBuilder().setSourceId(i).setIdx(j2);
        if (str2 == null) {
            str2 = "";
        }
        com.bapis.bilibili.app.show.popular.v1.PopularResultReq.b loginEvent = idx.setLastParam(str2).setLoginEvent(i2);
        if (str3 == null) {
            str3 = "";
        }
        final com.bapis.bilibili.app.show.popular.v1.PopularResultReq popularResultReqBuild = loginEvent.setVer(str3).setPlayerArgs(com.bilibili.app.comm.list.common.api.f.b()).setSpmid(str4).setEntranceId(j).setLocationIds(str).setFlush(i3).setPopularAd(com.bapis.bilibili.app.show.popular.v1.PopularAd.newBuilder().setExtra(Dd0.m.d.get()).build()).build();
        G5.g.b(new java.util.concurrent.Callable() { // from class: com.bilibili.pegasus.api.w
            /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
            /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.moss.api.MossException */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws com.bilibili.api.BiliApiException, com.bilibili.lib.moss.api.MossException {
                java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                long j3 = j2;
                com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse pegasusHotFeedResponse = null;
                try {
                    com.bapis.bilibili.app.show.popular.v1.PopularReply popularReplyExecuteIndex = new com.bapis.bilibili.app.show.popular.v1.PopularMoss().executeIndex(popularResultReqBuild);
                    if (popularReplyExecuteIndex == null) {
                        return null;
                    }
                    try {
                        if (atomicReference2.get() != null && j3 == 0) {
                            ((com.bilibili.pegasus.api.l) atomicReference2.get()).a(popularReplyExecuteIndex);
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    return new com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse(popularReplyExecuteIndex);
                } catch (com.bilibili.lib.moss.api.MossException e) {
                    try {
                        if (atomicReference2.get() != null && j3 == 0) {
                            pegasusHotFeedResponse = ((com.bilibili.pegasus.api.l) atomicReference2.get()).read();
                        }
                    } catch (java.lang.Throwable unused2) {
                    }
                    if (pegasusHotFeedResponse != null) {
                        return pegasusHotFeedResponse;
                    }
                    throw e;
                } catch (com.bilibili.lib.moss.api.BusinessException e2) {
                    try {
                        if (atomicReference2.get() != null && j3 == 0) {
                            pegasusHotFeedResponse = ((com.bilibili.pegasus.api.l) atomicReference2.get()).read();
                        }
                    } catch (java.lang.Throwable unused3) {
                    }
                    if (pegasusHotFeedResponse != null) {
                        return pegasusHotFeedResponse;
                    }
                    throw new com.bilibili.api.BiliApiException(e2.getCode(), e2.getMessage(), e2);
                }
            }
        }).d(new G5.f() { // from class: com.bilibili.pegasus.api.x
            public final java.lang.Object then(G5.g gVar) {
                p157uB0.b bVar2 = bVar;
                if (bVar2.d()) {
                    return null;
                }
                if (gVar.n()) {
                    bVar2.i(gVar.j());
                    return null;
                }
                bVar2.k((com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse) gVar.k());
                return null;
            }
        }, G5.g.i, (G5.c) null);
    }
}
