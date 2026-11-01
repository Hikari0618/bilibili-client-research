package com.bilibili.ship.theseus.united.player.history;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes16.dex */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2", f = "TheseusHistoryService.kt", l = {85}, m = "invokeSuspend", v = 1)
final class TheseusHistoryService$runReport$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super kotlinx.coroutines.Job>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$1", f = "TheseusHistoryService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, dy1.b<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass1(dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass1> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass1 anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass1(bVar);
            anonymousClass1.Z$0 = ((java.lang.Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return invoke(((java.lang.Boolean) obj).booleanValue(), (dy1.b<? super java.lang.Boolean>) obj2);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
            return java.lang.Boolean.valueOf(this.Z$0);
        }

        public final java.lang.Object invoke(boolean z, dy1.b<? super java.lang.Boolean> bVar) {
            return create(java.lang.Boolean.valueOf(z), bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2", f = "TheseusHistoryService.kt", l = {92}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        final /* synthetic */ long $backgroundReportInterval;
        int label;
        final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$2", f = "TheseusHistoryService.kt", l = {95}, m = "invokeSuspend", v = 1)
        public static final class C08162 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, dy1.b<? super Zx1.o>, java.lang.Object> {
            final /* synthetic */ long $backgroundReportInterval;
            long J$0;
            java.lang.Object L$0;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08162(long j, com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C08162> bVar2) {
                super(2, bVar2);
                this.$backgroundReportInterval = j;
                this.this$0 = bVar;
            }

            public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C08162 c08162 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C08162(this.$backgroundReportInterval, this.this$0, bVar);
                c08162.Z$0 = ((java.lang.Boolean) obj).booleanValue();
                return c08162;
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return invoke(((java.lang.Boolean) obj).booleanValue(), (dy1.b<? super Zx1.o>) obj2);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0036 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:16:0x0037). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0036
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r6.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    long r3 = r6.J$0
                    java.lang.Object r1 = r6.L$0
                    com.bilibili.ship.theseus.united.player.history.b r1 = (com.bilibili.ship.theseus.united.player.history.b) r1
                    kotlin.c.a(r7)
                    goto L37
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    kotlin.c.a(r7)
                    boolean r7 = r6.Z$0
                    if (r7 != 0) goto L25
                    Zx1.o r7 = Zx1.o.a
                    return r7
                L25:
                    long r3 = r6.$backgroundReportInterval
                    com.bilibili.ship.theseus.united.player.history.b r7 = r6.this$0
                    r1 = r7
                L2a:
                    r6.L$0 = r1
                    r6.J$0 = r3
                    r6.label = r2
                    java.lang.Object r7 = kotlinx.coroutines.M.b(r3, r6)
                    if (r7 != r0) goto L37
                    return r0
                L37:
                    java.lang.String r7 = "TheseusHistoryService"
                    java.lang.String r5 = "Interval when playing in background."
                    tv.danmaku.android.log.BLog.i(r7, r5)
                    com.bilibili.ship.theseus.united.player.history.b.b(r1)
                    goto L2a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C08162.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final java.lang.Object invoke(boolean z, dy1.b<? super Zx1.o> bVar) {
                return create(java.lang.Boolean.valueOf(z), bVar).invokeSuspend(Zx1.o.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.bilibili.ship.theseus.united.player.history.b bVar, long j, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2> bVar2) {
            super(2, bVar2);
            this.this$0 = bVar;
            this.$backgroundReportInterval = j;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2(this.this$0, this.$backgroundReportInterval, bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                final kotlinx.coroutines.flow.I currentStateFlow = this.this$0.b.getCurrentStateFlow();
                kotlinx.coroutines.flow.d dVarQ = kotlinx.coroutines.flow.f.q(new kotlinx.coroutines.flow.d<java.lang.Boolean>() { // from class: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: BL */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                        public final /* synthetic */ kotlinx.coroutines.flow.e b;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BL */
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2", f = "TheseusHistoryService.kt", l = {50}, m = "emit", v = 1)
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
                                return com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                            this.b = eVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                            com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            if (bVar instanceof com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) bVar;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(bVar);
                                }
                            } else {
                                anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(bVar);
                            }
                            java.lang.Object obj2 = anonymousClass1.result;
                            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                kotlin.c.a(obj2);
                                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((androidx.lifecycle.Lifecycle.State) obj).compareTo(androidx.lifecycle.Lifecycle.State.RESUMED) < 0);
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
                        java.lang.Object objCollect = currentStateFlow.collect(new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2(eVar), bVar);
                        return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
                    }
                });
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C08162 c08162 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C08162(this.$backgroundReportInterval, this.this$0, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.f.i(dVarQ, c08162, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3", f = "TheseusHistoryService.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;
        final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b b;

            public AnonymousClass1(com.bilibili.ship.theseus.united.player.history.b bVar) {
                this.b = bVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object emit(androidx.lifecycle.Lifecycle.Event event, dy1.b<? super Zx1.o> bVar) throws kotlin.NoWhenBranchMatchedException {
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1 theseusHistoryService$runReport$2$3$1$emit$1;
                if (bVar instanceof com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1) {
                    theseusHistoryService$runReport$2$3$1$emit$1 = (com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1) bVar;
                    int i = theseusHistoryService$runReport$2$3$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        theseusHistoryService$runReport$2$3$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        theseusHistoryService$runReport$2$3$1$emit$1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1(this, bVar);
                    }
                } else {
                    theseusHistoryService$runReport$2$3$1$emit$1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1(this, bVar);
                }
                java.lang.Object obj = theseusHistoryService$runReport$2$3$1$emit$1.result;
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = theseusHistoryService$runReport$2$3$1$emit$1.label;
                if (i2 == 0) {
                    kotlin.c.a(obj);
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_PAUSE) {
                        theseusHistoryService$runReport$2$3$1$emit$1.label = 1;
                        if (Ig1.m.p(theseusHistoryService$runReport$2$3$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Zx1.o.a;
                }
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                tv.danmaku.android.log.BLog.i("TheseusHistoryService", "Lifecycle onPause.");
                this.b.a(Long.MIN_VALUE);
                return Zx1.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass3> bVar2) {
            super(2, bVar2);
            this.this$0 = bVar;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass3(this.this$0, bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.d dVarB = androidx.lifecycle.LifecycleKt.b(this.this$0.b);
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass3.AnonymousClass1 anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass3.AnonymousClass1(this.this$0);
                this.label = 1;
                if (dVarB.collect(anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$4, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$4", f = "TheseusHistoryService.kt", l = {114}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;
        final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$4$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b b;

            public a(com.bilibili.ship.theseus.united.player.history.b bVar) {
                this.b = bVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) throws kotlin.NoWhenBranchMatchedException {
                com.bilibili.player.tangram.basic.PlayerAvailability playerAvailability = (com.bilibili.player.tangram.basic.PlayerAvailability) obj;
                if (playerAvailability == com.bilibili.player.tangram.basic.PlayerAvailability.COMPLETED || playerAvailability == com.bilibili.player.tangram.basic.PlayerAvailability.FORBIDDEN) {
                    tv.danmaku.android.log.BLog.i("TheseusHistoryService", "Availability " + playerAvailability);
                    this.b.a(Long.MIN_VALUE);
                }
                return Zx1.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass4> bVar2) {
            super(2, bVar2);
            this.this$0 = bVar;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass4(this.this$0, bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.d dVarA = this.this$0.g.a();
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass4.a aVar = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass4.a(this.this$0);
                this.label = 1;
                if (dVarA.collect(aVar, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$5, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$5", f = "TheseusHistoryService.kt", l = {com.bilibili.search2.api.SearchBangumiItem.TYPE_FULLNET_TV}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;
        final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$5$1, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$5$1", f = "TheseusHistoryService.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, dy1.b<? super java.lang.Boolean>, java.lang.Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;
            final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5.AnonymousClass1> bVar2) {
                super(3, bVar2);
                this.this$0 = bVar;
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return invoke(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (dy1.b<? super java.lang.Boolean>) obj3);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) throws kotlin.NoWhenBranchMatchedException {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                if (this.this$0.f.isBackgroundRunning() && z && !z2 && this.this$0.b.getCurrentState() == androidx.lifecycle.Lifecycle.State.CREATED) {
                    this.this$0.a(4L);
                }
                return java.lang.Boolean.valueOf(z2);
            }

            public final java.lang.Object invoke(boolean z, boolean z2, dy1.b<? super java.lang.Boolean> bVar) {
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5.AnonymousClass1 anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5.AnonymousClass1(this.this$0, bVar);
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z2;
                return anonymousClass1.invokeSuspend(Zx1.o.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5> bVar2) {
            super(2, bVar2);
            this.this$0 = bVar;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5(this.this$0, bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.d dVarD = com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt.d(this.this$0.a);
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5.AnonymousClass1 anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5.AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.f.H(dVarD, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$6, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$6", f = "TheseusHistoryService.kt", l = {133}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;
        final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass6> bVar2) {
            super(2, bVar2);
            this.this$0 = bVar;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass6(this.this$0, bVar);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws kotlin.NoWhenBranchMatchedException {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.c.a(obj);
                    this.label = 1;
                    if (kotlinx.coroutines.M.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.a(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            } catch (java.lang.Throwable th) {
                tv.danmaku.android.log.BLog.i("TheseusHistoryService", "Leaving.");
                this.this$0.a(Long.MIN_VALUE);
                throw th;
            }
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusHistoryService$runReport$2(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2> bVar2) {
        super(2, bVar2);
        this.this$0 = bVar;
    }

    public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
        com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2 theseusHistoryService$runReport$2 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2(this.this$0, bVar);
        theseusHistoryService$runReport$2.L$0 = obj;
        return theseusHistoryService$runReport$2;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.c.a(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.flow.d dVarD = com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt.d(this.this$0.a);
            com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass1 anonymousClass1 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass1(null);
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (kotlinx.coroutines.flow.f.v(dVarD, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.c.a(obj);
        }
        long j = 1000;
        com.bilibili.lib.blconfig.ConfigManager.b.getClass();
        java.lang.Long lT = kotlin.text.p.t(10, com.bilibili.lib.blconfig.ConfigManager.a.d("videodetail.player_history_report_interval", "0"));
        long jLongValue = j * (lT != null ? lT.longValue() : 0L);
        if (jLongValue > 0) {
            kotlinx.coroutines.g.d(coroutineScope, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2(this.this$0, jLongValue, null), 3);
        }
        kotlinx.coroutines.g.d(coroutineScope, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass3(this.this$0, null), 3);
        kotlinx.coroutines.g.d(coroutineScope, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass4(this.this$0, null), 3);
        kotlinx.coroutines.g.d(coroutineScope, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass5(this.this$0, null), 3);
        return kotlinx.coroutines.g.d(coroutineScope, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass6(this.this$0, null), 3);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super kotlinx.coroutines.Job> bVar) {
        return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
    }
}
