package org.xms.g.common.data;

public interface DataBufferObserver extends org.xms.g.utils.XInterface {
    
    public void onDataChanged();
    
    public void onDataRangeChanged(int param0, int param1);
    
    public void onDataRangeInserted(int param0, int param1);
    
    public void onDataRangeMoved(int param0, int param1, int param2);
    
    public void onDataRangeRemoved(int param0, int param1);
    
    default java.lang.Object getZInstanceDataBufferObserver() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceDataBufferObserver();
        } else {
            return getGInstanceDataBufferObserver();
        }
    }
    
    default com.google.android.gms.common.data.DataBufferObserver getGInstanceDataBufferObserver() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.data.DataBufferObserver) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.data.DataBufferObserver() {
            
            public void onDataChanged() {
                org.xms.g.common.data.DataBufferObserver.this.onDataChanged();
            }
            
            public void onDataRangeChanged(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeChanged(param0, param1);
            }
            
            public void onDataRangeInserted(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeInserted(param0, param1);
            }
            
            public void onDataRangeMoved(int param0, int param1, int param2) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeMoved(param0, param1, param2);
            }
            
            public void onDataRangeRemoved(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeRemoved(param0, param1);
            }
        };
    }
    
    default com.huawei.hms.common.data.DataBufferObserver getHInstanceDataBufferObserver() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.data.DataBufferObserver) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.common.data.DataBufferObserver() {
            
            public void onDataChanged() {
                org.xms.g.common.data.DataBufferObserver.this.onDataChanged();
            }
            
            public void onDataRangeChanged(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeChanged(param0, param1);
            }
            
            public void onDataRangeInserted(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeInserted(param0, param1);
            }
            
            public void onDataRangeMoved(int param0, int param1, int param2) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeMoved(param0, param1, param2);
            }
            
            public void onDataRangeRemoved(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeRemoved(param0, param1);
            }
        };
    }
    
    public static org.xms.g.common.data.DataBufferObserver dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.data.DataBufferObserver) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.DataBufferObserver;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.DataBufferObserver;
            }
        }
        return param0 instanceof org.xms.g.common.data.DataBufferObserver;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBufferObserver {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void onDataChanged() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataChanged()");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataChanged();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataChanged()");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataChanged();
            }
        }
        
        public void onDataRangeChanged(int param0, int param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeChanged(param0, param1)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeChanged(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeChanged(param0, param1)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeChanged(param0, param1);
            }
        }
        
        public void onDataRangeInserted(int param0, int param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeInserted(param0, param1)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeInserted(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeInserted(param0, param1)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeInserted(param0, param1);
            }
        }
        
        public void onDataRangeMoved(int param0, int param1, int param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeMoved(param0, param1, param2)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeMoved(param0, param1, param2);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeMoved(param0, param1, param2)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeMoved(param0, param1, param2);
            }
        }
        
        public void onDataRangeRemoved(int param0, int param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeRemoved(param0, param1)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeRemoved(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeRemoved(param0, param1)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeRemoved(param0, param1);
            }
        }
    }
    
    public static interface Observable extends org.xms.g.utils.XInterface {
        
        public void addObserver(org.xms.g.common.data.DataBufferObserver param0);
        
        public void removeObserver(org.xms.g.common.data.DataBufferObserver param0);
        
        default java.lang.Object getZInstanceObservable() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        default com.google.android.gms.common.data.DataBufferObserver.Observable getGInstanceObservable() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        default java.lang.Object getHInstanceObservable() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.common.data.DataBufferObserver.Observable dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBufferObserver.Observable {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void addObserver(org.xms.g.common.data.DataBufferObserver param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public void removeObserver(org.xms.g.common.data.DataBufferObserver param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
}