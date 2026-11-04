package com.bilibili.bplus.im.business.client.manager;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge2/dex/classes13.dex */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore$totalUnreadCount$1", f = "UnreadCountDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
public final class UnreadCountDataStore$totalUnreadCount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.bilibili.bplus.im.business.loader.a, dy1.b<? super Zx1.o>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;

    public UnreadCountDataStore$totalUnreadCount$1(dy1.b<? super com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore$totalUnreadCount$1> bVar) {
        super(2, bVar);
    }

    public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
        com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore$totalUnreadCount$1 unreadCountDataStore$totalUnreadCount$1 = new com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore$totalUnreadCount$1(bVar);
        unreadCountDataStore$totalUnreadCount$1.L$0 = obj;
        return unreadCountDataStore$totalUnreadCount$1;
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
        tv.danmaku.android.log.BLog.i("im-NotificationManager", "totalUnreadCount: " + ((com.bilibili.bplus.im.business.loader.a) this.L$0));
        return Zx1.o.a;
    }
}
