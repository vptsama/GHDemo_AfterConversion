package org.xms.g.common.api;

public interface HasApiKey<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XInterface {
    
    public java.lang.Object getApiKey();
    
    default java.lang.Object getZInstanceHasApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.HasApiKey<O> getGInstanceHasApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceHasApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.common.api.HasApiKey dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XObject implements org.xms.g.common.api.HasApiKey<XO> {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.Object getApiKey() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}