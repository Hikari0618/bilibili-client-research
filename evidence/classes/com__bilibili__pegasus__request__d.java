package com.bilibili.pegasus.request;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public final class d {
    public final long a;
    public final boolean b;
    public final int c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final int g;
    public final long h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final long k;
    public final java.lang.String l;
    public final int m;
    public final java.lang.String n;

    public d(long j, boolean z, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, long j2, java.lang.String str4, java.lang.String str5, long j3, java.lang.String str6, int i3, java.lang.String str7) {
        this.a = j;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = j2;
        this.i = str4;
        this.j = str5;
        this.k = j3;
        this.l = str6;
        this.m = i3;
        this.n = str7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bilibili.pegasus.request.d)) {
            return false;
        }
        com.bilibili.pegasus.request.d dVar = (com.bilibili.pegasus.request.d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && kotlin.jvm.internal.n.f(this.d, dVar.d) && kotlin.jvm.internal.n.f(this.e, dVar.e) && kotlin.jvm.internal.n.f(this.f, dVar.f) && this.g == dVar.g && this.h == dVar.h && kotlin.jvm.internal.n.f(this.i, dVar.i) && kotlin.jvm.internal.n.f(this.j, dVar.j) && this.k == dVar.k && kotlin.jvm.internal.n.f(this.l, dVar.l) && this.m == dVar.m && kotlin.jvm.internal.n.f(this.n, dVar.n);
    }

    public final int hashCode() {
        int iB = Ig.f.b(this.c, androidx.compose.animation.K.a(java.lang.Long.hashCode(this.a) * 31, 31, this.b), 31);
        java.lang.String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f;
        int iB2 = androidx.compose.animation.z.b(Ig.f.b(this.g, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.h);
        java.lang.String str4 = this.i;
        int iHashCode3 = (iB2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.j;
        int iB3 = androidx.compose.animation.z.b((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.k);
        java.lang.String str6 = this.l;
        int iB4 = Ig.f.b(this.m, (iB3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        java.lang.String str7 = this.n;
        return iB4 + (str7 != null ? str7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndexListCacheKey(idx=");
        sb.append(this.a);
        sb.append(", pull=");
        sb.append(this.b);
        sb.append(", loginEvent=");
        sb.append(this.c);
        sb.append(", bannerHash=");
        sb.append(this.d);
        sb.append(", openEvent=");
        sb.append(this.e);
        sb.append(", interestResult=");
        sb.append(this.f);
        sb.append(", flush=");
        sb.append(this.g);
        sb.append(", interestId=");
        sb.append(this.h);
        sb.append(", splashId=");
        sb.append(this.i);
        sb.append(", splashIds=");
        sb.append(this.j);
        sb.append(", splashCreativeId=");
        sb.append(this.k);
        sb.append(", interestIdOrders=");
        sb.append(this.l);
        sb.append(", windowSizeType=");
        sb.append(this.m);
        sb.append(", cnyInfo=");
        return C.j0.d(sb, this.n, ")");
    }
}
