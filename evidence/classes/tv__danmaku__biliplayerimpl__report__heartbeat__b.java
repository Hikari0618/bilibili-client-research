package tv.danmaku.biliplayerimpl.report.heartbeat;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
public final class b {
    public static java.io.File b;
    public static final java.util.HashMap<java.lang.String, tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext> a = new java.util.HashMap<>();
    public static final tv.danmaku.biliplayerimpl.report.heartbeat.a c = new tv.danmaku.biliplayerimpl.report.heartbeat.a();

    public static tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams a(tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext) {
        long mServerTime = reportContext.getMServerTime();
        java.lang.String mSession = reportContext.getMSession();
        long mMid = reportContext.getMMid();
        long mAid = reportContext.getMAid();
        long mCid = reportContext.getMCid();
        java.lang.String mSid = reportContext.getMSid();
        long mEpid = reportContext.getMEpid();
        java.lang.String mType = reportContext.getMType();
        int mSubType = reportContext.getMSubType();
        int mQuality = reportContext.getMQuality();
        long mTotalTime = reportContext.getMTotalTime();
        long mPausedTime = reportContext.getMPausedTime();
        long mPlayedTime = reportContext.getMPlayedTime();
        long mVideoDuration = reportContext.getMVideoDuration();
        java.lang.String mPlayType = reportContext.getMPlayType();
        int mNetworkType = reportContext.getMNetworkType();
        long mLastProcessTime = reportContext.getMLastProcessTime();
        long mMaxPlayProgressTime = reportContext.getMMaxPlayProgressTime();
        int mJumpFrom = reportContext.getMJumpFrom();
        java.lang.String mFromSpmid = reportContext.getMFromSpmid();
        java.lang.String mSpmid = reportContext.getMSpmid();
        java.lang.String mEpStatus = reportContext.getMEpStatus();
        java.lang.String mPlayStatus = reportContext.getMPlayStatus();
        java.lang.String mUserStatus = reportContext.getMUserStatus();
        long mActualPlayedTime = reportContext.getMActualPlayedTime();
        int mAutoPlay = reportContext.getMAutoPlay();
        long mListPlayTime = reportContext.getMListPlayTime();
        long mMiniPlayTime = reportContext.getMMiniPlayTime();
        java.lang.String mPlayMode = reportContext.getMPlayMode();
        java.lang.String mLanguage = reportContext.getMLanguage();
        java.lang.String mPerferType = reportContext.getMPerferType();
        java.lang.String mTrackId = reportContext.getMTrackId();
        java.lang.String oaid = Nr0.b.a.getOaid();
        java.lang.String strA = A5.E.a();
        if (strA == null) {
            strA = "";
        }
        return new tv.danmaku.biliplayerimpl.report.heartbeat.HeartbeatParams(mServerTime, mSession, mMid, mAid, mCid, mSid, mEpid, mType, mSubType, mQuality, mTotalTime, mPausedTime, mPlayedTime, mVideoDuration, mPlayType, mNetworkType, mLastProcessTime, mMaxPlayProgressTime, mJumpFrom, mFromSpmid, mSpmid, mEpStatus, mPlayStatus, mUserStatus, mActualPlayedTime, mAutoPlay, mListPlayTime, mMiniPlayTime, mPlayMode, mLanguage, mPerferType, mTrackId, oaid, strA, reportContext.getMIsAutoQn(), reportContext.getMIsAudioPlay(), reportContext.getMExtraParams());
    }

    public static void b(tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext) {
        java.lang.String cacheFilePath = reportContext.getCacheFilePath();
        if (cacheFilePath == null || cacheFilePath.length() == 0) {
            return;
        }
        java.io.File file = new java.io.File(cacheFilePath);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void c(tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext) {
        try {
            tv.danmaku.android.log.BLog.i("HeartBeatCacheManager", "try to save report info: aid:" + reportContext.getMAid() + " cid:" + reportContext.getMCid());
            java.lang.String cacheFilePath = reportContext.getCacheFilePath();
            if (cacheFilePath != null && cacheFilePath.length() != 0) {
                java.io.File file = new java.io.File(cacheFilePath);
                if (!file.exists()) {
                    file.createNewFile();
                }
                Ia0.a.y(file, com.alibaba.fastjson.JSON.toJSONString(reportContext), "UTF-8");
            }
        } catch (java.lang.Exception unused) {
            tv.danmaku.android.log.BLog.e("HeartBeatCacheManager", "write memory to disk failed");
        }
    }
}
