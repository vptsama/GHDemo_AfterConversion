package org.xms.g.common.api;

public final class BatchResult extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result {
    
    public BatchResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public final org.xms.g.common.api.Status getStatus() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final <XR extends org.xms.g.common.api.Result> XR take(org.xms.g.common.api.BatchResultToken<XR> param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.common.api.BatchResult dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}