package org.xms.g.common.api;

public abstract class TransformedResult<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public TransformedResult(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public TransformedResult() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public abstract void andFinally(org.xms.g.common.api.ResultCallbacks<? super XR> param0);
    
    public abstract <XS extends org.xms.g.common.api.Result> org.xms.g.common.api.TransformedResult<XS> then(org.xms.g.common.api.ResultTransform<? super XR, ? extends XS> param0);
    
    public static org.xms.g.common.api.TransformedResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.TransformedResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ConvertedResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.TransformedResult;
        }
    }
    
    private class GImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> {
        
        public void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> param0) {
            org.xms.g.common.api.TransformedResult.this.andFinally(((param0) == null ? null : (new org.xms.g.common.api.ResultCallbacks.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }
        
        public <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> param0) {
            org.xms.g.common.api.TransformedResult xResult = org.xms.g.common.api.TransformedResult.this.then(((param0) == null ? null : (new org.xms.g.common.api.ResultTransform.XImpl(new org.xms.g.utils.XBox(param0, null)))));
            return ((com.google.android.gms.common.api.TransformedResult) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public GImpl() {
            super();
        }
    }
    
    private class HImpl<R extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.support.api.client.ConvertedResult<R> {
        
        public void finalExec(com.huawei.hms.support.api.client.ResultCallbacks<? super R> param0) {
            org.xms.g.common.api.TransformedResult.this.andFinally(((param0) == null ? null : (new org.xms.g.common.api.ResultCallbacks.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }
        
        public <S extends com.huawei.hms.support.api.client.Result> com.huawei.hms.support.api.client.ConvertedResult<S> convertResult(com.huawei.hms.support.api.client.ResultConvert<? super R, ? extends S> param0) {
            org.xms.g.common.api.TransformedResult xResult = org.xms.g.common.api.TransformedResult.this.then(((param0) == null ? null : (new org.xms.g.common.api.ResultTransform.XImpl(new org.xms.g.utils.XBox(null, param0)))));
            return ((com.huawei.hms.support.api.client.ConvertedResult) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public HImpl() {
            super();
        }
    }
    
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.TransformedResult<XR> {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void andFinally(org.xms.g.common.api.ResultCallbacks<? super XR> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).finalExec(((com.huawei.hms.support.api.client.ResultCallbacks) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).finalExec(((com.huawei.hms.support.api.client.ResultCallbacks) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).andFinally(((com.google.android.gms.common.api.ResultCallbacks) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).andFinally(((com.google.android.gms.common.api.ResultCallbacks) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
        
        public <XS extends org.xms.g.common.api.Result> org.xms.g.common.api.TransformedResult<XS> then(org.xms.g.common.api.ResultTransform<? super XR, ? extends XS> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).convertResult(((com.huawei.hms.support.api.client.ResultConvert) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.support.api.client.ConvertedResult hReturn = ((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).convertResult(((com.huawei.hms.support.api.client.ResultConvert) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.TransformedResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).then(((com.google.android.gms.common.api.ResultTransform) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.TransformedResult gReturn = ((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).then(((com.google.android.gms.common.api.ResultTransform) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.TransformedResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}