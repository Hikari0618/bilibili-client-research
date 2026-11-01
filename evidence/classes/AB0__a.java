package AB0;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public class a implements AB0.d {
    private static final java.lang.String TAG = "DefaultRequestIntercept";
    private static AB0.a.InterfaceC0000a netPublicParamFactory;
    public static final AB0.a INSTANCE = new AB0.a();
    private static boolean guestIdEnable = true;

    /* JADX INFO: renamed from: AB0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BL */
    public interface InterfaceC0000a {
        boolean a();

        java.util.LinkedHashMap create();
    }

    private boolean checkSign() {
        try {
            return com.bilibili.lib.blconfig.ConfigManager.ab2().getWithDefault("net.check_sign", true);
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    private java.lang.String decode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        return android.text.TextUtils.isEmpty(str) ? "" : java.net.URLDecoder.decode(str, str2);
    }

    private java.util.Map<java.lang.String, java.lang.String> fromToQueryMap(java.lang.String str, java.nio.charset.Charset charset) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 1) {
                    try {
                        map.put(decode(strArrSplit[0], charset.name()), "");
                    } catch (java.io.UnsupportedEncodingException e) {
                        throw new java.lang.RuntimeException(e);
                    }
                } else if (strArrSplit.length == 2) {
                    try {
                        map.put(decode(strArrSplit[0], charset.name()), decode(strArrSplit[1], charset.name()));
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return map;
    }

    public static boolean guestIdEnable() {
        return guestIdEnable;
    }

    public static void put(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        if (!map.containsKey(str)) {
            map.put(str, str2);
            return;
        }
        java.lang.String str3 = map.get(str);
        if (str2 != null) {
            map.put(str, str3 + "," + str2);
        }
    }

    public static void setGuestIdEnable(boolean z) {
        guestIdEnable = z;
    }

    public static void setNetPublicParamFactory(AB0.a.InterfaceC0000a interfaceC0000a) {
        netPublicParamFactory = interfaceC0000a;
    }

    @androidx.annotation.CallSuper
    public void addCommonParam(java.util.Map<java.lang.String, java.lang.String> map) {
        com.bilibili.gripper.api.account.GAccount gAccount;
        AB0.a.InterfaceC0000a interfaceC0000a = netPublicParamFactory;
        if (interfaceC0000a != null && interfaceC0000a.a()) {
            try {
                map.putAll(netPublicParamFactory.create());
                return;
            } catch (java.lang.Throwable th) {
                tv.danmaku.android.log.BLog.e(TAG, "addCommonParam failure", th);
                return;
            }
        }
        map.put("platform", "android");
        map.put("mobi_app", Mg.a.j());
        map.put("appkey", getAppKey());
        map.put("build", java.lang.String.valueOf(Mg.a.d()));
        map.put("channel", Mg.a.f());
        Mg.a.a();
        com.bilibili.lib.gripper.api.SuspendProducer suspendProducer = Mg.a.a.a.b;
        java.lang.String accessKey = (suspendProducer == null || (gAccount = (com.bilibili.gripper.api.account.GAccount) suspendProducer.getOrNull()) == null) ? null : gAccount.getAccessKey();
        if (!android.text.TextUtils.isEmpty(accessKey)) {
            map.put(p158uC0.a.d, accessKey);
        }
        map.putAll(Mg.a.a.a());
        map.put("c_locale", Mg.a.g());
        map.put("s_locale", Mg.a.k());
    }

    public void addCommonParamToBody(okhttp3.t tVar, okhttp3.RequestBody requestBody, okhttp3.z.a aVar) {
        addCommonParamToBodyResult(tVar, requestBody, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f9 A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:35:0x00f1, B:37:0x00f9, B:42:0x010d), top: B:55:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d A[Catch: all -> 0x0111, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:35:0x00f1, B:37:0x00f9, B:42:0x010d), top: B:55:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean addCommonParamToBodyResult(okhttp3.t tVar, okhttp3.RequestBody requestBody, okhttp3.z.a aVar) {
        java.lang.String strConcat;
        if (!(requestBody instanceof okhttp3.v) && (requestBody.b() == null || !"multipart".equals(requestBody.b().b))) {
            java.util.HashMap map = new java.util.HashMap();
            boolean z = true;
            if (requestBody instanceof okhttp3.r) {
                new java.util.HashMap();
                okhttp3.r rVar = (okhttp3.r) requestBody;
                java.util.List list = rVar.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    java.lang.String str = (java.lang.String) list.get(i);
                    java.lang.String strN = okhttp3.t.n(0, str, str.length(), true);
                    java.lang.String str2 = (java.lang.String) rVar.b.get(i);
                    put(strN, okhttp3.t.n(0, str2, str2.length(), true), map);
                }
            } else if (requestBody.b() != null) {
                if ("application/x-www-form-urlencoded".equals(requestBody.b().b + "/" + requestBody.b().c)) {
                    try {
                        if (requestBody.a() > 0) {
                            java.nio.charset.Charset charsetA = requestBody.b().a((java.nio.charset.Charset) null) != null ? requestBody.b().a((java.nio.charset.Charset) null) : java.nio.charset.Charset.defaultCharset();
                            okio.Buffer buffer = new okio.Buffer();
                            requestBody.f(buffer);
                            java.lang.String string = buffer.readString(charsetA);
                            buffer.clear();
                            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : fromToQueryMap(string, charsetA).entrySet()) {
                                put(entry.getKey(), entry.getValue(), map);
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        if (5 >= Ng.a.b) {
                            android.util.Log.w(TAG, "inject common param to body failure : ", th);
                        }
                        return false;
                    }
                } else {
                    try {
                        if (requestBody.a() > 0) {
                            strConcat = "ignore inject common param to body contentType ".concat(java.lang.String.valueOf(requestBody.b()));
                            if (5 >= Ng.a.b) {
                                z = false;
                            }
                            if (z) {
                                android.util.Log.w(TAG, strConcat);
                            }
                            return false;
                        }
                    } catch (java.lang.Throwable th2) {
                        if (5 >= Ng.a.b) {
                            android.util.Log.w(TAG, "get contentLength error ", th2);
                        }
                    }
                }
            } else if (requestBody.a() > 0) {
                strConcat = "ignore inject common param to body contentType ".concat(java.lang.String.valueOf(requestBody.b()));
                if (5 >= Ng.a.b) {
                    z = false;
                }
                if (z) {
                    android.util.Log.w(TAG, strConcat);
                }
                return false;
            }
            int iU = tVar.u();
            for (int i2 = 0; i2 < iU; i2++) {
                put(tVar.s(i2), tVar.t(i2), map);
            }
            addCommonParam(map);
            okhttp3.t.a aVarK = tVar.k();
            aVarK.g = null;
            okhttp3.t tVarC = aVarK.c();
            okhttp3.A aC = okhttp3.RequestBody.c(okhttp3.MediaType.c("application/x-www-form-urlencoded; charset=utf-8"), signQuery(map).toString());
            aVar.a = tVarC;
            aVar.h(aC);
            return true;
        }
        return false;
    }

    public void addCommonParamToUrl(okhttp3.t tVar, okhttp3.z.a aVar) {
        if (!checkSign() || tVar.r("sign") == null) {
            java.util.HashMap map = new java.util.HashMap();
            int iU = tVar.u();
            for (int i = 0; i < iU; i++) {
                put(tVar.s(i), tVar.t(i), map);
            }
            addCommonParam(map);
            com.bilibili.nativelibrary.SignedQuery signedQuerySignQuery = signQuery(map);
            okhttp3.t.a aVarK = tVar.k();
            aVarK.d(signedQuerySignQuery.toString());
            aVar.a = aVarK.c();
        }
    }

    public void addHeader(okhttp3.z.a aVar) {
        if (!android.text.TextUtils.isEmpty(null)) {
            aVar.c.g("Display-ID", (java.lang.String) null);
        }
        java.lang.String strE = Mg.a.e();
        if (!android.text.TextUtils.isEmpty(strE)) {
            aVar.c.g("Buvid", strE);
        }
        java.lang.String strB = Mg.a.b();
        if (!android.text.TextUtils.isEmpty(strB)) {
            aVar.c.g(p158uC0.a.c, strB);
        }
        if (!android.text.TextUtils.isEmpty(null)) {
            aVar.c.g("Device-ID", (java.lang.String) null);
        }
        java.lang.String strH = Mg.a.h();
        if (!android.text.TextUtils.isEmpty(strH)) {
            aVar.c.g("fp_local", strH);
        }
        java.lang.String strI = Mg.a.i();
        if (!android.text.TextUtils.isEmpty(strI)) {
            aVar.c.g("fp_remote", strI);
        }
        Mg.a.a();
        java.lang.String sessionId = Mg.a.a.a.a.getSessionId();
        if (!android.text.TextUtils.isEmpty(sessionId)) {
            aVar.c.g("session_id", sessionId);
        }
        Mg.a.a();
        Mg.a.a.getClass();
        com.bapis.bilibili.metadata.locale.Locale.b bVarNewBuilder = com.bapis.bilibili.metadata.locale.Locale.newBuilder();
        try {
            kntr.base.localization.Localization.a.getClass();
            kntr.base.localization.m mVar = (kntr.base.localization.m) kntr.base.localization.Localization.b().getValue();
            com.bapis.bilibili.metadata.locale.LocaleIds.b bVarNewBuilder2 = com.bapis.bilibili.metadata.locale.LocaleIds.newBuilder();
            bVarNewBuilder2.setLanguage(kntr.base.localization.n.c(mVar));
            java.util.Locale locale = mVar.a;
            bVarNewBuilder2.setScript(locale.getScript());
            bVarNewBuilder2.setRegion(locale.getCountry());
            bVarNewBuilder.setCLocale(bVarNewBuilder2.build());
            kntr.base.localization.m mVarC = kntr.base.localization.Localization.c();
            com.bapis.bilibili.metadata.locale.LocaleIds.b bVarNewBuilder3 = com.bapis.bilibili.metadata.locale.LocaleIds.newBuilder();
            bVarNewBuilder3.setLanguage(kntr.base.localization.n.c(mVarC));
            java.util.Locale locale2 = mVarC.a;
            bVarNewBuilder3.setScript(locale2.getScript());
            bVarNewBuilder3.setRegion(locale2.getCountry());
            bVarNewBuilder.setSLocale(bVarNewBuilder3.build());
            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
            bVarNewBuilder.setTimezone(timeZone.getID());
            long offset = timeZone.getOffset(java.lang.System.currentTimeMillis());
            boolean z = offset < 0;
            long jAbs = (long) java.lang.Math.abs(offset);
            long j = 3600000;
            bVarNewBuilder.setUtcOffset(java.lang.String.format(java.util.Locale.US, "%s%02d:%02d", z ? "-" : "+", java.lang.Integer.valueOf((int) (jAbs / j)), java.lang.Integer.valueOf(((int) (jAbs % j)) / 60000)));
            bVarNewBuilder.setIsDaylightTime(timeZone.inDaylightTime(new java.util.Date()));
            kntr.base.localization.Translation.a.getClass();
            bVarNewBuilder.setAlwaysTranslate(((java.lang.Boolean) kotlinx.coroutines.flow.f.b(kntr.base.localization.Translation.e).b.getValue()).booleanValue());
        } catch (java.lang.Exception unused) {
        }
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bVarNewBuilder.build().toByteArray(), 3);
        if (!android.text.TextUtils.isEmpty(strEncodeToString)) {
            aVar.c.g("x-bili-locale-bin", strEncodeToString);
        }
        if (guestIdEnable) {
            Mg.a.a();
            java.lang.String guestId = ((ee0.a) Mg.a.a.a.f.get()).getGuestId();
            if (android.text.TextUtils.isEmpty(guestId)) {
                return;
            }
            aVar.c.g("GuestId", guestId);
        }
    }

    public java.lang.String getAppKey() {
        return Mg.a.c();
    }

    @Override // AB0.d
    public okhttp3.z intercept(okhttp3.z zVar) {
        okhttp3.z.a aVarB = zVar.b();
        addHeader(aVarB);
        java.lang.String str = zVar.b;
        boolean zEquals = "GET".equals(str);
        okhttp3.t tVar = zVar.a;
        if (zEquals) {
            addCommonParamToUrl(tVar, aVarB);
        } else if ("POST".equals(str) && !addCommonParamToBodyResult(tVar, zVar.d, aVarB)) {
            addCommonParamToUrl(tVar, aVarB);
        }
        return aVarB.b();
    }

    public com.bilibili.nativelibrary.SignedQuery signQuery(java.util.Map<java.lang.String, java.lang.String> map) {
        return com.bilibili.nativelibrary.LibBili.h(map);
    }
}
