package org.xms.g.common.api;




public abstract class ExtensionApi<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XObject implements org.xms.g.common.api.HasApiKey<XO> {
    
    
    
    public ExtensionApi(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.common.api.ExtensionApi dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.ExtensionApi) {
            return ((org.xms.g.common.api.ExtensionApi) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.GoogleApi gReturn = ((com.google.android.gms.common.api.GoogleApi) ((org.xms.g.utils.XGettable) param0).getGInstance());
            
            throw new RuntimeException("HMS does not support this API.");
        }
        return ((org.xms.g.common.api.ExtensionApi) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new RuntimeException("HMS does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.GoogleApi;
        }
    }
    
    public static class XImpl<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.common.api.ExtensionApi<XO> {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.Object getApiKey() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}