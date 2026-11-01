package com.bilibili.app.comm.list.common.data;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes12.dex */
@androidx.annotation.Keep
public class DislikeReason implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.bilibili.app.comm.list.common.data.DislikeReason> CREATOR = new com.bilibili.app.comm.list.common.data.DislikeReason.a();

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("extend")
    @com.alibaba.fastjson.annotation.JSONField(name = "extend")
    public java.lang.String extend;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("extra")
    @com.alibaba.fastjson.annotation.JSONField(name = "extra")
    public java.lang.String extra;

    @com.google.gson.annotations.SerializedName("id")
    @com.alibaba.fastjson.annotation.JSONField(name = "id")
    public long id;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("name")
    @com.alibaba.fastjson.annotation.JSONField(name = "name")
    public java.lang.String name;

    @androidx.annotation.Nullable
    @com.google.gson.annotations.SerializedName("toast")
    @com.alibaba.fastjson.annotation.JSONField(name = "toast")
    public java.lang.String toast;

    /* JADX INFO: compiled from: BL */
    public class a implements android.os.Parcelable.Creator<com.bilibili.app.comm.list.common.data.DislikeReason> {
        @Override // android.os.Parcelable.Creator
        public final com.bilibili.app.comm.list.common.data.DislikeReason createFromParcel(android.os.Parcel parcel) {
            return new com.bilibili.app.comm.list.common.data.DislikeReason(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final com.bilibili.app.comm.list.common.data.DislikeReason[] newArray(int i) {
            return new com.bilibili.app.comm.list.common.data.DislikeReason[i];
        }
    }

    public DislikeReason() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.extra);
        parcel.writeString(this.extend);
        parcel.writeString(this.toast);
    }

    public DislikeReason(android.os.Parcel parcel) {
        this.id = parcel.readLong();
        this.name = parcel.readString();
        this.extra = parcel.readString();
        this.extend = parcel.readString();
        this.toast = parcel.readString();
    }

    public DislikeReason(@androidx.annotation.NonNull m7.InterfaceC1723h interfaceC1723h) {
        this.id = interfaceC1723h.getId();
        this.name = interfaceC1723h.getName();
    }
}
