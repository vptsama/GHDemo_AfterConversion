package org.xms.g.common.api;

public interface Releasable extends org.xms.g.utils.XInterface {
    
    public void release();
    
    default java.lang.Object getZInstanceReleasable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceReleasable();
        } else {
            return getGInstanceReleasable();
        }
    }
    
    default com.google.android.gms.common.api.Releasable getGInstanceReleasable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.api.Releasable) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.api.Releasable() {
            
            public void release() {
                org.xms.g.common.api.Releasable.this.release();
            }
        };
    }
    
    default com.huawei.hms.common.api.Releasable getHInstanceReleasable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.api.Releasable) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.common.api.Releasable() {
            
            public void release() {
                org.xms.g.common.api.Releasable.this.release();
            }
        };
    }
    
    public static org.xms.g.common.api.Releasable dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Releasable) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.Releasable;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Releasable;
            }
        }
        return param0 instanceof org.xms.g.common.api.Releasable;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Releasable {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void release() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.Releasable) this.getHInstance()).release()");
                ((com.huawei.hms.common.api.Releasable) this.getHInstance()).release();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Releasable) this.getGInstance()).release()");
                ((com.google.android.gms.common.api.Releasable) this.getGInstance()).release();
            }
        }
    }
}