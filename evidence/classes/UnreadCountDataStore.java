package com.bilibili.bplus.im.business.client.manager;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge/dex/classes13.dex */
public final class UnreadCountDataStore {
    public static final com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore a = new com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore();
    public static boolean b;
    public static final kotlinx.coroutines.flow.StateFlowImpl c;
    public static final kotlinx.coroutines.flow.A d;
    public static final kotlinx.coroutines.flow.StateFlowImpl e;
    public static final kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1 f;
    public static final kotlinx.coroutines.flow.StateFlowImpl g;
    public static final kotlinx.coroutines.flow.A h;
    public static final kotlinx.coroutines.flow.StateFlowImpl i;
    public static final kotlinx.coroutines.flow.A j;
    public static final kotlinx.coroutines.flow.StateFlowImpl k;
    public static final kotlinx.coroutines.flow.A l;

    static {
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA = kotlinx.coroutines.flow.J.a(new com.bilibili.bplus.im.entity.SysNotificationUnreadCount(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null));
        c = stateFlowImplA;
        d = kotlinx.coroutines.flow.f.b(stateFlowImplA);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA2 = kotlinx.coroutines.flow.J.a(new com.bilibili.bplus.im.business.loader.a((com.bilibili.bplus.im.business.loader.UnreadCountDisplayType) null, 3));
        e = stateFlowImplA2;
        f = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$.inlined.unsafeTransform.1(new com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore$totalUnreadCount$1(null), stateFlowImplA2);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA3 = kotlinx.coroutines.flow.J.a(new com.bilibili.bplus.im.business.loader.a((com.bilibili.bplus.im.business.loader.UnreadCountDisplayType) null, 3));
        g = stateFlowImplA3;
        h = kotlinx.coroutines.flow.f.b(stateFlowImplA3);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA4 = kotlinx.coroutines.flow.J.a(0L);
        i = stateFlowImplA4;
        j = kotlinx.coroutines.flow.f.b(stateFlowImplA4);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImplA5 = kotlinx.coroutines.flow.J.a(java.lang.Boolean.FALSE);
        k = stateFlowImplA5;
        l = kotlinx.coroutines.flow.f.b(stateFlowImplA5);
    }

    public static com.bilibili.bplus.im.entity.SysNotificationUnreadCount a() {
        return (com.bilibili.bplus.im.entity.SysNotificationUnreadCount) d.b.getValue();
    }

    public static void b() {
        tv.danmaku.android.log.BLog.i("im-NotificationManager", "markAllNotificationRead");
        com.bilibili.bplus.im.entity.SysNotificationUnreadCount sysNotificationUnreadCount = new com.bilibili.bplus.im.entity.SysNotificationUnreadCount(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = c;
        stateFlowImpl.getClass();
        stateFlowImpl.k((java.lang.Object) null, sysNotificationUnreadCount);
        com.bilibili.bplus.im.business.loader.a aVar = new com.bilibili.bplus.im.business.loader.a((com.bilibili.bplus.im.business.loader.UnreadCountDisplayType) null, 3);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl2 = e;
        stateFlowImpl2.getClass();
        stateFlowImpl2.k((java.lang.Object) null, aVar);
    }

    public static void d(boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = k;
        stateFlowImpl.getClass();
        stateFlowImpl.k((java.lang.Object) null, boolValueOf);
    }

    public static void e() {
        Dd.v vVar = com.bilibili.lib.performance.i.a;
        if (com.bilibili.lib.performance.i.c(com.bilibili.lib.performance.PerformanceConfigKey.NET_REQUEST_OPT)) {
            tv.danmaku.android.log.BLog.i("im-NotificationManager", "updateNotificationCount v1 skip for net opt");
            return;
        }
        if (b) {
            return;
        }
        b = true;
        tv.danmaku.android.log.BLog.e("im-NotificationManager", "notificationManager updateNotificationCount");
        boolean zH = com.bilibili.bplus.im.business.client.manager.d0.f().h();
        p101r70.n.a(zH ? 1 : 0, true ^ com.bilibili.bplus.im.business.client.manager.d0.f().h(), false).n(Pi1.a.b()).a(new com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a());
    }

    public final synchronized void c(int i2) {
        tv.danmaku.android.log.BLog.i("im-NotificationManager", "markNotificationRead:" + i2);
        com.bilibili.bplus.im.entity.SysNotificationUnreadCount sysNotificationUnreadCount = (com.bilibili.bplus.im.entity.SysNotificationUnreadCount) d.b.getValue();
        c.setValue(sysNotificationUnreadCount.copy((1008 & 1) != 0 ? sysNotificationUnreadCount.replyCount : i2 == 1 ? 0 : sysNotificationUnreadCount.replyCount, (1008 & 2) != 0 ? sysNotificationUnreadCount.atCount : i2 == 2 ? 0 : sysNotificationUnreadCount.atCount, (1008 & 4) != 0 ? sysNotificationUnreadCount.likeCount : i2 == 3 ? 0 : sysNotificationUnreadCount.likeCount, (1008 & 8) != 0 ? sysNotificationUnreadCount.notifyCount : i2 == 4 ? 0 : sysNotificationUnreadCount.notifyCount, (1008 & 16) != 0 ? sysNotificationUnreadCount.messageCount : 0, (1008 & 32) != 0 ? sysNotificationUnreadCount.huahuoCount : 0, (1008 & 64) != 0 ? sysNotificationUnreadCount.recvReply : 0, (1008 & 128) != 0 ? sysNotificationUnreadCount.recvLike : 0, (1008 & 256) != 0 ? sysNotificationUnreadCount.newFollow : 0, (1008 & 512) != 0 ? sysNotificationUnreadCount.notifyStyle : 0));
    }

    /* JADX INFO: compiled from: BL */
    public static final class a implements Qi1.q<p101r70.k> {
        public final void onError(java.lang.Throwable th) {
            tv.danmaku.android.log.BLog.e("im-NotificationManager", th);
        }

        public final void onNext(java.lang.Object obj) {
            p101r70.k kVar = (p101r70.k) obj;
            kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.e;
            com.bilibili.bplus.im.business.loader.a aVar = kVar.d;
            stateFlowImpl.getClass();
            stateFlowImpl.k((java.lang.Object) null, aVar);
            com.bilibili.bplus.im.entity.SysNotificationUnreadCount sysNotificationUnreadCount = kVar.a;
            if (sysNotificationUnreadCount != null) {
                kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl2 = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.c;
                stateFlowImpl2.getClass();
                stateFlowImpl2.k((java.lang.Object) null, sysNotificationUnreadCount);
                tv.danmaku.android.log.BLog.i("im-NotificationManager", "getNoticeUnreadCount success:" + sysNotificationUnreadCount);
                com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.b = false;
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }
}
