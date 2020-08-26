package org.xms.g.common.api;

public abstract class ResultCallbacks<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject implements org.xms.g.common.api.ResultCallback<XR> {
    private boolean wrapper = true;
    
    public ResultCallbacks(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public ResultCallbacks() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public abstract void onFailure(org.xms.g.common.api.Status param0);
    
    public abstract void onSuccess(XR param0);
    
    public static org.xms.g.common.api.ResultCallbacks dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.ResultCallbacks) {
            return ((org.xms.g.common.api.ResultCallbacks) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.ResultCallbacks gReturn = ((com.google.android.gms.common.api.ResultCallbacks) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.api.client.ResultCallbacks hReturn = ((com.huawei.hms.support.api.client.ResultCallbacks) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.api.ResultCallbacks.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.api.ResultCallbacks) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ResultCallbacks;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ResultCallbacks;
        }
    }
    
    private class GImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultCallbacks<R> {
        
        public void onFailure(com.google.android.gms.common.api.Status param0) {
            org.xms.g.common.api.ResultCallbacks.this.onFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(param0, null)))));
        }
        
        public void onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultCallbacks.this, "onSuccess", params, types, false);
        }
        
        public GImpl() {
            super();
        }
    }
    
    private class HImpl<R extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.support.api.client.ResultCallbacks<R> {
        
        public void onFailure(com.huawei.hms.support.api.client.Status param0) {
            org.xms.g.common.api.ResultCallbacks.this.onFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, param0)))));
        }
        
        public void onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultCallbacks.this, "onSuccess", params, types, true);
        }
        
        public HImpl() {
            super();
        }
    }
    
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.ResultCallbacks<XR> {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void onFailure(org.xms.g.common.api.Status param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
        
        public void onSuccess(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onSuccess(hObj0)");
                ((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onSuccess(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onSuccess(gObj0)");
                ((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onSuccess(gObj0);
            }
        }
        
        public void onResult(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onResult(hObj0)");
                ((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onResult(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onResult(gObj0)");
                ((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onResult(gObj0);
            }
        }
    }
}