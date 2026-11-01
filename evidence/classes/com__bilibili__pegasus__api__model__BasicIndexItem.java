package com.bilibili.pegasus.api.model;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
@androidx.annotation.Keep
public class BasicIndexItem extends com.bilibili.bilifeed.card.FeedItem implements com.bilibili.app.comm.list.common.widget.c, p083kD0.a {

    @com.alibaba.fastjson.annotation.JSONField(name = "ad_index")
    public long adIndex;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "ad_info", serialize = false)
    public com.bilibili.adcommon.data.model.FeedAdInfo adInfo;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "ad_cb")
    public java.lang.String ad_cb;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "args")
    public com.bilibili.pegasus.api.modelv2.Args args;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "av_feature")
    public java.lang.String avFeature;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "card_goto")
    public java.lang.String cardGoto;
    public int cardGotoType;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public int cardPosition;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "card_type")
    public java.lang.String cardType;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient long channelId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "click_url")
    public java.lang.String clickUrl;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "cm_info")
    public com.bilibili.adcommon.data.model.CmInfo cmInfo;

    @com.alibaba.fastjson.annotation.JSONField(name = "cm_mark")
    public int cmMark;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "cover")
    public java.lang.String cover;

    @com.alibaba.fastjson.annotation.JSONField(name = "creative_id")
    public long creativeId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "dalao_feature")
    public java.lang.String dalaoFeature;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "dislike_report_data")
    public java.lang.String dislikeReportData;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient long dislikeTimestamp;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "extra_rpt_fields")
    public java.util.HashMap<java.lang.String, java.lang.String> extraRptFields;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "from_type")
    public java.lang.String fromType;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "goto")
    public java.lang.String goTo;
    public int gotoType;

    @com.alibaba.fastjson.annotation.JSONField(name = "id")
    public long id;

    @com.alibaba.fastjson.annotation.JSONField(name = "idx")
    public long idx;

    @com.alibaba.fastjson.annotation.JSONField(name = "index")
    public int index;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "client_ip")
    public java.lang.String ip;

    @com.alibaba.fastjson.annotation.JSONField(name = "is_ad")
    public boolean isAd;

    @com.alibaba.fastjson.annotation.JSONField(name = "is_ad_loc")
    public boolean isAdLoc;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient com.alibaba.fastjson.JSONObject jsonObj;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "inline_play_url")
    public java.lang.String mInlineUrl;

    @com.alibaba.fastjson.annotation.JSONField(name = "material_id")
    public long materialId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "param")
    public java.lang.String param;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient p046fD0.b parseError;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "player_args")
    public com.bilibili.app.comm.list.common.api.model.PlayerArgs playerArgs;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "pos_rec_unique_id")
    public java.lang.String posRecUniqueId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "request_id")
    public java.lang.String requestId;

    @com.alibaba.fastjson.annotation.JSONField(name = "resource_id")
    public long resourceId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient com.bilibili.app.comm.list.common.data.DislikeReason selectedDislikeReason;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient com.bilibili.app.comm.list.common.data.DislikeReason selectedFeedbackReason;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "show_url")
    public java.lang.String showUrl;

    @com.alibaba.fastjson.annotation.JSONField(name = "show_bottom")
    public int show_bottom;

    @com.alibaba.fastjson.annotation.JSONField(name = "show_top")
    public int show_top;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "square")
    public java.lang.String squareCover;

    @com.alibaba.fastjson.annotation.JSONField(name = "src_id")
    public long srcId;

    @androidx.annotation.Nullable
    public java.lang.String state;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    private android.net.Uri stringUriCache;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "subtitle")
    public java.lang.String subtitle;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient com.bilibili.pegasus.api.model.BasicIndexItem superItem;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient java.lang.String tabId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient java.lang.String tabName;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "three_point_v2")
    public java.util.List<com.bilibili.app.comm.list.common.data.ThreePointItem> threePoint;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "three_point_v")
    public java.lang.String threePointV;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "three_point_v3")
    public java.util.List<com.bilibili.app.comm.list.common.data.ThreePointItem> threePointV3;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "three_point_v4")
    public com.bilibili.pegasus.api.modelv2.ThreePointV4Item threePointV4;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "title")
    public java.lang.String title;

    @com.alibaba.fastjson.annotation.JSONField(name = "track_id")
    public java.lang.String trackId;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "translated_status")
    public java.lang.String translatedStatus;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "translated_title")
    public java.lang.String translatedTitle;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "up_args")
    public com.bilibili.pegasus.api.modelv2.UpArgs upArgs;

    @androidx.annotation.Nullable
    private java.lang.String uri;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.util.HashMap<java.lang.String, java.lang.String> uriCache;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "user_feature")
    public java.lang.String userFeature;

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(name = "view_type")
    public java.lang.String viewTypeString;
    public boolean isLightPanel = false;
    public boolean hasSecondPanel = false;

    @com.alibaba.fastjson.annotation.JSONField(name = "server_type")
    public long serverType = -1;

    @com.alibaba.fastjson.annotation.JSONField(name = "card_index")
    public long cardIndex = -1;

    @com.alibaba.fastjson.annotation.JSONField(name = "zero_signal")
    public int zeroSignal = 0;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public boolean hasAttached = false;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    private transient boolean mHasPendingUpdate = false;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient int createType = 0;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient int selectedDislikeType = -1;
    public transient int dislikeState = -1;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public transient int dislikeCardHeight = 0;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public boolean hasReportShow = false;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public boolean hasReportShowV2 = false;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public long cardStartTime = 0;

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public long threePointLastClickTime = 0;

    public BasicIndexItem() {
    }

    @androidx.annotation.Nullable
    public java.lang.Boolean getBoolean(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getBoolean(str);
    }

    public boolean getBooleanValue(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        return jSONObject != null && jSONObject.getBooleanValue(str);
    }

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.util.HashMap<java.lang.String, java.lang.String> getCacheMap() {
        return this.uriCache;
    }

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.lang.String getCacheUri() {
        return getUri();
    }

    @androidx.annotation.Nullable
    public android.graphics.Rect getHolderOutRect(int i, int i2) {
        return null;
    }

    public int getIntValue(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getIntValue(str);
    }

    @androidx.annotation.Nullable
    public java.lang.Integer getInteger(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getInteger(str);
    }

    @androidx.annotation.Nullable
    public com.alibaba.fastjson.JSONArray getJsonArray(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    @androidx.annotation.Nullable
    public com.alibaba.fastjson.JSONObject getJsonObj(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    @androidx.annotation.Nullable
    public java.lang.Long getLong(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getLong(str);
    }

    public long getLongValue(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return 0L;
        }
        return jSONObject.getLongValue(str);
    }

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.lang.String getOriginText() {
        return this.title;
    }

    public int getSpanCount() {
        return 1;
    }

    @androidx.annotation.NonNull
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public android.net.Uri getStringUriCache() {
        if (this.stringUriCache == null) {
            this.stringUriCache = android.net.Uri.parse(getCacheUri());
        }
        return this.stringUriCache;
    }

    @androidx.annotation.Nullable
    public java.lang.String getStringValue(java.lang.String str) {
        com.alibaba.fastjson.JSONObject jSONObject = this.jsonObj;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString(str);
    }

    @Override // p083kD0.a
    @androidx.annotation.NonNull
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public p083kD0.b getTranslateRequestParams() {
        p083kD0.b bVar = new p083kD0.b();
        bVar.a = com.bapis.bilibili.app.translation.v1.TranslationBusiness.TRANS_BIZ_UNSPECIFIED;
        bVar.b = "";
        bVar.c = java.util.Collections.singletonList("title");
        if (!android.text.TextUtils.isEmpty(this.param)) {
            bVar.b = this.param;
        }
        if (!android.text.TextUtils.isEmpty(this.goTo)) {
            if (this.goTo.equals(com.bilibili.pegasus.api.model.IndexConvergeItem.ConvergeVideo.GOTO_AV) || this.goTo.equals("vertical_av")) {
                bVar.a = com.bapis.bilibili.app.translation.v1.TranslationBusiness.TRANS_BIZ_ARC;
            } else if (this.goTo.equals("ketang")) {
                bVar.a = com.bapis.bilibili.app.translation.v1.TranslationBusiness.TRANS_BIZ_CHEESE;
            } else if (this.goTo.equals(com.bilibili.pegasus.api.model.IndexConvergeItem.ConvergeVideo.GOTO_LIVE)) {
                bVar.a = com.bapis.bilibili.app.translation.v1.TranslationBusiness.TRANS_BIZ_LIVE;
            }
        }
        return bVar;
    }

    @Override // p083kD0.a
    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.lang.String getTranslatedStatus() {
        return this.translatedStatus;
    }

    @androidx.annotation.Nullable
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.lang.String getTranslatedText() {
        return this.translatedTitle;
    }

    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public java.lang.String getUniqueIdentity() {
        if (this.idx != 0 && !android.text.TextUtils.isEmpty(this.trackId)) {
            return com.bapis.bilibili.app.im.v1.y0.a(this.idx, this.trackId);
        }
        if (this.idx == 0 && !android.text.TextUtils.isEmpty(this.trackId)) {
            return L0.y1.a(hashCode(), this.trackId);
        }
        if (android.text.TextUtils.isEmpty(this.trackId)) {
            long j = this.idx;
            if (j != 0) {
                return L0.y1.a(hashCode(), java.lang.String.valueOf(j));
            }
        }
        return java.lang.String.valueOf(hashCode());
    }

    @androidx.annotation.Nullable
    public java.lang.String getUri() {
        return this.uri;
    }

    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.String getUriQueryParameter(@androidx.annotation.NonNull java.lang.String str) {
        return super.getUriQueryParameter(str);
    }

    public boolean hasError() {
        return this.parseError != null;
    }

    public boolean hasPendingUpdate() {
        if (!this.mHasPendingUpdate) {
            return false;
        }
        this.mHasPendingUpdate = false;
        return true;
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    public /* bridge */ /* synthetic */ boolean initCacheEnable() {
        return false;
    }

    public void initCacheMap() {
        if (this.uriCache == null) {
            this.uriCache = new java.util.HashMap<>(8);
        }
    }

    public boolean isAdCard() {
        return com.bilibili.pegasus.card.base.y.a.contains(java.lang.Integer.valueOf(getViewType()));
    }

    public boolean isFunctionalItem() {
        return false;
    }

    public boolean isNatualAdCard() {
        return Sh1.c.d(this.adInfo);
    }

    public void markDataChanged() {
        this.mHasPendingUpdate = true;
    }

    public /* bridge */ /* synthetic */ void safeInitCache() {
        super.safeInitCache();
    }

    public void setOperationTabInfo(java.lang.String str, java.lang.String str2) {
        this.tabId = str;
        this.tabName = str2;
    }

    @Override // p083kD0.a
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public void setTranslatedStatus(@androidx.annotation.Nullable java.lang.String str) {
        this.translatedStatus = str;
    }

    @Override // p083kD0.a
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    public void setTranslatedText(@androidx.annotation.Nullable java.lang.String str) {
        this.translatedTitle = str;
    }

    public void setUri(java.lang.String str) {
        this.uri = str;
        this.stringUriCache = null;
        safeInitCache();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    public BasicIndexItem(@androidx.annotation.NonNull m7.d dVar) {
        java.lang.Object objB;
        com.bilibili.adcommon.data.model.FeedAdInfo feedAdInfoB;
        byte[] byteArray;
        java.lang.String cardType = dVar.getCardType();
        this.cardType = cardType;
        if (cardType != null) {
            setViewType(cardType.hashCode());
        } else {
            setViewType(0);
        }
        java.lang.String cardGoto = dVar.getCardGoto();
        this.cardGoto = cardGoto;
        if (!android.text.TextUtils.isEmpty(cardGoto)) {
            this.cardGotoType = this.cardGoto.hashCode();
        }
        java.lang.String str = dVar.getGoto();
        this.goTo = str;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.gotoType = this.goTo.hashCode();
        }
        this.param = dVar.getParam();
        this.cover = dVar.getCover();
        this.title = dVar.getTitle();
        this.translatedTitle = dVar.getTranslatedTitle();
        this.uri = dVar.getUri();
        com.bilibili.adcommon.data.model.FeedExtra feedExtra = null;
        if (dVar.hasArgs()) {
            this.args = new com.bilibili.pegasus.api.modelv2.Args(dVar.getArgs());
        } else {
            this.args = null;
        }
        this.idx = dVar.getIdx();
        this.fromType = dVar.getFromType();
        if (dVar.getThreePointV2Count() > 0) {
            this.threePoint = new java.util.ArrayList(dVar.getThreePointV2Count());
            java.util.Iterator it = dVar.getThreePointV2List().iterator();
            while (it.hasNext()) {
                this.threePoint.add(new com.bilibili.app.comm.list.common.data.ThreePointItem((m7.b0) it.next()));
            }
        } else {
            this.threePoint = null;
        }
        if (dVar.getThreePointV3Count() > 0) {
            this.threePointV3 = new java.util.ArrayList(dVar.getThreePointV3Count());
            java.util.Iterator it2 = dVar.getThreePointV3List().iterator();
            while (it2.hasNext()) {
                this.threePointV3.add(new com.bilibili.app.comm.list.common.data.ThreePointItem((m7.c0) it2.next()));
            }
        } else {
            this.threePointV3 = null;
        }
        if (dVar.hasThreePointV4()) {
            this.threePointV4 = new com.bilibili.pegasus.api.modelv2.ThreePointV4Item(dVar.getThreePointV4());
        } else {
            this.threePointV4 = null;
        }
        if (dVar.hasAdInfo()) {
            com.bapis.bilibili.app.card.v1.AdInfo adInfo = dVar.getAdInfo();
            boolean zContains = ej1.a.a().a.contains(kntr.common.ad.core.AdSlot.HOT_FEED);
            if ((zContains ? java.lang.Boolean.valueOf(zContains) : null) != null) {
                try {
                    byte[] byteArray2 = adInfo.toByteArray();
                    objB = kotlin.Result.constructor-impl(byteArray2 != null ? kntr.app.ad.base.utils.a.a(byteArray2, false) : null);
                } catch (java.lang.Throwable th) {
                    objB = S1.e.b(th);
                }
                dj1.d dVar2 = (dj1.d) (kotlin.Result.isFailure-impl(objB) ? null : objB);
                if (dVar2 != null) {
                    feedAdInfoB = com.bilibili.adcommon.utils.j.B(dVar2);
                    feedAdInfoB.setBuildFromKNTR(true);
                } else {
                    feedAdInfoB = new com.bilibili.adcommon.data.model.FeedAdInfo(0L, 0L, 0L, (com.bilibili.adcommon.data.model.CreativeContent) null, (java.lang.String) null, 0L, 0L, (java.lang.String) null, false, 0, 0L, false, 0L, 0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.bilibili.adcommon.data.model.FeedExtra) null, 0, 0, 0L, 0, 0L, 0L, (java.lang.String) null, (com.bilibili.adcommon.data.model.AdSearchWatchShow) null, false, 134217727, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    feedAdInfoB.setFeedCreativeId(adInfo.getCreativeId());
                    feedAdInfoB.setFeedCreativeType(adInfo.getCreativeType());
                    feedAdInfoB.setFeedInfoCardType(adInfo.getCardType());
                    feedAdInfoB.setFeedAdCb(adInfo.getAdCb());
                    feedAdInfoB.setFeedResource(adInfo.getResource());
                    feedAdInfoB.setFeedSrcId(adInfo.getSource());
                    feedAdInfoB.setFeedRequestId(adInfo.getRequestId());
                    feedAdInfoB.setFeedIsAd(adInfo.getIsAd());
                    feedAdInfoB.setFeedCmMark((int) adInfo.getCmMark());
                    feedAdInfoB.setFeedIndex(adInfo.getIndex());
                    feedAdInfoB.setFeedIsAdLoc(adInfo.getIsAdLoc());
                    feedAdInfoB.setFeedCardIndex(adInfo.getCardIndex());
                    feedAdInfoB.setFeedIp(adInfo.getClientIp());
                    feedAdInfoB.setFeedCreativeType(adInfo.getCreativeType());
                    try {
                        byteArray = adInfo.getExtra().toByteArray();
                        if (byteArray != null && byteArray.length != 0) {
                            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteArray.length);
                            byteBufferAllocate.put(byteArray);
                            byteBufferAllocate.flip();
                            feedExtra = (com.bilibili.adcommon.data.model.FeedExtra) com.alibaba.fastjson.JSON.parseObject(kotlin.text.a.a.newDecoder().decode(byteBufferAllocate.asReadOnlyBuffer()).toString(), com.bilibili.adcommon.data.model.FeedExtra.class);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    feedAdInfoB.setFeedExtra(feedExtra);
                    feedAdInfoB.setNatureAd((int) adInfo.getNatureAd());
                    feedAdInfoB.setBuildFromKNTR(false);
                }
            } else {
                feedAdInfoB = new com.bilibili.adcommon.data.model.FeedAdInfo(0L, 0L, 0L, (com.bilibili.adcommon.data.model.CreativeContent) null, (java.lang.String) null, 0L, 0L, (java.lang.String) null, false, 0, 0L, false, 0L, 0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.bilibili.adcommon.data.model.FeedExtra) null, 0, 0, 0L, 0, 0L, 0L, (java.lang.String) null, (com.bilibili.adcommon.data.model.AdSearchWatchShow) null, false, 134217727, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                feedAdInfoB.setFeedCreativeId(adInfo.getCreativeId());
                feedAdInfoB.setFeedCreativeType(adInfo.getCreativeType());
                feedAdInfoB.setFeedInfoCardType(adInfo.getCardType());
                feedAdInfoB.setFeedAdCb(adInfo.getAdCb());
                feedAdInfoB.setFeedResource(adInfo.getResource());
                feedAdInfoB.setFeedSrcId(adInfo.getSource());
                feedAdInfoB.setFeedRequestId(adInfo.getRequestId());
                feedAdInfoB.setFeedIsAd(adInfo.getIsAd());
                feedAdInfoB.setFeedCmMark((int) adInfo.getCmMark());
                feedAdInfoB.setFeedIndex(adInfo.getIndex());
                feedAdInfoB.setFeedIsAdLoc(adInfo.getIsAdLoc());
                feedAdInfoB.setFeedCardIndex(adInfo.getCardIndex());
                feedAdInfoB.setFeedIp(adInfo.getClientIp());
                feedAdInfoB.setFeedCreativeType(adInfo.getCreativeType());
                byteArray = adInfo.getExtra().toByteArray();
                if (byteArray != null) {
                    java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(byteArray.length);
                    byteBufferAllocate2.put(byteArray);
                    byteBufferAllocate2.flip();
                    feedExtra = (com.bilibili.adcommon.data.model.FeedExtra) com.alibaba.fastjson.JSON.parseObject(kotlin.text.a.a.newDecoder().decode(byteBufferAllocate2.asReadOnlyBuffer()).toString(), com.bilibili.adcommon.data.model.FeedExtra.class);
                }
                feedAdInfoB.setFeedExtra(feedExtra);
                feedAdInfoB.setNatureAd((int) adInfo.getNatureAd());
                feedAdInfoB.setBuildFromKNTR(false);
            }
            this.adInfo = feedAdInfoB;
            feedAdInfoB.setAvIdStr(this.param);
        } else {
            this.adInfo = null;
        }
        this.trackId = dVar.getTrackId();
    }
}
