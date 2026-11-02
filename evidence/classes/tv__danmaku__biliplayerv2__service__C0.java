package tv.danmaku.biliplayerv2.service;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/seek/dex/classes26.dex */
public final class C0 implements tv.danmaku.biliplayerv2.service.Z {
    public final tv.danmaku.biliplayerv2.service.C0.b A;
    public final tv.danmaku.biliplayerv2.service.C0.c B;
    public final Mj0.s C;
    public final BA.c D;
    public PH1.e g;
    public tv.danmaku.biliplayerv2.service.D h;
    public tv.danmaku.biliplayerv2.service.C2638o i;
    public Cy1.d o;
    public final kotlinx.coroutines.flow.StateFlowImpl p;
    public final kotlinx.coroutines.flow.StateFlowImpl q;

    @tv.danmaku.biliplayerv2.injection.InjectPlayerService
    private tv.danmaku.biliplayerv2.service.interact.biz.g r;

    @tv.danmaku.biliplayerv2.injection.InjectPlayerService
    private tv.danmaku.biliplayerv2.service.r s;
    public final Gh0.f t;
    public java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> u;
    public java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> v;
    public tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint w;
    public final tv.danmaku.biliplayerv2.service.C0.e x;
    public final tv.danmaku.biliplayerv2.service.C0.d y;
    public final tv.danmaku.biliplayerv2.service.C0.a z;
    public final kotlinx.coroutines.flow.StateFlowImpl b = kotlinx.coroutines.flow.J.a(java.lang.Boolean.FALSE);
    public final p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2634k> c = new p078fI1.f<>(new java.util.LinkedList());
    public final p078fI1.f<tv.danmaku.biliplayerv2.service.r0> d = new p078fI1.f<>(new java.util.LinkedList());
    public final p078fI1.f<tv.danmaku.biliplayerv2.service.B0> e = new p078fI1.f<>(new java.util.ArrayList());
    public final java.util.LinkedList<tv.danmaku.biliplayerv2.service.D0> f = new java.util.LinkedList<>();
    public final java.util.ArrayList j = new java.util.ArrayList();
    public final boolean k = true;
    public final boolean l = true;
    public boolean m = true;
    public boolean n = true;

    /* JADX INFO: compiled from: BL */
    public static final class a implements tv.danmaku.biliplayerv2.service.InterfaceC2628g {
        public a() {
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2628g
        public final void onControlContainerImmersiveChanged(int i, boolean z) {
            tv.danmaku.biliplayerv2.service.C0 c0 = tv.danmaku.biliplayerv2.service.C0.this;
            if (z) {
                c0.o(true);
                return;
            }
            tv.danmaku.biliplayerv2.service.r rVar = c0.s;
            if (rVar == null) {
                kotlin.jvm.internal.n.m("mControlContainerService");
                throw null;
            }
            if (rVar.isShowing()) {
                return;
            }
            zb0.d.a(0).removeCallbacks(c0.B);
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2628g
        public final void onControlContainerVisibleChanged(boolean z) {
            tv.danmaku.biliplayerv2.service.C0 c0 = tv.danmaku.biliplayerv2.service.C0.this;
            zb0.d.c(c0.C, 0);
            tv.danmaku.biliplayerv2.service.C0.b(c0, z);
            if (z) {
                c0.o(true);
            } else {
                zb0.d.a(0).removeCallbacks(c0.B);
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b implements tv.danmaku.biliplayerv2.service.InterfaceC2624e {
        public b() {
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2624e
        public final void onControlContainerChanged(tv.danmaku.biliplayerv2.ControlContainerType controlContainerType, tv.danmaku.biliplayerv2.ScreenModeType screenModeType) {
            zb0.d.c(tv.danmaku.biliplayerv2.service.C0.this.C, 0);
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class c implements java.lang.Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            tv.danmaku.biliplayerv2.service.C0 c0 = tv.danmaku.biliplayerv2.service.C0.this;
            tv.danmaku.biliplayerv2.service.D d = c0.h;
            if (d != null) {
                int duration = d.getDuration();
                int currentPosition = d.getCurrentPosition();
                if (currentPosition >= 0 && duration > 0) {
                    if (currentPosition > duration) {
                        currentPosition = duration;
                    }
                    p078fI1.f<tv.danmaku.biliplayerv2.service.r0> fVar = c0.d;
                    fVar.c++;
                    java.util.Iterator it = fVar.b.iterator();
                    while (it.hasNext()) {
                        ((tv.danmaku.biliplayerv2.service.r0) it.next()).G(currentPosition, duration);
                    }
                    fVar.c--;
                    if (!fVar.e()) {
                        while (true) {
                            java.util.ArrayList arrayList = fVar.d;
                            if (arrayList.size() <= 0) {
                                break;
                            } else {
                                ((java.lang.Runnable) arrayList.remove(0)).run();
                            }
                        }
                    }
                }
            }
            zb0.d.e(0, this, 1000L);
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class d implements tv.danmaku.biliplayerv2.service.E0 {
        public d() {
        }

        @Override // tv.danmaku.biliplayerv2.service.E0
        public final void b(tv.danmaku.biliplayerv2.service.Video.e eVar, tv.danmaku.biliplayerv2.service.Video.e eVar2) {
            if (kotlin.jvm.internal.n.f(eVar2, eVar)) {
                return;
            }
            tv.danmaku.biliplayerv2.service.C0 c0 = tv.danmaku.biliplayerv2.service.C0.this;
            c0.u = null;
            c0.g();
            c0.v = null;
            c0.g();
        }

        @Override // tv.danmaku.biliplayerv2.service.E0
        public final void e(tv.danmaku.biliplayerv2.service.Video.e eVar) {
            zb0.d.c(tv.danmaku.biliplayerv2.service.C0.this.D, 0);
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class e implements tv.danmaku.biliplayerv2.service.interact.biz.j {
        public e() {
        }

        @Override // tv.danmaku.biliplayerv2.service.interact.biz.j
        public final void a(java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list) {
            tv.danmaku.biliplayerv2.service.C0 c0 = tv.danmaku.biliplayerv2.service.C0.this;
            PH1.e eVar = c0.g;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            if (eVar.l().getDuration() <= 0) {
                return;
            }
            c0.u = list;
            c0.g();
        }
    }

    public C0() {
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA = kotlinx.coroutines.flow.J.a(kotlin.collections.EmptyList.INSTANCE);
        this.p = stateFlowImplA;
        this.q = stateFlowImplA;
        this.t = new Gh0.f(this, 6);
        this.x = new tv.danmaku.biliplayerv2.service.C0.e();
        this.y = new tv.danmaku.biliplayerv2.service.C0.d();
        this.z = new tv.danmaku.biliplayerv2.service.C0.a();
        this.A = new tv.danmaku.biliplayerv2.service.C0.b();
        this.B = new tv.danmaku.biliplayerv2.service.C0.c();
        this.C = new Mj0.s(this, 7);
        this.D = new BA.c(this, 5);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.PlayerControlBarChange$Request] */
    public static final void b(tv.danmaku.biliplayerv2.service.C0 c0, boolean z) {
        tv.danmaku.biliplayerv2.service.interact.biz.g gVar = c0.r;
        if (gVar == null) {
            kotlin.jvm.internal.n.m("mInteractLayerService");
            throw null;
        }
        if (gVar.d6()) {
            return;
        }
        ?? r2 = new java.lang.Object() { // from class: tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.PlayerControlBarChange$Request

            @com.alibaba.fastjson.annotation.JSONField(name = "display")
            private java.lang.Boolean display;

            @com.alibaba.fastjson.annotation.JSONField(name = "tiny_progress")
            private java.lang.Boolean tinyProgress;

            public final java.lang.Boolean getDisplay() {
                return this.display;
            }

            public final java.lang.Boolean getTinyProgress() {
                return this.tinyProgress;
            }

            public final void setDisplay(java.lang.Boolean bool) {
                this.display = bool;
            }

            public final void setTinyProgress(java.lang.Boolean bool) {
                this.tinyProgress = bool;
            }
        };
        r2.setDisplay(java.lang.Boolean.valueOf(z));
        tv.danmaku.biliplayerv2.service.C2638o c2638o = c0.i;
        r2.setTinyProgress(java.lang.Boolean.valueOf(c2638o != null ? c2638o.d : false));
        tv.danmaku.biliplayerv2.service.interact.biz.g gVar2 = c0.r;
        if (gVar2 == null) {
            kotlin.jvm.internal.n.m("mInteractLayerService");
            throw null;
        }
        tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.b bVarS0 = gVar2.S0();
        if (bVarS0 != null) {
            ((tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.RemoteServiceHandler) bVarS0).n.a(r2, null, tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.PlayerControlBarChange$Response.class, null, null);
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void B6(java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list) {
        this.v = list;
        g();
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void O6(tv.danmaku.biliplayerv2.service.D0 d0) {
        this.f.remove(d0);
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void U5(tv.danmaku.biliplayerv2.service.InterfaceC2634k interfaceC2634k) {
        p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2634k> fVar = this.c;
        if (fVar.b.contains(interfaceC2634k)) {
            return;
        }
        fVar.add(interfaceC2634k);
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void V4(tv.danmaku.biliplayerv2.service.InterfaceC2634k interfaceC2634k) {
        this.c.remove(interfaceC2634k);
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final kotlinx.coroutines.flow.A b7() {
        return kotlinx.coroutines.flow.f.b(this.b);
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void bindPlayerContainer(tv.danmaku.biliplayerv2.f fVar) {
        PH1.e eVar = (PH1.e) fVar;
        this.g = eVar;
        this.h = eVar.l();
        this.s = eVar.j();
    }

    public final void d() {
        zb0.d.f(this.C, 0);
        tv.danmaku.biliplayerv2.service.C2638o c2638o = this.i;
        if (c2638o == null || c2638o.d) {
            if ((c2638o == null || !c2638o.e) && c2638o != null) {
                PH1.e eVar = this.g;
                if (eVar != null) {
                    eVar.i0().e3(c2638o);
                } else {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
            }
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void e(tv.danmaku.biliplayerv2.service.r0 r0Var) {
        p078fI1.f<tv.danmaku.biliplayerv2.service.r0> fVar = this.d;
        if (fVar.b.contains(r0Var)) {
            return;
        }
        fVar.add(r0Var);
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void f(tv.danmaku.biliplayerv2.service.r0 r0Var) {
        this.d.remove(r0Var);
    }

    public final void g() {
        java.lang.Object next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list = this.u;
        if (list != null) {
            kotlin.collections.u.J(list, arrayList);
        }
        java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list2 = this.v;
        if (list2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint watchPoint = (tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint) obj;
                sy1.k kVar = new sy1.k(watchPoint.getFrom() - 30, watchPoint.getFrom() + 30, 1);
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    int from = ((tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint) next).getFrom();
                    if (((sy1.i) kVar).b <= from && from <= ((sy1.i) kVar).c) {
                        break;
                    }
                }
                if (next == null) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.u.J(arrayList2, arrayList);
        }
        tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint watchPoint2 = this.w;
        if (watchPoint2 != null) {
            arrayList.add(watchPoint2);
        }
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = this.p;
        stateFlowImpl.getClass();
        stateFlowImpl.k((java.lang.Object) null, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r0.j().isShowing() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.j
            PH1.e r1 = r4.g
            r2 = 0
            java.lang.String r3 = "mPlayerContainer"
            if (r1 == 0) goto L60
            tv.danmaku.biliplayerv2.service.r r1 = r1.j()
            tv.danmaku.biliplayerv2.ControlContainerType r1 = r1.getState()
            boolean r0 = r0.contains(r1)
            r1 = 1
            if (r0 == 0) goto L5f
            boolean r0 = r4.k
            if (r0 == 0) goto L2f
            PH1.e r0 = r4.g
            if (r0 == 0) goto L2b
            tv.danmaku.biliplayerv2.service.r r0 = r0.j()
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L2f
            goto L5f
        L2b:
            kotlin.jvm.internal.n.m(r3)
            throw r2
        L2f:
            tv.danmaku.biliplayerv2.service.interact.biz.g r0 = r4.r
            if (r0 == 0) goto L59
            boolean r0 = r0.O3()
            if (r0 == 0) goto L41
            java.lang.String r0 = "SeekService"
            java.lang.String r2 = "needHideSimpleProgressNormalCase, getSegmentSwitchValue"
            tv.danmaku.android.log.BLog.i(r0, r2)
            return r1
        L41:
            java.util.LinkedList<tv.danmaku.biliplayerv2.service.D0> r0 = r4.f
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r0 = r0.next()
            tv.danmaku.biliplayerv2.service.D0 r0 = (tv.danmaku.biliplayerv2.service.D0) r0
            r0.getClass()
            return r1
        L57:
            r0 = 0
            return r0
        L59:
            java.lang.String r0 = "mInteractLayerService"
            kotlin.jvm.internal.n.m(r0)
            throw r2
        L5f:
            return r1
        L60:
            kotlin.jvm.internal.n.m(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.biliplayerv2.service.C0.h():boolean");
    }

    public final void j(boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = this.b;
        stateFlowImpl.getClass();
        stateFlowImpl.k((java.lang.Object) null, boolValueOf);
        p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2634k> fVar = this.c;
        fVar.c++;
        java.util.Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            ((tv.danmaku.biliplayerv2.service.InterfaceC2634k) it.next()).K(z);
        }
        fVar.c--;
        if (fVar.e()) {
            return;
        }
        while (true) {
            java.util.ArrayList arrayList = fVar.d;
            if (arrayList.size() <= 0) {
                return;
            } else {
                ((java.lang.Runnable) arrayList.remove(0)).run();
            }
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Z
    public final void j7(tv.danmaku.biliplayerv2.service.D0 d0) {
        java.util.LinkedList<tv.danmaku.biliplayerv2.service.D0> linkedList = this.f;
        if (linkedList.contains(d0)) {
            return;
        }
        linkedList.add(d0);
    }

    public final void k(int i, int i2) {
        p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2634k> fVar = this.c;
        fVar.c++;
        java.util.Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            ((tv.danmaku.biliplayerv2.service.InterfaceC2634k) it.next()).f(i, i2);
        }
        fVar.c--;
        if (fVar.e()) {
            return;
        }
        while (true) {
            java.util.ArrayList arrayList = fVar.d;
            if (arrayList.size() <= 0) {
                return;
            } else {
                ((java.lang.Runnable) arrayList.remove(0)).run();
            }
        }
    }

    public final void l(tv.danmaku.biliplayerv2.ControlContainerType... controlContainerTypeArr) {
        java.util.ArrayList arrayList = this.j;
        arrayList.clear();
        arrayList.addAll(kotlin.collections.p.F0(controlContainerTypeArr));
        if (h()) {
            d();
        }
    }

    public final void m() {
        tv.danmaku.biliplayerv2.service.C2638o c2638o = this.i;
        if (c2638o == null || !c2638o.d) {
            if (c2638o != null && !c2638o.e) {
                PH1.e eVar = this.g;
                if (eVar != null) {
                    eVar.i0().P2(this.i);
                    return;
                } else {
                    kotlin.jvm.internal.n.m("mPlayerContainer");
                    throw null;
                }
            }
            PH1.e eVar2 = this.g;
            if (eVar2 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            tv.danmaku.biliplayerv2.widget.c.a aVar = new tv.danmaku.biliplayerv2.widget.c.a(-1, (int) LZ0.f.b(eVar2.c, 2.0f));
            aVar.f = 0;
            aVar.g = 8;
            aVar.i = -1;
            aVar.h = -1;
            aVar.a(false);
            PH1.e eVar3 = this.g;
            if (eVar3 != null) {
                this.i = eVar3.i0().u6(YI1.a.class, aVar);
            } else {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
        }
    }

    public final void o(boolean z) {
        tv.danmaku.biliplayerv2.service.r rVar = this.s;
        if (rVar == null) {
            kotlin.jvm.internal.n.m("mControlContainerService");
            throw null;
        }
        if (rVar.isShowing()) {
            tv.danmaku.biliplayerv2.service.C0.c cVar = this.B;
            if (z) {
                cVar.run();
            } else {
                zb0.d.e(0, cVar, 1000L);
            }
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onAttachByShared(tv.danmaku.biliplayerv2.PlayerSharingType playerSharingType, tv.danmaku.biliplayerv2.k kVar) {
        o(false);
        p();
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onCollectSharedParams(tv.danmaku.biliplayerv2.PlayerSharingType playerSharingType, tv.danmaku.biliplayerv2.k kVar) {
        zb0.d.f(this.C, 0);
        zb0.d.a(0).removeCallbacks(this.B);
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onStart(tv.danmaku.biliplayerv2.k kVar) {
        this.o = kotlinx.coroutines.F.b();
        PH1.e eVar = this.g;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        tv.danmaku.biliplayerv2.i.a(eVar).j0(this.y);
        PH1.e eVar2 = this.g;
        if (eVar2 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar2.k0().C5(this.x);
        tv.danmaku.biliplayerv2.service.r rVar = this.s;
        if (rVar == null) {
            kotlin.jvm.internal.n.m("mControlContainerService");
            throw null;
        }
        rVar.I3(this.z);
        tv.danmaku.biliplayerv2.service.r rVar2 = this.s;
        if (rVar2 == null) {
            kotlin.jvm.internal.n.m("mControlContainerService");
            throw null;
        }
        rVar2.D0(this.A);
        tv.danmaku.biliplayerv2.service.interact.biz.g gVar = this.r;
        if (gVar == null) {
            kotlin.jvm.internal.n.m("mInteractLayerService");
            throw null;
        }
        gVar.Q0(this.t);
        o(false);
        PH1.e eVar3 = this.g;
        if (eVar3 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        if (eVar3.l().getDuration() > 0) {
            PH1.e eVar4 = this.g;
            if (eVar4 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            this.u = eVar4.k0().n3();
            g();
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onStop() {
        Cy1.d dVar = this.o;
        if (dVar == null) {
            kotlin.jvm.internal.n.m("coroutineScope");
            throw null;
        }
        kotlinx.coroutines.F.c(dVar, (java.util.concurrent.CancellationException) null);
        PH1.e eVar = this.g;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        tv.danmaku.biliplayerv2.i.a(eVar).z0(this.y);
        PH1.e eVar2 = this.g;
        if (eVar2 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        eVar2.k0().o3(this.x);
        tv.danmaku.biliplayerv2.service.r rVar = this.s;
        if (rVar == null) {
            kotlin.jvm.internal.n.m("mControlContainerService");
            throw null;
        }
        rVar.Y4(this.z);
        tv.danmaku.biliplayerv2.service.r rVar2 = this.s;
        if (rVar2 == null) {
            kotlin.jvm.internal.n.m("mControlContainerService");
            throw null;
        }
        rVar2.Y6(this.A);
        tv.danmaku.biliplayerv2.service.interact.biz.g gVar = this.r;
        if (gVar == null) {
            kotlin.jvm.internal.n.m("mInteractLayerService");
            throw null;
        }
        gVar.U1(this.t);
        zb0.d.f(this.C, 0);
        zb0.d.a(0).removeCallbacks(this.B);
    }

    public final void p() {
        if (h()) {
            return;
        }
        m();
    }
}
