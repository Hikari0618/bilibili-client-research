package tv.danmaku.biliplayerimpl.videodirector;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
public final class VideosPlayDirectorService extends PH1.a implements tv.danmaku.biliplayerv2.service.InterfaceC2625e0 {
    public tv.danmaku.biliplayerv2.service.o0 b;
    public tv.danmaku.biliplayerv2.service.Video d;
    public tv.danmaku.biliplayerv2.service.Video e;
    public int f;
    public boolean j;
    public PH1.e m;
    public tv.danmaku.biliplayerv2.service.D n;
    public tv.danmaku.biliplayerv2.service.setting.c o;
    public tv.danmaku.biliplayerv2.service.InterfaceC2621c0 p;
    public tv.danmaku.biliplayerv2.service.IVideoQualityProvider q;
    public boolean s;
    public kotlinx.coroutines.A0 u;
    public int c = -1;
    public final androidx.collection.c0<tv.danmaku.biliplayerv2.service.F0> g = new androidx.collection.c0<>((java.lang.Object) null);
    public final p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> h = new p078fI1.f<>(new java.util.LinkedList());
    public final p078fI1.f<tv.danmaku.biliplayerv2.service.E0> i = new p078fI1.f<>(new java.util.LinkedList());
    public boolean k = true;
    public boolean l = true;
    public int r = -1;
    public SI1.a t = new SI1.b();
    public final tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.d v = new tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.d();
    public final tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.b w = new tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.b();
    public final tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.c x = new tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.c();
    public final tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.a y = new tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.a();
    public final tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.e z = new tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.e();

    /* JADX INFO: compiled from: BL */
    public static final class a implements tv.danmaku.biliplayerv2.service.i0 {
        public a() {
        }

        @Override // tv.danmaku.biliplayerv2.service.i0
        public final com.bilibili.lib.media.resource.MediaResource a(int i, int i2, int i3) {
            java.lang.String strJ;
            java.lang.String str;
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            tv.danmaku.biliplayerv2.service.Video video = videosPlayDirectorService.d;
            if (video == null) {
                return null;
            }
            tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider = videosPlayDirectorService.q;
            videosPlayDirectorService.r = iVideoQualityProvider != null ? iVideoQualityProvider.a(tv.danmaku.biliplayerv2.service.IVideoQualityProvider.ResolveFrom.ASSET_ITEM_UPDATE) : -1;
            tv.danmaku.biliplayerv2.service.Video.e eVarD = videosPlayDirectorService.D();
            java.lang.String str2 = "";
            if (eVarD == null || (strJ = eVarD.J()) == null) {
                strJ = "";
            }
            tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) videosPlayDirectorService.g.e(video.b);
            com.bilibili.lib.media.resource.MediaResource mediaResourceJ = f0 != null ? f0.j(i, i2, i3) : null;
            tv.danmaku.biliplayerv2.service.D d = videosPlayDirectorService.n;
            if (d == null) {
                kotlin.jvm.internal.n.m("mPlayerCoreService");
                throw null;
            }
            vJ1.h<?> hVarT2 = d.t2();
            if (hVarT2 != null && (str = hVarT2.b) != null) {
                str2 = str;
            }
            Mb0.e.m("VideosPlayDirectorService", "mediaItem-id: " + str2 + " current-id:" + strJ);
            return mediaResourceJ;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b implements tv.danmaku.biliplayerv2.service.InterfaceC2640q {
        public b() {
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2640q
        public final void a() {
            tv.danmaku.biliplayerv2.service.Video.e eVarD = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this.D();
            if (eVarD != null) {
                eVarD.p = true;
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class c implements tv.danmaku.biliplayerv2.service.o0.a {
        public c() {
        }

        @Override // tv.danmaku.biliplayerv2.service.o0.a
        public final void a(boolean z) {
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            if (z) {
                p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar = videosPlayDirectorService.h;
                fVar.c++;
                java.util.Iterator it = fVar.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it.next()).onVideoSetWillChange();
                    } catch (java.lang.Throwable unused) {
                    }
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
                tv.danmaku.biliplayerv2.service.Video video = videosPlayDirectorService.d;
                if (video != null) {
                    tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) videosPlayDirectorService.g.e(video.b);
                    if (f0 != null) {
                        f0.v(video);
                    }
                    videosPlayDirectorService.e = videosPlayDirectorService.d;
                    videosPlayDirectorService.d = null;
                    videosPlayDirectorService.f = 0;
                    videosPlayDirectorService.c = -1;
                }
                b();
                return;
            }
            tv.danmaku.biliplayerv2.service.o0 o0Var = videosPlayDirectorService.b;
            if (o0Var == null) {
                return;
            }
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                try {
                    ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onVideoSetWillChange();
                } catch (java.lang.Throwable unused2) {
                }
            }
            fVar2.c--;
            if (!fVar2.e()) {
                while (true) {
                    java.util.ArrayList arrayList2 = fVar2.d;
                    if (arrayList2.size() <= 0) {
                        break;
                    } else {
                        ((java.lang.Runnable) arrayList2.remove(0)).run();
                    }
                }
            }
            int iB = o0Var.B();
            boolean z2 = false;
            for (int i = 0; i < iB; i++) {
                tv.danmaku.biliplayerv2.service.Video videoA = o0Var.A(i);
                if (videoA != null && videoA.equals(videosPlayDirectorService.d)) {
                    videosPlayDirectorService.f = i;
                    int i2 = videoA.b;
                    androidx.collection.c0<tv.danmaku.biliplayerv2.service.F0> c0Var = videosPlayDirectorService.g;
                    tv.danmaku.biliplayerv2.service.F0 f1 = (tv.danmaku.biliplayerv2.service.F0) c0Var.e(i2);
                    tv.danmaku.biliplayerv2.service.Video video2 = videosPlayDirectorService.d;
                    tv.danmaku.biliplayerv2.service.F0 f2 = video2 != null ? (tv.danmaku.biliplayerv2.service.F0) c0Var.e(video2.b) : null;
                    if (!kotlin.jvm.internal.n.f(f2, f1)) {
                        tv.danmaku.biliplayerv2.service.Video video3 = videosPlayDirectorService.d;
                        if (video3 != null && f2 != null) {
                            f2.v(video3);
                        }
                        if (f1 != null) {
                            f1.s(videoA, o0Var);
                        }
                    } else if (f1 != null) {
                        f1.w(videoA);
                    }
                    videosPlayDirectorService.d = videoA;
                    z2 = true;
                }
            }
            if ((!z2 && videosPlayDirectorService.d != null) || videosPlayDirectorService.c >= 0) {
                int i3 = videosPlayDirectorService.c;
                if (i3 < 0) {
                    i3 = 0;
                }
                videosPlayDirectorService.b5(i3, 0);
            }
            b();
        }

        public final void b() {
            yJ1.f fVarF;
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            tv.danmaku.biliplayerv2.service.Video.e eVarD = videosPlayDirectorService.D();
            if (eVarD != null) {
                p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = videosPlayDirectorService.i;
                fVar.c++;
                java.util.Iterator it = fVar.b.iterator();
                while (it.hasNext()) {
                    ((tv.danmaku.biliplayerv2.service.E0) it.next()).c(eVarD);
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
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onVideoSetChanged();
            }
            fVar2.c--;
            if (!fVar2.e()) {
                while (true) {
                    java.util.ArrayList arrayList2 = fVar2.d;
                    if (arrayList2.size() <= 0) {
                        break;
                    } else {
                        ((java.lang.Runnable) arrayList2.remove(0)).run();
                    }
                }
            }
            tv.danmaku.biliplayerv2.service.Video.e eVarD2 = videosPlayDirectorService.D();
            if (eVarD2 == null || (fVarF = eVarD2.F()) == null) {
                return;
            }
            tv.danmaku.biliplayerv2.service.D d = videosPlayDirectorService.n;
            if (d != null) {
                d.S1(fVarF);
            } else {
                kotlin.jvm.internal.n.m("mPlayerCoreService");
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class d implements tv.danmaku.biliplayerv2.service.u0 {
        public d() {
        }

        @Override // tv.danmaku.biliplayerv2.service.u0
        public final void onPlayerStateChanged(int i) {
            tv.danmaku.biliplayerv2.service.F0 f0R7;
            if (i == 6) {
                tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
                videosPlayDirectorService.j = true;
                tv.danmaku.biliplayerv2.service.Video video = videosPlayDirectorService.d;
                if (video != null && (f0R7 = videosPlayDirectorService.R7(video.b)) != null) {
                    f0R7.l();
                    videosPlayDirectorService.j = false;
                }
                videosPlayDirectorService.j = false;
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class e implements tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a {
        public e() {
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void a(tv.danmaku.biliplayerv2.service.C2633j c2633j, tv.danmaku.biliplayerv2.service.Video video) {
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            PH1.e eVar = videosPlayDirectorService.m;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            eVar.m().t(new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$End(tv.danmaku.biliplayerv2.service.report.NeuronsEvents$End.Type.NORMAL));
            if (videosPlayDirectorService.D() != null) {
                p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = videosPlayDirectorService.i;
                fVar.c++;
                java.util.Iterator it = fVar.b.iterator();
                while (it.hasNext()) {
                    ((tv.danmaku.biliplayerv2.service.E0) it.next()).a();
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
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onVideoItemCompleted(c2633j, video);
            }
            fVar2.c--;
            if (!fVar2.e()) {
                while (true) {
                    java.util.ArrayList arrayList2 = fVar2.d;
                    if (arrayList2.size() <= 0) {
                        break;
                    } else {
                        ((java.lang.Runnable) arrayList2.remove(0)).run();
                    }
                }
            }
            if (!videosPlayDirectorService.k) {
                Mb0.e.m("VideosPlayDirectorService", "do not process complete action");
                return;
            }
            tv.danmaku.biliplayerv2.service.setting.c cVar = videosPlayDirectorService.o;
            if (cVar == null) {
                kotlin.jvm.internal.n.m("mPlayerSettingService");
                throw null;
            }
            int i = cVar.getInt("pref_player_completion_action_key3", 0);
            if (i == 1) {
                return;
            }
            if (i == 4) {
                videosPlayDirectorService.T7(true);
            } else if (i == 2) {
                videosPlayDirectorService.z6();
            } else if (i == 0) {
                videosPlayDirectorService.T7(false);
            }
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void b(tv.danmaku.biliplayerv2.service.Video video, tv.danmaku.biliplayerv2.service.Video.e eVar, java.lang.String str) {
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = videosPlayDirectorService.i;
            fVar.c++;
            java.util.Iterator it = fVar.b.iterator();
            while (it.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.E0) it.next()).d(str);
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
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onResolveFailed(video, eVar, str);
            }
            fVar2.c--;
            if (fVar2.e()) {
                return;
            }
            while (true) {
                java.util.ArrayList arrayList2 = fVar2.d;
                if (arrayList2.size() <= 0) {
                    return;
                } else {
                    ((java.lang.Runnable) arrayList2.remove(0)).run();
                }
            }
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void c(tv.danmaku.biliplayerv2.service.Video video) {
            video.e = true;
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar = videosPlayDirectorService.h;
            fVar.c++;
            java.util.Iterator it = fVar.b.iterator();
            while (it.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it.next()).onVideoCompleted(video);
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
            tv.danmaku.biliplayerv2.service.o0 o0Var = videosPlayDirectorService.b;
            if (videosPlayDirectorService.f + 1 < (o0Var != null ? o0Var.B() : 0)) {
                return;
            }
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onAllVideoCompleted();
            }
            fVar2.c--;
            if (fVar2.e()) {
                return;
            }
            while (true) {
                java.util.ArrayList arrayList2 = fVar2.d;
                if (arrayList2.size() <= 0) {
                    return;
                } else {
                    ((java.lang.Runnable) arrayList2.remove(0)).run();
                }
            }
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void d(com.bilibili.video.story.player.C c) {
            p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this.i;
            fVar.c++;
            java.util.Iterator it = fVar.b.iterator();
            while (it.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.E0) it.next()).c(c);
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

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void e(tv.danmaku.biliplayerv2.service.Video video) {
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this.h;
            fVar.c++;
            java.util.Iterator it = fVar.b.iterator();
            while (it.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it.next()).onVideoStart(video);
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

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void f(tv.danmaku.biliplayerv2.service.C2633j c2633j, tv.danmaku.biliplayerv2.service.Video video) {
            QI1.k kVar;
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            PH1.e eVar = videosPlayDirectorService.m;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            eVar.m().i();
            tv.danmaku.biliplayerv2.service.Video.e eVarD = videosPlayDirectorService.D();
            if (eVarD != null) {
                p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = videosPlayDirectorService.i;
                fVar.c++;
                java.util.Iterator it = fVar.b.iterator();
                while (it.hasNext()) {
                    ((tv.danmaku.biliplayerv2.service.E0) it.next()).e(eVarD);
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
            tv.danmaku.biliplayerv2.service.Video.g gVarH = eVarD != null ? eVarD.H() : null;
            if (gVarH != null) {
                gVarH.s = !kotlin.jvm.internal.n.f(eVarD != null ? eVarD.h : null, "live") ? RI1.e.b.a : RI1.e.a.a;
            }
            PH1.e eVar2 = videosPlayDirectorService.m;
            if (eVar2 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            eVar2.A().i6(gVarH);
            if (gVarH != null) {
                kVar = new QI1.k(gVarH.a, !kotlin.jvm.internal.n.f(eVarD.h, "live") ? gVarH.b : gVarH.c, gVarH.g, gVarH.j, gVarH.f, gVarH.e, gVarH.h, gVarH.i, gVarH.r, eVarD.A().i == tv.danmaku.biliplayerv2.DisplayOrientation.VERTICAL);
            } else {
                kVar = null;
            }
            PH1.e eVar3 = videosPlayDirectorService.m;
            if (eVar3 == null) {
                kotlin.jvm.internal.n.m((java.lang.String) r4);
                throw null;
            }
            eVar3.m().p5(kVar);
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onVideoItemStart(c2633j, video);
            }
            fVar2.c--;
            if (!fVar2.e()) {
                while (true) {
                    java.util.ArrayList arrayList2 = fVar2.d;
                    if (arrayList2.size() <= 0) {
                        break;
                    } else {
                        ((java.lang.Runnable) arrayList2.remove(0)).run();
                    }
                }
            }
            PH1.e eVar4 = videosPlayDirectorService.m;
            if (eVar4 != null) {
                eVar4.i0().p0();
            } else {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
        }

        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void g() {
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            if (videosPlayDirectorService.D() != null) {
                p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = videosPlayDirectorService.i;
                fVar.c++;
                java.util.Iterator it = fVar.b.iterator();
                while (it.hasNext()) {
                    ((tv.danmaku.biliplayerv2.service.E0) it.next()).getClass();
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
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onResolveSucceed();
            }
            fVar2.c--;
            if (fVar2.e()) {
                return;
            }
            while (true) {
                java.util.ArrayList arrayList2 = fVar2.d;
                if (arrayList2.size() <= 0) {
                    return;
                } else {
                    ((java.lang.Runnable) arrayList2.remove(0)).run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
        @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0.a
        public final void h(tv.danmaku.biliplayerv2.service.C2633j c2633j, tv.danmaku.biliplayerv2.service.C2633j c2633j2, tv.danmaku.biliplayerv2.service.Video video) {
            tv.danmaku.biliplayerv2.service.o0 o0Var;
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService = tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.this;
            PH1.e eVar = videosPlayDirectorService.m;
            if (eVar == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            RI1.b bVarA = eVar.A();
            tv.danmaku.biliplayerv2.service.D d = videosPlayDirectorService.n;
            if (d == null) {
                kotlin.jvm.internal.n.m("mPlayerCoreService");
                throw null;
            }
            int iL1 = d.L1();
            tv.danmaku.biliplayerv2.service.D d2 = videosPlayDirectorService.n;
            if (d2 == null) {
                kotlin.jvm.internal.n.m("mPlayerCoreService");
                throw null;
            }
            bVarA.T4(iL1, d2.l());
            PH1.e eVar2 = videosPlayDirectorService.m;
            if (eVar2 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            eVar2.m().t(new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$End(tv.danmaku.biliplayerv2.service.report.NeuronsEvents$End.Type.NORMAL));
            PH1.e eVar3 = videosPlayDirectorService.m;
            if (eVar3 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            eVar3.s().p0();
            tv.danmaku.biliplayerv2.service.Video.e eVarD = videosPlayDirectorService.D();
            int i = c2633j.c;
            tv.danmaku.biliplayerv2.service.Video.e eVarC = ((i == c2633j2.c && c2633j.b == c2633j2.b) || (o0Var = videosPlayDirectorService.b) == null) ? null : o0Var.C(video, i);
            if (eVarD != null) {
                p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = videosPlayDirectorService.i;
                fVar.c++;
                java.util.Iterator it = fVar.b.iterator();
                while (it.hasNext()) {
                    ((tv.danmaku.biliplayerv2.service.E0) it.next()).b(eVarD, eVarC);
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
            if (eVarC == null) {
                videosPlayDirectorService.P7();
            } else if (!kotlin.jvm.internal.n.f(eVarC.h, "live")) {
                if (!kotlin.jvm.internal.n.f(eVarD != null ? java.lang.Long.valueOf(eVarD.A().g) : null, eVarD != null ? java.lang.Long.valueOf(eVarD.A().g) : null)) {
                    videosPlayDirectorService.P7();
                } else if (kotlin.jvm.internal.n.f(eVarC.h, "live")) {
                    videosPlayDirectorService.P7();
                }
            } else if (kotlin.jvm.internal.n.f(eVarC.h, "live")) {
                videosPlayDirectorService.P7();
            }
            p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar2 = videosPlayDirectorService.h;
            fVar2.c++;
            java.util.Iterator it2 = fVar2.b.iterator();
            while (it2.hasNext()) {
                ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it2.next()).onVideoItemWillChange(c2633j, c2633j2, video);
            }
            fVar2.c--;
            if (!fVar2.e()) {
                while (true) {
                    java.util.ArrayList arrayList2 = fVar2.d;
                    if (arrayList2.size() <= 0) {
                        break;
                    } else {
                        ((java.lang.Runnable) arrayList2.remove(0)).run();
                    }
                }
            }
            if (!c2633j.equals(c2633j2)) {
                tv.danmaku.biliplayerv2.service.setting.c cVar = videosPlayDirectorService.o;
                if (cVar == null) {
                    kotlin.jvm.internal.n.m("mPlayerSettingService");
                    throw null;
                }
                cVar.v7(tv.danmaku.biliplayerv2.service.setting.Scope.VideoItem);
            }
            tv.danmaku.biliplayerv2.service.InterfaceC2621c0 interfaceC2621c0 = videosPlayDirectorService.p;
            if (interfaceC2621c0 != null) {
                interfaceC2621c0.V2();
            } else {
                kotlin.jvm.internal.n.m("mToastService");
                throw null;
            }
        }
    }

    public static final void S7(tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService videosPlayDirectorService, tv.danmaku.biliplayerv2.service.Video video, tv.danmaku.biliplayerv2.service.Video video2) {
        p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar = videosPlayDirectorService.h;
        fVar.c++;
        java.util.Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            ((tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b) it.next()).onVideoWillChange(video, video2);
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
        tv.danmaku.biliplayerv2.service.setting.c cVar = videosPlayDirectorService.o;
        if (cVar == null) {
            kotlin.jvm.internal.n.m("mPlayerSettingService");
            throw null;
        }
        cVar.v7(tv.danmaku.biliplayerv2.service.setting.Scope.Video);
        tv.danmaku.biliplayerv2.service.InterfaceC2621c0 interfaceC2621c0 = videosPlayDirectorService.p;
        if (interfaceC2621c0 != null) {
            interfaceC2621c0.V2();
        } else {
            kotlin.jvm.internal.n.m("mToastService");
            throw null;
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void A3(tv.danmaku.biliplayerv2.service.o0 o0Var) {
        Mb0.e.m("VideosPlayDirectorService", "set playerDataSource...");
        if (o0Var.equals(this.b)) {
            Mb0.e.m("VideosPlayDirectorService", "source is current PlayerDataSource, do nothing");
            return;
        }
        tv.danmaku.biliplayerv2.service.o0 o0Var2 = this.b;
        tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.c cVar = this.x;
        if (o0Var2 != null) {
            o0Var2.b.remove(cVar);
        }
        this.b = o0Var;
        java.util.ArrayList arrayList = o0Var.b;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
        if (this.c < 0) {
            tv.danmaku.biliplayerv2.service.o0 o0Var3 = this.b;
            if (o0Var3 != null) {
                o0Var3.E(true);
                return;
            }
            return;
        }
        tv.danmaku.biliplayerv2.service.D d2 = this.n;
        if (d2 == null) {
            kotlin.jvm.internal.n.m("mPlayerCoreService");
            throw null;
        }
        if (d2.getState() == 4) {
            tv.danmaku.biliplayerv2.service.D d3 = this.n;
            if (d3 == null) {
                kotlin.jvm.internal.n.m("mPlayerCoreService");
                throw null;
            }
            d3.pause();
        }
        b5(this.c, 0);
        this.c = -1;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void C0() {
        this.k = false;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void C7(SI1.a aVar) {
        this.t = aVar;
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final tv.danmaku.biliplayerv2.service.Video.e D() {
        tv.danmaku.biliplayerv2.service.F0 f0R7;
        tv.danmaku.biliplayerv2.service.C2633j c2633jD;
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null || (f0R7 = R7(video.b)) == null || (c2633jD = f0R7.d()) == null) {
            return null;
        }
        int i = c2633jD.c;
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        if (o0Var != null) {
            return o0Var.C(video, i);
        }
        return null;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final SI1.a D5() {
        return this.t;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void D6() {
        this.l = false;
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final boolean E(boolean z) {
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        int iB = o0Var != null ? o0Var.B() : 0;
        if (this.f < iB - 1) {
            return true;
        }
        if (iB <= 0) {
            return false;
        }
        tv.danmaku.biliplayerv2.service.Video videoA = this.d;
        if (videoA == null && (videoA = this.b.A(0)) == null) {
            return false;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(videoA.b);
        if (f0 != null) {
            return f0.h();
        }
        return false;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void E7() {
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video != null) {
            tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider = this.q;
            this.r = iVideoQualityProvider != null ? iVideoQualityProvider.a(tv.danmaku.biliplayerv2.service.IVideoQualityProvider.ResolveFrom.RELOAD) : -1;
            tv.danmaku.biliplayerv2.service.F0 f0R7 = R7(video.b);
            if (f0R7 != null) {
                f0R7.q();
            }
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void F2(com.bilibili.bangumi.logic.page.detail.playerhandler.BangumiPlayHandler bangumiPlayHandler) {
        androidx.collection.c0<tv.danmaku.biliplayerv2.service.F0> c0Var = this.g;
        int i = c0Var.i(bangumiPlayHandler);
        java.lang.Object[] objArr = c0Var.d;
        java.lang.Object obj = objArr[i];
        java.lang.Object obj2 = androidx.collection.d0.a;
        if (obj != obj2) {
            objArr[i] = obj2;
            c0Var.b = true;
        }
        bangumiPlayHandler.getClass();
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final int I6() {
        return this.r;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final boolean I7() {
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null) {
            return false;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(video.b);
        if (f0 == null) {
            return false;
        }
        return f0.h();
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final void J(boolean z) {
        X7(z);
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void J3() {
        tv.danmaku.android.log.BLog.e("VideosPlayDirectorService", "无需设置这个了，现存的也不需要了，会根据[MediaHistoryType]通过路由自动匹配,请删除");
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void K3() {
        if (this.s) {
            try {
                this.s = false;
                if (this.d == null) {
                    int i = this.f;
                    tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
                    if (i <= (o0Var != null ? o0Var.B() : 0)) {
                        tv.danmaku.biliplayerv2.service.o0 o0Var2 = this.b;
                        this.d = o0Var2 != null ? o0Var2.A(this.f) : null;
                    }
                }
                tv.danmaku.biliplayerv2.service.Video video = this.d;
                if (video != null) {
                    tv.danmaku.biliplayerv2.service.F0 f0R7 = R7(video.b);
                    if (f0R7 == null) {
                        tv.danmaku.android.log.BLog.i("VideosPlayDirectorService", "share fail: no handler:" + this.d.b + "!");
                        this.d = null;
                        this.f = 0;
                        this.b = null;
                        tv.danmaku.biliplayerv2.service.D d2 = this.n;
                        if (d2 == null) {
                            kotlin.jvm.internal.n.m("mPlayerCoreService");
                            throw null;
                        }
                        d2.stop();
                    }
                    if (f0R7 != null) {
                        PH1.e eVar = this.m;
                        if (eVar == null) {
                            kotlin.jvm.internal.n.m("mPlayerContainer");
                            throw null;
                        }
                        f0R7.m(eVar.d.a);
                    }
                    if (f0R7 != null) {
                        f0R7.u(video, this.b);
                    }
                }
            } catch (java.lang.Exception e2) {
                this.d = null;
                this.f = 0;
                this.b = null;
                tv.danmaku.biliplayerv2.service.D d3 = this.n;
                if (d3 == null) {
                    kotlin.jvm.internal.n.m("mPlayerCoreService");
                    throw null;
                }
                d3.stop();
                e2.printStackTrace();
                Mb0.e.r("VideoDirector", "play from shared, and share exception:" + e2);
                Zx1.o oVar = Zx1.o.a;
            }
        } else {
            tv.danmaku.biliplayerv2.service.D d4 = this.n;
            if (d4 == null) {
                kotlin.jvm.internal.n.m("mPlayerCoreService");
                throw null;
            }
            d4.M4(new Ak0.p(this, 25), new AK.a(21));
        }
        PH1.e eVar2 = this.m;
        if (eVar2 != null) {
            eVar2.d.a = null;
        } else {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final void M(boolean z) {
        T7(z);
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void O5(tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider) {
        this.q = iVideoQualityProvider;
    }

    public final void P7() {
        kotlinx.coroutines.A0 a0;
        kotlinx.coroutines.A0 a1 = this.u;
        if (a1 != null && a1.isActive() && (a0 = this.u) != null) {
            a0.cancel((java.util.concurrent.CancellationException) null);
        }
        this.u = null;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void Q5(final int i, final int i2, boolean z) {
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        if (o0Var == null) {
            this.c = i;
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", Hg.a.b(i, i2, "play video:{index: ", ", itemIndex: ", "}"));
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new java.lang.Runnable() { // from class: tv.danmaku.biliplayerimpl.videodirector.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.b.Q5(i, i2, true);
                }
            });
            return;
        }
        int iB = o0Var.B();
        if (i < 0) {
            Mb0.e.i("VideosPlayDirectorService", "index = " + i + "不能小于0");
            return;
        }
        if (i >= iB) {
            Mb0.e.i("VideosPlayDirectorService", "index = " + i + "不能大于videos的总长度: " + iB);
            return;
        }
        tv.danmaku.biliplayerv2.service.Video videoA = o0Var.A(i);
        if (videoA == null) {
            return;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(videoA.b);
        if (f0 == null) {
            Mb0.e.r("VideosPlayDirectorService", "not found playerHandler for type = " + videoA.b);
            return;
        }
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video != null) {
            S7(this, video, videoA);
        } else {
            tv.danmaku.biliplayerv2.service.Video video2 = this.e;
            if (video2 != null) {
                S7(this, video2, videoA);
            }
        }
        this.e = null;
        if (i2 >= 0 && i2 < o0Var.D(videoA)) {
            videoA.c = i2;
            videoA.d = false;
        }
        this.d = videoA;
        this.f = i;
        videoA.e = false;
        tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider = this.q;
        this.r = iVideoQualityProvider != null ? iVideoQualityProvider.a(tv.danmaku.biliplayerv2.service.IVideoQualityProvider.ResolveFrom.NORMAL_PLAY) : -1;
        f0.t(videoA, o0Var, z);
    }

    public final tv.danmaku.biliplayerv2.service.F0 R7(int i) {
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(i);
        if (f0 != null) {
            return f0;
        }
        Mb0.e.r("VideosPlayDirectorService", "not found playerHandler for type = " + i);
        return null;
    }

    public final void T7(final boolean z) {
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new java.lang.Runnable() { // from class: tv.danmaku.biliplayerimpl.videodirector.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.b.T7(z);
                }
            });
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "play next...");
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        int iB = o0Var != null ? o0Var.B() : 0;
        if (iB <= 0) {
            Mb0.e.m("VideosPlayDirectorService", "videos is empty, do nothing!!!");
            return;
        }
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null) {
            Mb0.e.m("VideosPlayDirectorService", "not has currentVideo, play index of 0");
            b5(0, 0);
            return;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(video.b);
        if (f0 == null) {
            Mb0.e.i("VideosPlayDirectorService", "something error, could not found VideoPlayHandler for mCurrentVideo");
            return;
        }
        if (f0.h()) {
            r2();
            return;
        }
        if (this.f < iB - 1) {
            U7();
            return;
        }
        if (z) {
            for (int i = 0; i < iB; i++) {
                tv.danmaku.biliplayerv2.service.Video videoA = this.b.A(i);
                if (videoA != null) {
                    videoA.d = true;
                    videoA.e = false;
                }
            }
            b5(0, 0);
        }
    }

    public final void U7() {
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new N3.e(this, 3));
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "try to play next video");
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        int iB = o0Var != null ? o0Var.B() : 0;
        int i = this.f + 1;
        if (i >= iB) {
            Mb0.e.r("VideosPlayDirectorService", "do not has next video");
        } else {
            b5(i, 0);
        }
    }

    public final void V7() {
        tv.danmaku.biliplayerv2.service.Video videoA;
        tv.danmaku.biliplayerv2.service.o0 o0Var;
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new com.bilibili.bililive.room.ui.topic.slide.c(this, 5));
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "try to play previous video");
        int i = this.f;
        if (i <= 0) {
            Mb0.e.r("VideosPlayDirectorService", "do not has previous video");
            return;
        }
        tv.danmaku.biliplayerv2.service.o0 o0Var2 = this.b;
        if (o0Var2 == null || (videoA = o0Var2.A(i - 1)) == null || (o0Var = this.b) == null) {
            return;
        }
        int iD = o0Var.D(videoA) - 1;
        Q5(this.f - 1, iD > 0 ? iD : 0, true);
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final tv.danmaku.biliplayerv2.service.o0 W0() {
        return this.b;
    }

    public final void W7() {
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new H.g(this, 10));
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "try to play previous videoItem");
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null) {
            Mb0.e.r("VideosPlayDirectorService", "currentVideo is null!!!");
            return;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(video.b);
        if (f0 == null) {
            Mb0.e.r("VideosPlayDirectorService", "could found videoHandler for type = " + this.d.b);
            return;
        }
        if (!f0.i()) {
            Mb0.e.r("VideosPlayDirectorService", "do not has previous item for current video");
            return;
        }
        tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider = this.q;
        this.r = iVideoQualityProvider != null ? iVideoQualityProvider.a(tv.danmaku.biliplayerv2.service.IVideoQualityProvider.ResolveFrom.NORMAL_PLAY) : -1;
        f0.o();
    }

    public final void X7(final boolean z) {
        int i;
        tv.danmaku.biliplayerv2.service.Video videoA;
        tv.danmaku.biliplayerv2.service.o0 o0Var;
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new java.lang.Runnable() { // from class: tv.danmaku.biliplayerimpl.videodirector.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.b.X7(z);
                }
            });
            return;
        }
        tv.danmaku.biliplayerv2.service.o0 o0Var2 = this.b;
        int iB = o0Var2 != null ? o0Var2.B() : 0;
        Mb0.e.m("VideosPlayDirectorService", "play previous...");
        if (iB <= 0) {
            Mb0.e.m("VideosPlayDirectorService", "videos is empty, do nothing!!!");
            return;
        }
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null) {
            Mb0.e.m("VideosPlayDirectorService", "not has currentVideo, play index of 0");
            b5(0, 0);
            return;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(video.b);
        if (f0 == null) {
            Mb0.e.i("VideosPlayDirectorService", "something error, could not found VideoPlayHandler for mCurrentVideo");
            return;
        }
        if (f0.i()) {
            W7();
            return;
        }
        if (this.f != 0) {
            V7();
            return;
        }
        if (z) {
            for (int i2 = 0; i2 < iB; i2++) {
                tv.danmaku.biliplayerv2.service.Video videoA2 = this.b.A(i2);
                if (videoA2 != null) {
                    videoA2.d = true;
                    videoA2.e = false;
                }
            }
            tv.danmaku.biliplayerv2.service.o0 o0Var3 = this.b;
            if (o0Var3 == null || (videoA = o0Var3.A((i = iB - 1))) == null || (o0Var = this.b) == null) {
                return;
            }
            int iD = o0Var.D(videoA) - 1;
            Q5(i, iD > 0 ? iD : 0, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public final boolean Z7(tv.danmaku.biliplayerv2.k kVar) {
        this.s = false;
        if (kVar != null) {
            this.f = kVar.b.getInt("key_share_current_video_index");
            tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
            tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService.c cVar = this.x;
            if (o0Var != null) {
                o0Var.b.remove(cVar);
            }
            tv.danmaku.biliplayerv2.service.o0 o0Var2 = (tv.danmaku.biliplayerv2.service.o0) kVar.b("key_share_player_data_source", true);
            tv.danmaku.biliplayerv2.service.Video.e eVarC = (tv.danmaku.biliplayerv2.service.Video.e) kVar.b("key_share_player_playable_params", true);
            tv.danmaku.biliplayerv2.service.C2633j c2633j = (tv.danmaku.biliplayerv2.service.C2633j) kVar.b("key_share_current_video_item", true);
            tv.danmaku.biliplayerv2.service.InterfaceC2617a0 interfaceC2617a0 = kVar.c;
            kVar.c = null;
            if (interfaceC2617a0 == null) {
                interfaceC2617a0 = null;
            }
            if (o0Var2 != null && c2633j != null) {
                this.b = o0Var2;
                tv.danmaku.biliplayerv2.service.Video videoA = o0Var2.A(this.f);
                this.d = videoA;
                if (videoA != null) {
                    try {
                        tv.danmaku.biliplayerv2.service.o0 o0Var3 = this.b;
                        if (o0Var3 != null) {
                            eVarC = o0Var3.C(videoA, c2633j.c);
                        } else {
                            eVarC = null;
                        }
                    } catch (java.lang.Exception e2) {
                        tv.danmaku.biliplayerv2.service.Video video = this.d;
                        java.lang.Integer numValueOf = video != null ? java.lang.Integer.valueOf(video.c) : null;
                        Mb0.e.r("VideoDirector", "share fail!!, currentIndex:" + numValueOf + " index:" + c2633j.c + " exception:" + e2);
                    }
                } else {
                    eVarC = null;
                }
                if (eVarC == null) {
                    Mb0.e.r("VideoDirector", "share fail!!, get playableParams fail");
                    return false;
                }
                if (interfaceC2617a0 != null) {
                    interfaceC2617a0.a(eVarC);
                } else {
                    Mb0.e.r("VideoDirector", "share player,please ensure report params");
                }
                kVar.c("key_share_current_video_item", c2633j);
            } else {
                if (interfaceC2617a0 == null || eVarC == null) {
                    com.bapis.bilibili.app.view.v1.w0.b("share fail!! ", " ", "VideosPlayDirectorService", interfaceC2617a0 != null, eVarC != null);
                    return false;
                }
                tv.danmaku.biliplayerv2.service.o0 o0VarB = interfaceC2617a0.b(eVarC);
                this.b = o0VarB;
                if ((o0VarB != null ? o0VarB.B() : 0) <= 0) {
                    tv.danmaku.android.log.BLog.i("VideosPlayDirectorService", "share fail!! no data");
                    return false;
                }
                this.f = 0;
                tv.danmaku.biliplayerv2.service.o0 o0Var4 = this.b;
                this.d = o0Var4 != null ? o0Var4.A(0) : null;
                if (c2633j == null) {
                    c2633j = new tv.danmaku.biliplayerv2.service.C2633j();
                }
                c2633j.c = 0;
                tv.danmaku.biliplayerv2.service.Video video2 = this.d;
                c2633j.b = video2 != null ? video2.b : -1;
                kVar.c("key_share_current_video_item", c2633j);
            }
            if (this.d == null) {
                tv.danmaku.android.log.BLog.i("VideosPlayDirectorService", "share fail: no video!");
                return false;
            }
            tv.danmaku.biliplayerv2.service.o0 o0Var5 = this.b;
            if (o0Var5 != null) {
                java.util.ArrayList arrayList = o0Var5.b;
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
            this.s = true;
            tv.danmaku.biliplayerv2.service.o0 o0Var6 = this.b;
            if (o0Var6 != null) {
                o0Var6.attachByShared();
            }
            Mb0.e.m("VideosPlayDirectorService", "sharedData[videoIndex: " + this.f + ", playerDataSource: " + this.b + ", video: " + this.d + ", enable: " + this.s + "]");
        }
        return true;
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final int b() {
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        if (o0Var == null) {
            return 0;
        }
        int iB = o0Var.B();
        int iD = 0;
        for (int i = 0; i < iB; i++) {
            tv.danmaku.biliplayerv2.service.Video videoA = o0Var.A(i);
            if (videoA != null) {
                iD = o0Var.D(videoA) + iD;
            }
        }
        return iD;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void b5(int i, int i2) {
        Q5(i, i2, true);
    }

    @Override // PH1.a
    public final void bindPlayerContainer$srcs_legacy_andruid_common_player_biliplayerimpl_biliplayerimpl_base(PH1.e eVar) {
        this.m = eVar;
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final int f0() {
        tv.danmaku.biliplayerv2.service.o0 o0Var;
        tv.danmaku.biliplayerv2.service.Video.e eVarD = D();
        if (eVarD == null || (o0Var = this.b) == null) {
            return -1;
        }
        int iB = o0Var.B();
        int i = 0;
        loop0: for (int i2 = 0; i2 < iB; i2++) {
            tv.danmaku.biliplayerv2.service.Video videoA = o0Var.A(i2);
            if (videoA != null) {
                int iD = o0Var.D(videoA);
                for (int i3 = 0; i3 < iD; i3++) {
                    tv.danmaku.biliplayerv2.service.Video.e eVarC = o0Var.C(videoA, i3);
                    if (eVarC != null) {
                        if (android.text.TextUtils.equals(eVarC.J(), eVarD.J())) {
                            break loop0;
                        }
                        i++;
                    }
                }
            }
        }
        return i;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final tv.danmaku.biliplayerv2.service.Video getCurrentVideo() {
        return this.d;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void h(tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b bVar) {
        this.h.remove(bVar);
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void h3(int i, tv.danmaku.biliplayerv2.service.F0 f0) {
        this.g.a(i, f0);
        PH1.e eVar = this.m;
        if (eVar != null) {
            f0.a(eVar, this.z);
        } else {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final void j0(tv.danmaku.biliplayerv2.service.E0 e0) {
        p078fI1.f<tv.danmaku.biliplayerv2.service.E0> fVar = this.i;
        if (fVar.b.contains(e0)) {
            return;
        }
        fVar.add(e0);
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onAttachByShared(tv.danmaku.biliplayerv2.PlayerSharingType playerSharingType, tv.danmaku.biliplayerv2.k kVar) {
        if (Z7(kVar)) {
            return;
        }
        PH1.e eVar = this.m;
        if (eVar != null) {
            eVar.d.a = null;
        } else {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onCollectSharedParams(tv.danmaku.biliplayerv2.PlayerSharingType playerSharingType, tv.danmaku.biliplayerv2.k kVar) {
        tv.danmaku.biliplayerv2.service.Video video;
        tv.danmaku.biliplayerv2.service.Video.e eVarD;
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        if (o0Var == null || (video = this.d) == null || (eVarD = D()) == null) {
            return;
        }
        kVar.c("key_share_player_playable_params", eVarD);
        tv.danmaku.biliplayerv2.service.F0 f0R7 = R7(video.b);
        if (f0R7 != null) {
            f0R7.k(kVar);
        }
        o0Var.detachByShared();
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onStart(tv.danmaku.biliplayerv2.k kVar) {
        h3(2, new tv.danmaku.biliplayerv2.service.NormalVideoPlayHandler());
        PH1.e eVar = this.m;
        if (eVar == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        tv.danmaku.biliplayerv2.service.D dL = eVar.l();
        this.n = dL;
        dL.y4(this.v, 6);
        tv.danmaku.biliplayerv2.service.D d2 = this.n;
        if (d2 == null) {
            kotlin.jvm.internal.n.m("mPlayerCoreService");
            throw null;
        }
        d2.s7(this.y);
        PH1.e eVar2 = this.m;
        if (eVar2 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        this.o = eVar2.f();
        PH1.e eVar3 = this.m;
        if (eVar3 == null) {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
        this.p = eVar3.g();
        if (!Z7(kVar)) {
            PH1.e eVar4 = this.m;
            if (eVar4 == null) {
                kotlin.jvm.internal.n.m("mPlayerContainer");
                throw null;
            }
            eVar4.d.a = null;
        }
        tv.danmaku.biliplayerv2.service.D d3 = this.n;
        if (d3 != null) {
            d3.H3(this.w);
        } else {
            kotlin.jvm.internal.n.m("mPlayerCoreService");
            throw null;
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.Q
    public final void onStop() {
        androidx.collection.c0<tv.danmaku.biliplayerv2.service.F0> c0Var = this.g;
        int iM = c0Var.m();
        for (int i = 0; i < iM; i++) {
            ((tv.danmaku.biliplayerv2.service.F0) c0Var.n(i)).p();
        }
        P7();
        c0Var.b();
        this.h.clear();
        tv.danmaku.biliplayerv2.service.D d2 = this.n;
        if (d2 == null) {
            kotlin.jvm.internal.n.m("mPlayerCoreService");
            throw null;
        }
        d2.R0(this.w);
        tv.danmaku.biliplayerv2.service.D d3 = this.n;
        if (d3 == null) {
            kotlin.jvm.internal.n.m("mPlayerCoreService");
            throw null;
        }
        d3.V5(this.v);
        tv.danmaku.biliplayerv2.service.D d4 = this.n;
        if (d4 == null) {
            kotlin.jvm.internal.n.m("mPlayerCoreService");
            throw null;
        }
        d4.s7(null);
        tv.danmaku.biliplayerv2.service.o0 o0Var = this.b;
        if (o0Var != null) {
            o0Var.b.remove(this.x);
        }
        this.b = null;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void r2() {
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new I2.e0(this, 6));
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "try to play next videoItem");
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null) {
            Mb0.e.r("VideosPlayDirectorService", "currentVideo is null!!!");
            return;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(video.b);
        if (f0 == null) {
            Mb0.e.r("VideosPlayDirectorService", "could found videoHandler for type = " + this.d.b);
            return;
        }
        if (!f0.h()) {
            Mb0.e.r("VideosPlayDirectorService", "do not has next item for current video");
            return;
        }
        tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider = this.q;
        this.r = iVideoQualityProvider != null ? iVideoQualityProvider.a(tv.danmaku.biliplayerv2.service.IVideoQualityProvider.ResolveFrom.NORMAL_PLAY) : -1;
        f0.n();
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void t6() {
        P7();
        tv.danmaku.biliplayerv2.service.Video.e eVarD = D();
        tv.danmaku.biliplayerv2.service.Video.a aVarZ = eVarD != null ? eVarD.z() : null;
        if (aVarZ == null) {
            Mb0.e.m("VideosPlayDirectorService", "no danmaku params id:" + (eVarD != null ? eVarD.J() : null) + " from:" + (eVarD != null ? eVarD.h : null));
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "resolve danmaku params id:" + eVarD.J() + " from:" + eVarD.h);
        PH1.e eVar = this.m;
        if (eVar != null) {
            this.u = kotlinx.coroutines.g.d(tv.danmaku.biliplayerv2.g.a(eVar), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new tv.danmaku.biliplayerimpl.videodirector.VideosPlayDirectorService$resolveDanmaku$1(this, aVarZ, eVarD, null), 3);
        } else {
            kotlin.jvm.internal.n.m("mPlayerContainer");
            throw null;
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final boolean u0() {
        return this.l;
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void v5(boolean z, tv.danmaku.biliplayerv2.service.z0 z0Var) {
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video != null) {
            tv.danmaku.biliplayerv2.service.IVideoQualityProvider iVideoQualityProvider = this.q;
            this.r = iVideoQualityProvider != null ? iVideoQualityProvider.a(tv.danmaku.biliplayerv2.service.IVideoQualityProvider.ResolveFrom.UPDATE_MEDIA_RESOURCE) : -1;
            tv.danmaku.biliplayerv2.service.F0 f0R7 = R7(video.b);
            if (f0R7 != null) {
                f0R7.x(z, z0Var);
            }
        }
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void x(tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b bVar) {
        p078fI1.f<tv.danmaku.biliplayerv2.service.InterfaceC2625e0.b> fVar = this.h;
        if (fVar.b.contains(bVar)) {
            return;
        }
        fVar.add(bVar);
    }

    @Override // tv.danmaku.biliplayerv2.service.A
    public final void z0(tv.danmaku.biliplayerv2.service.E0 e0) {
        this.i.remove(e0);
    }

    @Override // tv.danmaku.biliplayerv2.service.InterfaceC2625e0
    public final void z6() {
        if (this.j) {
            Mb0.e.m("VideosPlayDirectorService", "handling complete this moment, run in next loop");
            zb0.d.a(0).post(new US.b(this, 1));
            return;
        }
        Mb0.e.m("VideosPlayDirectorService", "replay current videoItem...");
        tv.danmaku.biliplayerv2.service.Video video = this.d;
        if (video == null) {
            Mb0.e.r("VideosPlayDirectorService", "mCurrentVideo must not be null!!");
            return;
        }
        tv.danmaku.biliplayerv2.service.F0 f0 = (tv.danmaku.biliplayerv2.service.F0) this.g.e(video.b);
        if (f0 == null) {
            Mb0.e.r("VideosPlayDirectorService", "something error!!can not found a VideoPlayHandler match with mCurrentVideo = " + this.d);
            return;
        }
        if (video.e) {
            video.e = false;
            this.z.e(video);
        }
        f0.r();
    }
}
