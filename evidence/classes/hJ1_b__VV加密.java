package p005hJ1;

import Ga0.c;
import aA0.i;
import com.bilibili.lib.blconfig.ConfigManager;
import java.nio.charset.Charset;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tv.danmaku.android.log.BLog;
import vb0.a;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes27.dex */
public final class b {
    public static final String a;
    public static final String b;
    public static final String c;

    static {
        String str = (String) i.a(ConfigManager.b, "videodetail.report_click_secret_key", (Object) null);
        if (str == null) {
            str = "fd6b639dbcff0c2a1b03b389ec763c4b";
        }
        a = str;
        String str2 = (String) ConfigManager.a.c().get("videodetail.report_click_iv", (Object) null);
        if (str2 == null) {
            str2 = "77b07a672d57d64c";
        }
        b = str2;
        String str3 = (String) ConfigManager.a.c().get("videodetail.report_click_salt", (Object) null);
        if (str3 == null) {
            str3 = "9cafa6466a028bfb";
        }
        c = str3;
    }

    public static byte[] a(String str) {
        try {
            String str2 = a;
            Charset charset = c.a;
            return a.b(new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(b.getBytes(charset)), str.getBytes(charset));
        } catch (Exception e) {
            BLog.e("PlayerEncrypt", e);
            return str.getBytes(c.a);
        }
    }
}
