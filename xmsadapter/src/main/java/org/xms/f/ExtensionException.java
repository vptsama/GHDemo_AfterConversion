package org.xms.f;

public class ExtensionException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    public ExtensionException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    public ExtensionException(java.lang.String param0) {
    }
    
    public ExtensionException(java.lang.String param0, java.lang.Throwable param1) {
    }
    
    public ExtensionException() {
    }
    
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    public static org.xms.f.ExtensionException dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}