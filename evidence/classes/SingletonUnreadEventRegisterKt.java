package com.bilibili.bplus.im.badge;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge/dex/classes13.dex */
public final class SingletonUnreadEventRegisterKt {

    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$provideAppForegroundEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$provideAppForegroundEvent$1", f = "SingletonUnreadEventRegister.kt", l = {68}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.p<? super Zx1.o>, dy1.b<? super Zx1.o>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$provideAppForegroundEvent$1$a */
        /* JADX INFO: compiled from: BL */
        public static final class a extends Lo.j.c {
            public final /* synthetic */ kotlinx.coroutines.channels.p<Zx1.o> b;

            public a(kotlinx.coroutines.channels.p<? super Zx1.o> pVar) {
                this.b = pVar;
            }

            public final void j() {
                this.b.o(Zx1.o.a);
            }
        }

        public AnonymousClass1(dy1.b<? super com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1> bVar) {
            super(2, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Zx1.o invokeSuspend$lambda$0(com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1.a aVar) {
            Lo.j.l(aVar);
            return Zx1.o.a;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1 anonymousClass1 = new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1(bVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.channels.p pVar = (kotlinx.coroutines.channels.p) this.L$0;
                final com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1.a aVar = new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1.a(pVar);
                Lo.j.j(aVar);
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.bilibili.bplus.im.badge.k
                    public final java.lang.Object invoke() {
                        return com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1.invokeSuspend$lambda$0(aVar);
                    }
                };
                this.label = 1;
                if (kotlinx.coroutines.channels.ProduceKt.a(pVar, function0, this) == coroutineSingletons) {
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

        public final java.lang.Object invoke(kotlinx.coroutines.channels.p<? super Zx1.o> pVar, dy1.b<? super Zx1.o> bVar) {
            return create(pVar, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    @com.bilibili.lib.gripper.api.Producer
    public static final kotlinx.coroutines.flow.d<Zx1.o> provideAppForegroundEvent() {
        return kotlinx.coroutines.flow.f.e(new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt.AnonymousClass1(null));
    }

    @com.bilibili.lib.gripper.api.PreTrigger(trigger = "OnPrivacyAllowed")
    @com.bilibili.lib.gripper.api.RestrictedProcesses({"main"})
    @com.bilibili.lib.gripper.api.Producer(id = "IM-Badge-Account", singleton = true)
    public static final void registerAccountNotifier(com.bilibili.bplus.im.badge.a aVar, final kntr.base.account.KAccountStore kAccountStore) {
        aVar.a("account", new com.bilibili.bplus.im.badge.b() { // from class: com.bilibili.bplus.im.badge.h
            @Override // com.bilibili.bplus.im.badge.b
            public final kotlinx.coroutines.flow.d a() {
                final kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1 r2 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1(new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$eventFlow$1$1(null), kAccountStore.c);
                return new kotlinx.coroutines.flow.d<com.bilibili.bplus.im.badge.BadgeEvent>() { // from class: com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1

                    /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: BL */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.e {
                        public final /* synthetic */ kotlinx.coroutines.flow.e b;

                        /* JADX INFO: renamed from: com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BL */
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1$2", f = "SingletonUnreadEventRegister.kt", l = {com.bilibili.bplus.im.entity.ChatMessage.STATUS_INVALID}, m = "emit", v = 1)
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
                                return com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.e eVar) {
                            this.b = eVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                            com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            if (bVar instanceof com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) bVar;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1(bVar);
                                }
                            } else {
                                anonymousClass1 = new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1(bVar);
                            }
                            java.lang.Object obj2 = anonymousClass1.result;
                            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                kotlin.c.a(obj2);
                                com.bilibili.bplus.im.badge.BadgeEvent badgeEvent = ((kntr.base.account.d) obj) instanceof kntr.base.account.d.b ? com.bilibili.bplus.im.badge.BadgeEvent.Refresh : com.bilibili.bplus.im.badge.BadgeEvent.Clear;
                                anonymousClass1.label = 1;
                                if (this.b.emit(badgeEvent, anonymousClass1) == coroutineSingletons) {
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
                        java.lang.Object objCollect = r2.collect(new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerAccountNotifier$lambda$0$$inlined$map$1.AnonymousClass2(eVar), bVar);
                        return objCollect == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Zx1.o.a;
                    }
                };
            }
        });
    }

    @com.bilibili.lib.gripper.api.PreTrigger(trigger = "OnPrivacyAllowed")
    @com.bilibili.lib.gripper.api.RestrictedProcesses({"main"})
    @com.bilibili.lib.gripper.api.Producer(id = "IM-Badge-Broadcast")
    public static final void registerBroadcastNotifier(com.bilibili.bplus.im.badge.a aVar, im.base.M m) {
        aVar.a("broadcast", new com.bilibili.bplus.im.badge.i(m));
    }

    @com.bilibili.lib.gripper.api.PreTrigger(trigger = "OnPrivacyAllowed")
    @com.bilibili.lib.gripper.api.RestrictedProcesses({"main"})
    @com.bilibili.lib.gripper.api.Producer(id = "IM-Badge-AppStart")
    public static final void registerForegroundNotifier(com.bilibili.bplus.im.badge.a aVar, kotlinx.coroutines.flow.d<Zx1.o> dVar) {
        aVar.a("foreground", new Xm0.r(dVar, 2));
    }

    @com.bilibili.lib.gripper.api.PreTrigger(trigger = "OnPrivacyAllowed")
    @com.bilibili.lib.gripper.api.RestrictedProcesses({"main"})
    @com.bilibili.lib.gripper.api.Producer(id = "IM-Badge-RestrictedMode")
    public static final void registerRestrictedModeNotifier(com.bilibili.bplus.im.badge.a aVar, com.bilibili.app.comm.restrict.k kVar, com.bilibili.app.comm.restrict.k kVar2) {
        aVar.a("restricted-mode", new com.bilibili.bplus.im.badge.j(new kotlinx.coroutines.flow.B(new com.bilibili.bplus.im.badge.SingletonUnreadEventRegisterKt$registerRestrictedModeNotifier$flow$1(kVar, kVar2, null))));
    }
}
