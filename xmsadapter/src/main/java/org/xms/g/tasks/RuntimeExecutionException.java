package org.xms.g.tasks;

public class RuntimeExecutionException extends java.lang.RuntimeException implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    public RuntimeExecutionException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    public RuntimeExecutionException(java.lang.Throwable param0) {
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
    
    public static org.xms.g.tasks.RuntimeExecutionException dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}