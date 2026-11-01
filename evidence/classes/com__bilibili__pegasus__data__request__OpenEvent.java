package com.bilibili.pegasus.data.request;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public enum OpenEvent {
    NORMAL(""),
    HOT(com.bilibili.pegasus.api.modelv2.channel.ChannelSortItem.SORT_HOT),
    COLD("cold");

    private static final /* synthetic */ fy1.a $ENTRIES = kotlin.enums.a.a(values());
    private final java.lang.String value;

    OpenEvent(java.lang.String str) {
        this.value = str;
    }

    public static fy1.a<com.bilibili.pegasus.data.request.OpenEvent> getEntries() {
        return $ENTRIES;
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
