package com.bilibili.lib.tf;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes16.dex */
public enum TfCode implements com.google.protobuf.Internal.EnumLite {
    OK(0),
    TF_SWITCH_DISABLED(TF_SWITCH_DISABLED_VALUE),
    ACTIVATE_STAUTS_INVALID(ACTIVATE_STAUTS_INVALID_VALUE),
    ACTIVATE_STAUTS_FAILED(ACTIVATE_STAUTS_FAILED_VALUE),
    ACTIVATE_STAUTS_CACHE_EXPIRE(ACTIVATE_STAUTS_CACHE_EXPIRE_VALUE),
    RESOURCE_INVALID(RESOURCE_INVALID_VALUE),
    UNICOM_IP_INVALIDE(UNICOM_IP_INVALIDE_VALUE),
    MOBILE_IP_INVALIDE(MOBILE_IP_INVALIDE_VALUE),
    TELECOM_IP_INVALIDE(TELECOM_IP_INVALIDE_VALUE),
    UNICOM_CDN_MEDIA_URL_EMPTY(UNICOM_CDN_MEDIA_URL_EMPTY_VALUE),
    UNICOM_CDN_RTMP_URL_EMPTY(UNICOM_CDN_RTMP_URL_EMPTY_VALUE),
    UNICOM_CDN_FILE_URL_EMPTY(UNICOM_CDN_FILE_URL_EMPTY_VALUE),
    UNICOM_CDN_USERID_CHANGED(2004),
    UNICOM_CDN_QUOTA_EXCEEDED(UNICOM_CDN_QUOTA_EXCEEDED_VALUE),
    UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR(UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR_VALUE),
    UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR(UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR_VALUE),
    UNICOM_CDN_RTMP_BIZ_ERROR(2008),
    UNICOM_CDN_RTMP_NETWORK_ERROR(UNICOM_CDN_RTMP_NETWORK_ERROR_VALUE),
    UNICOM_CDN_FILE_BIZ_ERROR(UNICOM_CDN_FILE_BIZ_ERROR_VALUE),
    UNICOM_CDN_FILE_NETWORK_ERROR(UNICOM_CDN_FILE_NETWORK_ERROR_VALUE),
    URL_EMPTY(URL_EMPTY_VALUE),
    UNICOM_CDN_URL_EMPTY(UNICOM_CDN_URL_EMPTY_VALUE),
    UNICOM_CDN_NETWORK_ERROR(UNICOM_CDN_NETWORK_ERROR_VALUE),
    UNICOM_CDN_BIZ_ERROR(UNICOM_CDN_BIZ_ERROR_VALUE),
    UNICOM_TF_RULES_NO_MATCH(UNICOM_TF_RULES_NO_MATCH_VALUE),
    UNICOM_TF_RULES_INVALID(UNICOM_TF_RULES_INVALID_VALUE),
    MOBILE_TF_RULES_NO_MATCH(MOBILE_TF_RULES_NO_MATCH_VALUE),
    MOBILE_TF_RULES_INVALID(MOBILE_TF_RULES_INVALID_VALUE),
    TELECOM_TF_RULES_NO_MATCH(4000),
    TELECOM_TF_RULES_INVALID(TELECOM_TF_RULES_INVALID_VALUE),
    BVC_CONVERT_NETWORK_ERROR(10001),
    BVC_CONVERT_BIZ_ERROR(BVC_CONVERT_BIZ_ERROR_VALUE),
    TF_RULES_INVALID(TF_RULES_INVALID_VALUE),
    TF_RULES_NO_MATCH(TF_RULES_NO_MATCH_VALUE),
    ACTIVATE_STAUTS_EXPIRE(ACTIVATE_STAUTS_EXPIRE_VALUE),
    MANUAL_TRANSFORM_ONLY(MANUAL_TRANSFORM_ONLY_VALUE),
    BILICR_TF_MARKED(BILICR_TF_MARKED_VALUE),
    UNRECOGNIZED(-1);


    @java.lang.Deprecated
    public static final int ACTIVATE_STAUTS_CACHE_EXPIRE_VALUE = 7002;
    public static final int ACTIVATE_STAUTS_EXPIRE_VALUE = 10012;

    @java.lang.Deprecated
    public static final int ACTIVATE_STAUTS_FAILED_VALUE = 7003;
    public static final int ACTIVATE_STAUTS_INVALID_VALUE = 7000;

    @java.lang.Deprecated
    public static final int BILICR_TF_MARKED_VALUE = 10101;
    public static final int BVC_CONVERT_BIZ_ERROR_VALUE = 10002;
    public static final int BVC_CONVERT_NETWORK_ERROR_VALUE = 10001;
    public static final int MANUAL_TRANSFORM_ONLY_VALUE = 10100;

    @java.lang.Deprecated
    public static final int MOBILE_IP_INVALIDE_VALUE = 20000;

    @java.lang.Deprecated
    public static final int MOBILE_TF_RULES_INVALID_VALUE = 5002;

    @java.lang.Deprecated
    public static final int MOBILE_TF_RULES_NO_MATCH_VALUE = 5000;
    public static final int OK_VALUE = 0;
    public static final int RESOURCE_INVALID_VALUE = 6000;

    @java.lang.Deprecated
    public static final int TELECOM_IP_INVALIDE_VALUE = 4004;

    @java.lang.Deprecated
    public static final int TELECOM_TF_RULES_INVALID_VALUE = 4002;

    @java.lang.Deprecated
    public static final int TELECOM_TF_RULES_NO_MATCH_VALUE = 4000;
    public static final int TF_RULES_INVALID_VALUE = 10010;
    public static final int TF_RULES_NO_MATCH_VALUE = 10011;
    public static final int TF_SWITCH_DISABLED_VALUE = 7001;
    public static final int UNICOM_CDN_BIZ_ERROR_VALUE = 9002;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_FILE_BIZ_ERROR_VALUE = 2016;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_FILE_NETWORK_ERROR_VALUE = 2018;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_FILE_URL_EMPTY_VALUE = 2042;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_MEDIA_URL_EMPTY_VALUE = 2044;
    public static final int UNICOM_CDN_NETWORK_ERROR_VALUE = 9001;
    public static final int UNICOM_CDN_QUOTA_EXCEEDED_VALUE = 2036;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_RTMP_BIZ_ERROR_VALUE = 2008;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR_VALUE = 2012;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR_VALUE = 2014;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_RTMP_NETWORK_ERROR_VALUE = 2010;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_RTMP_URL_EMPTY_VALUE = 2040;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_URL_EMPTY_VALUE = 9000;

    @java.lang.Deprecated
    public static final int UNICOM_CDN_USERID_CHANGED_VALUE = 2004;

    @java.lang.Deprecated
    public static final int UNICOM_IP_INVALIDE_VALUE = 2000;

    @java.lang.Deprecated
    public static final int UNICOM_TF_RULES_INVALID_VALUE = 3036;

    @java.lang.Deprecated
    public static final int UNICOM_TF_RULES_NO_MATCH_VALUE = 3010;
    public static final int URL_EMPTY_VALUE = 5001;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.bilibili.lib.tf.TfCode> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.bilibili.lib.tf.TfCode>() { // from class: com.bilibili.lib.tf.TfCode.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public com.bilibili.lib.tf.TfCode m59findValueByNumber(int i) {
            return com.bilibili.lib.tf.TfCode.forNumber(i);
        }
    };
    private final int value;

    /* JADX INFO: compiled from: BL */
    public static final class TfCodeVerifier implements com.google.protobuf.Internal.EnumVerifier {
        static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.bilibili.lib.tf.TfCode.TfCodeVerifier();

        private TfCodeVerifier() {
        }

        public boolean isInRange(int i) {
            return com.bilibili.lib.tf.TfCode.forNumber(i) != null;
        }
    }

    TfCode(int i) {
        this.value = i;
    }

    public static com.bilibili.lib.tf.TfCode forNumber(int i) {
        switch (i) {
            case 0:
                return OK;
            case UNICOM_IP_INVALIDE_VALUE:
                return UNICOM_IP_INVALIDE;
            case 2004:
                return UNICOM_CDN_USERID_CHANGED;
            case 2008:
                return UNICOM_CDN_RTMP_BIZ_ERROR;
            case UNICOM_CDN_RTMP_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_RTMP_NETWORK_ERROR;
            case UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR_VALUE:
                return UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR;
            case UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR;
            case UNICOM_CDN_FILE_BIZ_ERROR_VALUE:
                return UNICOM_CDN_FILE_BIZ_ERROR;
            case UNICOM_CDN_FILE_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_FILE_NETWORK_ERROR;
            case UNICOM_CDN_QUOTA_EXCEEDED_VALUE:
                return UNICOM_CDN_QUOTA_EXCEEDED;
            case UNICOM_CDN_RTMP_URL_EMPTY_VALUE:
                return UNICOM_CDN_RTMP_URL_EMPTY;
            case UNICOM_CDN_FILE_URL_EMPTY_VALUE:
                return UNICOM_CDN_FILE_URL_EMPTY;
            case UNICOM_CDN_MEDIA_URL_EMPTY_VALUE:
                return UNICOM_CDN_MEDIA_URL_EMPTY;
            case UNICOM_TF_RULES_NO_MATCH_VALUE:
                return UNICOM_TF_RULES_NO_MATCH;
            case UNICOM_TF_RULES_INVALID_VALUE:
                return UNICOM_TF_RULES_INVALID;
            case 4000:
                return TELECOM_TF_RULES_NO_MATCH;
            case TELECOM_TF_RULES_INVALID_VALUE:
                return TELECOM_TF_RULES_INVALID;
            case TELECOM_IP_INVALIDE_VALUE:
                return TELECOM_IP_INVALIDE;
            case MOBILE_TF_RULES_NO_MATCH_VALUE:
                return MOBILE_TF_RULES_NO_MATCH;
            case URL_EMPTY_VALUE:
                return URL_EMPTY;
            case MOBILE_TF_RULES_INVALID_VALUE:
                return MOBILE_TF_RULES_INVALID;
            case RESOURCE_INVALID_VALUE:
                return RESOURCE_INVALID;
            case ACTIVATE_STAUTS_INVALID_VALUE:
                return ACTIVATE_STAUTS_INVALID;
            case TF_SWITCH_DISABLED_VALUE:
                return TF_SWITCH_DISABLED;
            case ACTIVATE_STAUTS_CACHE_EXPIRE_VALUE:
                return ACTIVATE_STAUTS_CACHE_EXPIRE;
            case ACTIVATE_STAUTS_FAILED_VALUE:
                return ACTIVATE_STAUTS_FAILED;
            case UNICOM_CDN_URL_EMPTY_VALUE:
                return UNICOM_CDN_URL_EMPTY;
            case UNICOM_CDN_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_NETWORK_ERROR;
            case UNICOM_CDN_BIZ_ERROR_VALUE:
                return UNICOM_CDN_BIZ_ERROR;
            case 10001:
                return BVC_CONVERT_NETWORK_ERROR;
            case BVC_CONVERT_BIZ_ERROR_VALUE:
                return BVC_CONVERT_BIZ_ERROR;
            case TF_RULES_INVALID_VALUE:
                return TF_RULES_INVALID;
            case TF_RULES_NO_MATCH_VALUE:
                return TF_RULES_NO_MATCH;
            case ACTIVATE_STAUTS_EXPIRE_VALUE:
                return ACTIVATE_STAUTS_EXPIRE;
            case MANUAL_TRANSFORM_ONLY_VALUE:
                return MANUAL_TRANSFORM_ONLY;
            case BILICR_TF_MARKED_VALUE:
                return BILICR_TF_MARKED;
            case MOBILE_IP_INVALIDE_VALUE:
                return MOBILE_IP_INVALIDE;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.bilibili.lib.tf.TfCode> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.bilibili.lib.tf.TfCode.TfCodeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.bilibili.lib.tf.TfCode valueOf(int i) {
        return forNumber(i);
    }
}
