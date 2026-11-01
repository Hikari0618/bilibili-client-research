package com.bilibili.app.comm.list.common.data;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes12.dex */
@androidx.annotation.Keep
public class ThreePointItem {
    public static final java.lang.String DISLIKE = "dislike";
    public static final java.lang.String FEEDBACK = "feedback";
    public static final java.lang.String H5 = "h5";
    public static final java.lang.String LIKE = "like";
    public static final java.lang.String SWITCH_TO_DOUBLE = "switch_to_double";
    public static final java.lang.String SWITCH_TO_SINGLE = "switch_to_single";
    public static final java.lang.String WATCH_LATER = "watch_later";
    public static final java.lang.String WHY_CONTENT = "why_content";

    @com.google.gson.annotations.SerializedName("default_id")
    @com.alibaba.fastjson.annotation.JSONField(name = "default_id")
    public int defaultId;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("icon")
    @com.alibaba.fastjson.annotation.JSONField(name = "icon")
    public java.lang.String icon;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("icon_night")
    @com.alibaba.fastjson.annotation.JSONField(name = "icon_night")
    public java.lang.String iconNight;

    @com.google.gson.annotations.SerializedName("id")
    @com.alibaba.fastjson.annotation.JSONField(name = "id")
    public long id;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("reasons")
    @com.alibaba.fastjson.annotation.JSONField(name = "reasons")
    public java.util.List<com.bilibili.app.comm.list.common.data.DislikeReason> reasons;

    @com.google.gson.annotations.SerializedName("selected")
    @com.alibaba.fastjson.annotation.JSONField(name = "selected")
    public int selected;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("selected_icon")
    @com.alibaba.fastjson.annotation.JSONField(name = "selected_icon")
    public java.lang.String selectedIcon;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("selected_title")
    @com.alibaba.fastjson.annotation.JSONField(name = "selected_title")
    public java.lang.String selectedTitle;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("subtitle")
    @com.alibaba.fastjson.annotation.JSONField(name = "subtitle")
    public java.lang.String subtitle;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName(com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService.PAGE_TITLE)
    @com.alibaba.fastjson.annotation.JSONField(name = com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService.PAGE_TITLE)
    public java.lang.String title;

    @com.google.gson.annotations.SerializedName("toast")
    @com.alibaba.fastjson.annotation.JSONField(name = "toast")
    public java.lang.String toast;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("type")
    @com.alibaba.fastjson.annotation.JSONField(name = "type")
    public java.lang.String type;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("url")
    @com.alibaba.fastjson.annotation.JSONField(name = "url")
    public java.lang.String url;

    public ThreePointItem() {
    }

    public ThreePointItem(@androidx.annotation.NonNull m7.b0 b0Var) {
        this.title = b0Var.getTitle();
        this.subtitle = b0Var.getSubtitle();
        this.type = b0Var.getType();
        this.id = b0Var.getId();
        if (b0Var.getReasonsCount() <= 0) {
            this.reasons = null;
            return;
        }
        this.reasons = new java.util.ArrayList(b0Var.getReasonsCount());
        java.util.Iterator<com.bapis.bilibili.app.card.v1.DislikeReason> it = b0Var.getReasonsList().iterator();
        while (it.hasNext()) {
            this.reasons.add(new com.bilibili.app.comm.list.common.data.DislikeReason(it.next()));
        }
    }

    public ThreePointItem(@androidx.annotation.NonNull m7.c0 c0Var) {
        this.title = c0Var.getTitle();
        this.selectedTitle = c0Var.getSelectedTitle();
        this.subtitle = c0Var.getSubtitle();
        this.type = c0Var.getType();
        this.id = c0Var.getId();
        this.selected = c0Var.getSelected();
        this.icon = c0Var.getIcon();
        this.selectedIcon = c0Var.getSelectedIcon();
        this.url = c0Var.getUrl();
        this.defaultId = c0Var.getDefaultId();
        if (c0Var.getReasonsCount() > 0) {
            this.reasons = new java.util.ArrayList(c0Var.getReasonsCount());
            java.util.Iterator<com.bapis.bilibili.app.card.v1.DislikeReason> it = c0Var.getReasonsList().iterator();
            while (it.hasNext()) {
                this.reasons.add(new com.bilibili.app.comm.list.common.data.DislikeReason(it.next()));
            }
            return;
        }
        this.reasons = null;
    }
}
