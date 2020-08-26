package org.xms.g.common.api;

public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    public UnsupportedApiCallException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    public final java.lang.String getMessage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.UnsupportedApiCallException) this.getHInstance()).getMessage()");
            return ((com.huawei.hms.common.api.UnsupportedApiCallException) this.getHInstance()).getMessage();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.UnsupportedApiCallException) this.getGInstance()).getMessage()");
            return ((com.google.android.gms.common.api.UnsupportedApiCallException) this.getGInstance()).getMessage();
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
    
    public static org.xms.g.common.api.UnsupportedApiCallException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.UnsupportedApiCallException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.UnsupportedApiCallException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.UnsupportedApiCallException;
        }
    }
}