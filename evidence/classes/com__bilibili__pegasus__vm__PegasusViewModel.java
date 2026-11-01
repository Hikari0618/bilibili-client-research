package com.bilibili.pegasus.vm;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public final class PegasusViewModel extends androidx.lifecycle.a0 implements com.bilibili.pegasus.Store<NE0.c> {
    public final com.bilibili.pegasus.request.g b;
    public final java.util.ArrayList c;
    public final kotlinx.coroutines.flow.StateFlowImpl d;
    public final com.bilibili.pegasus.vm.r e;
    public final kotlinx.coroutines.flow.D f;
    public final kotlinx.coroutines.flow.z g;
    public final kotlinx.coroutines.flow.StateFlowImpl h;
    public final kotlinx.coroutines.flow.A i;
    public ME0.f j;
    public com.bilibili.pegasus.vm.n k;
    public kotlinx.coroutines.K l;
    public ME0.f m;
    public final kotlinx.coroutines.flow.A n;
    public final kotlinx.coroutines.flow.d<NE0.a> o;
    public final com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2 p;
    public final kotlinx.coroutines.flow.d<NE0.b> q;
    public final kotlinx.coroutines.flow.d<java.lang.Boolean> r;
    public final kotlinx.coroutines.flow.d<java.lang.Boolean> s;
    public final kotlinx.coroutines.flow.d<java.lang.Boolean> t;
    public final kotlinx.coroutines.flow.A u;
    public final kotlinx.coroutines.flow.A v;
    public final kotlinx.coroutines.flow.A w;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2] */
    public PegasusViewModel(com.bilibili.pegasus.request.g gVar, com.bilibili.pegasus.components.InterfaceC0578j interfaceC0578j) {
        this.b = gVar;
        this.c = kotlin.collections.x.G0(kotlin.collections.x.G0(kotlin.collections.x.G0(super.L(), new com.bilibili.pegasus.components.customreporter.a()), new com.bilibili.pegasus.components.customreporter.d(this)), interfaceC0578j.a(gVar, new CD.f(this, 16)));
        final kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA = kotlinx.coroutines.flow.J.a(new NE0.c(0));
        this.d = stateFlowImplA;
        this.e = new com.bilibili.pegasus.vm.r();
        kotlinx.coroutines.flow.D dB = kotlinx.coroutines.flow.E.b(0, 1, (kotlinx.coroutines.channels.BufferOverflow) null, 4);
        this.f = dB;
        this.g = kotlinx.coroutines.flow.f.a(dB);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA2 = kotlinx.coroutines.flow.J.a((java.lang.Object) null);
        this.h = stateFlowImplA2;
        this.i = kotlinx.coroutines.flow.f.b(stateFlowImplA2);
        this.j = new ME0.f(false, null, 0, 0, 2047);
        this.n = kotlinx.coroutines.flow.f.b(stateFlowImplA);
        final kotlinx.coroutines.flow.d<NE0.a> dVarQ = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<NE0.a>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        NE0.a aVar = ((NE0.c) obj).a;
                        anonymousClass1.label = 1;
                        if (this.b.emit(aVar, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        });
        this.o = dVarQ;
        this.p = new kotlinx.coroutines.flow.d<java.util.List<? extends com.bilibili.pegasus.PegasusHolderData>>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        java.util.List<com.bilibili.pegasus.PegasusHolderData> list = ((NE0.a) obj).a;
                        anonymousClass1.label = 1;
                        if (this.b.emit(list, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = dVarQ.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        };
        this.q = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<NE0.b>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        NE0.b bVar2 = ((NE0.c) obj).c;
                        anonymousClass1.label = 1;
                        if (this.b.emit(bVar2, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        });
        this.r = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<java.lang.Boolean>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        java.util.List<com.bilibili.pegasus.PegasusHolderData> list = ((NE0.a) obj).a;
                        boolean z = false;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (com.bilibili.pegasus.PegasusHolderData pegasusHolderData : list) {
                                if ((pegasusHolderData instanceof FE0.a) && ((FE0.a) pegasusHolderData).p() == 1) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                        anonymousClass1.label = 1;
                        if (this.b.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = dVarQ.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        });
        this.s = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<java.lang.Boolean>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((NE0.c) obj).b);
                        anonymousClass1.label = 1;
                        if (this.b.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        });
        this.t = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<java.lang.Boolean>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((NE0.c) obj).c());
                        anonymousClass1.label = 1;
                        if (this.b.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        });
        kotlinx.coroutines.flow.d dVarQ2 = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<EE0.a>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        EE0.a aVar = ((NE0.c) obj).d;
                        EE0.a aVarA = aVar != null ? EE0.a.a(aVar, null) : null;
                        anonymousClass1.label = 1;
                        if (this.b.emit(aVarA, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        });
        v2.a aVarA = androidx.lifecycle.b0.a(this);
        di1.n0 n0Var = kotlinx.coroutines.flow.H.a.a;
        this.u = kotlinx.coroutines.flow.f.M(dVarQ2, aVarA, n0Var, (java.lang.Object) null);
        this.v = kotlinx.coroutines.flow.f.M(new kotlinx.coroutines.flow.d<com.bilibili.pegasus.data.ToastConfig>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        EE0.a aVar = ((NE0.c) obj).d;
                        com.bilibili.pegasus.data.ToastConfig toastConfigK = aVar != null ? aVar.K() : null;
                        anonymousClass1.label = 1;
                        if (this.b.emit(toastConfigK, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        }, androidx.lifecycle.b0.a(this), n0Var, (java.lang.Object) null);
        this.w = kotlinx.coroutines.flow.f.M(kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<com.bilibili.pegasus.data.interestchoose.InterestChoose>() { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2, reason: invalid class name */
            /* JADX INFO: compiled from: BL */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                public final /* synthetic */ kotlinx.coroutines.flow.e b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: BL */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2", f = "PegasusViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(dy1.b bVar) {
                        super(bVar);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                    com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (bVar instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1) bVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1(bVar);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        kotlin.c.a(obj2);
                        com.bilibili.pegasus.data.interestchoose.InterestChoose interestChoose = ((NE0.c) obj).f;
                        anonymousClass1.label = 1;
                        if (this.b.emit(interestChoose, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.a(obj2);
                    }
                    return Zx1.o.a;
                }
            }

            public final java.lang.Object collect(kotlinx.coroutines.flow.e eVar, dy1.b bVar) {
                java.lang.Object objCollect = stateFlowImplA.collect(new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2(eVar), bVar);
                return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
            }
        }), androidx.lifecycle.b0.a(this), n0Var, (java.lang.Object) null);
        gVar.b();
    }

    public static void y0(com.bilibili.pegasus.vm.PegasusViewModel pegasusViewModel, boolean z, com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush, java.lang.String str, java.lang.String str2, LE0.e eVar, java.lang.String str3, int i, int i2, kotlin.jvm.functions.Function0 function0, int i3) {
        kotlinx.coroutines.K k;
        boolean z2 = (i3 & 1) != 0 ? pegasusViewModel.j.b : z;
        com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush2 = (i3 & 2) != 0 ? pegasusViewModel.j.c : pegasusFlush;
        java.lang.String str4 = (i3 & 4) != 0 ? pegasusViewModel.j.d : str;
        java.lang.String str5 = (i3 & 8) != 0 ? pegasusViewModel.j.e : str2;
        LE0.e eVar2 = (i3 & 16) != 0 ? pegasusViewModel.j.g : eVar;
        java.lang.String str6 = (i3 & 32) != 0 ? null : str3;
        int i4 = (i3 & 128) != 0 ? pegasusViewModel.j.k : i2;
        kotlin.jvm.functions.Function0 function1 = (i3 & 256) != 0 ? null : function0;
        ME0.f fVar = pegasusViewModel.j;
        com.bilibili.pegasus.PegasusHolderData pegasusHolderData = (com.bilibili.pegasus.PegasusHolderData) kotlin.collections.x.k0(pegasusViewModel.getState().a.a);
        long idx = pegasusHolderData != null ? pegasusHolderData.getIdx() : 0L;
        long j = ((to0.e) com.bilibili.lib.homepage.splash.SplashViewModel.l.b.getValue()).a;
        fVar.getClass();
        java.lang.String str7 = str4;
        java.lang.String str8 = str5;
        pegasusViewModel.j = new ME0.f(idx, z2, pegasusFlush2, str4, str5, j, eVar2, function1, str6, i, i4);
        Zx1.e eVar3 = com.bilibili.pegasus.common.n.c;
        boolean zBooleanValue = ((java.lang.Boolean) eVar3.getValue()).booleanValue();
        com.bilibili.pegasus.request.g gVar = pegasusViewModel.b;
        if (zBooleanValue) {
            ME0.f fVar2 = pegasusViewModel.j;
            if (fVar2.b) {
                if (fVar2.c == com.bilibili.pegasus.data.request.PegasusFlush.PULL_DOWN && (k = pegasusViewModel.l) != null && kotlin.jvm.internal.n.f(pegasusViewModel.m, fVar2)) {
                    tv.danmaku.android.log.BLog.i("[Pegasus]PegasusViewModel", "commit preloaded pull down refresh");
                    pegasusViewModel.l = null;
                    pegasusViewModel.m = null;
                    pegasusViewModel.I(pegasusViewModel, new com.bilibili.pegasus.vm.CommitPreloadedRefreshAction(pegasusViewModel.j, gVar, k));
                    pegasusViewModel.w0(str7, str8);
                    return;
                }
            }
        }
        if (((java.lang.Boolean) eVar3.getValue()).booleanValue()) {
            ME0.f fVar3 = pegasusViewModel.j;
            if (fVar3.b) {
                if (fVar3.c == com.bilibili.pegasus.data.request.PegasusFlush.PULL_DOWN) {
                    kotlinx.coroutines.K k2 = pegasusViewModel.l;
                    if (k2 != null) {
                        k2.cancel((java.util.concurrent.CancellationException) null);
                    }
                    pegasusViewModel.l = null;
                    pegasusViewModel.m = null;
                }
            }
        }
        com.bilibili.pegasus.components.N.d++;
        ME0.f fVar4 = pegasusViewModel.j;
        pegasusViewModel.I(pegasusViewModel, fVar4.b ? new com.bilibili.pegasus.vm.RefreshAction(fVar4, gVar) : new com.bilibili.pegasus.vm.LoadMoreAction(fVar4, gVar));
        pegasusViewModel.w0(str7, str8);
    }

    public final void A0(LE0.e eVar) {
        this.j = ME0.f.a(this.j, 0L, false, null, 0L, eVar, 1983);
    }

    @Override // com.bilibili.pegasus.Store
    public final java.util.List<com.bilibili.pegasus.h> L() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0544  */
    /* JADX WARN: Code duplicated, block: B:299:0x0976 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // com.bilibili.pegasus.Store
    public final java.lang.Object u(com.bilibili.pegasus.InterfaceC0514a interfaceC0514a, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1 pegasusViewModel$dispatch$1;
        com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1 pegasusViewModel$dispatch$2;
        Zx1.o oVar;
        NE0.c cVarA;
        int i;
        int i2;
        int i3;
        int i4;
        com.bilibili.pegasus.d extra;
        EE0.a aVarA;
        EE0.a aVarB;
        int i5;
        EE0.a aVarB2;
        Zx1.o oVar2;
        EE0.a aVarA2;
        EE0.a aVarB3;
        int i6;
        com.bilibili.pegasus.InterfaceC0514a interfaceC0514a2 = interfaceC0514a;
        if (continuationImpl instanceof com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1) {
            pegasusViewModel$dispatch$1 = (com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1) continuationImpl;
            int i7 = pegasusViewModel$dispatch$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                pegasusViewModel$dispatch$1.label = i7 - Integer.MIN_VALUE;
            } else {
                pegasusViewModel$dispatch$1 = new com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1(this, continuationImpl);
            }
        } else {
            pegasusViewModel$dispatch$1 = new com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1(this, continuationImpl);
        }
        java.lang.Object obj = pegasusViewModel$dispatch$1.result;
        Zx1.o oVar3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = pegasusViewModel$dispatch$1.label;
        if (i8 != 0) {
            if (i8 == 1) {
                interfaceC0514a2 = (com.bilibili.pegasus.InterfaceC0514a) pegasusViewModel$dispatch$1.L$0;
                kotlin.c.a(obj);
            } else {
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            return Zx1.o.a;
        }
        kotlin.c.a(obj);
        if (com.bilibili.pegasus.request.a.b && (((interfaceC0514a2 instanceof com.bilibili.pegasus.vm.RefreshAction) || (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.LoadMoreAction)) && (((NE0.c) this.n.b.getValue()).d != null || !((NE0.c) this.n.b.getValue()).a.a.isEmpty()))) {
            com.bilibili.pegasus.request.a.b = false;
        }
        pegasusViewModel$dispatch$1.L$0 = interfaceC0514a2;
        pegasusViewModel$dispatch$1.label = 1;
        if (com.bilibili.pegasus.Store.j0(this, interfaceC0514a2, pegasusViewModel$dispatch$1) == oVar3) {
            return oVar3;
        }
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = this.d;
        com.bilibili.pegasus.vm.r rVar = this.e;
        final NE0.c cVar = (NE0.c) stateFlowImpl.getValue();
        rVar.getClass();
        boolean z = interfaceC0514a2 instanceof ME0.c;
        NE0.a aVar = cVar.a;
        if (!z) {
            stateFlowImpl = stateFlowImpl;
            pegasusViewModel$dispatch$2 = pegasusViewModel$dispatch$1;
            oVar = oVar3;
            if (interfaceC0514a2 instanceof ME0.d) {
                ME0.d dVar = (ME0.d) interfaceC0514a2;
                ME0.b bVar = dVar.a;
                tv.danmaku.android.log.BLog.i("PegasusFeedsReducer", "RefreshCompleteAction length " + bVar.c().size());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(aVar.a);
                if (dVar.b) {
                    com.bilibili.pegasus.vm.u.b(arrayList);
                    arrayList.addAll(bVar.c());
                    NE0.a aVar2 = new NE0.a(arrayList);
                    FE0.f fVar = bVar.a;
                    com.bilibili.pegasus.data.interestchoose.InterestChoose interestChooseC = fVar != null ? fVar.c() : null;
                    EE0.a aVarB4 = bVar.b();
                    cVarA = NE0.c.a(cVar, aVar2, false, NE0.b.c.a, aVarB4 != null ? EE0.a.a(aVarB4, (com.bilibili.pegasus.vm.u.d(arrayList) || (aVarB2 = bVar.b()) == null) ? null : aVarB2.K()) : null, false, interestChooseC, 16);
                } else {
                    if (bVar.c.b) {
                        int size = arrayList.size();
                        EE0.a aVarB5 = bVar.b();
                        boolean z2 = aVarB5 != null && aVarB5.i();
                        if (z2) {
                            arrayList.clear();
                        }
                        EE0.a aVarB6 = bVar.b();
                        int iX = aVarB6 != null ? aVarB6.x() : 100;
                        if (arrayList.size() > iX) {
                            int size2 = arrayList.size();
                            if (iX > size2) {
                                iX = size2;
                            }
                            arrayList = new java.util.ArrayList(kotlin.collections.x.Q0(arrayList, sy1.o.G(0, iX)));
                        }
                        com.bilibili.pegasus.vm.u.a(arrayList);
                        kotlin.collections.u.M(arrayList, new androidx.compose.foundation.gestures.C0(3), true);
                        kotlin.collections.u.M(arrayList, new androidx.compose.foundation.text.k0(4), true);
                        int size3 = arrayList.size();
                        boolean z3 = arrayList.size() > 0;
                        if (z3) {
                            i5 = 0;
                            arrayList.add(0, di1.o0.e());
                        } else {
                            i5 = 0;
                        }
                        arrayList.addAll(i5, bVar.c());
                        com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush = bVar.c.c;
                        int size4 = bVar.c().size();
                        int size5 = arrayList.size();
                        java.util.ArrayList arrayList2 = arrayList;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("RefreshCompleteAction refresh: flush=");
                        sb.append(pegasusFlush);
                        sb.append(", clearFeeds=");
                        sb.append(z2);
                        sb.append(", originOldSize=");
                        androidx.appcompat.widget.y.c(size, size3, ", keptOldSize=", ", newRespSize=", sb);
                        J5.J.a(", insertedLegacyTip=", ", finalFeedsSize=", size4, z3, sb);
                        Ig.g.e(size5, "PegasusFeedsReducer", sb);
                        arrayList = arrayList2;
                    }
                    NE0.a aVar3 = new NE0.a(arrayList);
                    EE0.a aVarB7 = bVar.b();
                    if (aVarB7 != null) {
                        Zx1.e eVar = com.bilibili.pegasus.vm.u.a;
                        aVarA = EE0.a.a(aVarB7, (com.bilibili.pegasus.vm.u.d(bVar.c()) || (aVarB = bVar.b()) == null) ? null : aVarB.K());
                    } else {
                        aVarA = null;
                    }
                    FE0.f fVar2 = bVar.a;
                    cVarA = NE0.c.a(cVar, aVar3, false, NE0.b.c.a, aVarA, false, fVar2 != null ? fVar2.c() : null, 16);
                }
            } else if (interfaceC0514a2 instanceof ME0.a) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.addAll(aVar.a);
                final boolean zB = com.bilibili.pegasus.vm.u.b(arrayList3);
                final int iIntValue = ((java.lang.Number) com.bilibili.pegasus.vm.u.a.getValue()).intValue() - aVar.a.size();
                ME0.b bVar2 = ((ME0.a) interfaceC0514a2).a;
                if (iIntValue <= 0) {
                    NE0.a aVar4 = new NE0.a(14, (java.util.List) aVar.a, (kotlin.jvm.functions.Function1) null, false);
                    EE0.a aVarB8 = bVar2.b();
                    FE0.f fVar3 = bVar2.a;
                    cVarA = NE0.c.a(cVar, aVar4, false, NE0.b.c.a, aVarB8, false, fVar3 != null ? fVar3.c() : null, 2);
                } else {
                    if (iIntValue < bVar2.c().size()) {
                        arrayList3.addAll(kotlin.collections.x.X0(bVar2.c(), iIntValue));
                        arrayList3.add(new GE0.q("footer_empty", null, null, null, null, null, 0L, null, 0L, null, new com.bilibili.pegasus.HolderStyle(true, false, false, false, 8, null), 201326589));
                    } else {
                        arrayList3.addAll(bVar2.c());
                        iIntValue = bVar2.c().size();
                    }
                    NE0.a aVar5 = new NE0.a(10, (java.util.List) arrayList3, new kotlin.jvm.functions.Function1() { // from class: com.bilibili.pegasus.vm.p
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            androidx.recyclerview.widget.RecyclerView.Adapter adapter = (androidx.recyclerview.widget.RecyclerView.Adapter) obj2;
                            boolean z4 = zB;
                            NE0.c cVar2 = cVar;
                            if (z4) {
                                adapter.notifyItemRemoved(kntr.app.article.publish.ui.F.s(cVar2.a.a));
                            }
                            int i9 = iIntValue;
                            if (i9 > 0) {
                                adapter.notifyItemRangeInserted(kntr.app.article.publish.ui.F.s(cVar2.a.a), i9);
                            }
                            return Zx1.o.a;
                        }
                    }, false);
                    EE0.a aVarB9 = bVar2.b();
                    FE0.f fVar4 = bVar2.a;
                    cVarA = NE0.c.a(cVar, aVar5, false, NE0.b.c.a, aVarB9, false, fVar4 != null ? fVar4.c() : null, 2);
                }
            } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.i) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(aVar.a);
                arrayList4.add(new GE0.q("footer_loading", null, null, null, null, null, 0L, null, 0L, null, new com.bilibili.pegasus.HolderStyle(false, false, false, false, 8, null), 201326589));
                cVarA = NE0.c.a(cVar, new NE0.a(14, (java.util.List) arrayList4, (kotlin.jvm.functions.Function1) null, false), false, null, null, true, null, 46);
            } else {
                boolean z4 = interfaceC0514a2 instanceof com.bilibili.pegasus.vm.e;
                EE0.a aVar6 = cVar.d;
                if (z4) {
                    ME0.b bVar3 = ((com.bilibili.pegasus.vm.e) interfaceC0514a2).a;
                    NE0.b c0035b = bVar3.b != null ? new NE0.b.C0035b() : bVar3.c().isEmpty() ? new NE0.b.a() : NE0.b.c.a;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.addAll(aVar.a);
                    com.bilibili.pegasus.vm.u.b(arrayList5);
                    cVarA = NE0.c.a(cVar, new NE0.a(14, (java.util.List) arrayList5, (kotlin.jvm.functions.Function1) null, false), false, c0035b, bVar3.b() != null ? bVar3.b() : aVar6, false, null, 32);
                } else if (interfaceC0514a2 instanceof ME0.e) {
                    cVarA = NE0.c.a(cVar, null, ((ME0.e) interfaceC0514a2).b, null, null, false, null, 61);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.z) {
                    com.bilibili.pegasus.vm.z zVar = (com.bilibili.pegasus.vm.z) interfaceC0514a2;
                    final int iIndexOf = aVar.a.indexOf(zVar.a);
                    if (iIndexOf < 0) {
                        cVarA = cVar;
                    } else {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(aVar.a);
                        com.bilibili.pegasus.PegasusHolderData pegasusHolderData = zVar.b;
                        arrayList6.set(iIndexOf, pegasusHolderData);
                        if (pegasusHolderData.getExtra().i) {
                            java.util.Iterator it = arrayList6.iterator();
                            while (it.hasNext()) {
                                ((com.bilibili.pegasus.PegasusHolderData) it.next()).getExtra().i = true;
                            }
                        }
                        final int i9 = 0;
                        cVarA = NE0.c.a(cVar, new NE0.a(8, (java.util.List) arrayList6, new kotlin.jvm.functions.Function1() { // from class: com.bilibili.pegasus.vm.q
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                switch (i9) {
                                    case 0:
                                        ((androidx.recyclerview.widget.RecyclerView.Adapter) obj2).notifyItemChanged(iIndexOf);
                                        return Zx1.o.a;
                                    default:
                                        return new Zs1.j(java.lang.Integer.valueOf(iIndexOf));
                                }
                            }
                        }, true), false, null, null, false, null, 62);
                    }
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.k) {
                    cVarA = NE0.c.a(cVar, NE0.a.a(aVar, new androidx.compose.material.Z1(3, cVar, (com.bilibili.pegasus.vm.k) interfaceC0514a2), 3), false, null, null, false, null, 62);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.x) {
                    java.util.List<com.bilibili.pegasus.PegasusHolderData> list = aVar.a;
                    com.bilibili.pegasus.vm.x xVar = (com.bilibili.pegasus.vm.x) interfaceC0514a2;
                    com.bilibili.pegasus.PegasusHolderData pegasusHolderData2 = xVar.a;
                    if (list.indexOf(pegasusHolderData2) < 0) {
                        cVarA = cVar;
                    } else {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList(aVar.a);
                        arrayList7.remove(pegasusHolderData2);
                        cVarA = NE0.c.a(cVar, new NE0.a(12, arrayList7, (kotlin.jvm.functions.Function1) null, xVar.b), false, null, null, false, null, 62);
                    }
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.h) {
                    int size6 = aVar.a.size();
                    com.bilibili.pegasus.vm.h hVar = (com.bilibili.pegasus.vm.h) interfaceC0514a2;
                    int i10 = hVar.b;
                    if (i10 < 0 || i10 > size6) {
                        cVarA = cVar;
                    } else {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList(aVar.a);
                        com.bilibili.pegasus.PegasusHolderData pegasusHolderData3 = hVar.a;
                        arrayList8.add(i10, pegasusHolderData3);
                        if (pegasusHolderData3.getExtra().i) {
                            com.bilibili.pegasus.d extra2 = pegasusHolderData3.getExtra();
                            com.bilibili.pegasus.PegasusHolderData pegasusHolderData4 = (com.bilibili.pegasus.PegasusHolderData) kotlin.collections.x.l0(i10 + 1, arrayList8);
                            extra2.a = (pegasusHolderData4 == null || (extra = pegasusHolderData4.getExtra()) == null) ? 1 : extra.a;
                            int i11 = 0;
                            for (java.lang.Object obj2 : arrayList8) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    kntr.app.article.publish.ui.F.A();
                                    throw null;
                                }
                                com.bilibili.pegasus.PegasusHolderData pegasusHolderData5 = (com.bilibili.pegasus.PegasusHolderData) obj2;
                                pegasusHolderData5.getExtra().i = true;
                                if (i11 > i10) {
                                    pegasusHolderData5.getExtra().a++;
                                }
                                i11 = i12;
                            }
                        }
                        com.bilibili.pegasus.vm.h hVar2 = (com.bilibili.pegasus.vm.h) interfaceC0514a2;
                        cVarA = NE0.c.a(cVar, new NE0.a((java.util.List) arrayList8, (kotlin.jvm.functions.Function1) new IW.h(hVar2, 8), (kotlin.jvm.functions.Function1) new IW.i(hVar2, 11), true), false, null, null, false, null, 62);
                    }
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.j) {
                    int size7 = aVar.a.size();
                    com.bilibili.pegasus.vm.j jVar = (com.bilibili.pegasus.vm.j) interfaceC0514a2;
                    jVar.getClass();
                    if (size7 >= 0) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList(aVar.a);
                        arrayList9.addAll(0, jVar.a);
                        com.bilibili.pegasus.vm.j jVar2 = (com.bilibili.pegasus.vm.j) interfaceC0514a2;
                        cVarA = NE0.c.a(cVar, new NE0.a((java.util.List) arrayList9, (kotlin.jvm.functions.Function1) new Na.d(jVar2, 11), (kotlin.jvm.functions.Function1) new bb.h(jVar2, 8), true), false, null, null, false, null, 62);
                    } else {
                        cVarA = cVar;
                    }
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.v) {
                    com.bilibili.pegasus.vm.v vVar = (com.bilibili.pegasus.vm.v) interfaceC0514a2;
                    cVarA = NE0.c.a(cVar, new NE0.a(vVar.a), false, NE0.b.c.a, vVar.b, false, null, 32);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.b) {
                    cVarA = NE0.c.a(cVar, new NE0.a(14, (java.util.List) kotlin.collections.EmptyList.INSTANCE, (kotlin.jvm.functions.Function1) null, false), false, null, null, false, null, 62);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.g) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList(aVar.a);
                    int size8 = arrayList10.size();
                    if (arrayList10.isEmpty()) {
                        i3 = 0;
                    } else {
                        java.util.Iterator it2 = arrayList10.iterator();
                        i3 = 0;
                        while (it2.hasNext()) {
                            if (com.bilibili.pegasus.vm.u.c((com.bilibili.pegasus.PegasusHolderData) it2.next()) && (i3 = i3 + 1) < 0) {
                                kntr.app.article.publish.ui.F.z();
                                throw null;
                            }
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        i4 = 0;
                    } else {
                        java.util.Iterator it3 = arrayList10.iterator();
                        i4 = 0;
                        while (it3.hasNext()) {
                            if ((((com.bilibili.pegasus.PegasusHolderData) it3.next()) instanceof GE0.r) && (i4 = i4 + 1) < 0) {
                                kntr.app.article.publish.ui.F.z();
                                throw null;
                            }
                        }
                    }
                    Zx1.e eVar2 = com.bilibili.pegasus.vm.u.a;
                    kotlin.collections.u.M(arrayList10, new androidx.compose.foundation.gestures.C0(3), true);
                    kotlin.collections.u.M(arrayList10, new J0.x(6), true);
                    java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
                    com.bilibili.pegasus.vm.g gVar = (com.bilibili.pegasus.vm.g) interfaceC0514a2;
                    setNewSetFromMap.addAll(gVar.c);
                    int size9 = arrayList10.size();
                    kotlin.collections.u.M(arrayList10, new IW.c(setNewSetFromMap, 7), true);
                    int size10 = gVar.c.size();
                    int size11 = size9 - arrayList10.size();
                    int size12 = arrayList10.size() + 1;
                    java.lang.StringBuilder sbD = O0.n.d(size8, i3, "FoldRecoverAction: before=", ", legacyTipRemoved=", ", staleStripRemoved=");
                    androidx.appcompat.widget.y.c(i4, size10, ", toRemove=", ", actualRemoved=", sbD);
                    Tf.d.b(size11, size12, ", after=", "PegasusFeedsReducer", sbD);
                    arrayList10.add(gVar.b);
                    cVarA = NE0.c.a(cVar, new NE0.a(14, (java.util.List) arrayList10, (kotlin.jvm.functions.Function1) null, false), false, null, null, false, null, 62);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.f) {
                    java.util.ArrayList arrayList11 = new java.util.ArrayList(aVar.a);
                    java.util.Iterator it4 = arrayList11.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (((com.bilibili.pegasus.PegasusHolderData) it4.next()) instanceof GE0.r) {
                            i2 = i13;
                            break;
                        }
                        i13++;
                    }
                    com.bilibili.pegasus.vm.f fVar5 = (com.bilibili.pegasus.vm.f) interfaceC0514a2;
                    Ig.g.e(arrayList11.size(), "PegasusFeedsReducer", O0.n.d(i2, fVar5.b.size(), "ExpandRecoverAction: stripIndex=", ", foldedCards=", ", feedsBefore="));
                    if (i2 < 0) {
                        tv.danmaku.android.log.BLog.w("PegasusFeedsReducer", "ExpandRecoverAction: no RecoverStripItem in feeds, skip expand");
                        cVarA = cVar;
                    } else {
                        arrayList11.remove(i2);
                        arrayList11.addAll(i2, fVar5.b);
                        tv.danmaku.android.log.BLog.i("PegasusFeedsReducer", "ExpandRecoverAction: feedsAfter=" + arrayList11.size());
                        cVarA = NE0.c.a(cVar, new NE0.a(12, (java.util.List) arrayList11, (kotlin.jvm.functions.Function1) null, true), false, null, null, false, null, 62);
                    }
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.y) {
                    java.util.ArrayList arrayList12 = new java.util.ArrayList(aVar.a);
                    int size13 = aVar.a.size();
                    int iS = kntr.app.article.publish.ui.F.s(aVar.a);
                    while (true) {
                        int i14 = iS;
                        i = size13;
                        size13 = i14;
                        if (-1 >= size13 || aVar.a.get(size13).getExtra().e) {
                            break;
                        }
                        iS = size13 - 1;
                    }
                    A5.C.c(i, kntr.app.article.publish.ui.F.s(aVar.a), "lastAttachedIndex:", " lastIndex:", "PegasusFeedsReducer");
                    int iS2 = kntr.app.article.publish.ui.F.s(aVar.a);
                    if (i <= iS2) {
                        while (true) {
                            arrayList12.remove(iS2);
                            if (iS2 == i) {
                                break;
                            }
                            iS2--;
                        }
                    }
                    cVarA = NE0.c.a(cVar, new NE0.a(14, (java.util.List) arrayList12, (kotlin.jvm.functions.Function1) null, false), false, null, null, false, null, 62);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.c) {
                    cVarA = NE0.c.a(cVar, NE0.a.a(aVar, null, 1), false, null, null, false, null, 62);
                } else if (interfaceC0514a2 instanceof com.bilibili.pegasus.vm.d) {
                    cVarA = NE0.c.a(cVar, null, false, null, aVar6 != null ? EE0.a.a(aVar6, null) : null, false, null, 55);
                } else {
                    cVarA = cVar;
                }
            }
            stateFlowImpl.getClass();
            stateFlowImpl.k((java.lang.Object) null, cVarA);
            Ig.d.b("dispatch -> ", interfaceC0514a2.getClass().getSimpleName(), " = ", "[Pegasus]PegasusViewModel", this.f.d(interfaceC0514a2));
            kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl2 = this.h;
            com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1 pegasusViewModel$dispatch$3 = pegasusViewModel$dispatch$2;
            pegasusViewModel$dispatch$3.L$0 = null;
            pegasusViewModel$dispatch$3.label = 2;
            stateFlowImpl2.getClass();
            stateFlowImpl2.k((java.lang.Object) null, interfaceC0514a2);
            oVar2 = oVar;
            if (Zx1.o.a == oVar2) {
                return oVar2;
            }
            return Zx1.o.a;
        }
        ME0.b bVar4 = ((ME0.c) interfaceC0514a2).a;
        oVar = oVar3;
        pegasusViewModel$dispatch$2 = pegasusViewModel$dispatch$1;
        tv.danmaku.android.log.BLog.i("PegasusFeedsReducer", "PreLoadAction length " + bVar4.c().size());
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.addAll(aVar.a);
        if (bVar4.c.b) {
            int size14 = arrayList13.size();
            EE0.a aVarB10 = bVar4.b();
            boolean z5 = aVarB10 != null && aVarB10.i();
            if (z5) {
                arrayList13.clear();
            }
            EE0.a aVarB11 = bVar4.b();
            int iX2 = aVarB11 != null ? aVarB11.x() : 100;
            if (arrayList13.size() > iX2) {
                int size15 = arrayList13.size();
                if (iX2 > size15) {
                    iX2 = size15;
                }
                arrayList13 = new java.util.ArrayList(kotlin.collections.x.Q0(arrayList13, sy1.o.G(0, iX2)));
            }
            com.bilibili.pegasus.vm.u.a(arrayList13);
            kotlin.collections.u.M(arrayList13, new androidx.compose.foundation.gestures.C0(3), true);
            kotlin.collections.u.M(arrayList13, new Na.a(7), true);
            int size16 = arrayList13.size();
            boolean zIsEmpty = arrayList13.isEmpty();
            boolean z6 = !zIsEmpty;
            if (zIsEmpty) {
                i6 = 0;
            } else {
                i6 = 0;
                arrayList13.add(0, di1.o0.e());
            }
            arrayList13.addAll(i6, bVar4.c());
            com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush2 = bVar4.c.c;
            int size17 = bVar4.c().size();
            int size18 = arrayList13.size();
            java.util.ArrayList arrayList14 = arrayList13;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PreLoadAction refresh: flush=");
            sb2.append(pegasusFlush2);
            sb2.append(", clearFeeds=");
            sb2.append(z5);
            sb2.append(", originOldSize=");
            androidx.appcompat.widget.y.c(size14, size16, ", keptOldSize=", ", newRespSize=", sb2);
            J5.J.a(", insertedLegacyTip=", ", finalFeedsSize=", size17, z6, sb2);
            Ig.g.e(size18, "PegasusFeedsReducer", sb2);
            arrayList13 = arrayList14;
        } else {
            interfaceC0514a2 = interfaceC0514a2;
            stateFlowImpl = stateFlowImpl;
        }
        NE0.a aVar7 = new NE0.a(arrayList13);
        EE0.a aVarB12 = bVar4.b();
        if (aVarB12 != null) {
            Zx1.e eVar3 = com.bilibili.pegasus.vm.u.a;
            aVarA2 = EE0.a.a(aVarB12, (com.bilibili.pegasus.vm.u.d(bVar4.c()) || (aVarB3 = bVar4.b()) == null) ? null : aVarB3.K());
        } else {
            aVarA2 = null;
        }
        FE0.f fVar6 = bVar4.a;
        cVarA = NE0.c.a(cVar, aVar7, false, NE0.b.c.a, aVarA2, false, fVar6 != null ? fVar6.c() : null, 16);
        interfaceC0514a2 = interfaceC0514a2;
        stateFlowImpl.getClass();
        stateFlowImpl.k((java.lang.Object) null, cVarA);
        Ig.d.b("dispatch -> ", interfaceC0514a2.getClass().getSimpleName(), " = ", "[Pegasus]PegasusViewModel", this.f.d(interfaceC0514a2));
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl3 = this.h;
        com.bilibili.pegasus.vm.PegasusViewModel$dispatch$1 pegasusViewModel$dispatch$4 = pegasusViewModel$dispatch$2;
        pegasusViewModel$dispatch$4.L$0 = null;
        pegasusViewModel$dispatch$4.label = 2;
        stateFlowImpl3.getClass();
        stateFlowImpl3.k((java.lang.Object) null, interfaceC0514a2);
        oVar2 = oVar;
        if (Zx1.o.a == oVar2) {
            return oVar2;
        }
        return Zx1.o.a;
    }

    public final void w0(java.lang.String str, java.lang.String str2) {
        A0(null);
        if (str != null && !kotlin.text.u.b0(str)) {
            this.j = ME0.f.a(this.j, 0L, false, null, 0L, null, 2039);
        }
        if (str2 == null || kotlin.text.u.b0(str2)) {
            return;
        }
        this.j = ME0.f.a(this.j, 0L, false, null, 0L, null, 2031);
    }

    @Override // com.bilibili.pegasus.Store
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final NE0.c getState() {
        return (NE0.c) this.n.b.getValue();
    }

    public final void z0() {
        if (((java.lang.Boolean) com.bilibili.pegasus.common.n.c.getValue()).booleanValue() && !getState().c()) {
            kotlinx.coroutines.K k = this.l;
            if (k == null || !k.isActive()) {
                if (k != null) {
                    this.l = null;
                    this.m = null;
                }
                ME0.f fVar = this.j;
                com.bilibili.pegasus.PegasusHolderData pegasusHolderData = (com.bilibili.pegasus.PegasusHolderData) kotlin.collections.x.k0(getState().a.a);
                ME0.f fVarA = ME0.f.a(fVar, pegasusHolderData != null ? pegasusHolderData.getIdx() : 0L, true, com.bilibili.pegasus.data.request.PegasusFlush.PULL_DOWN, ((to0.e) com.bilibili.lib.homepage.splash.SplashViewModel.l.b.getValue()).a, null, 1624);
                tv.danmaku.android.log.BLog.i("[Pegasus]PegasusViewModel", "preload pull down refresh");
                this.m = fVarA;
                com.bilibili.pegasus.components.N.d++;
                this.l = kotlinx.coroutines.g.b(androidx.lifecycle.b0.a(this), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.vm.PegasusViewModel$preloadPullDownRefresh$1(fVarA, this, null), 3);
            }
        }
    }
}
