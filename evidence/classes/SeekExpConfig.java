package com.bilibili.playerbizcommonv2.utils;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/seek/dex/classes17.dex */
public final class SeekExpConfig {
    public static final com.bilibili.playerbizcommonv2.utils.SeekExpConfig a = new com.bilibili.playerbizcommonv2.utils.SeekExpConfig();

    /* JADX INFO: compiled from: BL */
    public enum UiStyle {
        ONLINE,
        PLAN_A,
        PLAN_B;

        private static final /* synthetic */ fy1.a $ENTRIES = kotlin.enums.a.a(values());

        public static fy1.a<com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle> getEntries() {
            return $ENTRIES;
        }
    }

    public static com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle a() {
        com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle uiStyle;
        java.lang.Object objB;
        com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle uiStyle2 = null;
        if (kntr.app.following.opusDetail.ui.g.a) {
            try {
                objB = kotlin.Result.constructor-impl(java.lang.Integer.valueOf(Lo.m.j(Zn0.e.a()).getInt("debug_seek_ui_style", -1)));
            } catch (java.lang.Throwable th) {
                objB = S1.e.b(th);
            }
            if (kotlin.Result.isFailure-impl(objB)) {
                objB = -1;
            }
            int iIntValue = ((java.lang.Number) objB).intValue();
            if (iIntValue == 0) {
                uiStyle2 = com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.ONLINE;
            } else if (iIntValue == 1) {
                uiStyle2 = com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.PLAN_A;
            } else if (iIntValue == 2) {
                uiStyle2 = com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.PLAN_B;
            }
        }
        if (uiStyle2 != null) {
            return uiStyle2;
        }
        org.json.JSONObject jSONObjectB = b();
        if (jSONObjectB == null) {
            uiStyle = com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.ONLINE;
        } else {
            java.lang.String string = kotlin.text.u.G0(jSONObjectB.optString("seek_style")).toString();
            if (kotlin.jvm.internal.n.f(string, com.bilibili.pegasus.api.modelv2.UGCInlineMenusConfig.FLAG_VISIBLE)) {
                uiStyle = com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.PLAN_A;
            } else {
                uiStyle = kotlin.jvm.internal.n.f(string, "2") ? com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.PLAN_B : com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.ONLINE;
            }
        }
        return uiStyle;
    }

    public static org.json.JSONObject b() {
        java.lang.Object objB;
        java.lang.Object objB2;
        com.bilibili.playerbizcommonv2.utils.g.b();
        try {
            objB = kotlin.Result.constructor-impl((java.lang.String) Lo.m.j(Zn0.e.a()).get("sp_seek_ratio_experiment", ""));
        } catch (java.lang.Throwable th) {
            objB = S1.e.b(th);
        }
        if (kotlin.Result.isFailure-impl(objB)) {
            objB = null;
        }
        java.lang.String str = (java.lang.String) objB;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            objB2 = kotlin.Result.constructor-impl(new org.json.JSONObject(str));
        } catch (java.lang.Throwable th2) {
            objB2 = S1.e.b(th2);
        }
        return (org.json.JSONObject) (kotlin.Result.isFailure-impl(objB2) ? null : objB2);
    }
}
