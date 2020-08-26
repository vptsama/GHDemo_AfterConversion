package org.xms.g.common;

public final class ExtensionPlayServicesNotAvailableException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    public ExtensionPlayServicesNotAvailableException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    public ExtensionPlayServicesNotAvailableException(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.HuaweiServicesNotAvailableException(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.GooglePlayServicesNotAvailableException(param0));
        }
    }
    
    public int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiServicesNotAvailableException) this.getHInstance()).errorCode");
            return ((com.huawei.hms.api.HuaweiServicesNotAvailableException) this.getHInstance()).errorCode;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GooglePlayServicesNotAvailableException) this.getGInstance()).errorCode");
            return ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) this.getGInstance()).errorCode;
        }
    }
    
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    public static org.xms.g.common.ExtensionPlayServicesNotAvailableException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionPlayServicesNotAvailableException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiServicesNotAvailableException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GooglePlayServicesNotAvailableException;
        }
    }
}