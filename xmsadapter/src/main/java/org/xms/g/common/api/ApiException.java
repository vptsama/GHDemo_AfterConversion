package org.xms.g.common.api;

public class ApiException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;
    
    public ApiException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
        wrapper = true;
    }
    
    public ApiException(org.xms.g.common.api.Status param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance())))));
        }
        wrapper = false;
    }
    
    public int getStatusCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusCode()");
                return ((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusCode()");
                return ((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusCodeCallSuper();
            }
        }
    }
    
    public java.lang.String getStatusMessage() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusMessage()");
                return ((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusMessage();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusMessage()");
                return ((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusMessage();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusMessageCallSuper()");
                return ((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusMessageCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusMessageCallSuper()");
                return ((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusMessageCallSuper();
            }
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
    
    public static org.xms.g.common.api.ApiException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.ApiException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.ApiException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ApiException;
        }
    }
    
    private class GImpl extends com.google.android.gms.common.api.ApiException {
        
        public int getStatusCode() {
            return org.xms.g.common.api.ApiException.this.getStatusCode();
        }
        
        public java.lang.String getStatusMessage() {
            return org.xms.g.common.api.ApiException.this.getStatusMessage();
        }
        
        public int getStatusCodeCallSuper() {
            return super.getStatusCode();
        }
        
        public java.lang.String getStatusMessageCallSuper() {
            return super.getStatusMessage();
        }
        
        public GImpl(com.google.android.gms.common.api.Status param0) {
            super(param0);
        }
    }
    
    private class HImpl extends com.huawei.hms.common.ApiException {
        
        public int getStatusCode() {
            return org.xms.g.common.api.ApiException.this.getStatusCode();
        }
        
        public java.lang.String getStatusMessage() {
            return org.xms.g.common.api.ApiException.this.getStatusMessage();
        }
        
        public int getStatusCodeCallSuper() {
            return super.getStatusCode();
        }
        
        public java.lang.String getStatusMessageCallSuper() {
            return super.getStatusMessage();
        }
        
        public HImpl(com.huawei.hms.support.api.client.Status param0) {
            super(param0);
        }
    }
}