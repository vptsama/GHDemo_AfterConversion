package org.xms.g.common.data;

public abstract class AbstractDataBuffer<XT> extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBuffer<XT> {
    
    public AbstractDataBuffer(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public void close() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).close()");
            ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).close();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).close()");
            ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).close();
        }
    }
    
    public abstract XT get(int param0);
    
    public int getCount() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).getCount()");
            return ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).getCount();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).getCount()");
            return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).getCount();
        }
    }
    
    public boolean isClosed() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).isClosed()");
            return ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).isClosed();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).isClosed()");
            return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).isClosed();
        }
    }
    
    public java.util.Iterator<XT> iterator() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).iterator()");
            java.util.Iterator hReturn = ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).iterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(hReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).iterator()");
            java.util.Iterator gReturn = ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).iterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(gReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }
    
    public void release() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).release()");
            ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).release();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).release()");
            ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).release();
        }
    }
    
    public java.util.Iterator<XT> singleRefIterator() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).singleRefIterator()");
            java.util.Iterator hReturn = ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).singleRefIterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(hReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).singleRefIterator()");
            java.util.Iterator gReturn = ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).singleRefIterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(gReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }
    
    public static org.xms.g.common.data.AbstractDataBuffer dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.data.AbstractDataBuffer) {
            return ((org.xms.g.common.data.AbstractDataBuffer) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.data.AbstractDataBuffer gReturn = ((com.google.android.gms.common.data.AbstractDataBuffer) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.common.data.AbstractDataBuffer hReturn = ((com.huawei.hms.common.data.AbstractDataBuffer) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.data.AbstractDataBuffer.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.data.AbstractDataBuffer) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.AbstractDataBuffer;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.AbstractDataBuffer;
        }
    }
    
    public static class XImpl<XT> extends org.xms.g.common.data.AbstractDataBuffer<XT> {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public XT get(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).get(param0)");
                java.lang.Object hmsObj = ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).get(param0);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).get(param0)");
                java.lang.Object gmsObj = ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).get(param0);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
    }
}