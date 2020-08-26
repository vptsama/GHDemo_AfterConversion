package org.xms.g.common.api;




public final class BatchResultToken<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {
    
    
    
    public BatchResultToken(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.common.api.BatchResultToken dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.BatchResultToken) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new RuntimeException("HMS does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.BatchResultToken;
        }
    }
}