package EE0;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili3/dex/classes17.dex */
public final class a {

    @com.google.gson.annotations.SerializedName("toast")
    private final com.bilibili.pegasus.data.ToastConfig A;

    @com.google.gson.annotations.SerializedName("history_cache_size")
    private final int B;

    @com.google.gson.annotations.SerializedName("top_refresh_latest_exp")
    private final int C;

    @com.google.gson.annotations.SerializedName("behavior_return_refresh_exp")
    private final int D;

    @com.google.gson.annotations.SerializedName("in_app_timeout_refresh_exp")
    private final int E;

    @com.google.gson.annotations.SerializedName("rcmd_label_mng_entrance")
    private final int F;

    @com.google.gson.annotations.SerializedName("is_oversea")
    private final boolean G;

    @com.google.gson.annotations.SerializedName("interest_guide")
    private final com.bilibili.pegasus.data.interestchoose.InterestChooseGuide H;

    @com.google.gson.annotations.SerializedName("is_back_auto_refresh")
    private final int I;

    @com.google.gson.annotations.SerializedName("pre_flush_recover")
    private final com.bilibili.pegasus.data.config.FlushRecoverConfig J;

    @com.google.gson.annotations.SerializedName("refresh_exp")
    private final com.bilibili.pegasus.data.config.RefreshExp K;

    @com.google.gson.annotations.SerializedName("inline")
    private final com.bilibili.pegasus.data.InlineConfig L;

    @com.google.gson.annotations.SerializedName("trigger_loadmore_left_line_num")
    private final int a;

    @com.google.gson.annotations.SerializedName("column")
    private final int b;

    @com.google.gson.annotations.SerializedName("autoplay_card")
    private final int c;

    @com.google.gson.annotations.SerializedName("follow_mode")
    private final EE0.c d;

    @com.google.gson.annotations.SerializedName("scene_uri")
    private final java.lang.String e;

    @com.google.gson.annotations.SerializedName("feed_top_clean")
    private final int f;

    @com.google.gson.annotations.SerializedName("no_preload")
    private final int g;

    @com.google.gson.annotations.SerializedName("small_cover_wh_ratio")
    private final float h;

    @com.google.gson.annotations.SerializedName("need_reset_autoplay")
    private final boolean i;

    @com.google.gson.annotations.SerializedName("night_follow_system_ab")
    private final int j;

    @com.google.gson.annotations.SerializedName("close_small_window")
    private final int k;

    @com.google.gson.annotations.SerializedName("navigate_switch_column")
    private final EE0.e l;

    @com.google.gson.annotations.SerializedName("inline_sound_cold_state")
    private final int m;

    @com.google.gson.annotations.SerializedName("auto_refresh_state")
    private final int n;

    @com.google.gson.annotations.SerializedName("enable_rcmd_guide")
    private final boolean o;

    @com.google.gson.annotations.SerializedName("visible_area")
    private final int p;

    @com.google.gson.annotations.SerializedName("exposure_duration_start_ratio")
    private final float q;

    @com.google.gson.annotations.SerializedName("exposure_duration_end_ratio")
    private final float r;

    @com.google.gson.annotations.SerializedName("exposure_duration_min_ms")
    private final long s;

    @com.google.gson.annotations.SerializedName("video_mode")
    private final int t;

    @com.google.gson.annotations.SerializedName("need_show_story_mode_guide")
    private final int u;

    @com.google.gson.annotations.SerializedName("story_mode_v2_guide_exp")
    private final int v;

    @com.google.gson.annotations.SerializedName("auto_refresh_time_by_behavior")
    private final int w;

    @com.google.gson.annotations.SerializedName("auto_refresh_by_behavior")
    private final int x;

    @com.google.gson.annotations.SerializedName("auto_refresh_time_by_appear")
    private final long y;

    @com.google.gson.annotations.SerializedName("auto_refresh_time_by_active")
    private final long z;

    public a(int i, int i2, int i3, EE0.c cVar, java.lang.String str, int i4, int i5, float f, boolean z, int i6, int i7, EE0.e eVar, int i8, int i9, boolean z2, int i10, float f2, float f3, long j, int i11, int i12, int i13, int i14, int i15, long j2, long j3, com.bilibili.pegasus.data.ToastConfig toastConfig, int i16, int i17, int i18, int i19, int i20, boolean z3, com.bilibili.pegasus.data.interestchoose.InterestChooseGuide interestChooseGuide, int i21, com.bilibili.pegasus.data.config.FlushRecoverConfig flushRecoverConfig, com.bilibili.pegasus.data.config.RefreshExp refreshExp, com.bilibili.pegasus.data.InlineConfig inlineConfig) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = cVar;
        this.e = str;
        this.f = i4;
        this.g = i5;
        this.h = f;
        this.i = z;
        this.j = i6;
        this.k = i7;
        this.l = eVar;
        this.m = i8;
        this.n = i9;
        this.o = z2;
        this.p = i10;
        this.q = f2;
        this.r = f3;
        this.s = j;
        this.t = i11;
        this.u = i12;
        this.v = i13;
        this.w = i14;
        this.x = i15;
        this.y = j2;
        this.z = j3;
        this.A = toastConfig;
        this.B = i16;
        this.C = i17;
        this.D = i18;
        this.E = i19;
        this.F = i20;
        this.G = z3;
        this.H = interestChooseGuide;
        this.I = i21;
        this.J = flushRecoverConfig;
        this.K = refreshExp;
        this.L = inlineConfig;
    }

    public static EE0.a a(EE0.a aVar, com.bilibili.pegasus.data.ToastConfig toastConfig) {
        int i = aVar.a;
        int i2 = aVar.b;
        int i3 = aVar.c;
        EE0.c cVar = aVar.d;
        java.lang.String str = aVar.e;
        int i4 = aVar.f;
        int i5 = aVar.g;
        float f = aVar.h;
        boolean z = aVar.i;
        int i6 = aVar.j;
        int i7 = aVar.k;
        EE0.e eVar = aVar.l;
        int i8 = aVar.m;
        int i9 = aVar.n;
        boolean z2 = aVar.o;
        int i10 = aVar.p;
        float f2 = aVar.q;
        float f3 = aVar.r;
        long j = aVar.s;
        int i11 = aVar.t;
        int i12 = aVar.u;
        int i13 = aVar.v;
        int i14 = aVar.w;
        int i15 = aVar.x;
        long j2 = aVar.y;
        long j3 = aVar.z;
        int i16 = aVar.B;
        int i17 = aVar.C;
        int i18 = aVar.D;
        int i19 = aVar.E;
        int i20 = aVar.F;
        boolean z3 = aVar.G;
        com.bilibili.pegasus.data.interestchoose.InterestChooseGuide interestChooseGuide = aVar.H;
        int i21 = aVar.I;
        com.bilibili.pegasus.data.config.FlushRecoverConfig flushRecoverConfig = aVar.J;
        com.bilibili.pegasus.data.config.RefreshExp refreshExp = aVar.K;
        com.bilibili.pegasus.data.InlineConfig inlineConfig = aVar.L;
        aVar.getClass();
        return new EE0.a(i, i2, i3, cVar, str, i4, i5, f, z, i6, i7, eVar, i8, i9, z2, i10, f2, f3, j, i11, i12, i13, i14, i15, j2, j3, toastConfig, i16, i17, i18, i19, i20, z3, interestChooseGuide, i21, flushRecoverConfig, refreshExp, inlineConfig);
    }

    public final int A() {
        return this.u;
    }

    public final int B() {
        return this.j;
    }

    public final com.bilibili.pegasus.data.config.FlushRecoverConfig C() {
        return this.J;
    }

    public final int D() {
        if (this.g != 0) {
            return 0;
        }
        int i = this.a;
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int E() {
        return this.F;
    }

    public final com.bilibili.pegasus.data.config.RefreshExp F() {
        return this.K;
    }

    public final long G() {
        com.bilibili.pegasus.data.config.RefreshExp refreshExp = this.K;
        int refreshMinInterval = refreshExp != null ? refreshExp.getRefreshMinInterval() : 0;
        if (refreshMinInterval <= 0) {
            return -1L;
        }
        return ((long) refreshMinInterval) * 1000;
    }

    public final java.lang.String H() {
        return this.e;
    }

    public final int I() {
        return this.v;
    }

    public final float J() {
        return this.h;
    }

    public final com.bilibili.pegasus.data.ToastConfig K() {
        return this.A;
    }

    public final int L() {
        return this.t;
    }

    public final boolean M() {
        int i = this.x;
        return i >= 0 && i < 8;
    }

    public final int N() {
        return this.I;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.x;
    }

    public final int d() {
        return this.n;
    }

    public final long e() {
        long j = this.z;
        if (j < 0) {
            return -1L;
        }
        if (j == 0) {
            return 1200000L;
        }
        return j * 1000;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EE0.a)) {
            return false;
        }
        EE0.a aVar = (EE0.a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && kotlin.jvm.internal.n.f(this.d, aVar.d) && kotlin.jvm.internal.n.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && java.lang.Float.compare(this.h, aVar.h) == 0 && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && kotlin.jvm.internal.n.f(this.l, aVar.l) && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && java.lang.Float.compare(this.q, aVar.q) == 0 && java.lang.Float.compare(this.r, aVar.r) == 0 && this.s == aVar.s && this.t == aVar.t && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && this.y == aVar.y && this.z == aVar.z && kotlin.jvm.internal.n.f(this.A, aVar.A) && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && kotlin.jvm.internal.n.f(this.H, aVar.H) && this.I == aVar.I && kotlin.jvm.internal.n.f(this.J, aVar.J) && kotlin.jvm.internal.n.f(this.K, aVar.K) && kotlin.jvm.internal.n.f(this.L, aVar.L);
    }

    public final long f() {
        long j = this.y;
        if (j < 0) {
            return -1L;
        }
        if (j == 0) {
            return 1200000L;
        }
        return j * 1000;
    }

    public final long g() {
        int i = this.w;
        if (i <= 0) {
            return -1L;
        }
        return ((long) i) * 1000;
    }

    public final int h() {
        return this.D;
    }

    public final int hashCode() {
        int iB = Ig.f.b(this.c, Ig.f.b(this.b, java.lang.Integer.hashCode(this.a) * 31, 31), 31);
        EE0.c cVar = this.d;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        java.lang.String str = this.e;
        int iB2 = Ig.f.b(this.k, Ig.f.b(this.j, androidx.compose.animation.K.a(Ne.i.a(this.h, Ig.f.b(this.g, Ig.f.b(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.i), 31), 31);
        EE0.e eVar = this.l;
        int iB3 = androidx.compose.animation.z.b(androidx.compose.animation.z.b(Ig.f.b(this.x, Ig.f.b(this.w, Ig.f.b(this.v, Ig.f.b(this.u, Ig.f.b(this.t, androidx.compose.animation.z.b(Ne.i.a(this.r, Ne.i.a(this.q, Ig.f.b(this.p, androidx.compose.animation.K.a(Ig.f.b(this.n, Ig.f.b(this.m, (iB2 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31), 31), 31, this.o), 31), 31), 31), 31, this.s), 31), 31), 31), 31), 31), 31, this.y), 31, this.z);
        com.bilibili.pegasus.data.ToastConfig toastConfig = this.A;
        int iA = androidx.compose.animation.K.a(Ig.f.b(this.F, Ig.f.b(this.E, Ig.f.b(this.D, Ig.f.b(this.C, Ig.f.b(this.B, (iB3 + (toastConfig == null ? 0 : toastConfig.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.G);
        com.bilibili.pegasus.data.interestchoose.InterestChooseGuide interestChooseGuide = this.H;
        int iB4 = Ig.f.b(this.I, (iA + (interestChooseGuide == null ? 0 : interestChooseGuide.hashCode())) * 31, 31);
        com.bilibili.pegasus.data.config.FlushRecoverConfig flushRecoverConfig = this.J;
        int iHashCode2 = (iB4 + (flushRecoverConfig == null ? 0 : flushRecoverConfig.hashCode())) * 31;
        com.bilibili.pegasus.data.config.RefreshExp refreshExp = this.K;
        int iHashCode3 = (iHashCode2 + (refreshExp == null ? 0 : refreshExp.hashCode())) * 31;
        com.bilibili.pegasus.data.InlineConfig inlineConfig = this.L;
        return iHashCode3 + (inlineConfig != null ? inlineConfig.hashCode() : 0);
    }

    public final boolean i() {
        return this.f == 1;
    }

    public final int j() {
        return this.k;
    }

    public final int k() {
        return this.b;
    }

    public final boolean l() {
        return this.o;
    }

    public final java.util.List<java.lang.String> m() {
        java.util.List<java.lang.String> excludedPvList;
        com.bilibili.pegasus.data.config.RefreshExp refreshExp = this.K;
        return (refreshExp == null || (excludedPvList = refreshExp.getExcludedPvList()) == null) ? kotlin.collections.EmptyList.INSTANCE : excludedPvList;
    }

    public final float n() {
        return this.r;
    }

    public final long o() {
        return this.s;
    }

    public final float p() {
        int i = this.p;
        if (i < 0 || i >= 101) {
            return 0.5f;
        }
        return i * 0.01f;
    }

    public final float q() {
        return this.q;
    }

    public final EE0.c r() {
        return this.d;
    }

    public final int s() {
        return this.E;
    }

    public final com.bilibili.pegasus.data.InlineConfig t() {
        return this.L;
    }

    public final java.lang.String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        EE0.c cVar = this.d;
        java.lang.String str = this.e;
        int i4 = this.f;
        int i5 = this.g;
        float f = this.h;
        boolean z = this.i;
        int i6 = this.j;
        int i7 = this.k;
        EE0.e eVar = this.l;
        int i8 = this.m;
        int i9 = this.n;
        boolean z2 = this.o;
        int i10 = this.p;
        float f2 = this.q;
        float f3 = this.r;
        long j = this.s;
        int i11 = this.t;
        int i12 = this.u;
        int i13 = this.v;
        int i14 = this.w;
        int i15 = this.x;
        long j2 = this.y;
        long j3 = this.z;
        com.bilibili.pegasus.data.ToastConfig toastConfig = this.A;
        int i16 = this.B;
        int i17 = this.C;
        int i18 = this.D;
        int i19 = this.E;
        int i20 = this.F;
        boolean z3 = this.G;
        com.bilibili.pegasus.data.interestchoose.InterestChooseGuide interestChooseGuide = this.H;
        int i21 = this.I;
        com.bilibili.pegasus.data.config.FlushRecoverConfig flushRecoverConfig = this.J;
        com.bilibili.pegasus.data.config.RefreshExp refreshExp = this.K;
        com.bilibili.pegasus.data.InlineConfig inlineConfig = this.L;
        java.lang.StringBuilder sbD = O0.n.d(i, i2, "ConfigData(triggerLoadMoreLeftLineNum=", ", column=", ", autoPlayCard=");
        sbD.append(i3);
        sbD.append(", followMode=");
        sbD.append(cVar);
        sbD.append(", sceneUri=");
        ba1.m.b(i4, str, ", feedTopClean=", ", noPreload=", sbD);
        androidx.appcompat.widget.b0.c(f, i5, ", smallCoverWhRatio=", ", needResetAutoPlay=", sbD);
        SK0.B0.d(", nightFollowSystemAb=", ", closeSmallWindow=", i6, z, sbD);
        sbD.append(i7);
        sbD.append(", navigateSwitchColumn=");
        sbD.append(eVar);
        sbD.append(", inlineSoundColdState=");
        androidx.appcompat.widget.y.c(i8, i9, ", autoRefreshState=", ", enableRcmdGuide=", sbD);
        SK0.B0.d(", visibleArea=", ", exposeStartRatio=", i10, z2, sbD);
        androidx.compose.animation.core.v.c(sbD, f2, ", exposeEndRatio=", f3, ", exposeMinReportTimeMs=");
        J2.G.a(i11, j, ", videoMode=", sbD);
        androidx.compose.runtime.s1.c(i12, i13, ", needShowStoryModeGuide=", ", showStoryModeGuideExpV2=", sbD);
        androidx.compose.runtime.s1.c(i14, i15, ", autoRefreshTimeByBehavior=", ", autoRefreshByBehavior=", sbD);
        J2.J.a(j2, ", autoRefreshTimeByAppear=", ", autoRefreshTimeByActive=", sbD);
        sbD.append(j3);
        sbD.append(", toastConfig=");
        sbD.append(toastConfig);
        androidx.compose.runtime.s1.c(i16, i17, ", historyCacheSize=", ", topRefreshLatestExp=", sbD);
        androidx.compose.runtime.s1.c(i18, i19, ", behaviorReturnRefreshExp=", ", inAppTimeoutRefreshExp=", sbD);
        Ig.l.f(", rcmdLabelMngEntrance=", ", isOversea=", i20, z3, sbD);
        sbD.append(", interestChooseGuide=");
        sbD.append(interestChooseGuide);
        sbD.append(", isBackAutoRefresh=");
        sbD.append(i21);
        sbD.append(", preFlushRecover=");
        sbD.append(flushRecoverConfig);
        sbD.append(", refreshExp=");
        sbD.append(refreshExp);
        sbD.append(", inlineConfig=");
        sbD.append(inlineConfig);
        sbD.append(")");
        return sbD.toString();
    }

    public final int u() {
        return this.m;
    }

    public final com.bilibili.pegasus.data.interestchoose.InterestChooseGuide v() {
        return this.H;
    }

    public final int w() {
        int i = this.m;
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                return 0;
            }
        }
        return 2;
    }

    public final int x() {
        int i = this.B;
        if (i > 0) {
            return i;
        }
        return i < 0 ? 0 : 100;
    }

    public final EE0.e y() {
        return this.l;
    }

    public final boolean z() {
        return this.i;
    }
}
