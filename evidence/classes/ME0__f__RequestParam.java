package ME0;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili2/dex/classes17.dex */
public final class f {
    public final long a;
    public final boolean b;
    public final com.bilibili.pegasus.data.request.PegasusFlush c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final long f;
    public final LE0.e g;
    public final kotlin.jvm.functions.Function0<java.lang.String> h;
    public final java.lang.String i;
    public final int j;
    public final int k;

    public f() {
        this(false, null, 0, 0, 2047);
    }

    public static ME0.f a(ME0.f fVar, long j, boolean z, com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush, long j2, LE0.e eVar, int i) {
        long j3 = (i & 1) != 0 ? fVar.a : j;
        boolean z2 = (i & 2) != 0 ? fVar.b : z;
        com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush2 = (i & 4) != 0 ? fVar.c : pegasusFlush;
        java.lang.String str = (i & 8) != 0 ? fVar.d : null;
        java.lang.String str2 = (i & 16) != 0 ? fVar.e : null;
        long j4 = (i & 32) != 0 ? fVar.f : j2;
        LE0.e eVar2 = (i & 64) != 0 ? fVar.g : eVar;
        kotlin.jvm.functions.Function0<java.lang.String> function0 = (i & 128) != 0 ? fVar.h : null;
        java.lang.String str3 = (i & 256) != 0 ? fVar.i : null;
        int i2 = fVar.j;
        int i3 = fVar.k;
        fVar.getClass();
        return new ME0.f(j3, z2, pegasusFlush2, str, str2, j4, eVar2, function0, str3, i2, i3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ME0.f)) {
            return false;
        }
        ME0.f fVar = (ME0.f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && kotlin.jvm.internal.n.f(this.d, fVar.d) && kotlin.jvm.internal.n.f(this.e, fVar.e) && this.f == fVar.f && kotlin.jvm.internal.n.f(this.g, fVar.g) && kotlin.jvm.internal.n.f(this.h, fVar.h) && kotlin.jvm.internal.n.f(this.i, fVar.i) && this.j == fVar.j && this.k == fVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + androidx.compose.animation.K.a(java.lang.Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        java.lang.String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.e;
        int iB = androidx.compose.animation.z.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        LE0.e eVar = this.g;
        int iHashCode3 = (iB + (eVar == null ? 0 : eVar.hashCode())) * 31;
        kotlin.jvm.functions.Function0<java.lang.String> function0 = this.h;
        int iHashCode4 = (iHashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        java.lang.String str3 = this.i;
        return java.lang.Integer.hashCode(this.k) + Ig.f.b(this.j, (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestParam(idx=");
        sb.append(this.a);
        sb.append(", refresh=");
        sb.append(this.b);
        sb.append(", flush=");
        sb.append(this.c);
        sb.append(", splashId=");
        sb.append(this.d);
        sb.append(", splashIds=");
        sb.append(this.e);
        sb.append(", splashCreativeId=");
        sb.append(this.f);
        sb.append(", interestInfo=");
        sb.append(this.g);
        sb.append(", queryBannerAction=");
        sb.append(this.h);
        sb.append(", cnyInfo=");
        sb.append(this.i);
        sb.append(", windowSizeType=");
        sb.append(this.j);
        sb.append(", rawWindowSizeType=");
        return C.r.b(this.k, ")", sb);
    }

    public f(long j, boolean z, com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush, java.lang.String str, java.lang.String str2, long j2, LE0.e eVar, kotlin.jvm.functions.Function0<java.lang.String> function0, java.lang.String str3, int i, int i2) {
        this.a = j;
        this.b = z;
        this.c = pegasusFlush;
        this.d = str;
        this.e = str2;
        this.f = j2;
        this.g = eVar;
        this.h = function0;
        this.i = str3;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ f(boolean z, com.bilibili.pegasus.data.request.PegasusFlush pegasusFlush, int i, int i2, int i3) {
        this(0L, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? com.bilibili.pegasus.data.request.PegasusFlush.NORMAL : pegasusFlush, null, null, 0L, null, null, null, (i3 & 512) != 0 ? 1 : i, (i3 & 1024) != 0 ? 1 : i2);
    }
}
