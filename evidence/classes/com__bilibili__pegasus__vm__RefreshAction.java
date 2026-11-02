package com.bilibili.pegasus.vm;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili2/dex/classes17.dex */
public final class RefreshAction implements com.bilibili.pegasus.A<NE0.c> {
    public final ME0.f a;
    public final com.bilibili.pegasus.request.g b;

    public RefreshAction(ME0.f fVar, com.bilibili.pegasus.request.g gVar) {
        this.a = fVar;
        this.b = gVar;
    }

    public static com.bilibili.pegasus.InterfaceC0514a b(ME0.b bVar) {
        return ((java.lang.Boolean) com.bilibili.pegasus.common.n.b.getValue()).booleanValue() ? new com.bilibili.pegasus.vm.C0654a(bVar) : new com.bilibili.pegasus.vm.e(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00df A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:15:0x0039, B:91:0x01b5, B:93:0x01bd, B:95:0x01c9, B:96:0x01cf, B:21:0x0049, B:84:0x0196, B:86:0x01a4, B:88:0x01ac, B:22:0x004e, B:58:0x0106, B:60:0x010e, B:62:0x011a, B:63:0x0120, B:25:0x005f, B:49:0x00d9, B:51:0x00df, B:53:0x00ef, B:55:0x00f7, B:65:0x0125, B:67:0x012f, B:69:0x0135, B:71:0x0152, B:73:0x0159, B:74:0x0162, B:76:0x0174, B:78:0x0180, B:79:0x0186, B:35:0x0091, B:38:0x009b, B:40:0x00a5, B:45:0x00b0, B:81:0x018b), top: B:100:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:15:0x0039, B:91:0x01b5, B:93:0x01bd, B:95:0x01c9, B:96:0x01cf, B:21:0x0049, B:84:0x0196, B:86:0x01a4, B:88:0x01ac, B:22:0x004e, B:58:0x0106, B:60:0x010e, B:62:0x011a, B:63:0x0120, B:25:0x005f, B:49:0x00d9, B:51:0x00df, B:53:0x00ef, B:55:0x00f7, B:65:0x0125, B:67:0x012f, B:69:0x0135, B:71:0x0152, B:73:0x0159, B:74:0x0162, B:76:0x0174, B:78:0x0180, B:79:0x0186, B:35:0x0091, B:38:0x009b, B:40:0x00a5, B:45:0x00b0, B:81:0x018b), top: B:100:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0125 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:15:0x0039, B:91:0x01b5, B:93:0x01bd, B:95:0x01c9, B:96:0x01cf, B:21:0x0049, B:84:0x0196, B:86:0x01a4, B:88:0x01ac, B:22:0x004e, B:58:0x0106, B:60:0x010e, B:62:0x011a, B:63:0x0120, B:25:0x005f, B:49:0x00d9, B:51:0x00df, B:53:0x00ef, B:55:0x00f7, B:65:0x0125, B:67:0x012f, B:69:0x0135, B:71:0x0152, B:73:0x0159, B:74:0x0162, B:76:0x0174, B:78:0x0180, B:79:0x0186, B:35:0x0091, B:38:0x009b, B:40:0x00a5, B:45:0x00b0, B:81:0x018b), top: B:100:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0152 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:15:0x0039, B:91:0x01b5, B:93:0x01bd, B:95:0x01c9, B:96:0x01cf, B:21:0x0049, B:84:0x0196, B:86:0x01a4, B:88:0x01ac, B:22:0x004e, B:58:0x0106, B:60:0x010e, B:62:0x011a, B:63:0x0120, B:25:0x005f, B:49:0x00d9, B:51:0x00df, B:53:0x00ef, B:55:0x00f7, B:65:0x0125, B:67:0x012f, B:69:0x0135, B:71:0x0152, B:73:0x0159, B:74:0x0162, B:76:0x0174, B:78:0x0180, B:79:0x0186, B:35:0x0091, B:38:0x009b, B:40:0x00a5, B:45:0x00b0, B:81:0x018b), top: B:100:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:15:0x0039, B:91:0x01b5, B:93:0x01bd, B:95:0x01c9, B:96:0x01cf, B:21:0x0049, B:84:0x0196, B:86:0x01a4, B:88:0x01ac, B:22:0x004e, B:58:0x0106, B:60:0x010e, B:62:0x011a, B:63:0x0120, B:25:0x005f, B:49:0x00d9, B:51:0x00df, B:53:0x00ef, B:55:0x00f7, B:65:0x0125, B:67:0x012f, B:69:0x0135, B:71:0x0152, B:73:0x0159, B:74:0x0162, B:76:0x0174, B:78:0x0180, B:79:0x0186, B:35:0x0091, B:38:0x009b, B:40:0x00a5, B:45:0x00b0, B:81:0x018b), top: B:100:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.bilibili.pegasus.vm.w] */
    @Override // com.bilibili.pegasus.A
    public final java.lang.Object a(com.bilibili.pegasus.Store<NE0.c> store, dy1.b<? super com.bilibili.pegasus.InterfaceC0514a> bVar) {
        com.bilibili.pegasus.vm.RefreshAction$run$1 refreshAction$run$1;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        FE0.f fVar;
        java.util.List<com.bilibili.pegasus.PegasusHolderData> listD;
        java.util.ArrayList arrayList;
        FE0.f fVar2;
        FE0.f fVarA;
        kotlin.jvm.functions.Function0<java.lang.String> function0;
        java.lang.String str;
        kotlin.jvm.functions.Function0<java.lang.String> function1;
        java.lang.String str2;
        final com.bilibili.pegasus.Store<NE0.c> store2 = store;
        if (bVar instanceof com.bilibili.pegasus.vm.RefreshAction$run$1) {
            refreshAction$run$1 = (com.bilibili.pegasus.vm.RefreshAction$run$1) bVar;
            int i = refreshAction$run$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshAction$run$1.label = i - Integer.MIN_VALUE;
            } else {
                refreshAction$run$1 = new com.bilibili.pegasus.vm.RefreshAction$run$1(this, bVar);
            }
        } else {
            refreshAction$run$1 = new com.bilibili.pegasus.vm.RefreshAction$run$1(this, bVar);
        }
        java.lang.Object objB = refreshAction$run$1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = refreshAction$run$1.label;
        ME0.f fVar3 = this.a;
        try {
            if (i2 == 0) {
                kotlin.c.a(objB);
                if (store.getState().c()) {
                    return new com.bilibili.pegasus.vm.l("refresh isLoading");
                }
                ME0.e eVar = new ME0.e(true);
                refreshAction$run$1.L$0 = store2;
                refreshAction$run$1.label = 1;
                if (store2.u(eVar, refreshAction$run$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) refreshAction$run$1.L$2;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) refreshAction$run$1.L$1;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) refreshAction$run$1.L$0;
                        kotlin.c.a(objB);
                        objectRef2.element = objB;
                        if (objectRef.element != null) {
                            fVar = (FE0.f) ((Vg0.c) objectRef3.element).b;
                            if (fVar != null && (listD = fVar.d()) != null) {
                                arrayList = new java.util.ArrayList();
                                arrayList.addAll(listD);
                                arrayList.removeAll((java.util.Collection) objectRef.element);
                                Vg0.c.a aVar = Vg0.c.d;
                                fVar2 = (FE0.f) ((Vg0.c) objectRef3.element).b;
                                if (fVar2 != null) {
                                    fVarA = FE0.f.a(fVar2, arrayList, null, null, 6);
                                } else {
                                    fVarA = null;
                                }
                                aVar.getClass();
                                objectRef3.element = Vg0.c.a.d(fVarA);
                            }
                            ME0.b bVarAvoidEmptyWindow = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objectRef3.element, fVar3));
                            return (bVarAvoidEmptyWindow.d() || bVarAvoidEmptyWindow.c().isEmpty()) ? b(bVarAvoidEmptyWindow) : new ME0.d(bVarAvoidEmptyWindow, true);
                        }
                        ME0.b bVarAvoidEmptyWindow2 = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objectRef3.element, fVar3));
                        function0 = fVar3.h;
                        if (function0 != null) {
                            str = (java.lang.String) function0.invoke();
                        } else {
                            str = null;
                        }
                        refreshAction$run$1.L$0 = null;
                        refreshAction$run$1.L$1 = null;
                        refreshAction$run$1.L$2 = null;
                        refreshAction$run$1.label = 3;
                        objB = com.bilibili.pegasus.components.topview.a.a(bVarAvoidEmptyWindow2, str, refreshAction$run$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                kotlin.c.a(objB);
                                ME0.b bVarAvoidEmptyWindow3 = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objB, fVar3));
                                function1 = fVar3.h;
                                if (function1 != null) {
                                    str2 = (java.lang.String) function1.invoke();
                                } else {
                                    str2 = null;
                                }
                                refreshAction$run$1.label = 5;
                                objB = com.bilibili.pegasus.components.topview.a.a(bVarAvoidEmptyWindow3, str2, refreshAction$run$1);
                                if (objB == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i2 != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.a(objB);
                            }
                            ME0.b bVar2 = (ME0.b) objB;
                            return (bVar2.d() || bVar2.c().isEmpty()) ? b(bVar2) : new ME0.d(bVar2, false);
                        }
                        kotlin.c.a(objB);
                    }
                    ME0.b bVar3 = (ME0.b) objB;
                    return (bVar3.d() || bVar3.c().isEmpty()) ? b(bVar3) : new ME0.d(bVar3, false);
                }
                store2 = (com.bilibili.pegasus.Store) refreshAction$run$1.L$0;
                kotlin.c.a(objB);
            }
            long j = fVar3.a;
            com.bilibili.pegasus.request.g gVar = this.b;
            if (j == 0) {
                Dd.v vVar = com.bilibili.lib.performance.i.a;
                if (com.bilibili.lib.performance.i.c(com.bilibili.lib.performance.PerformanceConfigKey.BOOT_OPT_SETUP_INDEX) && com.bilibili.lib.performance.i.d()) {
                    com.bilibili.pegasus.vm.ActionsKt.reportPreApiRawWindowSizeType(fVar3.k);
                    final kotlin.coroutines.d context = refreshAction$run$1.getContext();
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    ?? r14 = new kotlin.jvm.functions.Function1() { // from class: com.bilibili.pegasus.vm.w
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            Vg0.c cVar = (Vg0.c) obj;
                            kotlinx.coroutines.g.d(kotlinx.coroutines.F.a(context), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.vm.RefreshAction$run$response$1$1(this, cVar, objectRef, store2, null), 3);
                            return Zx1.o.a;
                        }
                    };
                    refreshAction$run$1.L$0 = objectRef;
                    refreshAction$run$1.L$1 = objectRef4;
                    refreshAction$run$1.L$2 = objectRef4;
                    refreshAction$run$1.label = 2;
                    objB = com.bilibili.pegasus.request.a.e(fVar3, gVar, r14, refreshAction$run$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objectRef2 = objectRef4;
                    objectRef3 = objectRef2;
                    objectRef2.element = objB;
                    if (objectRef.element != null) {
                        ME0.b bVarAvoidEmptyWindow4 = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objectRef3.element, fVar3));
                        function0 = fVar3.h;
                        if (function0 != null) {
                            str = (java.lang.String) function0.invoke();
                        } else {
                            str = null;
                        }
                        refreshAction$run$1.L$0 = null;
                        refreshAction$run$1.L$1 = null;
                        refreshAction$run$1.L$2 = null;
                        refreshAction$run$1.label = 3;
                        objB = com.bilibili.pegasus.components.topview.a.a(bVarAvoidEmptyWindow4, str, refreshAction$run$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ME0.b bVar4 = (ME0.b) objB;
                        if (bVar4.d()) {
                        }
                    }
                    fVar = (FE0.f) ((Vg0.c) objectRef3.element).b;
                    if (fVar != null) {
                        arrayList = new java.util.ArrayList();
                        arrayList.addAll(listD);
                        arrayList.removeAll((java.util.Collection) objectRef.element);
                        Vg0.c.a aVar2 = Vg0.c.d;
                        fVar2 = (FE0.f) ((Vg0.c) objectRef3.element).b;
                        if (fVar2 != null) {
                            fVarA = FE0.f.a(fVar2, arrayList, null, null, 6);
                        } else {
                            fVarA = null;
                        }
                        aVar2.getClass();
                        objectRef3.element = Vg0.c.a.d(fVarA);
                    }
                    ME0.b bVarAvoidEmptyWindow5 = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objectRef3.element, fVar3));
                    if (bVarAvoidEmptyWindow5.d()) {
                    }
                }
            }
            refreshAction$run$1.L$0 = null;
            refreshAction$run$1.label = 4;
            objB = com.bilibili.pegasus.request.a.b(fVar3, gVar, refreshAction$run$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ME0.b bVarAvoidEmptyWindow6 = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objB, fVar3));
            function1 = fVar3.h;
            if (function1 != null) {
                str2 = (java.lang.String) function1.invoke();
            } else {
                str2 = null;
            }
            refreshAction$run$1.label = 5;
            objB = com.bilibili.pegasus.components.topview.a.a(bVarAvoidEmptyWindow6, str2, refreshAction$run$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ME0.b bVar5 = (ME0.b) objB;
            if (bVar5.d()) {
            }
        } catch (java.lang.Exception e) {
            tv.danmaku.android.log.BLog.e("PegasusActions", "RefreshAction error", e);
            return b(new ME0.b(null, e, fVar3, false));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bilibili.pegasus.vm.RefreshAction)) {
            return false;
        }
        com.bilibili.pegasus.vm.RefreshAction refreshAction = (com.bilibili.pegasus.vm.RefreshAction) obj;
        return kotlin.jvm.internal.n.f(this.a, refreshAction.a) && kotlin.jvm.internal.n.f(this.b, refreshAction.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "RefreshAction(requestParam=" + this.a + ", parser=" + this.b + ")";
    }
}
