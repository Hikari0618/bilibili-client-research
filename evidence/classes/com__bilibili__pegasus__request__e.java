package com.bilibili.pegasus.request;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public final class e extends com.bilibili.app.comm.list.common.api.e {
    public static final int g = 8;
    private final kx0.b c;
    private final com.bilibili.pegasus.v d;
    private final com.bilibili.pegasus.j e;
    private final Zx1.e f;

    public e() {
        ki0.a aVar = ki0.a.a;
        this.c = (kx0.b) aVar.c(kx0.b.class, "pegasus_inline_volume_key");
        this.d = (com.bilibili.pegasus.v) aVar.c(com.bilibili.pegasus.v.class, "default");
        this.e = (com.bilibili.pegasus.j) aVar.c(com.bilibili.pegasus.j.class, "default");
        this.f = kotlin.b.b(kotlin.LazyThreadSafetyMode.NONE, new CW.v(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    public static final kotlin.Pair b() {
        java.lang.String strA = hh0.a.a();
        java.lang.String strB = "";
        if (hh0.b.g().j()) {
            int i = FO0.j.d;
            if (i != -1) {
                if (i == 0) {
                    java.lang.String strC = hh0.a.c();
                    java.lang.String strB2 = hh0.a.b();
                    if (strC.length() == 0) {
                        strB = strB2;
                    } else {
                        FO0.j.d = 1;
                        if (!strC.equals(strB2)) {
                            strB = strB2;
                        }
                    }
                }
            } else if (hh0.a.c().length() == 0) {
                FO0.j.d = 0;
                strB = hh0.a.b();
            } else {
                FO0.j.d = 1;
            }
        }
        kotlin.Pair pair = new kotlin.Pair(strA, strB);
        java.lang.Object first = pair.getFirst();
        java.lang.Object second = pair.getSecond();
        int i2 = FO0.j.d;
        java.lang.StringBuilder sbA = androidx.compose.animation.core.j.a("header_buvid: ", first, ", local_buvid: ", second, ", status: ");
        sbA.append(i2);
        tv.danmaku.android.log.BLog.i(sbA.toString());
        return pair;
    }

    private final java.lang.String c(java.lang.String str) {
        try {
            return p130qF0.b.a(str.getBytes(java.nio.charset.Charset.forName("UTF-8")));
        } catch (java.lang.Exception unused) {
            tv.danmaku.android.log.BLog.e("IndexParamInterceptor", "Fail to encrypt id string!!!");
            return "";
        }
    }

    private final java.lang.String d() {
        kx0.c cVar = (kx0.c) ki0.a.a.c(kx0.c.class, "default");
        return java.lang.String.valueOf(cVar == null ? 0 : Lj.f.g(cVar.getCurrentState(), cVar.b()));
    }

    private final java.lang.String e() {
        com.bilibili.pegasus.PegasusAutoRefreshMode pegasusAutoRefreshModeB;
        com.bilibili.pegasus.j jVar = this.e;
        if (jVar == null || (pegasusAutoRefreshModeB = jVar.b()) == null) {
            pegasusAutoRefreshModeB = com.bilibili.pegasus.PegasusAutoRefreshMode.MODE_SERVER_OPEN;
        }
        if (pegasusAutoRefreshModeB == com.bilibili.pegasus.PegasusAutoRefreshMode.MODE_DEFAULT) {
            pegasusAutoRefreshModeB = com.bilibili.pegasus.PegasusAutoRefreshMode.MODE_SERVER_OPEN;
        }
        return java.lang.String.valueOf(pegasusAutoRefreshModeB.getValue());
    }

    private final kotlin.Pair<java.lang.String, java.lang.String> f() {
        return (kotlin.Pair) this.f.getValue();
    }

    private final java.lang.String g() {
        int i = (hh0.b.g().j() && com.bilibili.pegasus.request.a.a) ? 1 : 0;
        com.bilibili.pegasus.request.a.e = i;
        return java.lang.String.valueOf(i);
    }

    private final java.lang.String h() {
        return c(k());
    }

    private final java.lang.String i() {
        return java.lang.String.valueOf((hh0.b.g().j() && com.bilibili.pegasus.request.a.b) ? 1 : 0);
    }

    private final java.lang.String j() {
        Zx1.e eVar = com.bilibili.playerbizcommon.utils.l.a;
        return java.lang.String.valueOf(1);
    }

    private final java.lang.String k() {
        com.google.gson.j jVar = new com.google.gson.j();
        java.lang.String strF = hh0.b.g().f();
        if (strF == null) {
            strF = "";
        }
        java.lang.String strA = hh0.b.g().a();
        java.lang.String str = strA != null ? strA : "";
        java.lang.String oaid = Nr0.b.a.getOaid();
        s(strF, str, oaid);
        jVar.u("imei", strF);
        jVar.u("androidid", str);
        jVar.u("oaid", oaid);
        return jVar.toString();
    }

    private final java.lang.String l() {
        tv.danmaku.biliplayerv2.service.setting.c.R3.getClass();
        return java.lang.String.valueOf(tv.danmaku.biliplayerv2.service.setting.c.a.b("inline_danmaku_switch", true) ? 2 : 1);
    }

    private final java.lang.String m() {
        kx0.b bVar = this.c;
        return java.lang.String.valueOf((bVar == null || !bVar.a()) ? 2 : 1);
    }

    private final java.lang.String n() {
        com.bilibili.pegasus.PegasusInlineVolumeMode pegasusInlineVolumeModeA;
        com.bilibili.pegasus.v vVar = this.d;
        return java.lang.String.valueOf((vVar == null || (pegasusInlineVolumeModeA = vVar.a()) == null) ? 0 : pegasusInlineVolumeModeA.getValue());
    }

    private final java.lang.String o() {
        java.lang.String str = com.bilibili.pegasus.request.a.c;
        if (str == null || !kotlin.text.u.P(str, "h5awaken", false)) {
            return null;
        }
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("h5awaken");
            if (queryParameter != null && !kotlin.text.u.b0(queryParameter)) {
                java.nio.charset.Charset charset = kotlin.text.a.a;
                java.lang.String str2 = str + "&" + new java.lang.String(android.util.Base64.decode(queryParameter.getBytes(charset), 0), charset);
                tv.danmaku.android.log.BLog.i("IndexParamInterceptor", "deep link:" + str2);
                return android.net.Uri.parse(str2).getQueryParameter("open_app_url");
            }
            return null;
        } catch (java.lang.Exception unused) {
            tv.danmaku.android.log.BLog.i("IndexParamInterceptor", "decode deep link error:".concat(str));
            return null;
        }
    }

    private final java.lang.String p() {
        return java.lang.String.valueOf(Gj.v.g() ? 1 : 0);
    }

    private final java.lang.String q() {
        return java.lang.String.valueOf(nq1.f.b.a.c() ? 1 : Gj.B.a().getValue());
    }

    private final java.lang.String r() {
        return java.lang.String.valueOf(kJ1.e.e() ? 1 : 0);
    }

    private final void s(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p130qF0.c.a().i = !(str == null || str.length() == 0);
        p130qF0.c.a().k = !(str2 == null || str2.length() == 0);
        p130qF0.c.a().j = !(str3 == null || str3.length() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void addCommonParam(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str;
        super.addCommonParam(map);
        if (map != 0) {
            map.put("column", java.lang.String.valueOf(Gj.w.a.b().getValue()));
            int iC = Mo.c.b().c();
            if (iC == 1) {
                str = "wifi";
            } else if (iC == 2) {
                str = "mobile";
            } else if (iC != 5) {
                str = "";
            } else {
                str = "wifi";
            }
            map.put("network", str);
            map.put("ad_extra", Dd0.m.d.g(kntr.common.ad.core.AdSlot.PEGASUS_FEED));
            map.put("device_name", android.os.Build.MODEL);
            map.put("device_type", g());
            map.put("https_url_req", j());
            map.put("recsys_mode", p());
            map.put("autoplay_card", d());
            map.put("inline_sound", m());
            map.put("inline_sound_cold_state", n());
            map.put("auto_refresh_state", e());
            map.put("inline_danmu", l());
            ji0.f fVarI = Lo.m.i();
            map.put("column_timestamp", java.lang.String.valueOf(fVarI != null ? fVarI.getLong("pegasus_column_update_time", 0L) : 0L));
            ji0.f fVarI2 = Lo.m.i();
            map.put("autoplay_timestamp", java.lang.String.valueOf(fVarI2 != null ? fVarI2.getLong("pegasus_auto_play_update_time", 0L) : 0L));
            map.put("volume_balance", r());
            map.put("video_mode", q());
            map.put("guidance", i());
            java.lang.String strO = o();
            if (strO != null) {
                map.put("open_app_url", strO);
                com.bilibili.pegasus.request.a.c = null;
            }
            if (((java.lang.CharSequence) f().getSecond()).length() > 0) {
                map.put("local_buvid", f().getSecond());
            }
            tv.danmaku.android.log.BLog.i("IndexParamInterceptor", "pegasus request:" + map);
        }
        com.bilibili.pegasus.request.a.a = false;
        long[] jArr = com.bilibili.pegasus.components.customreporter.e.a;
        Zx1.e eVar = com.bilibili.pegasus.components.customreporter.h.a;
        jArr[3] = android.os.SystemClock.uptimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addHeader(okhttp3.z.a aVar) {
        super/*AB0.a*/.addHeader(aVar);
        if (com.bilibili.pegasus.request.f.a()) {
            tv.danmaku.android.log.BLog.i("InstalledAppListUtil", "add device info & applist");
            if (aVar != null) {
                aVar.c.a("DeviceInfo", h());
            }
            java.util.ArrayList arrayList = p130qF0.b.a;
            android.app.Application applicationA = Lo.j.a();
            java.lang.String str = null;
            if (applicationA == null || p130qF0.b.c == null) {
                N2.e.d("return null ctx:", java.lang.String.valueOf(applicationA), " sGetInstallAppListTask:", java.lang.String.valueOf(p130qF0.b.c), "InstalledAppListUtil");
            } else {
                p130qF0.b.b = android.os.SystemClock.elapsedRealtime();
                p130qF0.c cVarA = p130qF0.c.a();
                try {
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    java.lang.String str2 = p130qF0.b.c.get(1L, java.util.concurrent.TimeUnit.SECONDS);
                    long jUptimeMillis2 = android.os.SystemClock.uptimeMillis() - jUptimeMillis;
                    tv.danmaku.android.log.BLog.i("InstalledAppListUtil", "getResultDuration: " + jUptimeMillis2);
                    p130qF0.b.c(true, jUptimeMillis2, null);
                    str = str2;
                } catch (java.lang.InterruptedException e) {
                    e = e;
                    tv.danmaku.android.log.BLog.i("InstalledAppListUtil", "InterruptedException", e);
                    cVarA.e = 4;
                    p130qF0.b.c(false, 0L, e);
                } catch (java.util.concurrent.ExecutionException e2) {
                    e = e2;
                    tv.danmaku.android.log.BLog.i("InstalledAppListUtil", "ExecutionException", e);
                    cVarA.e = 5;
                    p130qF0.b.c(false, 0L, e);
                } catch (java.util.concurrent.TimeoutException e3) {
                    e = e3;
                    tv.danmaku.android.log.BLog.i("InstalledAppListUtil", "TimeoutException", e);
                    cVarA.e = 1;
                    p130qF0.b.c(false, 0L, e);
                }
            }
            if (str != null) {
                tv.danmaku.android.log.BLog.i("InstalledAppListUtil", " add header:".concat(str));
                if (aVar != null) {
                    aVar.c.a("AppList", str);
                }
            }
            if (aVar != null) {
                aVar.c.g("Buvid", (java.lang.String) f().getFirst());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public okhttp3.z intercept(okhttp3.z zVar) {
        com.bilibili.lib.performance.e.a.getClass();
        F1.q.b("intercept start ", com.bilibili.lib.performance.e.c(), "IndexParam");
        okhttp3.z zVarIntercept = super/*AB0.a*/.intercept(zVar);
        F1.q.b("intercept end ", com.bilibili.lib.performance.e.c(), "IndexParam");
        return zVarIntercept;
    }
}
