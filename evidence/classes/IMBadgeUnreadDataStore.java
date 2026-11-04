package com.bilibili.bplus.im.badge;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge/dex/classes13.dex */
public final class IMBadgeUnreadDataStore {
    public static final com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore a = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore();
    public static final com.bilibili.bplus.im.business.loader.a b;
    public static final long c;
    public static final kotlinx.coroutines.flow.D d;
    public static final kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1 e;
    public static final Cy1.d f;
    public static final kotlinx.coroutines.flow.StateFlowImpl g;
    public static final kotlinx.coroutines.flow.StateFlowImpl h;
    public static final kotlinx.coroutines.flow.StateFlowImpl i;

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$1", f = "IMBadgeUnreadDataStore.kt", l = {96}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$1$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1.a<T> b = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1.a<>();

            /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$1$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BL */
            public static final /* synthetic */ class C0081a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[com.bilibili.bplus.im.badge.BadgeEvent.values().length];
                    try {
                        iArr[com.bilibili.bplus.im.badge.BadgeEvent.Refresh.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.bilibili.bplus.im.badge.BadgeEvent.Clear.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) throws kotlin.NoWhenBranchMatchedException {
                int i = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1.a.C0081a.a[((com.bilibili.bplus.im.badge.BadgeEvent) obj).ordinal()];
                if (i == 1) {
                    java.lang.Object objA = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.a(com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.a, bVar);
                    return objA == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Zx1.o.a;
                }
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                Cy1.d dVar = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.f;
                Ey1.b bVar2 = kotlinx.coroutines.T.a;
                kotlinx.coroutines.g.d(dVar, Ey1.a.b, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$clearBadge$1(null), 2);
                return Zx1.o.a;
            }
        }

        public AnonymousClass1(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1 r4 = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.e;
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1.a.b;
                this.label = 1;
                if (r4.collect(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            return Zx1.o.a;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$2, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$2", f = "IMBadgeUnreadDataStore.kt", l = {com.bilibili.bplus.im.entity.Conversation.TYPE_GARBAGE}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$2$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass2.a<T> b = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass2.a<>();

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                dh0.a aVarA;
                com.bilibili.bplus.im.business.loader.a aVar = (com.bilibili.bplus.im.business.loader.a) obj;
                com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.h.setValue(aVar);
                dh0.b bVarA = dh0.b.a();
                if (((java.lang.Boolean) com.bilibili.bplus.im.hometab.a.a.getValue()).booleanValue()) {
                    aVarA = dh0.a.o;
                } else {
                    int i = com.bilibili.bplus.im.communication.G0.b;
                    aVarA = com.bilibili.bplus.im.communication.G0.a.a(aVar);
                }
                bVarA.d("bilibili://im/home_tab", aVarA);
                return Zx1.o.a;
            }
        }

        public AnonymousClass2(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass2> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass2(bVar);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws kotlin.KotlinNothingValueException {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.g;
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass2.a.b;
                this.label = 1;
                if (stateFlowImpl.collect(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3", f = "IMBadgeUnreadDataStore.kt", l = {com.bilibili.bplus.im.entity.DataChangeNotify.TYPE_NEW_PRAISE_RECEIVED_V2}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$2", f = "IMBadgeUnreadDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.bilibili.bplus.im.business.loader.a, java.lang.Boolean, dy1.b<? super com.bilibili.bplus.im.business.loader.a>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            int label;

            public AnonymousClass2(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.AnonymousClass2> bVar) {
                super(3, bVar);
            }

            public final java.lang.Object invoke(com.bilibili.bplus.im.business.loader.a aVar, boolean z, dy1.b<? super com.bilibili.bplus.im.business.loader.a> bVar) {
                com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.AnonymousClass2 anonymousClass2 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.AnonymousClass2(bVar);
                anonymousClass2.L$0 = aVar;
                return anonymousClass2.invokeSuspend(Zx1.o.a);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                return (com.bilibili.bplus.im.business.loader.a) this.L$0;
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return invoke((com.bilibili.bplus.im.business.loader.a) obj, ((java.lang.Boolean) obj2).booleanValue(), (dy1.b<? super com.bilibili.bplus.im.business.loader.a>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.a<T> b = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.a<>();

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.h.setValue((com.bilibili.bplus.im.business.loader.a) obj);
                return Zx1.o.a;
            }
        }

        public AnonymousClass3(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.g;
                final kotlinx.coroutines.flow.A a2 = vo0.a.b;
                kotlinx.coroutines.flow.v vVar = new kotlinx.coroutines.flow.v(stateFlowImpl, new kotlinx.coroutines.flow.d<java.lang.Boolean>() { // from class: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: BL */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                        public final /* synthetic */ kotlinx.coroutines.flow.e b;

                        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BL */
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1$2", f = "IMBadgeUnreadDataStore.kt", l = {com.bilibili.bplus.im.entity.ChatMessage.STATUS_INVALID}, m = "emit", v = 1)
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object L$0;
                            java.lang.Object L$1;
                            int label;
                            /* synthetic */ java.lang.Object result;

                            public AnonymousClass1(dy1.b bVar) {
                                super(bVar);
                            }

                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                            this.b = eVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                            com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            if (bVar instanceof com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) bVar;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(bVar);
                                }
                            } else {
                                anonymousClass1 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(bVar);
                            }
                            java.lang.Object obj2 = anonymousClass1.result;
                            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                kotlin.c.a(obj2);
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
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
                        java.lang.Object objCollect = a2.collect(new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$3$invokeSuspend$$inlined$filter$1.AnonymousClass2(eVar), bVar);
                        return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
                    }
                }, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.AnonymousClass2(null));
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3.a.b;
                this.label = 1;
                if (vVar.collect(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            return Zx1.o.a;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$4, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$4", f = "IMBadgeUnreadDataStore.kt", l = {120}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$4$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass4.a<T> b = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass4.a<>();

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore iMBadgeUnreadDataStore = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.a;
                dh0.b bVarA = dh0.b.a();
                int i = com.bilibili.bplus.im.communication.G0.b;
                bVarA.d("action://link/home/menu", com.bilibili.bplus.im.communication.G0.a.a((com.bilibili.bplus.im.business.loader.a) obj));
                return Zx1.o.a;
            }
        }

        public AnonymousClass4(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass4> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass4(bVar);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws kotlin.KotlinNothingValueException {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.h;
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass4.a.b;
                this.label = 1;
                if (stateFlowImpl.collect(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$5, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$5", f = "IMBadgeUnreadDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        public AnonymousClass5(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass5> bVar) {
            super(2, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(java.lang.String str, dh0.a aVar) {
            com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.h.setValue(com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.b(aVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(java.lang.String str, dh0.a aVar) {
            com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.i.setValue(com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.b(aVar));
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass5(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
            dh0.b.a().b("action://link/home/menu", new com.bilibili.bplus.im.badge.c());
            dh0.b.a().b("bilibili://im/home_tab", new com.bilibili.bplus.im.badge.d());
            return Zx1.o.a;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6", f = "IMBadgeUnreadDataStore.kt", l = {147}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6$1", f = "IMBadgeUnreadDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.bilibili.bplus.im.business.loader.a, dy1.b<? super Zx1.o>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            int label;

            public AnonymousClass1(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass1> bVar) {
                super(2, bVar);
            }

            public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
                com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass1 anonymousClass1 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass1(bVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final java.lang.Object invoke(com.bilibili.bplus.im.business.loader.a aVar, dy1.b<? super Zx1.o> bVar) {
                return create(aVar, bVar).invokeSuspend(Zx1.o.a);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "Redpoint show to be reported: " + ((com.bilibili.bplus.im.business.loader.a) this.L$0));
                return Zx1.o.a;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6$2, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6$2", f = "IMBadgeUnreadDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.bilibili.bplus.im.business.loader.a, java.lang.Boolean, dy1.b<? super kotlin.Pair<? extends com.bilibili.bplus.im.business.loader.a, ? extends java.lang.Boolean>>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass2(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass2> bVar) {
                super(3, bVar);
            }

            public final java.lang.Object invoke(com.bilibili.bplus.im.business.loader.a aVar, boolean z, dy1.b<? super kotlin.Pair<com.bilibili.bplus.im.business.loader.a, java.lang.Boolean>> bVar) {
                com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass2 anonymousClass2 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass2(bVar);
                anonymousClass2.L$0 = aVar;
                anonymousClass2.Z$0 = z;
                return anonymousClass2.invokeSuspend(Zx1.o.a);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                return new kotlin.Pair((com.bilibili.bplus.im.business.loader.a) this.L$0, java.lang.Boolean.valueOf(this.Z$0));
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return invoke((com.bilibili.bplus.im.business.loader.a) obj, ((java.lang.Boolean) obj2).booleanValue(), (dy1.b<? super kotlin.Pair<com.bilibili.bplus.im.business.loader.a, java.lang.Boolean>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.a<T> b = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.a<>();

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                com.bilibili.bplus.im.business.loader.a aVar = (com.bilibili.bplus.im.business.loader.a) ((kotlin.Pair) obj).component1();
                gr0.o.j(8, "main.homepage.msg.redpoint.show", kotlin.collections.J.v(new kotlin.Pair[]{new kotlin.Pair("redpoint", aVar.b == com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.RedPoint ? com.bilibili.bplus.im.entity.Conversation.MEDAL_OLD : "0"), new kotlin.Pair("redpoint_num", aVar.b == com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.Number ? java.lang.String.valueOf(aVar.a) : "0")}), false);
                return Zx1.o.a;
            }
        }

        public AnonymousClass6(dy1.b<? super com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.v vVar = new kotlinx.coroutines.flow.v(new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1(new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass1(null), com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.h), vo0.a.b, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.AnonymousClass2(null));
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6.a.b;
                this.label = 1;
                java.lang.Object objCollect = vVar.collect(new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$6$invokeSuspend$$inlined$filter$1$2(eVar), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = Zx1.o.a;
                }
                if (objCollect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            return Zx1.o.a;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    static {
        java.lang.Integer numR;
        com.bilibili.bplus.im.business.loader.a aVar = new com.bilibili.bplus.im.business.loader.a((com.bilibili.bplus.im.business.loader.UnreadCountDisplayType) null, 3);
        b = aVar;
        com.bilibili.lib.dd.DeviceDecision deviceDecision = com.bilibili.lib.dd.DeviceDecision.INSTANCE;
        boolean z = deviceDecision.getBoolean("im.socket_login_request_switch", true);
        SK0.v0.b("Frequency control enabled: ", "IMBadgeUnreadDataStore", z);
        kotlin.time.a.a aVar2 = kotlin.time.a.c;
        java.lang.String strDd = deviceDecision.dd("im.socket_login_request_threshold_duration_seconds", "5");
        c = kotlin.time.b.h((strDd == null || (numR = kotlin.text.p.r(10, strDd)) == null) ? 5 : numR.intValue(), kotlin.time.DurationUnit.SECONDS);
        kotlinx.coroutines.flow.B bA = kotlinx.coroutines.flow.E.a(0, 1, kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST);
        d = bA;
        if (z) {
            bA = new kotlinx.coroutines.flow.B(new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$special$$inlined$transform$1(kotlinx.coroutines.flow.f.m(bA), null));
        }
        e = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1(new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$filteredRefreshEvent$2(null), bA);
        Ey1.b bVar = kotlinx.coroutines.T.a;
        Cy1.d dVarA = Oe.a.a(Cy1.r.a);
        f = dVarA;
        g = kotlinx.coroutines.flow.J.a(aVar);
        h = kotlinx.coroutines.flow.J.a(aVar);
        i = kotlinx.coroutines.flow.J.a(aVar);
        if (!Lo.j.g()) {
            tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "IMBadgeUnreadDataStore is not in main process, will not work");
            return;
        }
        if (!p078n70.a.a()) {
            tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "BffSwitch is false, new badge will not work");
            return;
        }
        kotlinx.coroutines.g.d(dVarA, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass1(null), 3);
        kotlinx.coroutines.g.d(dVarA, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass2(null), 3);
        kotlinx.coroutines.g.d(dVarA, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass3(null), 3);
        kotlinx.coroutines.g.d(dVarA, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass4(null), 3);
        kotlinx.coroutines.g.d(dVarA, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass5(null), 3);
        kotlinx.coroutines.g.d(dVarA, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.AnonymousClass6(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00b0, please report this as an issue */
    public static final java.lang.Object a(com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore iMBadgeUnreadDataStore, dy1.b bVar) {
        com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$1 iMBadgeUnreadDataStore$refreshBadge$1;
        java.lang.Object objB;
        java.lang.Throwable th;
        iMBadgeUnreadDataStore.getClass();
        if (bVar instanceof com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$1) {
            iMBadgeUnreadDataStore$refreshBadge$1 = (com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$1) bVar;
            int i2 = iMBadgeUnreadDataStore$refreshBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iMBadgeUnreadDataStore$refreshBadge$1.label = i2 - Integer.MIN_VALUE;
            } else {
                iMBadgeUnreadDataStore$refreshBadge$1 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$1(iMBadgeUnreadDataStore, bVar);
            }
        } else {
            iMBadgeUnreadDataStore$refreshBadge$1 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$1(iMBadgeUnreadDataStore, bVar);
        }
        java.lang.Object totalUnread = iMBadgeUnreadDataStore$refreshBadge$1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = iMBadgeUnreadDataStore$refreshBadge$1.label;
        try {
            if (i3 == 0) {
                kotlin.c.a(totalUnread);
                if (com.bilibili.app.comm.restrict.i.g()) {
                    tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "Restricted mode, no request needed");
                    return Zx1.o.a;
                }
                if (!aA0.l.d()) {
                    tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "Not login, no request needed");
                    return Zx1.o.a;
                }
                if (com.bilibili.lib.performance.i.d()) {
                    Ey1.b bVar2 = kotlinx.coroutines.T.a;
                    Ey1.a aVar = Ey1.a.b;
                    com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$2 iMBadgeUnreadDataStore$refreshBadge$2 = new com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore$refreshBadge$2(null);
                    iMBadgeUnreadDataStore$refreshBadge$1.label = 1;
                    if (kotlinx.coroutines.g.g(aVar, iMBadgeUnreadDataStore$refreshBadge$2, iMBadgeUnreadDataStore$refreshBadge$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    com.bapis.bilibili.app.im.v1.KimMoss kimMoss = new com.bapis.bilibili.app.im.v1.KimMoss((kr1.e) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.bapis.bilibili.app.im.v1.c1 c1Var = new com.bapis.bilibili.app.im.v1.c1();
                    iMBadgeUnreadDataStore$refreshBadge$1.label = 2;
                    totalUnread = kimMoss.getTotalUnread(c1Var, iMBadgeUnreadDataStore$refreshBadge$1);
                    if (totalUnread == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objB = kotlin.Result.constructor-impl((com.bapis.bilibili.app.im.v1.b1) totalUnread);
                    th = kotlin.Result.exceptionOrNull-impl(objB);
                    if (th != null) {
                        kotlinx.coroutines.m0.g(iMBadgeUnreadDataStore$refreshBadge$1.getContext());
                        tv.danmaku.android.log.BLog.e("IMBadgeUnreadDataStore", "Fail to refresh im unread badge", th);
                    }
                    if (kotlin.Result.isSuccess-impl(objB)) {
                        com.bapis.bilibili.app.im.v1.b1 b1Var = (com.bapis.bilibili.app.im.v1.b1) objB;
                        tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "Updating badge: " + b1Var);
                        com.bilibili.bplus.im.business.loader.a aVarC = c(b1Var.getTotal());
                        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = g;
                        stateFlowImpl.getClass();
                        stateFlowImpl.k((java.lang.Object) null, aVarC);
                    }
                }
            } else if (i3 == 1) {
                kotlin.c.a(totalUnread);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(totalUnread);
                objB = kotlin.Result.constructor-impl((com.bapis.bilibili.app.im.v1.b1) totalUnread);
                th = kotlin.Result.exceptionOrNull-impl(objB);
                if (th != null) {
                    kotlinx.coroutines.m0.g(iMBadgeUnreadDataStore$refreshBadge$1.getContext());
                    tv.danmaku.android.log.BLog.e("IMBadgeUnreadDataStore", "Fail to refresh im unread badge", th);
                }
                if (kotlin.Result.isSuccess-impl(objB)) {
                    com.bapis.bilibili.app.im.v1.b1 b1Var2 = (com.bapis.bilibili.app.im.v1.b1) objB;
                    tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "Updating badge: " + b1Var2);
                    com.bilibili.bplus.im.business.loader.a aVarC2 = c(b1Var2.getTotal());
                    kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl2 = g;
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.k((java.lang.Object) null, aVarC2);
                }
            }
        } catch (java.lang.Throwable th2) {
            objB = S1.e.b(th2);
        }
        return Zx1.o.a;
    }

    public static final com.bilibili.bplus.im.business.loader.a b(dh0.a aVar) {
        com.bilibili.bplus.im.business.loader.a aVar2;
        if (aVar == null) {
            return com.bilibili.bplus.im.business.loader.a.c;
        }
        int i2 = aVar.b;
        if (i2 == 2 && aVar.a > 0) {
            int i3 = aVar.a;
            int i4 = aVar.c;
            if (i3 > i4) {
                i3 = i4;
            }
            aVar2 = new com.bilibili.bplus.im.business.loader.a(i3, com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.Number);
        } else {
            if (i2 != 1) {
                return com.bilibili.bplus.im.business.loader.a.c;
            }
            aVar2 = new com.bilibili.bplus.im.business.loader.a(1, com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.RedPoint);
        }
        return aVar2;
    }

    public static com.bilibili.bplus.im.business.loader.a c(com.bapis.bilibili.app.im.v1.e3 e3Var) {
        com.bilibili.bplus.im.business.loader.UnreadCountDisplayType unreadCountDisplayType;
        if (e3Var == null) {
            return new com.bilibili.bplus.im.business.loader.a((com.bilibili.bplus.im.business.loader.UnreadCountDisplayType) null, 3);
        }
        com.bapis.bilibili.app.im.v1.KUnreadStyle style = e3Var.getStyle();
        if (kotlin.jvm.internal.n.f(style, com.bapis.bilibili.app.im.v1.KUnreadStyle.UNREAD_STYLE_DOT.INSTANCE)) {
            unreadCountDisplayType = com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.RedPoint;
        } else {
            unreadCountDisplayType = kotlin.jvm.internal.n.f(style, com.bapis.bilibili.app.im.v1.KUnreadStyle.UNREAD_STYLE_NUMBER.INSTANCE) ? com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.Number : com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.None;
        }
        return new com.bilibili.bplus.im.business.loader.a((int) e3Var.getNumber(), unreadCountDisplayType);
    }
}
