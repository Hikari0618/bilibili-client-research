package com.bilibili.pegasus;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili3/dex/classes17.dex */
public enum PegasusWindowProfile {
    Large(3, 4),
    Medium(2, 3),
    Normal(1, 2);

    private final int columns;
    private final int type;
    private static final /* synthetic */ fy1.a $ENTRIES = kotlin.enums.a.a(values());
    public static final com.bilibili.pegasus.PegasusWindowProfile.a Companion = new com.bilibili.pegasus.PegasusWindowProfile.a();

    /* JADX INFO: compiled from: BL */
    public static final class a {
    }

    PegasusWindowProfile(int i, int i2) {
        this.type = i;
        this.columns = i2;
    }

    public static fy1.a<com.bilibili.pegasus.PegasusWindowProfile> getEntries() {
        return $ENTRIES;
    }

    public final int getColumns() {
        return this.columns;
    }

    public final int getType() {
        return this.type;
    }
}
