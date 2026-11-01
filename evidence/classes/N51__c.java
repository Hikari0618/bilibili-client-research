package N51;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes19.dex */
public final class c implements p014Dw0.b {
    public static long b;
    public static final N51.c a = new N51.c();
    public static final Zx1.e c = kotlin.b.c(new Jx1.r(1));
    public static final N51.c.a d = new N51.c.a();
    public static final N51.c.b e = new N51.c.b();
    public static final N51.c.C0056c f = new N51.c.C0056c();
    public static final java.lang.Class<? extends p028Gw0.a> g = com.bilibili.app.comm.ugc.miniplayer.common.UgcMiniPlayerPanel.class;

    /* JADX INFO: compiled from: BL */
    public static final class a implements dJ1.m {
        public final EF0.c b(EF0.a aVar) {
            if (!(aVar instanceof FF0.h)) {
                Ig.b.c("read history from error params , params = ", aVar.o(), "StoryMiniPlayerBizProvider");
                return null;
            }
            Zx1.e eVar = EF0.e.a;
            EF0.e.a.a().getClass();
            EF0.c cVarB = EF0.e.b(aVar);
            FF0.h hVar = (FF0.h) aVar;
            tv.danmaku.android.log.BLog.i("StoryMiniPlayerBizProvider", "read history cid = " + ((FF0.b) hVar).b + " progress = " + (cVarB != null ? java.lang.Integer.valueOf(cVarB.a) : null));
            return cVarB;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b implements p023Fw0.b {
    }

    /* JADX INFO: renamed from: N51.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BL */
    public static final class C0056c implements cJ1.k {

        /* JADX INFO: renamed from: N51.c$c$a */
        /* JADX INFO: compiled from: BL */
        public static final class a implements iG0.a.a {
            public final /* synthetic */ cJ1.l a;

            public a(cJ1.l lVar) {
                this.a = lVar;
            }

            public final void a() {
                if (Lo.j.h()) {
                    return;
                }
                N51.c cVar = N51.c.a;
                N51.c.n(this.a);
            }

            public final int w() {
                return this.a.w();
            }
        }

        public final void X(cJ1.l lVar) {
            N51.c.n(lVar);
            ((iG0.a) N51.c.c.getValue()).b();
        }

        public final void j1(cJ1.l lVar) {
            N51.c.n(lVar);
            ((iG0.a) N51.c.c.getValue()).b();
        }

        public final void m1(cJ1.l lVar) {
            N51.c cVar = N51.c.a;
            N51.c.b = ol.d.d();
            ((iG0.a) N51.c.c.getValue()).a(new N51.c.C0056c.a(lVar));
        }
    }

    public static final void n(cJ1.l lVar) {
        tv.danmaku.biliplayerv2.service.Video.e eVarD = lVar.D();
        if (eVarD != null) {
            tv.danmaku.biliplayerv2.service.Video.b bVarA = eVarD.A();
            long currentPosition = lVar.getCurrentPosition();
            EF0.c cVar = ((long) com.bilibili.lib.tf.TfCode.MOBILE_TF_RULES_NO_MATCH_VALUE) + currentPosition >= lVar.getDuration() ? new EF0.c(-1) : new EF0.c((int) currentPosition);
            Zx1.e eVar = EF0.e.a;
            EF0.e eVarA = EF0.e.a.a();
            FF0.h hVar = new FF0.h(bVarA.g);
            eVarA.getClass();
            EF0.e.e(hVar, cVar);
            if (bVarA.f < 0 || bVarA.g < 0) {
                return;
            }
            java.lang.String str = Lo.j.h() ? "front" : com.bilibili.lib.gripper.api.StandardExecutor.BACKGROUND;
            long j = 1000;
            ((com.bilibili.playerbizcommonv2.api.c) uB0.d.b(com.bilibili.playerbizcommonv2.api.c.class)).b(B9.Q.b(), kotlin.collections.J.r(), bVarA.g, bVarA.f, "player-window", lVar.getDuration() / j, currentPosition / j, 3, ol.d.d() / j, b / j, str).f(new N51.d(bVarA, currentPosition, str, lVar));
        }
    }

    @Override // p014Dw0.b
    public final SI1.a b() {
        return null;
    }

    @Override // p014Dw0.b
    public final kotlin.jvm.functions.Function1<com.bilibili.mini.player.common.AppState, Zx1.o> c() {
        return null;
    }

    @Override // p014Dw0.b
    public final java.lang.Class<? extends p028Gw0.a> e() {
        return g;
    }

    @Override // p014Dw0.b
    public final p023Fw0.b g() {
        return e;
    }

    @Override // p014Dw0.b
    public final dJ1.m h() {
        return d;
    }

    @Override // p014Dw0.b
    public final p014Dw0.a j() {
        return N51.b.a;
    }

    @Override // p014Dw0.b
    public final p008Bw0.a k() {
        return (com.bilibili.app.comm.ugc.miniplayer.common.a) com.bilibili.app.comm.ugc.miniplayer.common.a.d.getValue();
    }

    @Override // p014Dw0.b
    public final cJ1.k m() {
        return f;
    }
}
