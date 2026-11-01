package tv.danmaku.biliplayerimpl.report.heartbeat;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
public final class f extends PH1.a implements RI1.b {
    public static final Zx1.e<java.lang.Boolean> x = kotlin.b.c(new Gf0.b(19));
    public PH1.e b;
    public final boolean c;
    public tv.danmaku.biliplayerv2.service.Video.g d;
    public tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext e;
    public java.lang.String f;
    public boolean g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final boolean n;
    public final Zx1.e o;
    public final kotlinx.coroutines.flow.D p;
    public final kotlinx.coroutines.flow.D q;
    public final tv.danmaku.biliplayerimpl.report.heartbeat.f.C0740f r;
    public final tv.danmaku.biliplayerimpl.report.heartbeat.f.a s;
    public final tv.danmaku.biliplayerimpl.report.heartbeat.f.e t;
    public final tv.danmaku.biliplayerimpl.report.heartbeat.f.c u;
    public final tv.danmaku.biliplayerimpl.report.heartbeat.f.d v;
    public final tv.danmaku.biliplayerimpl.report.heartbeat.f.b w;

    /* JADX INFO: compiled from: BL */
    public static final class a implements tv.danmaku.biliplayerv2.service.InterfaceC2622d {
        public a() {
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2622d
        public final void onBufferingEnd() {
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext;
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            PH1.e eVar = fVar.b;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            int iL = eVar.l().l();
            if (fVar.T7() || (reportContext = fVar.e) == null) {
                return;
            }
            reportContext.refreshProgress(iL);
            fVar.R7();
            fVar.l = false;
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2622d
        public final void onBufferingStart(int i) {
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext;
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            PH1.e eVar = fVar.b;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            int iL = eVar.l().l();
            if (fVar.T7() || (reportContext = fVar.e) == null) {
                return;
            }
            reportContext.refreshProgress(iL);
            fVar.R7();
            fVar.l = true;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b implements tv.danmaku.biliplayerv2.service.InterfaceC2648z {
        public b() {
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2648z
        public final void onUpdated(com.bilibili.lib.media.resource.MediaResource mediaResource) {
            if (mediaResource == null) {
                return;
            }
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = fVar.e;
            if (reportContext != null) {
                reportContext.setMLanguage(mediaResource.q);
            }
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext2 = fVar.e;
            if (reportContext2 != null) {
                reportContext2.setMPerferType(tv.danmaku.biliplayerimpl.report.heartbeat.f.W7(mediaResource));
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class c implements tv.danmaku.biliplayerv2.service.V {
        public c() {
        }

        @Override // tv.danmaku.biliplayerv2.service.V
        public final void a(float f) {
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            if (fVar.T7() || fVar.e == null) {
                return;
            }
            fVar.R7();
            fVar.h = f;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class d implements tv.danmaku.biliplayerv2.service.P {
        public d() {
        }

        @Override // tv.danmaku.biliplayerv2.service.P
        public final void a() {
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            PH1.e eVar = fVar.b;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            tv.danmaku.biliplayerv2.service.D dL = eVar.l();
            fVar.T4(dL.L1(), dL.l());
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class e implements tv.danmaku.biliplayerv2.service.s0 {
        public e() {
        }

        @Override // tv.danmaku.biliplayerv2.service.s0
        public final void onSeekComplete(long j) {
            tv.danmaku.biliplayerv2.service.Video.g gVar;
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            PH1.e eVar = fVar.b;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            tv.danmaku.biliplayerv2.service.D dL = eVar.l();
            int iL1 = dL.L1();
            int realDuration = dL.getRealDuration();
            int iL = dL.l();
            boolean zN1 = dL.n1();
            if (fVar.T7() || (gVar = fVar.d) == null) {
                return;
            }
            if (fVar.e == null) {
                java.lang.String session = fVar.getSession();
                PH1.e eVar2 = fVar.b;
                if (eVar2 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                com.bilibili.lib.media.resource.MediaResource mediaResourceD = eVar2.l().d();
                java.lang.String str = mediaResourceD != null ? mediaResourceD.q : null;
                PH1.e eVar3 = fVar.b;
                if (eVar3 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                com.bilibili.lib.media.resource.MediaResource mediaResourceD2 = eVar3.l().d();
                java.lang.String strW7 = mediaResourceD2 != null ? tv.danmaku.biliplayerimpl.report.heartbeat.f.W7(mediaResourceD2) : null;
                tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.a aVar = tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.Companion;
                PH1.e eVar4 = fVar.b;
                if (eVar4 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                boolean zM1 = eVar4.l().M1();
                aVar.getClass();
                fVar.e = tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.a.a(gVar, session, str, strW7, iL1, realDuration, iL, zN1, zM1);
                fVar.Z7();
            }
            fVar.e.refreshProgress(iL);
            fVar.R7();
        }

        @Override // tv.danmaku.biliplayerv2.service.s0
        public final void onSeekStart(long j) {
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext;
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            PH1.e eVar = fVar.b;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            int iL = eVar.l().l();
            if (fVar.T7() || (reportContext = fVar.e) == null) {
                return;
            }
            reportContext.refreshProgress(iL);
            fVar.R7();
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.biliplayerimpl.report.heartbeat.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BL */
    public static final class C0740f implements tv.danmaku.biliplayerv2.service.u0 {
        public C0740f() {
        }

        @Override // tv.danmaku.biliplayerv2.service.u0
        public final void onPlayerStateChanged(int i) {
            final tv.danmaku.biliplayerv2.service.Video.g gVar;
            final tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            if (i != 3) {
                if (i == 4) {
                    if (fVar.T7() || fVar.e == null) {
                        return;
                    }
                    fVar.g = true;
                    fVar.P7();
                    return;
                }
                if (i == 5) {
                    if (fVar.T7() || fVar.e == null) {
                        return;
                    }
                    fVar.g = false;
                    if (fVar.l) {
                        fVar.P7();
                        return;
                    } else {
                        fVar.S7();
                        return;
                    }
                }
                if (i == 6) {
                    fVar.n7();
                    return;
                }
                if (i != 7) {
                    return;
                }
                PH1.e eVar = fVar.b;
                if (eVar == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                tv.danmaku.biliplayerv2.service.D dL = eVar.l();
                fVar.T4(dL.L1(), dL.l());
                return;
            }
            PH1.e eVar2 = fVar.b;
            if (eVar2 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            tv.danmaku.biliplayerv2.service.D dL2 = eVar2.l();
            int iL1 = dL2.L1();
            int realDuration = dL2.getRealDuration();
            int iL = dL2.l();
            boolean zN1 = dL2.n1();
            if (fVar.T7() || (gVar = fVar.d) == null) {
                return;
            }
            if (fVar.e == null) {
                java.lang.String session = fVar.getSession();
                PH1.e eVar3 = fVar.b;
                if (eVar3 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                com.bilibili.lib.media.resource.MediaResource mediaResourceD = eVar3.l().d();
                java.lang.String str = mediaResourceD != null ? mediaResourceD.q : null;
                PH1.e eVar4 = fVar.b;
                if (eVar4 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                com.bilibili.lib.media.resource.MediaResource mediaResourceD2 = eVar4.l().d();
                java.lang.String strW7 = mediaResourceD2 != null ? tv.danmaku.biliplayerimpl.report.heartbeat.f.W7(mediaResourceD2) : null;
                tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.a aVar = tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.Companion;
                PH1.e eVar5 = fVar.b;
                if (eVar5 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                boolean zM1 = eVar5.l().M1();
                aVar.getClass();
                fVar.e = tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.a.a(gVar, session, str, strW7, iL1, realDuration, iL, zN1, zM1);
                fVar.Z7();
                long j = gVar.a;
                if (j <= 0 || gVar.b <= 0) {
                    Ig.e.f(O0.n.e(j, "player report click(vv): failed! avid:", ", cid:"), gVar.b, "HeartBeatTracker");
                }
                final java.lang.String session2 = fVar.getSession();
                Zx1.e<java.lang.Boolean> eVar6 = tv.danmaku.biliplayerimpl.report.heartbeat.f.x;
                final long jD = ol.d.d() / 1000;
                G5.g.b(new java.util.concurrent.Callable() { // from class: tv.danmaku.biliplayerimpl.report.heartbeat.e
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        long mid;
                        int level;
                        java.lang.String str2;
                        long j2;
                        java.lang.String str3;
                        java.lang.String mLanguage;
                        Zx1.e<java.lang.Boolean> eVar7 = tv.danmaku.biliplayerimpl.report.heartbeat.f.x;
                        long j3 = ((sh0.b) hh0.b.g().h()).a.getLong("first_play_time", -1L);
                        long j4 = jD;
                        if (j3 == -1) {
                            T71.b bVar = ((sh0.b) hh0.b.g().h()).a;
                            bVar.getClass();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putLong("first_play_time", j4);
                            bVar.a(bundle, "$9", (java.lang.String) null);
                            j3 = j4;
                        }
                        tv.danmaku.biliplayerv2.service.Video.g gVar2 = gVar;
                        long j5 = gVar2.a;
                        long j6 = gVar2.b;
                        int i2 = gVar2.o;
                        int i3 = gVar2.h;
                        int i4 = gVar2.i;
                        long j7 = gVar2.g;
                        java.lang.String str4 = gVar2.j;
                        int i5 = gVar2.k;
                        java.lang.String str5 = gVar2.q;
                        tv.danmaku.biliplayerimpl.report.heartbeat.f fVar2 = fVar;
                        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = fVar2.e;
                        java.lang.String str6 = (reportContext == null || (mLanguage = reportContext.getMLanguage()) == null) ? "" : mLanguage;
                        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext2 = fVar2.e;
                        java.lang.String mPerferType = reportContext2 != null ? reportContext2.getMPerferType() : null;
                        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext3 = fVar2.e;
                        java.lang.Boolean boolValueOf = reportContext3 != null ? java.lang.Boolean.valueOf(reportContext3.getMIsAutoQn()) : null;
                        PH1.e eVar8 = fVar2.b;
                        if (eVar8 == null) {
                            kotlin.jvm.internal.n.m("mPlayerContainer");
                            throw null;
                        }
                        boolean zM2 = eVar8.l().M1();
                        java.lang.String str7 = gVar2.e;
                        java.lang.String str8 = gVar2.f;
                        java.lang.String str9 = gVar2.r;
                        java.util.LinkedHashMap linkedHashMapH = com.bilibili.common.chronoscommon.effects.q.h(gVar2, (java.util.Map) null);
                        com.bilibili.lib.accounts.x xVarC = com.bilibili.lib.accounts.x.c(Lo.j.a());
                        com.bilibili.lib.accountinfo.model.AccountInfo accountInfoC = Dg0.b.a.a().c();
                        if (accountInfoC != null) {
                            mid = accountInfoC.getMid();
                            level = accountInfoC.getLevel();
                        } else {
                            mid = 0;
                            level = 0;
                        }
                        java.util.TreeMap treeMap = new java.util.TreeMap();
                        treeMap.put("aid", java.lang.String.valueOf(j5));
                        treeMap.put("cid", java.lang.String.valueOf(j6));
                        treeMap.put("part", java.lang.String.valueOf(i2));
                        treeMap.put("mid", java.lang.String.valueOf(mid));
                        treeMap.put("lv", java.lang.String.valueOf(level));
                        treeMap.put("ftime", java.lang.String.valueOf(j3));
                        treeMap.put("stime", java.lang.String.valueOf(j4));
                        PH1.e eVar9 = fVar2.b;
                        if (eVar9 == null) {
                            kotlin.jvm.internal.n.m("mPlayerContainer");
                            throw null;
                        }
                        treeMap.put("did", eVar9.f().getString("rpdid", ""));
                        treeMap.put("type", java.lang.String.valueOf(i3));
                        treeMap.put("sub_type", java.lang.String.valueOf(i4));
                        treeMap.put("sid", java.lang.String.valueOf(j7));
                        treeMap.put("epid", str4);
                        treeMap.put("platform", Mg.a.j());
                        treeMap.put("auto_play", java.lang.String.valueOf(i5));
                        xVarC.getClass();
                        if (com.bilibili.lib.accounts.x.g()) {
                            treeMap.put("access_key", com.bilibili.lib.accounts.x.d());
                        }
                        if (str5 != null && str5.length() != 0) {
                            treeMap.put("play_mode", str5);
                        }
                        treeMap.put("cur_language", str6);
                        treeMap.put("perfer_type", mPerferType == null ? "" : mPerferType);
                        treeMap.put("is_auto_qn", kotlin.jvm.internal.n.f(boolValueOf, java.lang.Boolean.TRUE) ? "1" : "0");
                        treeMap.put("is_audio_play", zM2 ? "1" : "0");
                        treeMap.put("build", java.lang.String.valueOf(Mg.a.d()));
                        treeMap.put("mobi_app", Mg.a.j());
                        treeMap.put("spmid", str7);
                        treeMap.put("from_spmid", str8);
                        treeMap.put("track_id", str9);
                        treeMap.put("session", session2);
                        treeMap.put("oaid", (java.lang.String) fVar2.o.getValue());
                        rI0.b.f().getClass();
                        java.lang.String strB = rI0.b.b();
                        if (strB == null) {
                            strB = "";
                        }
                        treeMap.put("polaris_action_id", strB);
                        if (linkedHashMapH != null) {
                            for (java.util.Map.Entry entry : linkedHashMapH.entrySet()) {
                                treeMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        java.util.LinkedHashMap linkedHashMapA = Mg.a.a.a();
                        if ((!linkedHashMapA.isEmpty()) && (str3 = (java.lang.String) linkedHashMapA.get("statistics")) != null) {
                            treeMap.put("statistics", str3);
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        for (java.util.Map.Entry entry2 : treeMap.entrySet()) {
                            java.lang.String str10 = (java.lang.String) entry2.getKey();
                            java.lang.String str11 = (java.lang.String) entry2.getValue();
                            sb.append(str10);
                            sb.append('=');
                            if (str11 == null) {
                                str11 = "";
                            }
                            sb.append(android.net.Uri.encode(str11));
                            sb.append('&');
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        java.lang.String string = sb.toString();
                        java.lang.String str12 = hJ1.b.a;
                        java.nio.charset.Charset charset = Ga0.c.a;
                        java.lang.String lowerCase = La0.a.g(string.getBytes(charset), hJ1.b.c.getBytes(charset)).toLowerCase(java.util.Locale.US);
                        N2.e.d("player report click(vv), params: ", string, " & sign=", lowerCase, "HeartBeatTracker");
                        sb.append("&sign=");
                        sb.append(lowerCase);
                        retrofit2.y yVarExecute = ((tv.danmaku.biliplayerimpl.report.heartbeat.c) uB0.d.b(tv.danmaku.biliplayerimpl.report.heartbeat.c.class)).a(okhttp3.RequestBody.d(okhttp3.MediaType.c("application/octet-stream"), hJ1.b.a(sb.toString()))).execute();
                        okhttp3.D d = yVarExecute.a;
                        java.lang.String str13 = (java.lang.String) yVarExecute.b;
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(java.lang.String.valueOf(str13));
                            if (!jSONObject.isNull("data")) {
                                java.lang.String string2 = jSONObject.getJSONObject("data").getString("rpdid");
                                PH1.e eVar10 = fVar2.b;
                                if (eVar10 == null) {
                                    kotlin.jvm.internal.n.m("mPlayerContainer");
                                    throw null;
                                }
                                eVar10.f().putString("rpdid", string2);
                            }
                            str2 = "code";
                            try {
                                j2 = !jSONObject.isNull(str2) ? jSONObject.getLong(str2) : 0L;
                            } catch (java.lang.Exception e) {
                                e = e;
                                tv.danmaku.android.log.BLog.e("HeartBeatTracker", "player report click(vv): responseBody parse to json failed!", e);
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            str2 = "code";
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("player report click(vv): responseCode:");
                        sb2.append(d.d);
                        sb2.append(", responseMsg:");
                        com.bapis.bilibili.live.app.room.v1.i.a(d.e, ", responseBody:", str13, "HeartBeatTracker", sb2);
                        if (j2 != 0) {
                            java.util.HashMap map = new java.util.HashMap();
                            map.put(str2, java.lang.String.valueOf(j2));
                            map.put("spmid", gVar2.e);
                            map.put("avid", java.lang.String.valueOf(gVar2.a));
                            map.put("cid", java.lang.String.valueOf(gVar2.b));
                            map.put("seasonId", java.lang.String.valueOf(gVar2.g));
                            map.put("epId", gVar2.j);
                            gr0.o.u(1, "player.vv_error", map, new GA.a(25), false);
                        }
                        return Zx1.o.a;
                    }
                });
                tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = fVar.e;
                if (reportContext != null) {
                    kotlinx.coroutines.flow.D d = fVar.p;
                    tv.danmaku.biliplayerv2.service.report.heartbeat.PlaySessionPhase playSessionPhase = tv.danmaku.biliplayerv2.service.report.heartbeat.PlaySessionPhase.START;
                    java.lang.String mSession = reportContext.getMSession();
                    if (mSession != null) {
                        session = mSession;
                    }
                    d.d(new RI1.c(playSessionPhase, session, fVar.V7(reportContext, true)));
                }
            }
            fVar.i = gVar.p;
        }
    }

    static {
        java.util.HashMap<java.lang.String, tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext> map = tv.danmaku.biliplayerimpl.report.heartbeat.b.a;
        zb0.d.c(new tv.danmaku.bili.ui.main2.X(1), 2);
        zb0.d.c(tv.danmaku.biliplayerimpl.report.heartbeat.b.c, 2);
    }

    public f() {
        com.bilibili.lib.blconfig.ConfigManager.b.getClass();
        this.c = com.bilibili.lib.blconfig.ConfigManager.a.f("ff_vt_switch");
        this.h = 1.0f;
        this.n = true;
        this.o = kotlin.b.c(new Qr0.h(17));
        kotlinx.coroutines.flow.D dB = kotlinx.coroutines.flow.E.b(0, 8, (kotlinx.coroutines.channels.BufferOverflow) null, 4);
        this.p = dB;
        this.q = dB;
        this.r = new tv.danmaku.biliplayerimpl.report.heartbeat.f.C0740f();
        this.s = new tv.danmaku.biliplayerimpl.report.heartbeat.f.a();
        this.t = new tv.danmaku.biliplayerimpl.report.heartbeat.f.e();
        this.u = new tv.danmaku.biliplayerimpl.report.heartbeat.f.c();
        this.v = new tv.danmaku.biliplayerimpl.report.heartbeat.f.d();
        this.w = new tv.danmaku.biliplayerimpl.report.heartbeat.f.b();
    }

    public static java.lang.String W7(com.bilibili.lib.media.resource.MediaResource mediaResource) {
        int i = mediaResource.r;
        if (i == 1) {
            return "upload";
        }
        if (i != 2) {
            return null;
        }
        return "ai";
    }

    @Override // RI1.a
    public final tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams D7() {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = this.e;
        if (reportContext == null) {
            return null;
        }
        R7();
        return V7(reportContext, false);
    }

    @Override // RI1.a
    public final void G2(boolean z) {
        R7();
        this.j = z;
    }

    public final void P7() {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = this.e;
        if (reportContext != null) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() / 1000;
            reportContext.setMPausedTime((jElapsedRealtime - reportContext.getMLastActionMills()) + reportContext.getMPausedTime());
            reportContext.setMLastActionMills(jElapsedRealtime);
        }
    }

    public final void R7() {
        if (!this.g || this.l) {
            P7();
        } else {
            S7();
        }
    }

    public final void S7() {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = this.e;
        if (reportContext != null) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() / 1000;
            long mLastActionMills = jElapsedRealtime - reportContext.getMLastActionMills();
            reportContext.setMPlayedTime(reportContext.getMPlayedTime() + mLastActionMills);
            reportContext.setMActualPlayedTime(reportContext.getMActualPlayedTime() + ((long) (mLastActionMills * this.h)));
            if (this.j) {
                reportContext.setMMiniPlayTime(reportContext.getMMiniPlayTime() + mLastActionMills);
            }
            reportContext.setMLastActionMills(jElapsedRealtime);
            if (this.i) {
                reportContext.setMListPlayTime(reportContext.getMPlayedTime());
            }
        }
    }

    @Override // RI1.a
    public final void T0(androidx.lifecycle.Lifecycle.Event event) {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext;
        tv.danmaku.biliplayerv2.service.Video.g gVar;
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext2;
        if (event != androidx.lifecycle.Lifecycle.Event.ON_PAUSE) {
            if (event != androidx.lifecycle.Lifecycle.Event.ON_RESUME || T7() || (reportContext = this.e) == null) {
                return;
            }
            zb0.d.c(new Pz.a(reportContext, 7), 3);
            return;
        }
        PH1.e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        tv.danmaku.biliplayerv2.service.D dL = eVar.l();
        int iL1 = dL.L1();
        int iL = dL.l();
        if (T7() || (gVar = this.d) == null || (reportContext2 = this.e) == null) {
            return;
        }
        reportContext2.refreshMutableState(gVar, iL1, iL);
        R7();
        zb0.d.c(new com.bilibili.ogv.operation.modular.modules.banner.l(reportContext2, 2, gVar, this), 3);
    }

    @Override // RI1.b
    public final void T4(int i, int i2) {
        X7(i, i2);
        i();
    }

    public final boolean T7() {
        if (this.n && !this.k) {
            tv.danmaku.biliplayerv2.service.Video.g gVar = this.d;
            if (!kotlin.jvm.internal.n.f(gVar != null ? gVar.s : null, RI1.e.a.a)) {
                return false;
            }
        }
        return true;
    }

    public final java.util.LinkedHashMap U7() {
        if (!((java.lang.Boolean) x.getValue()).booleanValue()) {
            return null;
        }
        PH1.e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        java.lang.String strI0 = eVar.l().I0(false);
        if (strI0.length() == 0) {
            tv.danmaku.android.log.BLog.e("HeartBeatTracker", "get Dye Info error:no play url");
            return null;
        }
        try {
            android.net.Uri uri = android.net.Uri.parse(strI0);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String lastPathSegment = uri.getLastPathSegment();
            java.lang.String str = "";
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            linkedHashMap.put("video_file_name", lastPathSegment);
            java.lang.String queryParameter = uri.getQueryParameter("qn_dyeid");
            if (queryParameter != null) {
                str = queryParameter;
            }
            linkedHashMap.put("video_dye_id", str);
            return linkedHashMap;
        } catch (java.lang.Exception e2) {
            A5.q0.e("get Dye Info error: ", e2.getMessage(), "HeartBeatTracker");
            return null;
        }
    }

    public final tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams V7(tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext, boolean z) {
        long mServerTime = z ? 0L : reportContext.getMServerTime();
        java.lang.String mSession = reportContext.getMSession();
        long mMid = reportContext.getMMid();
        long mAid = reportContext.getMAid();
        long mCid = reportContext.getMCid();
        java.lang.String mSid = reportContext.getMSid();
        long mEpid = reportContext.getMEpid();
        java.lang.String mType = reportContext.getMType();
        int mSubType = reportContext.getMSubType();
        int mQuality = reportContext.getMQuality();
        long mTotalTime = z ? 0L : reportContext.getMTotalTime();
        long mPausedTime = z ? 0L : reportContext.getMPausedTime();
        long mPlayedTime = z ? 0L : reportContext.getMPlayedTime();
        long mVideoDuration = reportContext.getMVideoDuration();
        java.lang.String mPlayType = reportContext.getMPlayType();
        int mNetworkType = reportContext.getMNetworkType();
        long mLastProcessTime = z ? 0L : reportContext.getMLastProcessTime();
        long mMaxPlayProgressTime = z ? 0L : reportContext.getMMaxPlayProgressTime();
        int mJumpFrom = reportContext.getMJumpFrom();
        java.lang.String mFromSpmid = reportContext.getMFromSpmid();
        java.lang.String mSpmid = reportContext.getMSpmid();
        java.lang.String mEpStatus = reportContext.getMEpStatus();
        java.lang.String mPlayStatus = reportContext.getMPlayStatus();
        java.lang.String mUserStatus = reportContext.getMUserStatus();
        long mActualPlayedTime = z ? 0L : reportContext.getMActualPlayedTime();
        int mAutoPlay = reportContext.getMAutoPlay();
        long mListPlayTime = z ? 0L : reportContext.getMListPlayTime();
        long mMiniPlayTime = z ? 0L : reportContext.getMMiniPlayTime();
        java.lang.String mPlayMode = reportContext.getMPlayMode();
        java.lang.String mLanguage = reportContext.getMLanguage();
        java.lang.String str = mLanguage == null ? "" : mLanguage;
        java.lang.String mPerferType = reportContext.getMPerferType();
        java.lang.String str2 = mPerferType == null ? "" : mPerferType;
        java.lang.String mTrackId = reportContext.getMTrackId();
        java.lang.String str3 = (java.lang.String) this.o.getValue();
        java.lang.String strA = A5.E.a();
        return new tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams(mServerTime, mSession, mMid, mAid, mCid, mSid, mEpid, mType, mSubType, mQuality, mTotalTime, mPausedTime, mPlayedTime, mVideoDuration, mPlayType, mNetworkType, mLastProcessTime, mMaxPlayProgressTime, mJumpFrom, mFromSpmid, mSpmid, mEpStatus, mPlayStatus, mUserStatus, mActualPlayedTime, mAutoPlay, mListPlayTime, mMiniPlayTime, mPlayMode, str, str2, mTrackId, str3, strA == null ? "" : strA, reportContext.getMIsAutoQn(), reportContext.getMIsAudioPlay(), reportContext.getMExtraParams());
    }

    public final void X7(int i, int i2) {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext;
        if (T7()) {
            i();
            return;
        }
        tv.danmaku.biliplayerv2.service.Video.g gVar = this.d;
        if (gVar == null || (reportContext = this.e) == null) {
            return;
        }
        reportContext.refreshMutableState(gVar, i, i2);
        R7();
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext2 = this.e;
        if (reportContext2 != null && reportContext2.getMAid() > 0) {
            if (this.e.getMServerTime() == 0) {
                this.e.setMServerTime(ol.d.d() / 1000);
            }
            this.m = false;
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext3 = this.e;
            if (reportContext3 != null) {
                PH1.e eVar = this.b;
                if (eVar == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                reportContext3.setMIsAutoQn(eVar.l().n1());
            }
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext4 = this.e;
            if (reportContext4 != null) {
                PH1.e eVar2 = this.b;
                if (eVar2 == null) {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
                reportContext4.setMIsAudioPlay(eVar2.l().M1());
            }
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext5 = this.e;
            if (reportContext5 != null) {
                tv.danmaku.biliplayerv2.service.Video.g gVar2 = this.d;
                reportContext5.setMExtraParams(gVar2 != null ? com.bilibili.common.chronoscommon.effects.q.h(gVar2, U7()) : null);
            }
            tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams heartbeatParamsV7 = V7(this.e, false);
            ((tv.danmaku.biliplayerimpl.report.heartbeat.c) uB0.d.b(tv.danmaku.biliplayerimpl.report.heartbeat.c.class)).b(heartbeatParamsV7).f(new tv.danmaku.biliplayerimpl.report.heartbeat.g(this.e.copy()));
            tv.danmaku.android.log.BLog.i("HeartBeatTracker", "report heartbeat end, params:" + heartbeatParamsV7);
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext6 = this.e;
            if (reportContext6 != null) {
                kotlinx.coroutines.flow.D d2 = this.p;
                tv.danmaku.biliplayerv2.service.report.heartbeat.PlaySessionPhase playSessionPhase = tv.danmaku.biliplayerv2.service.report.heartbeat.PlaySessionPhase.END;
                java.lang.String mSession = reportContext6.getMSession();
                if (mSession == null) {
                    mSession = "";
                }
                d2.d(new RI1.c(playSessionPhase, mSession, heartbeatParamsV7));
            }
            this.e = null;
        }
    }

    public final void Z7() {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = this.e;
        if (reportContext == null) {
            return;
        }
        if (reportContext.getMAid() <= 0 || this.e.getMCid() <= 0) {
            tv.danmaku.android.log.BLog.e("HeartBeatTracker", "request block: a video report heartbeat without avid");
            return;
        }
        if (this.e.getMServerTime() == 0) {
            this.e.setMServerTime(ol.d.d() / 1000);
        }
        this.m = true;
        tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams heartbeatParamsV7 = V7(this.e, true);
        ((tv.danmaku.biliplayerimpl.report.heartbeat.c) uB0.d.b(tv.danmaku.biliplayerimpl.report.heartbeat.c.class)).b(heartbeatParamsV7).f(new tv.danmaku.biliplayerimpl.report.heartbeat.f.g(this.e.getMSession()));
        tv.danmaku.android.log.BLog.i("HeartBeatTracker", "report heartbeat start, params:" + heartbeatParamsV7);
    }

    public final void a8(tv.danmaku.biliplayerv2.k kVar, boolean z) {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext;
        if (kVar == null) {
            this.e = null;
            this.g = false;
            this.h = 1.0f;
            this.i = false;
            return;
        }
        tv.danmaku.biliplayerv2.service.Video.g gVar = this.d;
        android.os.Bundle bundle = kVar.b;
        this.f = bundle.getString("key_share_player_report_session");
        this.e = (tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext) kVar.b("key_share_report_context", true);
        this.g = bundle.getBoolean("key_share_is_playing");
        tv.danmaku.biliplayerv2.PlayerSharedState playerSharedStateA = kVar.a();
        this.h = playerSharedStateA != null ? playerSharedStateA.b : 1.0f;
        if (gVar != null && (reportContext = this.e) != null) {
            reportContext.updateCommonParamsFromShare(gVar);
        }
        this.m = this.e != null;
        this.i = gVar != null ? gVar.p : false;
        if (z) {
            zb0.d.c(new Bs0.f(this, 8), 0);
        }
    }

    @Override // PH1.a
    public final void bindPlayerContainer$srcs_legacy_andruid_common_player_biliplayerimpl_biliplayerimpl_base(PH1.e eVar) {
        this.b = eVar;
    }

    @Override // RI1.a
    public final void f7() {
        tv.danmaku.biliplayerv2.service.Video.g gVar = this.d;
        if (gVar != null) {
            gVar.q = "8";
        }
    }

    @Override // RI1.b
    public final java.lang.String getSession() {
        java.lang.String str = this.f;
        if (str == null || str.length() == 0) {
            java.util.Random random = new java.util.Random();
            java.lang.String str2 = hh0.a.a() + java.lang.System.currentTimeMillis() + random.nextInt(1000000);
            java.lang.String strI = La0.a.i(str2);
            if (!android.text.TextUtils.isEmpty(strI)) {
                str2 = strI;
            }
            this.f = str2;
        }
        return this.f;
    }

    @Override // RI1.b
    public final void i() {
        PH1.e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        if (eVar.C()) {
            tv.danmaku.android.log.BLog.i("HeartBeatTracker", "is sharing, keep session");
        } else {
            this.f = null;
        }
    }

    @Override // RI1.a
    public final void i6(tv.danmaku.biliplayerv2.service.Video.g gVar) {
        this.d = gVar;
    }

    @Override // RI1.a
    public final kotlinx.coroutines.flow.D m5() {
        return this.q;
    }

    @Override // RI1.a
    public final void n7() {
        PH1.e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        tv.danmaku.biliplayerv2.service.D dL = eVar.l();
        X7(dL.L1(), dL.l());
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onAttachByShared(tv.danmaku.biliplayerv2.PlayerSharingType playerSharingType, tv.danmaku.biliplayerv2.k kVar) {
        this.k = false;
        a8(kVar, false);
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onCollectSharedParams(tv.danmaku.biliplayerv2.PlayerSharingType playerSharingType, tv.danmaku.biliplayerv2.k kVar) {
        java.lang.String str = this.f;
        android.os.Bundle bundle = kVar.b;
        if (str != null && str.length() != 0) {
            bundle.putString("key_share_player_report_session", this.f);
        }
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = this.e;
        if (reportContext == null) {
            return;
        }
        R7();
        if (this.i) {
            reportContext.setMListPlayTime(reportContext.getMPlayedTime());
        }
        kVar.c("key_share_report_context", reportContext.copy());
        bundle.putBoolean("key_share_is_playing", this.g);
        this.k = true;
        this.l = false;
        this.f = null;
        this.d = null;
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onStart(tv.danmaku.biliplayerv2.k kVar) {
        a8(kVar, true);
        PH1.e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar.l().y4(this.r, 3, 5, 4, 7, 6);
        PH1.e eVar2 = this.b;
        if (eVar2 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar2.l().z5(this.s);
        PH1.e eVar3 = this.b;
        if (eVar3 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar3.l().m3(this.u);
        PH1.e eVar4 = this.b;
        if (eVar4 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar4.l().F0(this.v);
        PH1.e eVar5 = this.b;
        if (eVar5 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar5.l().i3(this.w);
        PH1.e eVar6 = this.b;
        if (eVar6 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar6.l().j2(this.t);
        if (this.c) {
            PH1.e eVar7 = this.b;
            if (eVar7 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            tv.danmaku.biliplayerv2.service.t0 t0VarH = eVar7.h();
            tv.danmaku.biliplayerv2.service.t0.c<?> cVar = new tv.danmaku.biliplayerv2.service.t0.c<>();
            cVar.a = XH1.a.class;
            t0VarH.c(cVar);
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onStop() {
        if (this.m) {
            PH1.e eVar = this.b;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            tv.danmaku.biliplayerv2.service.D dL = eVar.l();
            T4(dL.L1(), dL.l());
        }
        PH1.e eVar2 = this.b;
        if (eVar2 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar2.l().V5(this.r);
        PH1.e eVar3 = this.b;
        if (eVar3 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar3.l().G7(this.s);
        PH1.e eVar4 = this.b;
        if (eVar4 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar4.l().l2(this.u);
        PH1.e eVar5 = this.b;
        if (eVar5 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar5.l().c2(this.v);
        PH1.e eVar6 = this.b;
        if (eVar6 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar6.l().A2(this.w);
        PH1.e eVar7 = this.b;
        if (eVar7 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar7.l().a3(this.t);
        this.f = null;
    }

    /* JADX INFO: compiled from: BL */
    public static final class g extends uB0.b<java.lang.String> {
        public final /* synthetic */ java.lang.String d;

        public g(java.lang.String str) {
            this.d = str;
        }

        public final void k(java.lang.Object obj) {
            java.lang.String str = (java.lang.String) obj;
            tv.danmaku.biliplayerimpl.report.heartbeat.f fVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.this;
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = fVar.e;
            if (reportContext == null || str == null || str.length() == 0 || !kotlin.jvm.internal.n.f(reportContext.getMSession(), this.d)) {
                return;
            }
            fVar.e.setMServerTime(new org.json.JSONObject(str).optLong("ts", 0L));
        }

        public final void i(java.lang.Throwable th) {
        }
    }
}
