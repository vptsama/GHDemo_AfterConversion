package org.xms.g.tasks;




public class TaskCompletionSource<XTResult> extends org.xms.g.utils.XObject {
    
    
    
    public TaskCompletionSource(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public org.xms.g.tasks.Task<XTResult> getTask() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).getTask()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).getTask();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).getTask()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).getTask();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public void setException(java.lang.Exception param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setException(param0)");
            ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setException(param0);
        }
    }
    
    public void setResult(XTResult param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            java.lang.Object hObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(hObj0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(hObj0);
        } else {
            java.lang.Object gObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setResult(gObj0)");
            ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setResult(gObj0);
        }
    }
    
    public boolean trySetException(java.lang.Exception param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0);
            return true;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetException(param0)");
            return ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetException(param0);
        }
    }
    
    public boolean trySetResult(XTResult param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(param0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(param0);
            return true;
        } else {
            java.lang.Object gObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetResult(gObj0)");
            return ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetResult(gObj0);
        }
    }
    
    public static org.xms.g.tasks.TaskCompletionSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.TaskCompletionSource) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.TaskCompletionSource;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.TaskCompletionSource;
        }
    }
}