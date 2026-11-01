package La0;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes10.dex */
public final class a {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void a(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.lang.String b(java.lang.String str) throws java.lang.Throwable {
        int i;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.io.FileInputStream fileInputStream = null;
        try {
            try {
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(new java.io.File(str));
                try {
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("md5");
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                    for (byte b : messageDigest.digest()) {
                        java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            hexString = "0" + hexString;
                        }
                        sb2.append(hexString);
                    }
                    a(fileInputStream2);
                } catch (java.io.FileNotFoundException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    a(fileInputStream);
                } catch (java.io.IOException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    a(fileInputStream);
                } catch (java.security.NoSuchAlgorithmException e3) {
                    e = e3;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    a(fileInputStream);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.io.FileNotFoundException e4) {
            e = e4;
        } catch (java.io.IOException e5) {
            e = e5;
        } catch (java.security.NoSuchAlgorithmException e6) {
            e = e6;
        }
        return sb2.toString();
    }

    public static java.lang.String c(java.io.File file) throws java.lang.Throwable {
        java.security.DigestInputStream digestInputStream = null;
        try {
            try {
                java.security.DigestInputStream digestInputStream2 = new java.security.DigestInputStream(new java.io.FileInputStream(file), java.security.MessageDigest.getInstance("MD5"));
                try {
                    while (digestInputStream2.read(new byte[16384]) != -1) {
                    }
                    java.lang.String strP = Ga0.f.p(digestInputStream2.getMessageDigest().digest());
                    a(digestInputStream2);
                    return strP;
                } catch (java.lang.Exception e) {
                    e = e;
                    digestInputStream = digestInputStream2;
                    e.printStackTrace();
                    a(digestInputStream);
                    return "";
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    digestInputStream = digestInputStream2;
                    a(digestInputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public static java.lang.String d(java.io.InputStream inputStream) throws java.lang.Throwable {
        java.security.DigestInputStream digestInputStream = null;
        try {
            try {
                java.security.DigestInputStream digestInputStream2 = new java.security.DigestInputStream(inputStream, java.security.MessageDigest.getInstance("MD5"));
                try {
                    while (digestInputStream2.read(new byte[16384]) != -1) {
                    }
                    java.lang.String strP = Ga0.f.p(digestInputStream2.getMessageDigest().digest());
                    a(digestInputStream2);
                    return strP;
                } catch (java.lang.Exception e) {
                    e = e;
                    digestInputStream = digestInputStream2;
                    e.printStackTrace();
                    a(digestInputStream);
                    return "";
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    digestInputStream = digestInputStream2;
                    a(digestInputStream);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public static java.lang.String e(java.lang.String str) {
        return f(str.getBytes());
    }

    public static java.lang.String f(byte[] bArr) {
        try {
            return h(bArr, java.security.MessageDigest.getInstance("MD5"));
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.String g(byte[] bArr, byte[] bArr2) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            messageDigest.update(bArr);
            if (bArr2 != null) {
                messageDigest.update(bArr2);
            }
            return Ga0.f.p(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.lang.String h(byte[] bArr, java.security.MessageDigest messageDigest) {
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        char[] cArr = new char[bArrDigest.length * 2];
        int i = 0;
        for (byte b : bArrDigest) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new java.lang.String(cArr).toLowerCase();
    }

    public static java.lang.String i(java.lang.String str) {
        try {
            return h(str.getBytes(), java.security.MessageDigest.getInstance("SHA1"));
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
