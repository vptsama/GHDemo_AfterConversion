package org.xms.g.tasks;




public abstract class CancellationToken extends org.xms.g.utils.XObject {
    
    
    
    public CancellationToken(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public abstract boolean isCancellationRequested();
    
    public abstract org.xms.g.tasks.CancellationToken onCanceledRequested(org.xms.g.tasks.OnTokenCanceledListener param0);
    
    public static org.xms.g.tasks.CancellationToken dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.CancellationToken) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.CancellationToken;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.CancellationToken;
        }
    }
    
    public static class XImpl extends org.xms.g.tasks.CancellationToken {
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public boolean isCancellationRequested() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).isCancellationRequested()");
                return ((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).isCancellationRequested();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).isCancellationRequested()");
                return ((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).isCancellationRequested();
            }
        }
        
        public org.xms.g.tasks.CancellationToken onCanceledRequested(org.xms.g.tasks.OnTokenCanceledListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).register(action)");
                com.huawei.hmf.tasks.CancellationToken hReturn = null;
                Runnable action = new Runnable() {
                    @Override
                    public void run() {
                        param0.onCanceled();
                    }
                };
                hReturn = ((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).register(action);
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.tasks.CancellationToken.XImpl(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).onCanceledRequested(((param0) == null ? null : (param0.getGInstanceOnTokenCanceledListener())))");
                com.google.android.gms.tasks.CancellationToken gReturn = ((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).onCanceledRequested(((param0) == null ? null : (param0.getGInstanceOnTokenCanceledListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.CancellationToken.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}