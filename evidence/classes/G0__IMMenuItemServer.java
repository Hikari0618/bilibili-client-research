package com.bilibili.bplus.im.communication;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge2/dex/classes13.dex */
public final class G0 implements vo0.b {
    public static int b;
    public static boolean c;
    public static final Zx1.e<com.bilibili.bplus.im.communication.H0> d = kotlin.b.c(new LH0.a(9));
    public final android.content.Context a;

    /* JADX INFO: compiled from: BL */
    public static final class a {
        public static dh0.a a(com.bilibili.bplus.im.business.loader.a aVar) {
            com.bilibili.bplus.im.communication.G0.c = false;
            com.bilibili.bplus.im.communication.G0.b = 0;
            java.util.ArrayList arrayList = BY0.c.c;
            BY0.c.b.a.getClass();
            if (BY0.c.g("im") || com.bilibili.app.comm.restrict.i.e(com.bilibili.app.comm.restrict.RestrictedType.LESSONS, "im")) {
                tv.danmaku.android.log.BLog.i("im-IMMenuItemServer", "createBadge: wrong obtionNone");
                return dh0.a.o;
            }
            if (com.bilibili.bplus.im.business.client.manager.d0.f().c.isMsgNotify()) {
                com.bilibili.bplus.im.business.loader.UnreadCountDisplayType unreadCountDisplayType = com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.Number;
                com.bilibili.bplus.im.business.loader.UnreadCountDisplayType unreadCountDisplayType2 = aVar.b;
                if (unreadCountDisplayType2 == unreadCountDisplayType) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("createBadge: obtainNumber = ");
                    int i = aVar.a;
                    Ig.g.e(i, "im-IMMenuItemServer", sb);
                    com.bilibili.bplus.im.communication.G0.b = i;
                    return dh0.a.a(i, com.bilibili.bplus.followingcard.api.entity.ControlIndex.LOCAL_MESSAGE_TYPE, 2);
                }
                if (unreadCountDisplayType2 == com.bilibili.bplus.im.business.loader.UnreadCountDisplayType.RedPoint) {
                    com.bilibili.bplus.im.communication.G0.c = true;
                    tv.danmaku.android.log.BLog.i("im-IMMenuItemServer", "createBadge: obtainMole");
                    return dh0.a.b();
                }
            }
            tv.danmaku.android.log.BLog.i("im-IMMenuItemServer", "createBadge: obtainNone");
            return dh0.a.o;
        }
    }

    public G0(android.content.Context context) {
        this.a = context;
    }

    public final void a() {
        gr0.o.j(12, "main.homepage.msg.0.show", (java.util.Map) null, false);
    }

    public final oo0.a b() {
        return new oo0.a() { // from class: com.bilibili.bplus.im.communication.F0
            public final void a(android.content.Context context) {
                int i = com.bilibili.bplus.im.communication.G0.b;
                this.b.getClass();
                tv.danmaku.android.log.BLog.e("im-IMMenuItemServer", "homePage badge server refresh");
                if (com.bilibili.lib.dd.DeviceDecision.INSTANCE.getBoolean("dd_im_menu_refresh_on_start_only", false)) {
                    ((com.bilibili.bplus.im.communication.H0) com.bilibili.bplus.im.communication.G0.d.getValue()).a();
                } else {
                    int i2 = com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.b;
                    com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.a(false);
                }
            }
        };
    }

    public final vo0.c c() {
        return null;
    }

    public final void d() {
        android.content.Context context = this.a;
        if (context != null) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("redpoint", c ? com.bilibili.bplus.im.entity.Conversation.MEDAL_OLD : "0");
            map.put("redpoint_num", java.lang.String.valueOf(b));
            gr0.o.e("main.homepage.msg.0.click", map, false);
            ki0.a.i(context, new com.bilibili.lib.blrouter.RouteRequest(new com.bilibili.lib.blrouter.RouteRequest.a("activity://link/im-home")));
        }
    }
}
