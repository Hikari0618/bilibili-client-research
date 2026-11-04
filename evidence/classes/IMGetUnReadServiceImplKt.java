package com.bilibili.bplus.im.communication;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge/dex/classes13.dex */
public final class IMGetUnReadServiceImplKt {

    /* JADX INFO: compiled from: BL */
    public static final class a<T> implements kotlinx.coroutines.flow.e {
        public static final com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.a<T> b = new com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.a<>();

        public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
            int i = ((com.bilibili.bplus.im.business.loader.a) obj).a;
            tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "syncImBadgeToLive: " + i);
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("liveIM");
            intent.putExtra("unreadnum", i);
            z2.a.a(Zn0.e.a()).c(intent);
            return Zx1.o.a;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt$syncImBadgeToLive$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt", f = "IMGetUnReadServiceImpl.kt", l = {44}, m = "syncImBadgeToLive", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(dy1.b<? super com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.AnonymousClass1> bVar) {
            super(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.syncImBadgeToLive(this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @com.bilibili.lib.gripper.api.PreTrigger(trigger = "IM-Ready")
    @com.bilibili.lib.gripper.api.RestrictedProcesses({"main"})
    @com.bilibili.lib.gripper.api.Producer(id = "IM-Live-Badge-Sync", singleton = true)
    public static final java.lang.Object syncImBadgeToLive(dy1.b<? super Zx1.o> bVar) throws kotlin.KotlinNothingValueException {
        com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.AnonymousClass1 anonymousClass1;
        if (bVar instanceof com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.AnonymousClass1) {
            anonymousClass1 = (com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.AnonymousClass1) bVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.AnonymousClass1(bVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.c.a(obj);
            tv.danmaku.android.log.BLog.i("IMBadgeUnreadDataStore", "syncImBadgeToLive");
            kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = com.bilibili.bplus.im.badge.IMBadgeUnreadDataStore.h;
            kotlinx.coroutines.flow.e eVar = com.bilibili.bplus.im.communication.IMGetUnReadServiceImplKt.a.b;
            anonymousClass1.label = 1;
            if (stateFlowImpl.collect(eVar, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }
}
