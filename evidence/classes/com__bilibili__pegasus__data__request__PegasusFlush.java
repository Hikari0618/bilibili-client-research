package com.bilibili.pegasus.data.request;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public enum PegasusFlush {
    NORMAL(0),
    AUTO_BACK_FROM_BACKGROUND(1),
    SWITCH_STYLE(2),
    INTEREST(3),
    SWITCH_PEGASUS_RECOMMEND_MODE(4),
    TAB_CLICK(5),
    PULL_DOWN(6),
    TOP_REFRESH_BUTTON_CLICK(7),
    PULL_UP(8),
    AUTO_BACK_FROM_OTHER_PAGE(9),
    SWITCH_RECOMMEND_MODE_FROM_SETTINGS(11),
    SWITCH_RECOMMEND_MODE_FROM_GUIDANCE(12),
    TAB_CLICK_WITH_OFFSET(14),
    TAB_DOUBLE_CLICK(15),
    BOTTOM_REFRESH_BUTTON_CLICK(16),
    VIDEO_MODE_CHANGE(17),
    REFRESH_GUIDANCE(18),
    HOME_TAB_REFRESH_GUIDANCE(19),
    AUTO_BACK_FROM_BEHAVIOR(20),
    LOGIN_CHANGE(21),
    FLUSH_TAB_SWITCH_COLUMN(22),
    FLUSH_ON_BACK_PRESS(23);

    private static final /* synthetic */ fy1.a $ENTRIES = kotlin.enums.a.a(values());
    private final int value;

    PegasusFlush(int i) {
        this.value = i;
    }

    public static fy1.a<com.bilibili.pegasus.data.request.PegasusFlush> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isUserRequest() {
        return this == PULL_DOWN || this == PULL_UP || this == TAB_CLICK || this == TOP_REFRESH_BUTTON_CLICK || this == NORMAL || this == TAB_CLICK_WITH_OFFSET;
    }
}
