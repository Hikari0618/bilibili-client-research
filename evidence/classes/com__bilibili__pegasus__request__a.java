package com.bilibili.pegasus.request;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public final class a {
    public static volatile boolean a = true;
    public static volatile boolean b = true;
    public static volatile java.lang.String c = null;
    public static volatile boolean d = false;
    public static volatile int e = 0;
    public static volatile int f = -1;
    public static final Zx1.e g = kotlin.b.c(new Cp1.s(14));

    /* JADX INFO: renamed from: com.bilibili.pegasus.request.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BL */
    public static final /* synthetic */ class C0173a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.bilibili.lib.arch.lifecycle.Status.values().length];
            try {
                iArr[com.bilibili.lib.arch.lifecycle.Status.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.bilibili.lib.arch.lifecycle.Status.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b extends com.google.gson.reflect.a<com.bilibili.okretro.GeneralResponse<LE0.d>> {
    }

    public static final Zx1.o a(com.bilibili.pegasus.request.c cVar, ME0.f fVar, com.bilibili.gripper.main.f fVar2) {
        java.lang.String str;
        LE0.e eVar = fVar.g;
        java.lang.String strB = eVar != null ? eVar.b() : null;
        if (eVar != null) {
            java.lang.String str2 = eVar.c;
            if (str2 == null) {
                str2 = "";
            }
            str = str2;
        } else {
            str = null;
        }
        com.bilibili.pegasus.request.d dVar = new com.bilibili.pegasus.request.d(fVar.a, fVar.b, !p000aA0.C0433l.d() ? 1 : 2, com.bilibili.pegasus.components.N.a, com.bilibili.pegasus.components.N.c.getValue(), strB, fVar.c.getValue(), eVar != null ? eVar.a : 0L, fVar.d, fVar.e, fVar.f, str, fVar.j, fVar.i);
        com.bilibili.lib.performance.e.a.getClass();
        android.util.Log.w("IndexParam", "cacheIndexFeed: " + dVar + com.bilibili.lib.performance.e.c());
        tv.danmaku.android.log.BLog.v("ApiManager", "cacheIndexFeed: " + dVar + " ");
        Cy1.d dVar2 = com.bilibili.pegasus.request.j.e;
        kotlinx.coroutines.g.d(dVar2, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.request.TMPCache$cache$1(dVar, kotlinx.coroutines.g.b(dVar2, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.request.ApiManagerKt$cacheIndexFeed$job$1(dVar, fVar, cVar, fVar2, null), 3), null), 3);
        return Zx1.o.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final java.lang.Object b(ME0.f fVar, com.bilibili.pegasus.request.g gVar, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.bilibili.pegasus.request.ApiManagerKt$getIndexFeed$1 apiManagerKt$getIndexFeed$1;
        long j;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        long j2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        if (continuationImpl instanceof com.bilibili.pegasus.request.ApiManagerKt$getIndexFeed$1) {
            apiManagerKt$getIndexFeed$1 = (com.bilibili.pegasus.request.ApiManagerKt$getIndexFeed$1) continuationImpl;
            int i = apiManagerKt$getIndexFeed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiManagerKt$getIndexFeed$1.label = i - Integer.MIN_VALUE;
            } else {
                apiManagerKt$getIndexFeed$1 = new com.bilibili.pegasus.request.ApiManagerKt$getIndexFeed$1(continuationImpl);
            }
        } else {
            apiManagerKt$getIndexFeed$1 = new com.bilibili.pegasus.request.ApiManagerKt$getIndexFeed$1(continuationImpl);
        }
        java.lang.Object obj = apiManagerKt$getIndexFeed$1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = apiManagerKt$getIndexFeed$1.label;
        if (i2 == 0) {
            kotlin.c.a(obj);
            LE0.e eVar = fVar.g;
            if (eVar != null) {
                java.lang.String strB = eVar.b();
                java.lang.String str3 = eVar.c;
                if (str3 == null) {
                    str3 = "";
                }
                j = eVar.a;
                str = strB;
                str2 = str3;
            } else {
                j = 0;
                str = null;
                str2 = null;
            }
            long j3 = j;
            kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
            com.bilibili.lib.performance.BootKeyEventRecoder.e(com.bilibili.lib.performance.BootKeyEventRecoder.a, "infra.setup.phase.tm_req_start", (java.util.Map) null, 6);
            kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
            kotlin.time.f.a.a.getClass();
            long jB = kotlin.time.e.b();
            p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> aVarB = ((com.bilibili.pegasus.request.c) g.getValue()).b(fVar.a, fVar.b, com.bilibili.pegasus.components.N.b, com.bilibili.pegasus.components.N.c.getValue(), com.bilibili.pegasus.components.N.a, str, fVar.c.getValue(), j3, fVar.d, fVar.e, fVar.f, str2, fVar.i, null, null, fVar.j, fVar.k);
            com.bilibili.pegasus.components.N.c = com.bilibili.pegasus.data.request.OpenEvent.NORMAL;
            com.bilibili.pegasus.components.N.b = 0;
            p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> aVarI = aVarB.i(gVar);
            apiManagerKt$getIndexFeed$1.L$0 = objectRef3;
            apiManagerKt$getIndexFeed$1.L$1 = booleanRef2;
            apiManagerKt$getIndexFeed$1.L$2 = objectRef3;
            apiManagerKt$getIndexFeed$1.J$0 = jB;
            apiManagerKt$getIndexFeed$1.label = 1;
            java.lang.Object objC = com.bilibili.lib.coroutineextension.BiliCallExtKt.c(aVarI, apiManagerKt$getIndexFeed$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectRef = objectRef3;
            booleanRef = booleanRef2;
            j2 = jB;
            obj = objC;
            objectRef2 = objectRef;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = apiManagerKt$getIndexFeed$1.J$0;
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getIndexFeed$1.L$2;
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) apiManagerKt$getIndexFeed$1.L$1;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getIndexFeed$1.L$0;
            kotlin.c.a(obj);
        }
        int i3 = com.bilibili.pegasus.request.a.C0173a.a[((Vg0.c) obj).a.ordinal()];
        if (i3 == 1) {
            com.bilibili.lib.performance.BootTracerV2.h = 1;
            booleanRef.element = true;
        } else if (i3 == 2) {
            com.bilibili.lib.performance.BootTracerV2 bootTracerV2 = com.bilibili.lib.performance.BootTracerV2.a;
            com.bilibili.lib.performance.BootTracerV2.h = 2;
            com.bilibili.lib.performance.BootTracerV2.d(com.bilibili.lib.performance.BootTracerV2.Phase.PEGASUS_API_ERROR);
            booleanRef.element = false;
        }
        objectRef2.element = obj;
        long jB2 = kotlin.time.f.a.a.b(j2);
        com.bilibili.lib.performance.BootTracerV2 bootTracerV3 = com.bilibili.lib.performance.BootTracerV2.a;
        com.bilibili.lib.performance.BootTracerV2.i = kotlin.time.a.i(jB2);
        com.bilibili.lib.performance.BootKeyEventRecoder.a.c(jB2, booleanRef.element);
        return objectRef.element;
    }

    public static java.lang.Object c(int i, java.lang.String str, kotlin.coroutines.jvm.internal.SuspendLambda suspendLambda, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return com.bilibili.lib.coroutineextension.BiliCallExtKt.c(((com.bilibili.pegasus.request.c) g.getValue()).c(Nr0.b.a.getOaid(), str, i).i(new aS.a()), suspendLambda);
    }

    public static final void d(long j, java.lang.String str, java.lang.String str2, p157uB0.b<LE0.d> bVar) {
        ((com.bilibili.pegasus.request.c) g.getValue()).a(Nr0.b.a.getOaid(), j, str, str2, (hh0.b.g().j() && a) ? 1L : 0L).i(new F2.b()).f(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x019d  */
    /* JADX WARN: Code duplicated, block: B:35:0x025c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x025d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0270  */
    /* JADX WARN: Code duplicated, block: B:42:0x0274  */
    /* JADX WARN: Code duplicated, block: B:43:0x0281  */
    /* JADX WARN: Code duplicated, block: B:45:0x028a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final java.lang.Object e(ME0.f fVar, com.bilibili.pegasus.request.g gVar, com.bilibili.pegasus.vm.w wVar, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.bilibili.pegasus.request.ApiManagerKt$getSegIndexFeed$1 apiManagerKt$getSegIndexFeed$1;
        com.bilibili.pegasus.request.d dVar;
        com.bilibili.pegasus.request.g gVar2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        ME0.f fVar2;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        long j;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        ME0.f fVar3;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        com.bilibili.pegasus.request.g gVar3;
        kotlin.jvm.functions.Function1 function2;
        Vg0.c cVar;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        com.bilibili.pegasus.request.d dVar2;
        long j2;
        long j3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        int i;
        if (continuationImpl instanceof com.bilibili.pegasus.request.ApiManagerKt$getSegIndexFeed$1) {
            apiManagerKt$getSegIndexFeed$1 = (com.bilibili.pegasus.request.ApiManagerKt$getSegIndexFeed$1) continuationImpl;
            int i2 = apiManagerKt$getSegIndexFeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apiManagerKt$getSegIndexFeed$1.label = i2 - Integer.MIN_VALUE;
            } else {
                apiManagerKt$getSegIndexFeed$1 = new com.bilibili.pegasus.request.ApiManagerKt$getSegIndexFeed$1(continuationImpl);
            }
        } else {
            apiManagerKt$getSegIndexFeed$1 = new com.bilibili.pegasus.request.ApiManagerKt$getSegIndexFeed$1(continuationImpl);
        }
        java.lang.Object objC = apiManagerKt$getSegIndexFeed$1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = apiManagerKt$getSegIndexFeed$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                j = apiManagerKt$getSegIndexFeed$1.J$0;
                com.bilibili.pegasus.request.d dVar3 = (com.bilibili.pegasus.request.d) apiManagerKt$getSegIndexFeed$1.L$8;
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) apiManagerKt$getSegIndexFeed$1.L$7;
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$6;
                longRef = (kotlin.jvm.internal.Ref.LongRef) apiManagerKt$getSegIndexFeed$1.L$5;
                kotlin.jvm.internal.Ref.ObjectRef objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$4;
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$3;
                kotlin.jvm.functions.Function1 function3 = (kotlin.jvm.functions.Function1) apiManagerKt$getSegIndexFeed$1.L$2;
                com.bilibili.pegasus.request.g gVar4 = (com.bilibili.pegasus.request.g) apiManagerKt$getSegIndexFeed$1.L$1;
                fVar2 = (ME0.f) apiManagerKt$getSegIndexFeed$1.L$0;
                kotlin.c.a(objC);
                objectRef = objectRef7;
                dVar = dVar3;
                function1 = function3;
                gVar2 = gVar4;
            } else {
                if (i3 == 2) {
                    long j4 = apiManagerKt$getSegIndexFeed$1.J$0;
                    cVar = (Vg0.c) apiManagerKt$getSegIndexFeed$1.L$9;
                    dVar2 = (com.bilibili.pegasus.request.d) apiManagerKt$getSegIndexFeed$1.L$8;
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) apiManagerKt$getSegIndexFeed$1.L$7;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$6;
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) apiManagerKt$getSegIndexFeed$1.L$5;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$4;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$3;
                    kotlin.jvm.functions.Function1 function4 = (kotlin.jvm.functions.Function1) apiManagerKt$getSegIndexFeed$1.L$2;
                    gVar3 = (com.bilibili.pegasus.request.g) apiManagerKt$getSegIndexFeed$1.L$1;
                    fVar3 = (ME0.f) apiManagerKt$getSegIndexFeed$1.L$0;
                    kotlin.c.a(objC);
                    function2 = function4;
                    booleanRef2 = booleanRef3;
                    objectRef2 = objectRef8;
                    j = j4;
                    if (cVar == null) {
                        com.bilibili.pegasus.components.N.a = null;
                        com.bilibili.pegasus.request.c cVar2 = (com.bilibili.pegasus.request.c) g.getValue();
                        j2 = j;
                        long j5 = fVar3.a;
                        int i4 = com.bilibili.pegasus.components.N.b;
                        java.lang.String str = dVar2.d;
                        p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> aVarB = cVar2.b(j5, fVar3.b, i4, com.bilibili.pegasus.components.N.c.getValue(), str, (java.lang.String) objectRef2.element, fVar3.c.getValue(), longRef2.element, fVar3.d, fVar3.e, fVar3.f, (java.lang.String) objectRef.element, fVar3.i, null, null, fVar3.j, fVar3.k);
                        com.bilibili.pegasus.components.N.c = com.bilibili.pegasus.data.request.OpenEvent.NORMAL;
                        com.bilibili.pegasus.components.N.b = 0;
                        com.google.gson.Gson gson = new com.google.gson.Gson();
                        OE0.a aVar = gVar3.b;
                        QQ.c cVar3 = new QQ.c(1, function2);
                        JA0.c cVar4 = new JA0.c();
                        cVar4.b = cVar3;
                        com.google.gson.c cVar5 = new com.google.gson.c(gson);
                        BY.d dVar4 = new BY.d(cVar4, 14);
                        com.bilibili.pegasus.request.PegasusResponseTypeAdapter pegasusResponseTypeAdapter = new com.bilibili.pegasus.request.PegasusResponseTypeAdapter();
                        pegasusResponseTypeAdapter.a = dVar4;
                        cVar5.b(FE0.f.class, pegasusResponseTypeAdapter);
                        cVar4.c = new com.bilibili.pegasus.request.PegasusGsonParser(aVar, cVar5);
                        pegasusResponseTypeAdapter.b = cVar5.a();
                        p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> aVarI = aVarB.i(cVar4);
                        apiManagerKt$getSegIndexFeed$1.L$0 = objectRef4;
                        apiManagerKt$getSegIndexFeed$1.L$1 = booleanRef2;
                        apiManagerKt$getSegIndexFeed$1.L$2 = objectRef4;
                        apiManagerKt$getSegIndexFeed$1.L$3 = null;
                        apiManagerKt$getSegIndexFeed$1.L$4 = null;
                        apiManagerKt$getSegIndexFeed$1.L$5 = null;
                        apiManagerKt$getSegIndexFeed$1.L$6 = null;
                        apiManagerKt$getSegIndexFeed$1.L$7 = null;
                        apiManagerKt$getSegIndexFeed$1.L$8 = null;
                        apiManagerKt$getSegIndexFeed$1.L$9 = null;
                        apiManagerKt$getSegIndexFeed$1.J$0 = j2;
                        apiManagerKt$getSegIndexFeed$1.label = 3;
                        objC = com.bilibili.lib.coroutineextension.BiliCallExtKt.c(aVarI, apiManagerKt$getSegIndexFeed$1);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j3 = j2;
                        objectRef5 = objectRef4;
                        objectRef6 = objectRef5;
                    } else {
                        objectRef4.element = cVar;
                        booleanRef2.element = true;
                    }
                    long jB = kotlin.time.f.a.a.b(j);
                    com.bilibili.lib.performance.BootTracerV2 bootTracerV2 = com.bilibili.lib.performance.BootTracerV2.a;
                    com.bilibili.lib.performance.BootTracerV2.i = kotlin.time.a.i(jB);
                    com.bilibili.lib.performance.BootKeyEventRecoder.a.c(jB, booleanRef2.element);
                    return objectRef4.element;
                }
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = apiManagerKt$getSegIndexFeed$1.J$0;
                objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$2;
                booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) apiManagerKt$getSegIndexFeed$1.L$1;
                objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) apiManagerKt$getSegIndexFeed$1.L$0;
                kotlin.c.a(objC);
            }
            i = com.bilibili.pegasus.request.a.C0173a.a[((Vg0.c) objC).a.ordinal()];
            if (i != 1) {
                com.bilibili.lib.performance.BootTracerV2.h = 1;
                booleanRef2.element = true;
            } else if (i == 2) {
                com.bilibili.lib.performance.BootTracerV2 bootTracerV3 = com.bilibili.lib.performance.BootTracerV2.a;
                com.bilibili.lib.performance.BootTracerV2.h = 2;
                com.bilibili.lib.performance.BootTracerV2.d(com.bilibili.lib.performance.BootTracerV2.Phase.PEGASUS_API_ERROR);
                booleanRef2.element = false;
            }
            objectRef5.element = objC;
            objectRef4 = objectRef6;
            j = j3;
            long jB2 = kotlin.time.f.a.a.b(j);
            com.bilibili.lib.performance.BootTracerV2 bootTracerV4 = com.bilibili.lib.performance.BootTracerV2.a;
            com.bilibili.lib.performance.BootTracerV2.i = kotlin.time.a.i(jB2);
            com.bilibili.lib.performance.BootKeyEventRecoder.a.c(jB2, booleanRef2.element);
            return objectRef4.element;
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRefC = androidx.compose.foundation.gestures.a0.c(objC);
        kotlin.jvm.internal.Ref.ObjectRef objectRef9 = new kotlin.jvm.internal.Ref.ObjectRef();
        kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
        LE0.e eVar = fVar.g;
        if (eVar != null) {
            objectRefC.element = eVar.b();
            java.lang.String str2 = eVar.c;
            if (str2 == null) {
                str2 = "";
            }
            objectRef9.element = str2;
            longRef3.element = eVar.a;
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
        com.bilibili.lib.performance.BootKeyEventRecoder.e(com.bilibili.lib.performance.BootKeyEventRecoder.a, "infra.setup.phase.tm_req_start", (java.util.Map) null, 6);
        kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = new kotlin.jvm.internal.Ref.BooleanRef();
        kotlin.time.f.a.a.getClass();
        long jB3 = kotlin.time.e.b();
        java.lang.String str3 = (java.lang.String) objectRefC.element;
        java.lang.String str4 = (java.lang.String) objectRef9.element;
        long j6 = longRef3.element;
        dVar = new com.bilibili.pegasus.request.d(fVar.a, fVar.b, com.bilibili.pegasus.components.N.b, null, com.bilibili.pegasus.components.N.c.getValue(), str3, fVar.c.getValue(), j6, fVar.d, fVar.e, fVar.f, str4, fVar.j, fVar.i);
        com.bilibili.pegasus.request.j jVar = com.bilibili.pegasus.request.j.a;
        apiManagerKt$getSegIndexFeed$1.L$0 = fVar;
        gVar2 = gVar;
        apiManagerKt$getSegIndexFeed$1.L$1 = gVar2;
        apiManagerKt$getSegIndexFeed$1.L$2 = wVar;
        apiManagerKt$getSegIndexFeed$1.L$3 = objectRefC;
        apiManagerKt$getSegIndexFeed$1.L$4 = objectRef9;
        apiManagerKt$getSegIndexFeed$1.L$5 = longRef3;
        apiManagerKt$getSegIndexFeed$1.L$6 = objectRef10;
        apiManagerKt$getSegIndexFeed$1.L$7 = booleanRef4;
        apiManagerKt$getSegIndexFeed$1.L$8 = dVar;
        apiManagerKt$getSegIndexFeed$1.J$0 = jB3;
        apiManagerKt$getSegIndexFeed$1.label = 1;
        java.lang.Object objB = jVar.b(dVar, apiManagerKt$getSegIndexFeed$1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        objectRef = objectRef9;
        booleanRef = booleanRef4;
        fVar2 = fVar;
        function1 = wVar;
        objectRef2 = objectRefC;
        objC = objB;
        longRef = longRef3;
        objectRef3 = objectRef10;
        j = jB3;
        Vg0.c cVar6 = (Vg0.c) objC;
        com.bilibili.pegasus.request.j jVar2 = com.bilibili.pegasus.request.j.a;
        apiManagerKt$getSegIndexFeed$1.L$0 = fVar2;
        apiManagerKt$getSegIndexFeed$1.L$1 = gVar2;
        apiManagerKt$getSegIndexFeed$1.L$2 = function1;
        apiManagerKt$getSegIndexFeed$1.L$3 = objectRef2;
        apiManagerKt$getSegIndexFeed$1.L$4 = objectRef;
        apiManagerKt$getSegIndexFeed$1.L$5 = longRef;
        apiManagerKt$getSegIndexFeed$1.L$6 = objectRef3;
        apiManagerKt$getSegIndexFeed$1.L$7 = booleanRef;
        apiManagerKt$getSegIndexFeed$1.L$8 = dVar;
        apiManagerKt$getSegIndexFeed$1.L$9 = cVar6;
        apiManagerKt$getSegIndexFeed$1.J$0 = j;
        apiManagerKt$getSegIndexFeed$1.label = 2;
        if (jVar2.a(apiManagerKt$getSegIndexFeed$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        booleanRef2 = booleanRef;
        fVar3 = fVar2;
        longRef2 = longRef;
        gVar3 = gVar2;
        function2 = function1;
        cVar = cVar6;
        com.bilibili.pegasus.request.d dVar5 = dVar;
        objectRef4 = objectRef3;
        dVar2 = dVar5;
        if (cVar == null) {
            com.bilibili.pegasus.components.N.a = null;
            com.bilibili.pegasus.request.c cVar7 = (com.bilibili.pegasus.request.c) g.getValue();
            j2 = j;
            long j7 = fVar3.a;
            int i5 = com.bilibili.pegasus.components.N.b;
            java.lang.String str5 = dVar2.d;
            p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> aVarB2 = cVar7.b(j7, fVar3.b, i5, com.bilibili.pegasus.components.N.c.getValue(), str5, (java.lang.String) objectRef2.element, fVar3.c.getValue(), longRef2.element, fVar3.d, fVar3.e, fVar3.f, (java.lang.String) objectRef.element, fVar3.i, null, null, fVar3.j, fVar3.k);
            com.bilibili.pegasus.components.N.c = com.bilibili.pegasus.data.request.OpenEvent.NORMAL;
            com.bilibili.pegasus.components.N.b = 0;
            com.google.gson.Gson gson2 = new com.google.gson.Gson();
            OE0.a aVar2 = gVar3.b;
            QQ.c cVar8 = new QQ.c(1, function2);
            JA0.c cVar9 = new JA0.c();
            cVar9.b = cVar8;
            com.google.gson.c cVar10 = new com.google.gson.c(gson2);
            BY.d dVar6 = new BY.d(cVar9, 14);
            com.bilibili.pegasus.request.PegasusResponseTypeAdapter pegasusResponseTypeAdapter2 = new com.bilibili.pegasus.request.PegasusResponseTypeAdapter();
            pegasusResponseTypeAdapter2.a = dVar6;
            cVar10.b(FE0.f.class, pegasusResponseTypeAdapter2);
            cVar9.c = new com.bilibili.pegasus.request.PegasusGsonParser(aVar2, cVar10);
            pegasusResponseTypeAdapter2.b = cVar10.a();
            p165vB0.a<com.bilibili.okretro.GeneralResponse<FE0.f>> aVarI2 = aVarB2.i(cVar9);
            apiManagerKt$getSegIndexFeed$1.L$0 = objectRef4;
            apiManagerKt$getSegIndexFeed$1.L$1 = booleanRef2;
            apiManagerKt$getSegIndexFeed$1.L$2 = objectRef4;
            apiManagerKt$getSegIndexFeed$1.L$3 = null;
            apiManagerKt$getSegIndexFeed$1.L$4 = null;
            apiManagerKt$getSegIndexFeed$1.L$5 = null;
            apiManagerKt$getSegIndexFeed$1.L$6 = null;
            apiManagerKt$getSegIndexFeed$1.L$7 = null;
            apiManagerKt$getSegIndexFeed$1.L$8 = null;
            apiManagerKt$getSegIndexFeed$1.L$9 = null;
            apiManagerKt$getSegIndexFeed$1.J$0 = j2;
            apiManagerKt$getSegIndexFeed$1.label = 3;
            objC = com.bilibili.lib.coroutineextension.BiliCallExtKt.c(aVarI2, apiManagerKt$getSegIndexFeed$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j3 = j2;
            objectRef5 = objectRef4;
            objectRef6 = objectRef5;
            i = com.bilibili.pegasus.request.a.C0173a.a[((Vg0.c) objC).a.ordinal()];
            if (i != 1) {
                com.bilibili.lib.performance.BootTracerV2.h = 1;
                booleanRef2.element = true;
            } else if (i == 2) {
                com.bilibili.lib.performance.BootTracerV2 bootTracerV5 = com.bilibili.lib.performance.BootTracerV2.a;
                com.bilibili.lib.performance.BootTracerV2.h = 2;
                com.bilibili.lib.performance.BootTracerV2.d(com.bilibili.lib.performance.BootTracerV2.Phase.PEGASUS_API_ERROR);
                booleanRef2.element = false;
            }
            objectRef5.element = objC;
            objectRef4 = objectRef6;
            j = j3;
        } else {
            objectRef4.element = cVar;
            booleanRef2.element = true;
        }
        long jB4 = kotlin.time.f.a.a.b(j);
        com.bilibili.lib.performance.BootTracerV2 bootTracerV6 = com.bilibili.lib.performance.BootTracerV2.a;
        com.bilibili.lib.performance.BootTracerV2.i = kotlin.time.a.i(jB4);
        com.bilibili.lib.performance.BootKeyEventRecoder.a.c(jB4, booleanRef2.element);
        return objectRef4.element;
    }

    public static final boolean f() {
        return hh0.b.g().j() && a;
    }
}
