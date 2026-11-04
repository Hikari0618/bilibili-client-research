package com.bilibili.bplus.im.communication;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge2/dex/classes13.dex */
public final class CommunicationUnreadCountHelper {
    public static long a;
    public static int b;
    public static boolean c;
    public static boolean d;

    /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1", f = "CommunicationUnreadCountHelper.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1$1", f = "CommunicationUnreadCountHelper.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C00831 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.bilibili.bplus.im.business.loader.a, java.lang.Long, dy1.b<? super kotlin.Pair<? extends com.bilibili.bplus.im.business.loader.a, ? extends java.lang.Long>>, java.lang.Object> {
            /* synthetic */ long J$0;
            /* synthetic */ java.lang.Object L$0;
            int label;

            public C00831(dy1.b<? super com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.C00831> bVar) {
                super(3, bVar);
            }

            public final java.lang.Object invoke(com.bilibili.bplus.im.business.loader.a aVar, long j, dy1.b<? super kotlin.Pair<com.bilibili.bplus.im.business.loader.a, java.lang.Long>> bVar) {
                com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.C00831 c00831 = new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.C00831(bVar);
                c00831.L$0 = aVar;
                c00831.J$0 = j;
                return c00831.invokeSuspend(Zx1.o.a);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                return new kotlin.Pair((com.bilibili.bplus.im.business.loader.a) this.L$0, new java.lang.Long(this.J$0));
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return invoke((com.bilibili.bplus.im.business.loader.a) obj, ((java.lang.Number) obj2).longValue(), (dy1.b<? super kotlin.Pair<com.bilibili.bplus.im.business.loader.a, java.lang.Long>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1$2", f = "CommunicationUnreadCountHelper.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlin.Pair<? extends com.bilibili.bplus.im.business.loader.a, ? extends java.lang.Long>, java.lang.Boolean, dy1.b<? super com.bilibili.bplus.im.business.loader.a>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass2(dy1.b<? super com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.AnonymousClass2> bVar) {
                super(3, bVar);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return invoke((kotlin.Pair<com.bilibili.bplus.im.business.loader.a, java.lang.Long>) obj, ((java.lang.Boolean) obj2).booleanValue(), (dy1.b<? super com.bilibili.bplus.im.business.loader.a>) obj3);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                kotlin.Pair pair = (kotlin.Pair) this.L$0;
                boolean z = this.Z$0;
                com.bilibili.bplus.im.business.loader.a aVar = (com.bilibili.bplus.im.business.loader.a) pair.component1();
                if (!z) {
                    return aVar;
                }
                return new com.bilibili.bplus.im.business.loader.a(aVar.a, com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.None);
            }

            public final java.lang.Object invoke(kotlin.Pair<com.bilibili.bplus.im.business.loader.a, java.lang.Long> pair, boolean z, dy1.b<? super com.bilibili.bplus.im.business.loader.a> bVar) {
                com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.AnonymousClass2 anonymousClass2 = new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.AnonymousClass2(bVar);
                anonymousClass2.L$0 = pair;
                anonymousClass2.Z$0 = z;
                return anonymousClass2.invokeSuspend(Zx1.o.a);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$1$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.a<T> b = new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.a<>();

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                com.bilibili.bplus.im.business.loader.a aVar = (com.bilibili.bplus.im.business.loader.a) obj;
                if (!com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.d) {
                    com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.c = false;
                    tv.danmaku.android.log.BLog.i("im-CommunicationUnreadCountHelperV2", "total display count: " + aVar);
                    int i = com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.b;
                    com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.b(aVar);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("notifyLiveRoom: unReadNum = ");
                    int i2 = aVar.a;
                    sb.append(i2);
                    tv.danmaku.android.log.BLog.d("im-CommunicationUnreadCountHelperV2", sb.toString());
                    android.content.Intent intent = new android.content.Intent();
                    intent.setAction("liveIM");
                    intent.putExtra("unreadnum", i2);
                    z2.a.a(Lo.j.a()).c(intent);
                }
                return Zx1.o.a;
            }
        }

        public AnonymousClass1(dy1.b<? super com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.v vVar = new kotlinx.coroutines.flow.v(new kotlinx.coroutines.flow.v(com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.f, com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.j, new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.C00831(null)), com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.l, new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.AnonymousClass2(null));
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1.a.b;
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

    /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$2, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$2", f = "CommunicationUnreadCountHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        public AnonymousClass2(dy1.b<? super com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass2> bVar) {
            super(2, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(java.lang.String str, dh0.a aVar) {
            com.bilibili.bplus.im.business.loader.a aVar2;
            java.lang.Integer numValueOf = aVar != null ? java.lang.Integer.valueOf(aVar.b) : null;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                int i = aVar.a;
                int i2 = aVar.c;
                if (i > i2) {
                    i = i2;
                }
                aVar2 = new com.bilibili.bplus.im.business.loader.a(i, com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.Number);
            } else {
                aVar2 = (numValueOf != null && numValueOf.intValue() == 1) ? new com.bilibili.bplus.im.business.loader.a(1, com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.RedPoint) : com.bilibili.bplus.im.business.loader.a.c;
            }
            kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.g;
            stateFlowImpl.getClass();
            stateFlowImpl.k((java.lang.Object) null, aVar2);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass2(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
            dh0.b.a().b("action://link/home/menu", new com.bilibili.bplus.im.communication.J());
            return Zx1.o.a;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$3, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$3", f = "CommunicationUnreadCountHelper.kt", l = {102}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: BL */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$3$1", f = "CommunicationUnreadCountHelper.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.bilibili.bplus.im.business.loader.a, java.lang.Boolean, dy1.b<? super com.bilibili.bplus.im.communication.K0>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass1(dy1.b<? super com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.AnonymousClass1> bVar) {
                super(3, bVar);
            }

            public final java.lang.Object invoke(com.bilibili.bplus.im.business.loader.a aVar, boolean z, dy1.b<? super com.bilibili.bplus.im.communication.K0> bVar) {
                com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.AnonymousClass1 anonymousClass1 = new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.AnonymousClass1(bVar);
                anonymousClass1.L$0 = aVar;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Zx1.o.a);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
                return new com.bilibili.bplus.im.communication.K0(this.Z$0, (com.bilibili.bplus.im.business.loader.a) this.L$0);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return invoke((com.bilibili.bplus.im.business.loader.a) obj, ((java.lang.Boolean) obj2).booleanValue(), (dy1.b<? super com.bilibili.bplus.im.communication.K0>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$3$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public static final com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.a<T> b = new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.a<>();

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                com.bilibili.bplus.im.business.loader.a aVar = ((com.bilibili.bplus.im.communication.K0) obj).b;
                com.bilibili.bplus.im.business.loader.UnreadCountDisplayType unreadCountDisplayType = aVar.b;
                int i = unreadCountDisplayType == com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.RedPoint ? 1 : 0;
                int i2 = unreadCountDisplayType == com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.Number ? aVar.a : 0;
                if (i != 0 || i2 != 0) {
                    gr0.o.j(8, "main.homepage.msg.redpoint.show", kotlin.collections.J.v(new kotlin.Pair[]{new kotlin.Pair("redpoint", java.lang.String.valueOf(i)), new kotlin.Pair("redpoint_num", java.lang.String.valueOf(i2))}), false);
                }
                return Zx1.o.a;
            }
        }

        public AnonymousClass3(dy1.b<? super com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.v vVar = new kotlinx.coroutines.flow.v(com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.h, vo0.a.b, new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.AnonymousClass1(null));
                kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3.a.b;
                this.label = 1;
                java.lang.Object objCollect = vVar.collect(new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper$3$invokeSuspend$$inlined$filter$1$2(eVar), this);
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
        com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper communicationUnreadCountHelper = new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper();
        if (p078n70.a.a()) {
            tv.danmaku.android.log.BLog.i("im-CommunicationUnreadCountHelperV2", "BffSwitch is true, old badge will not work");
            return;
        }
        Ey1.b bVar = kotlinx.coroutines.T.a;
        kotlinx.coroutines.r0 r0Var = Cy1.r.a;
        kotlinx.coroutines.g.d(kotlinx.coroutines.F.a(r0Var), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass1(null), 3);
        kotlinx.coroutines.g.d(kotlinx.coroutines.F.a(r0Var), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass2(null), 3);
        kotlinx.coroutines.g.d(kotlinx.coroutines.F.a(r0Var), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.AnonymousClass3(null), 3);
        org.greenrobot.eventbus.EventBus.getDefault().register(communicationUnreadCountHelper);
    }

    public static void a(boolean z) {
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl;
        java.lang.Object value;
        if (!AE1.c.e()) {
            tv.danmaku.android.log.BLog.e("im-CommunicationUnreadCountHelperV2", "not login");
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
            if (!AE1.c.e()) {
                com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.e.setValue(com.bilibili.bplus.im.business.loader.a.c);
                kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl2 = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.c;
                com.bilibili.bplus.im.entity.SysNotificationUnreadCount sysNotificationUnreadCount = new com.bilibili.bplus.im.entity.SysNotificationUnreadCount(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
                stateFlowImpl2.getClass();
                stateFlowImpl2.k((java.lang.Object) null, sysNotificationUnreadCount);
            }
            b(com.bilibili.bplus.im.business.loader.a.c);
            return;
        }
        if (a != LX0.b.c()) {
            a = LX0.b.c();
            c = false;
        }
        if (z) {
            c = false;
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore2 = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.d(false);
            do {
                stateFlowImpl = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.i;
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.b(value, java.lang.Long.valueOf(((java.lang.Number) value).longValue() + 1)));
        }
        if (!c) {
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore3 = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.e();
        } else {
            tv.danmaku.android.log.BLog.e("im-CommunicationUnreadCountHelperV2", "isBetweenCleanAndNextNotify");
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore4 = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.d(true);
            b(com.bilibili.bplus.im.business.loader.a.c);
        }
    }

    public static void b(com.bilibili.bplus.im.business.loader.a aVar) {
        tv.danmaku.android.log.BLog.i("im-CommunicationUnreadCountHelperV2", "sendBadge: " + aVar);
        b = aVar.a;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new G10.b(aVar, 2));
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
    public final void onNewSingleMsgUnreadEvent(p095q70.o oVar) {
        c = false;
        com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
        com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.d(false);
        tv.danmaku.android.log.BLog.e("im-CommunicationUnreadCountHelperV2", "onNewSingleMsgUnreadEvent reqTotalUnread");
        a(false);
    }
}
