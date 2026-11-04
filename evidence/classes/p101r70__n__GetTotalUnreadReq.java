package p101r70;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge/dex/classes13.dex */
public final class n {
    public static final io.reactivex.rxjava3.internal.operators.observable.w a(int i, boolean z, boolean z2) {
        return com.bilibili.bplus.im.pblink.g.a("im-moss", new Df.d(com.bapis.bilibili.im.gateway.interfaces.v1.GetTotalUnreadReq.newBuilder().setUnreadType(i).setShowUnfollowList(z ? 1 : 0).setShowDustbin(z2 ? 1 : 0).build(), 8)).g(p101r70.l.b).m(p101r70.m.b);
    }
}
