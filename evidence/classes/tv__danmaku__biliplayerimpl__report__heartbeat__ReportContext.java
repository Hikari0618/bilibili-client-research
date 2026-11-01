package tv.danmaku.biliplayerimpl.report.heartbeat;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
@androidx.annotation.Keep
public final class ReportContext extends uJ1.b {
    public static final tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.a Companion = new tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.a();
    private static final java.lang.String TAG = "ReportContext";

    @com.alibaba.fastjson.annotation.JSONField(name = "actual_played_time")
    private long mActualPlayedTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "aid")
    private long mAid;

    @com.alibaba.fastjson.annotation.JSONField(name = "auto_play")
    private int mAutoPlay;

    @com.alibaba.fastjson.annotation.JSONField(name = "cid")
    private long mCid;

    @com.alibaba.fastjson.annotation.JSONField(name = "epid_status")
    private java.lang.String mEpStatus;

    @com.alibaba.fastjson.annotation.JSONField(name = "epid")
    private long mEpid;
    private java.util.Map<java.lang.String, java.lang.String> mExtraParams;

    @com.alibaba.fastjson.annotation.JSONField(name = "from_spmid")
    private java.lang.String mFromSpmid;

    @com.alibaba.fastjson.annotation.JSONField(name = "hash")
    private java.lang.String mHash;

    @com.alibaba.fastjson.annotation.JSONField(name = "is_audio_play")
    private boolean mIsAudioPlay;

    @com.alibaba.fastjson.annotation.JSONField(name = "is_auto_qn")
    private boolean mIsAutoQn;

    @com.alibaba.fastjson.annotation.JSONField(name = "from")
    private int mJumpFrom;

    @com.alibaba.fastjson.annotation.JSONField(name = "language")
    private java.lang.String mLanguage;
    private transient long mLastActionMills;

    @com.alibaba.fastjson.annotation.JSONField(name = "last_play_progress_time")
    private long mLastProcessTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "list_play_time")
    private long mListPlayTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "max_play_progress_time")
    private long mMaxPlayProgressTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "mid")
    private long mMid;

    @com.alibaba.fastjson.annotation.JSONField(name = "miniplayer_play_time")
    private long mMiniPlayTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "network_type")
    private int mNetworkType;

    @com.alibaba.fastjson.annotation.JSONField(name = "paused_time")
    private long mPausedTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "perfer_type")
    private java.lang.String mPerferType;

    @com.alibaba.fastjson.annotation.JSONField(name = "play_mode")
    private java.lang.String mPlayMode;

    @com.alibaba.fastjson.annotation.JSONField(name = "play_status")
    private java.lang.String mPlayStatus;

    @com.alibaba.fastjson.annotation.JSONField(name = "play_type")
    private java.lang.String mPlayType;

    @com.alibaba.fastjson.annotation.JSONField(name = "played_time")
    private long mPlayedTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "quality")
    private int mQuality;

    @com.alibaba.fastjson.annotation.JSONField(name = "start_ts")
    private long mServerTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "session")
    private java.lang.String mSession;

    @com.alibaba.fastjson.annotation.JSONField(name = "sid")
    private java.lang.String mSid;

    @com.alibaba.fastjson.annotation.JSONField(name = "spmid")
    private java.lang.String mSpmid;
    private transient long mStartElapsed;

    @com.alibaba.fastjson.annotation.JSONField(name = "sub_type")
    private int mSubType;

    @com.alibaba.fastjson.annotation.JSONField(name = "total_time")
    private long mTotalTime;

    @com.alibaba.fastjson.annotation.JSONField(name = "track_id")
    private java.lang.String mTrackId;

    @com.alibaba.fastjson.annotation.JSONField(name = "type")
    private java.lang.String mType;

    @com.alibaba.fastjson.annotation.JSONField(name = "user_status")
    private java.lang.String mUserStatus;

    @com.alibaba.fastjson.annotation.JSONField(name = "video_duration")
    private long mVideoDuration;

    /* JADX INFO: compiled from: BL */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:14:0x00a7  */
        public static tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext a(tv.danmaku.biliplayerv2.service.Video.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, boolean z, boolean z2) {
            tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = new tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext();
            Zx1.e<java.lang.Boolean> eVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.x;
            reportContext.setMServerTime(ol.d.d() / 1000);
            reportContext.setMStartElapsed(android.os.SystemClock.elapsedRealtime() / 1000);
            reportContext.setMLastActionMills(reportContext.getMStartElapsed());
            reportContext.setMSession(str);
            reportContext.setMHash(java.util.UUID.randomUUID().toString());
            android.app.Application applicationA = Lo.j.a();
            if (applicationA != null) {
                com.bilibili.lib.accounts.x.c(Lo.j.a()).getClass();
                reportContext.setMMid(com.bilibili.lib.accounts.x.k());
                reportContext.setMAid(gVar.a);
                reportContext.setMCid(gVar.b);
                reportContext.setMSid(java.lang.String.valueOf(gVar.g));
                java.lang.Long lT = kotlin.text.p.t(10, gVar.j);
                reportContext.setMEpid(lT != null ? lT.longValue() : 0L);
                reportContext.setMType(java.lang.String.valueOf(gVar.h));
                reportContext.setMAutoPlay(gVar.k);
                reportContext.setMSubType(gVar.i);
                reportContext.setMQuality(i);
                reportContext.setMIsAutoQn(z);
                reportContext.setMIsAudioPlay(z2);
                reportContext.setMVideoDuration(((long) i2) / 1000);
                reportContext.setMPlayType(gVar.l);
                tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext.Companion.getClass();
                int iA = Jp0.c.a(applicationA);
                if (iA == -1) {
                    iA = 2;
                } else if (iA != 0) {
                    if (iA == 1) {
                        iA = 1;
                    }
                } else if (com.bilibili.fd_service.FreeDataManager.c.a.u()) {
                    iA = 3;
                } else {
                    iA = 1;
                }
                reportContext.setMNetworkType(iA);
                reportContext.setMEpStatus(gVar.m);
                reportContext.setMPlayStatus(gVar.n);
                com.bilibili.lib.accountinfo.model.VipUserInfo vipUserInfoF = Dg0.b.a.a().f();
                reportContext.setMUserStatus((vipUserInfoF == null || !vipUserInfoF.isEffectiveVip()) ? "0" : "1");
                long j = ((long) i3) / 1000;
                reportContext.setMLastProcessTime(j);
                reportContext.setMMaxPlayProgressTime(j);
                java.lang.Integer numR = kotlin.text.p.r(10, gVar.d);
                reportContext.setMJumpFrom(numR != null ? numR.intValue() : 6);
                reportContext.setMFromSpmid(gVar.f);
                reportContext.setMSpmid(gVar.e);
                reportContext.setMPlayMode(gVar.q);
                reportContext.setMLanguage(str2);
                reportContext.setMPerferType(str3);
                reportContext.setMTrackId(gVar.r);
                reportContext.setMExtraParams(com.bilibili.common.chronoscommon.effects.q.h(gVar, (java.util.Map) null));
            }
            return reportContext;
        }
    }

    public final tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext copy() {
        tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext reportContext = new tv.danmaku.biliplayerimpl.report.heartbeat.ReportContext();
        reportContext.mStartElapsed = this.mStartElapsed;
        reportContext.mSession = this.mSession;
        reportContext.mMid = this.mMid;
        reportContext.mAid = this.mAid;
        reportContext.mCid = this.mCid;
        reportContext.mSid = this.mSid;
        reportContext.mEpid = this.mEpid;
        reportContext.mType = this.mType;
        reportContext.mSubType = this.mSubType;
        reportContext.mQuality = this.mQuality;
        reportContext.mIsAutoQn = this.mIsAutoQn;
        reportContext.mIsAudioPlay = this.mIsAudioPlay;
        reportContext.mVideoDuration = this.mVideoDuration;
        reportContext.mPlayType = this.mPlayType;
        reportContext.mNetworkType = this.mNetworkType;
        reportContext.mJumpFrom = this.mJumpFrom;
        reportContext.mFromSpmid = this.mFromSpmid;
        reportContext.mSpmid = this.mSpmid;
        reportContext.mEpStatus = this.mEpStatus;
        reportContext.mPlayStatus = this.mPlayStatus;
        reportContext.mUserStatus = this.mUserStatus;
        reportContext.mLastProcessTime = this.mLastProcessTime;
        reportContext.setMMaxPlayProgressTime(this.mMaxPlayProgressTime);
        reportContext.mTotalTime = this.mTotalTime;
        reportContext.mPausedTime = this.mPausedTime;
        reportContext.mPlayedTime = this.mPlayedTime;
        reportContext.mActualPlayedTime = this.mActualPlayedTime;
        reportContext.mAutoPlay = this.mAutoPlay;
        reportContext.mListPlayTime = this.mListPlayTime;
        reportContext.mMiniPlayTime = this.mMiniPlayTime;
        reportContext.mLanguage = this.mLanguage;
        reportContext.mPerferType = this.mPerferType;
        reportContext.mLastActionMills = this.mLastActionMills;
        reportContext.mServerTime = this.mServerTime;
        reportContext.mHash = this.mHash;
        reportContext.mPlayMode = this.mPlayMode;
        reportContext.mTrackId = this.mTrackId;
        reportContext.mExtraParams = this.mExtraParams;
        return reportContext;
    }

    public final java.lang.String getCacheFilePath() {
        java.io.File externalFilesDir;
        try {
            android.app.Application applicationA = Lo.j.a();
            if (applicationA != null && (externalFilesDir = applicationA.getExternalFilesDir("heartbeat_report")) != null) {
                return externalFilesDir.getPath() + java.io.File.separator + this.mHash;
            }
            return null;
        } catch (java.lang.NullPointerException unused) {
            Mb0.e.i(TAG, "Get cache file path failed!");
            return null;
        }
    }

    public final long getMActualPlayedTime() {
        return this.mActualPlayedTime;
    }

    public final long getMAid() {
        return this.mAid;
    }

    public final int getMAutoPlay() {
        return this.mAutoPlay;
    }

    public final long getMCid() {
        return this.mCid;
    }

    public final java.lang.String getMEpStatus() {
        return this.mEpStatus;
    }

    public final long getMEpid() {
        return this.mEpid;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMExtraParams() {
        return this.mExtraParams;
    }

    public final java.lang.String getMFromSpmid() {
        return this.mFromSpmid;
    }

    public final java.lang.String getMHash() {
        return this.mHash;
    }

    public final boolean getMIsAudioPlay() {
        return this.mIsAudioPlay;
    }

    public final boolean getMIsAutoQn() {
        return this.mIsAutoQn;
    }

    public final int getMJumpFrom() {
        return this.mJumpFrom;
    }

    public final java.lang.String getMLanguage() {
        return this.mLanguage;
    }

    public final long getMLastActionMills() {
        return this.mLastActionMills;
    }

    public final long getMLastProcessTime() {
        return this.mLastProcessTime;
    }

    public final long getMListPlayTime() {
        return this.mListPlayTime;
    }

    public final long getMMaxPlayProgressTime() {
        return this.mMaxPlayProgressTime;
    }

    public final long getMMid() {
        return this.mMid;
    }

    public final long getMMiniPlayTime() {
        return this.mMiniPlayTime;
    }

    public final int getMNetworkType() {
        return this.mNetworkType;
    }

    public final long getMPausedTime() {
        return this.mPausedTime;
    }

    public final java.lang.String getMPerferType() {
        return this.mPerferType;
    }

    public final java.lang.String getMPlayMode() {
        return this.mPlayMode;
    }

    public final java.lang.String getMPlayStatus() {
        return this.mPlayStatus;
    }

    public final java.lang.String getMPlayType() {
        return this.mPlayType;
    }

    public final long getMPlayedTime() {
        return this.mPlayedTime;
    }

    public final int getMQuality() {
        return this.mQuality;
    }

    public final long getMServerTime() {
        return this.mServerTime;
    }

    public final java.lang.String getMSession() {
        return this.mSession;
    }

    public final java.lang.String getMSid() {
        return this.mSid;
    }

    public final java.lang.String getMSpmid() {
        return this.mSpmid;
    }

    public final long getMStartElapsed() {
        return this.mStartElapsed;
    }

    public final int getMSubType() {
        return this.mSubType;
    }

    public final long getMTotalTime() {
        return this.mTotalTime;
    }

    public final java.lang.String getMTrackId() {
        return this.mTrackId;
    }

    public final java.lang.String getMType() {
        return this.mType;
    }

    public final java.lang.String getMUserStatus() {
        return this.mUserStatus;
    }

    public final long getMVideoDuration() {
        return this.mVideoDuration;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final void refreshMutableState(RI1.d dVar, int i, int i2) {
        android.app.Application applicationA = Lo.j.a();
        if (applicationA == null) {
            return;
        }
        this.mMid = LX0.b.c();
        this.mAutoPlay = dVar.k;
        this.mQuality = i;
        Companion.getClass();
        int iA = Jp0.c.a(applicationA);
        if (iA == -1) {
            iA = 2;
        } else if (iA != 0) {
            if (iA == 1) {
                iA = 1;
            }
        } else if (com.bilibili.fd_service.FreeDataManager.c.a.u()) {
            iA = 3;
        } else {
            iA = 1;
        }
        this.mNetworkType = iA;
        com.bilibili.lib.accountinfo.model.VipUserInfo vipUserInfoF = Dg0.b.a.a().f();
        this.mUserStatus = (vipUserInfoF == null || !vipUserInfoF.isEffectiveVip()) ? "0" : "1";
        refreshProgress(i2);
        java.lang.Integer numR = kotlin.text.p.r(10, dVar.d);
        this.mJumpFrom = numR != null ? numR.intValue() : 6;
        this.mFromSpmid = dVar.f;
        this.mSpmid = dVar.e;
        this.mPlayMode = dVar.q;
        this.mTrackId = dVar.r;
    }

    public final void refreshProgress(int i) {
        long j = ((long) i) / 1000;
        this.mLastProcessTime = j;
        setMMaxPlayProgressTime(j);
        Zx1.e<java.lang.Boolean> eVar = tv.danmaku.biliplayerimpl.report.heartbeat.f.x;
        this.mTotalTime = (android.os.SystemClock.elapsedRealtime() / 1000) - this.mStartElapsed;
    }

    public final void setMActualPlayedTime(long j) {
        this.mActualPlayedTime = j;
    }

    public final void setMAid(long j) {
        this.mAid = j;
    }

    public final void setMAutoPlay(int i) {
        this.mAutoPlay = i;
    }

    public final void setMCid(long j) {
        this.mCid = j;
    }

    public final void setMEpStatus(java.lang.String str) {
        this.mEpStatus = str;
    }

    public final void setMEpid(long j) {
        this.mEpid = j;
    }

    public final void setMExtraParams(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mExtraParams = map;
    }

    public final void setMFromSpmid(java.lang.String str) {
        this.mFromSpmid = str;
    }

    public final void setMHash(java.lang.String str) {
        this.mHash = str;
    }

    public final void setMIsAudioPlay(boolean z) {
        this.mIsAudioPlay = z;
    }

    public final void setMIsAutoQn(boolean z) {
        this.mIsAutoQn = z;
    }

    public final void setMJumpFrom(int i) {
        this.mJumpFrom = i;
    }

    public final void setMLanguage(java.lang.String str) {
        this.mLanguage = str;
    }

    public final void setMLastActionMills(long j) {
        this.mLastActionMills = j;
    }

    public final void setMLastProcessTime(long j) {
        this.mLastProcessTime = j;
    }

    public final void setMListPlayTime(long j) {
        this.mListPlayTime = j;
    }

    public final void setMMaxPlayProgressTime(long j) {
        if (j > this.mMaxPlayProgressTime) {
            this.mMaxPlayProgressTime = j;
        }
    }

    public final void setMMid(long j) {
        this.mMid = j;
    }

    public final void setMMiniPlayTime(long j) {
        this.mMiniPlayTime = j;
    }

    public final void setMNetworkType(int i) {
        this.mNetworkType = i;
    }

    public final void setMPausedTime(long j) {
        this.mPausedTime = j;
    }

    public final void setMPerferType(java.lang.String str) {
        this.mPerferType = str;
    }

    public final void setMPlayMode(java.lang.String str) {
        this.mPlayMode = str;
    }

    public final void setMPlayStatus(java.lang.String str) {
        this.mPlayStatus = str;
    }

    public final void setMPlayType(java.lang.String str) {
        this.mPlayType = str;
    }

    public final void setMPlayedTime(long j) {
        this.mPlayedTime = j;
    }

    public final void setMQuality(int i) {
        this.mQuality = i;
    }

    public final void setMServerTime(long j) {
        this.mServerTime = j;
    }

    public final void setMSession(java.lang.String str) {
        this.mSession = str;
    }

    public final void setMSid(java.lang.String str) {
        this.mSid = str;
    }

    public final void setMSpmid(java.lang.String str) {
        this.mSpmid = str;
    }

    public final void setMStartElapsed(long j) {
        this.mStartElapsed = j;
    }

    public final void setMSubType(int i) {
        this.mSubType = i;
    }

    public final void setMTotalTime(long j) {
        this.mTotalTime = j;
    }

    public final void setMTrackId(java.lang.String str) {
        this.mTrackId = str;
    }

    public final void setMType(java.lang.String str) {
        this.mType = str;
    }

    public final void setMUserStatus(java.lang.String str) {
        this.mUserStatus = str;
    }

    public final void setMVideoDuration(long j) {
        this.mVideoDuration = j;
    }

    public final void updateCommonParamsFromShare(RI1.d dVar) {
        this.mAid = dVar.a;
        this.mCid = dVar.b;
        this.mSid = java.lang.String.valueOf(dVar.g);
        java.lang.Long lT = kotlin.text.p.t(10, dVar.j);
        this.mEpid = lT != null ? lT.longValue() : 0L;
        this.mType = java.lang.String.valueOf(dVar.h);
        this.mAutoPlay = dVar.k;
        this.mSubType = dVar.i;
        this.mPlayType = dVar.l;
        this.mEpStatus = dVar.m;
        this.mPlayStatus = dVar.n;
        java.lang.Integer numR = kotlin.text.p.r(10, dVar.d);
        this.mJumpFrom = numR != null ? numR.intValue() : 6;
        this.mFromSpmid = dVar.f;
        this.mSpmid = dVar.e;
        this.mPlayMode = dVar.q;
        this.mTrackId = dVar.r;
        this.mExtraParams = com.bilibili.common.chronoscommon.effects.q.h(dVar, (java.util.Map) null);
    }
}
