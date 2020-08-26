package org.xms.g.common.api;

public class CommonStatusCodes extends org.xms.g.utils.XObject {
    
    public CommonStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static int getAPI_NOT_CONNECTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.API_NOT_CONNECTED");
            return com.huawei.hms.common.api.CommonStatusCodes.API_NOT_CONNECTED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.API_NOT_CONNECTED");
            return com.google.android.gms.common.api.CommonStatusCodes.API_NOT_CONNECTED;
        }
    }
    
    public static int getCANCELED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.CANCELED");
            return com.huawei.hms.common.api.CommonStatusCodes.CANCELED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.CANCELED");
            return com.google.android.gms.common.api.CommonStatusCodes.CANCELED;
        }
    }
    
    public static int getDEVELOPER_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.DEVELOPER_ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.DEVELOPER_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.DEVELOPER_ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.DEVELOPER_ERROR;
        }
    }
    
    public static int getERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.ERROR;
        }
    }
    
    public static int getINTERNAL_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.INTERNAL_ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.INTERNAL_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.INTERNAL_ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.INTERNAL_ERROR;
        }
    }
    
    public static int getINTERRUPTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.INTERRUPTED");
            return com.huawei.hms.common.api.CommonStatusCodes.INTERRUPTED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.INTERRUPTED");
            return com.google.android.gms.common.api.CommonStatusCodes.INTERRUPTED;
        }
    }
    
    public static int getINVALID_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.INVALID_ACCOUNT");
            return com.huawei.hms.common.api.CommonStatusCodes.INVALID_ACCOUNT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.INVALID_ACCOUNT");
            return com.google.android.gms.common.api.CommonStatusCodes.INVALID_ACCOUNT;
        }
    }
    
    public static int getNETWORK_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.NETWORK_ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.NETWORK_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.NETWORK_ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.NETWORK_ERROR;
        }
    }
    
    public static int getRESOLUTION_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED");
            return com.huawei.hms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED");
            return com.google.android.gms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED;
        }
    }
    
    public static int getSERVICE_DISABLED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SERVICE_DISABLED");
            return com.huawei.hms.common.api.CommonStatusCodes.SERVICE_DISABLED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SERVICE_DISABLED");
            return com.google.android.gms.common.api.CommonStatusCodes.SERVICE_DISABLED;
        }
    }
    
    public static int getSERVICE_VERSION_UPDATE_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.huawei.hms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.google.android.gms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED;
        }
    }
    
    public static int getSIGN_IN_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED");
            return com.huawei.hms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED");
            return com.google.android.gms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED;
        }
    }
    
    public static int getSUCCESS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SUCCESS");
            return com.huawei.hms.common.api.CommonStatusCodes.SUCCESS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SUCCESS");
            return com.google.android.gms.common.api.CommonStatusCodes.SUCCESS;
        }
    }
    
    public static int getSUCCESS_CACHE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SUCCESS_CACHE");
            return com.huawei.hms.common.api.CommonStatusCodes.SUCCESS_CACHE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SUCCESS_CACHE");
            return com.google.android.gms.common.api.CommonStatusCodes.SUCCESS_CACHE;
        }
    }
    
    public static int getTIMEOUT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.TIMEOUT");
            return com.huawei.hms.common.api.CommonStatusCodes.TIMEOUT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.TIMEOUT");
            return com.google.android.gms.common.api.CommonStatusCodes.TIMEOUT;
        }
    }
    
    public static java.lang.String getStatusCodeString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.getStatusCodeString(param0)");
            return com.huawei.hms.common.api.CommonStatusCodes.getStatusCodeString(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(param0)");
            return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(param0);
        }
    }
    
    public static org.xms.g.common.api.CommonStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.CommonStatusCodes) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.CommonStatusCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.CommonStatusCodes;
        }
    }
}