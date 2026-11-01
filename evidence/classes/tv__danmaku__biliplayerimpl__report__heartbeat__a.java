package tv.danmaku.biliplayerimpl.report.heartbeat;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
public final /* synthetic */ class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.okretro.GeneralResponse generalResponse;
        java.util.HashMap<java.lang.String, tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext> map = tv.danmaku.biliplayerimpl.report.heartbeat.b.a;
        if (map.isEmpty() || !Mo.c.b().g()) {
            return;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext> next = it.next();
            long mAid = next.getValue().getMAid();
            java.util.HashMap<java.lang.String, tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext> map2 = tv.danmaku.biliplayerimpl.report.heartbeat.b.a;
            if (mAid <= 0) {
                tv.danmaku.biliplayerimpl.report.heartbeat.b.b(next.getValue());
                it.remove();
            } else {
                try {
                    generalResponse = (com.bilibili.okretro.GeneralResponse) ((tv.danmaku.biliplayerimpl.report.heartbeat.c) uB0.d.b(tv.danmaku.biliplayerimpl.report.heartbeat.c.class)).b(tv.danmaku.biliplayerimpl.report.heartbeat.b.a(next.getValue())).execute().b;
                } catch (java.lang.Exception unused) {
                    generalResponse = null;
                }
                if (generalResponse == null || !generalResponse.isSuccess()) {
                    if (generalResponse != null && ((com.bilibili.okretro.BaseResponse) generalResponse).code == -400) {
                        tv.danmaku.biliplayerimpl.report.heartbeat.b.b(next.getValue());
                        it.remove();
                    }
                    long mAid2 = next.getValue().getMAid();
                    long mCid = next.getValue().getMCid();
                    java.lang.StringBuilder sbE = O0.n.e(mAid2, "try report heartbeat end avid:", " cid:");
                    sbE.append(mCid);
                    sbE.append(" fail}");
                    tv.danmaku.android.log.BLog.i(sbE.toString());
                } else {
                    long mAid3 = next.getValue().getMAid();
                    long mCid2 = next.getValue().getMCid();
                    java.lang.String mPlayMode = next.getValue().getMPlayMode();
                    java.lang.StringBuilder sbE2 = O0.n.e(mAid3, "try report heartbeat end avid:", " cid:");
                    sbE2.append(mCid2);
                    sbE2.append("  playmode:");
                    sbE2.append(mPlayMode);
                    tv.danmaku.android.log.BLog.i(sbE2.toString());
                    tv.danmaku.biliplayerimpl.report.heartbeat.b.b(next.getValue());
                    it.remove();
                }
            }
        }
    }
}
