package p134vb0;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes12.dex */
public final class a {
    public static byte[] a(String str, String str2, String str3) {
        byte[] bArrDecode = Base64.decode(str3, 2);
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = str2.getBytes(charset);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOf(bytes2, 16));
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArrDecode);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static byte[] b(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }
}
