package com.bilibili.bplus.im.hometab;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge2/dex/classes13.dex */
public final class IMHomeTabBadgeServer implements oo0.a, android.os.Parcelable {
    public static final com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer.a CREATOR = new com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer.a();
    public final Zx1.e b = kotlin.b.c(new Bp0.a(4));

    /* JADX INFO: compiled from: BL */
    public static final class a implements android.os.Parcelable.Creator<com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer> {
        @Override // android.os.Parcelable.Creator
        public final com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer createFromParcel(android.os.Parcel parcel) {
            return new com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer();
        }

        @Override // android.os.Parcelable.Creator
        public final com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer[] newArray(int i) {
            return new com.bilibili.bplus.im.hometab.IMHomeTabBadgeServer[i];
        }
    }

    public final void a(android.content.Context context) {
        int i = com.bilibili.bplus.im.communication.G0.b;
        if (com.bilibili.lib.dd.DeviceDecision.INSTANCE.getBoolean("dd_im_menu_refresh_on_start_only", false)) {
            ((com.bilibili.bplus.im.communication.H0) this.b.getValue()).a();
        } else {
            int i2 = com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.b;
            com.bilibili.bplus.im.communication.CommunicationUnreadCountHelper.a(false);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
    }
}
