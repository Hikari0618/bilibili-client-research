package com.bilibili.ship.theseus.united.player.history;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes16.dex */
public final class b {
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final com.bilibili.ship.theseus.keel.player.h a;
    public final androidx.lifecycle.Lifecycle b;
    public final com.bilibili.lib.accounts.x c;
    public final com.bilibili.ship.theseus.united.player.history.b.InterfaceC0818b d;
    public final TK0.i.a e;
    public final com.bilibili.playerbizcommon.features.background.e f;
    public final com.bilibili.ship.theseus.keel.player.j g;
    public final com.bilibili.app.gemini.base.player.a h;
    public long i;
    public final Zx1.e j = kotlin.b.c(new NH0.i(8));
    public com.bilibili.ship.theseus.united.player.history.b.a k;
    public com.bilibili.ship.theseus.united.player.history.a l;

    /* JADX INFO: compiled from: BL */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.bilibili.ship.theseus.united.player.history.b.a)) {
                return false;
            }
            com.bilibili.ship.theseus.united.player.history.b.a aVar = (com.bilibili.ship.theseus.united.player.history.b.a) obj;
            return kotlin.time.a.f(this.a, aVar.a) && kotlin.time.a.f(this.b, aVar.b);
        }

        public final int hashCode() {
            kotlin.time.a.a aVar = kotlin.time.a.c;
            return java.lang.Long.hashCode(this.b) + (java.lang.Long.hashCode(this.a) * 31);
        }

        public final java.lang.String toString() {
            return L7.d0.a("State(duration=", kotlin.time.a.z(this.a), ", position=", kotlin.time.a.z(this.b), ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BL */
    public interface InterfaceC0818b {
        int b();

        EF0.a c(long j);

        java.util.Map<java.lang.String, java.lang.String> d();

        int getType();
    }

    static {
        kotlin.time.a.a aVar = kotlin.time.a.c;
        m = kotlin.time.b.h(com.bilibili.lib.tf.TfCode.MOBILE_TF_RULES_NO_MATCH_VALUE, kotlin.time.DurationUnit.MILLISECONDS);
    }

    public b(com.bilibili.ship.theseus.keel.player.h hVar, androidx.lifecycle.Lifecycle lifecycle, com.bilibili.lib.accounts.x xVar, com.bilibili.ship.theseus.united.player.history.b.InterfaceC0818b interfaceC0818b, TK0.i.a aVar, com.bilibili.playerbizcommon.features.background.e eVar, com.bilibili.ship.theseus.keel.player.j jVar, com.bilibili.app.gemini.base.player.a aVar2) {
        this.a = hVar;
        this.b = lifecycle;
        this.c = xVar;
        this.d = interfaceC0818b;
        this.e = aVar;
        this.f = eVar;
        this.g = jVar;
        this.h = aVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(long j) throws kotlin.NoWhenBranchMatchedException {
        long j2;
        int i;
        long jI;
        long jY;
        long j3;
        vB0.a aVarA;
        boolean z;
        boolean z2;
        com.bilibili.ship.theseus.keel.player.j jVar = this.g;
        kotlin.time.a aVarM = jVar.l().m();
        if (aVarM != null) {
            this.k = new com.bilibili.ship.theseus.united.player.history.b.a(aVarM.b, jVar.l().y());
        }
        com.bilibili.ship.theseus.united.player.history.b.a aVar = this.k;
        if (aVar == null) {
            tv.danmaku.android.log.BLog.i("TheseusHistoryService", "State is null.");
            return;
        }
        com.bilibili.app.gemini.base.player.a aVar2 = this.h;
        long j4 = aVar2.u;
        long j5 = aVar2.v;
        if (j4 < 0 || j5 < 0) {
            tv.danmaku.android.log.BLog.i("TheseusHistoryService", "id invalid.");
            return;
        }
        long j6 = aVar.b;
        long jS = kotlin.time.a.s(j6, m);
        long j7 = aVar.a;
        int iC = kotlin.time.a.c(jS, j7);
        com.bilibili.ship.theseus.united.player.history.a.C0817a c0817a = com.bilibili.ship.theseus.united.player.history.a.C0817a.a;
        com.bilibili.ship.theseus.united.player.history.a bVar = iC >= 0 ? c0817a : new com.bilibili.ship.theseus.united.player.history.a.b(j6);
        com.bilibili.ship.theseus.united.player.history.a aVar3 = this.l;
        if (aVar3 != null) {
            aVar3.getClass();
            if ((aVar3 instanceof com.bilibili.ship.theseus.united.player.history.a.C0817a) && (bVar instanceof com.bilibili.ship.theseus.united.player.history.a.C0817a)) {
                j2 = j5;
                z2 = true;
                z = true;
            } else {
                boolean z3 = false;
                if ((aVar3 instanceof com.bilibili.ship.theseus.united.player.history.a.b) && (bVar instanceof com.bilibili.ship.theseus.united.player.history.a.b)) {
                    j2 = j5;
                    z = true;
                    if (kotlin.time.a.c(kotlin.time.a.g(kotlin.time.a.r(((com.bilibili.ship.theseus.united.player.history.a.b) aVar3).a, ((com.bilibili.ship.theseus.united.player.history.a.b) bVar).a)), kotlin.time.b.h(1, kotlin.time.DurationUnit.SECONDS)) <= 0) {
                        z3 = true;
                    }
                } else {
                    j2 = j5;
                    z = true;
                }
                z2 = z3;
            }
            if (z2 == z) {
                tv.danmaku.android.log.BLog.i("TheseusHistoryService", "Has reported same history.");
                return;
            }
        } else {
            j2 = j5;
        }
        this.l = bVar;
        if (bVar.equals(c0817a)) {
            i = -1;
        } else {
            if (!(bVar instanceof com.bilibili.ship.theseus.united.player.history.a.b)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = (int) kotlin.time.a.i(((com.bilibili.ship.theseus.united.player.history.a.b) bVar).a);
        }
        EF0.c cVar = new EF0.c(i);
        long j8 = j2;
        tv.danmaku.android.log.BLog.i("TheseusHistoryService", androidx.compose.runtime.s1.a(i, j8, "cid ", ",  progress "));
        Zx1.e eVar = EF0.e.a;
        EF0.e eVarA = EF0.e.a.a();
        com.bilibili.ship.theseus.united.player.history.b.InterfaceC0818b interfaceC0818b = this.d;
        EF0.a aVarC = interfaceC0818b.c(j8);
        eVarA.getClass();
        EF0.e.e(aVarC, cVar);
        long j9 = aVar2.u;
        long j10 = aVar2.v;
        java.lang.String str = aVar2.F;
        java.lang.String str2 = aVar2.G;
        int i2 = aVar2.D;
        int iB = interfaceC0818b.b();
        com.bilibili.playerbizcommonv2.history.CommonVideoPlayerDBData commonVideoPlayerDBData = new com.bilibili.playerbizcommonv2.history.CommonVideoPlayerDBData();
        commonVideoPlayerDBData.b = j9;
        commonVideoPlayerDBData.c = j10;
        commonVideoPlayerDBData.d = 3;
        commonVideoPlayerDBData.e = str;
        commonVideoPlayerDBData.f = str2;
        commonVideoPlayerDBData.g = i2;
        commonVideoPlayerDBData.h = null;
        commonVideoPlayerDBData.i = iB;
        com.bilibili.playerdb.basic.PlayerDBEntity playerDBEntity = new com.bilibili.playerdb.basic.PlayerDBEntity(commonVideoPlayerDBData);
        if (bVar.equals(c0817a)) {
            jI = -1;
        } else {
            if (!(bVar instanceof com.bilibili.ship.theseus.united.player.history.a.b)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            jI = kotlin.time.a.i(((com.bilibili.ship.theseus.united.player.history.a.b) bVar).a);
        }
        long jI2 = kotlin.time.a.i(j7);
        long jC = ol.d.c();
        playerDBEntity.b = jI;
        playerDBEntity.c = jI2;
        playerDBEntity.e = jC;
        playerDBEntity.d = 0L;
        com.bilibili.playerbizcommonv2.history.c cVar2 = (com.bilibili.playerbizcommonv2.history.c) this.j.getValue();
        cVar2.getClass();
        G5.g.b(new com.bilibili.playerbizcommonv2.history.b(cVar2, playerDBEntity));
        java.lang.String str3 = this.f.isBackgroundRunning() ? com.bilibili.lib.gripper.api.StandardExecutor.BACKGROUND : "front";
        if (bVar.equals(c0817a)) {
            jY = -1;
        } else {
            if (!(bVar instanceof com.bilibili.ship.theseus.united.player.history.a.b)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            jY = kotlin.time.a.y(((com.bilibili.ship.theseus.united.player.history.a.b) bVar).a, kotlin.time.DurationUnit.SECONDS);
        }
        long jY2 = kotlin.time.a.y(j7, kotlin.time.DurationUnit.SECONDS);
        if (j5 < 0 || j4 < 0) {
            j3 = j8;
        } else {
            this.c.getClass();
            java.lang.String strD = com.bilibili.lib.accounts.x.d();
            java.util.Map<java.lang.String, java.lang.String> mapD = interfaceC0818b.d();
            java.lang.Integer num = this.e.p;
            int iIntValue = num != null ? num.intValue() : interfaceC0818b.getType();
            com.bilibili.playerbizcommonv2.api.c cVar3 = (com.bilibili.playerbizcommonv2.api.c) uB0.d.b(com.bilibili.playerbizcommonv2.api.c.class);
            if (j == Long.MIN_VALUE) {
                if (mapD == null) {
                    mapD = kotlin.collections.J.r();
                }
                long j11 = 1000;
                aVarA = cVar3.b(strD, mapD, j8, j4, "player-old", jY2, jY, iIntValue, ol.d.d() / j11, this.i / j11, str3);
            } else {
                if (mapD == null) {
                    mapD = kotlin.collections.J.r();
                }
                long j12 = 1000;
                aVarA = cVar3.a(strD, mapD, j8, j4, "player-old", jY2, jY, iIntValue, ol.d.d() / j12, this.i / j12, str3, j);
            }
            j3 = j8;
            aVarA.f(new com.bilibili.ship.theseus.united.player.history.c(j8, this, j4, jY, "player-old", iIntValue, jY2));
        }
        java.lang.StringBuilder sbE = O0.n.e(j3, "Saving play history. cid: ", ", progress: ");
        androidx.compose.runtime.snapshots.y.a(jY, ", scene: ", str3, sbE);
        CI0.b.e(sbE, ".", "TheseusHistoryService");
    }

    public final java.lang.Object c(kotlin.coroutines.jvm.internal.SuspendLambda suspendLambda) {
        java.lang.Object objD = kotlinx.coroutines.F.d(new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2(this, null), suspendLambda);
        return objD == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Zx1.o.a;
    }
}
