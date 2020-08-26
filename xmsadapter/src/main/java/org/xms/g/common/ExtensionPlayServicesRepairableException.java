package org.xms.g.common;

public class ExtensionPlayServicesRepairableException extends org.xms.g.common.UserRecoverableException {
    
    public ExtensionPlayServicesRepairableException(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public int getConnectionStatusCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiServicesRepairableException) this.getHInstance()).getConnectionStatusCode()");
            return ((com.huawei.hms.api.HuaweiServicesRepairableException) this.getHInstance()).getConnectionStatusCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GooglePlayServicesRepairableException) this.getGInstance()).getConnectionStatusCode()");
            return ((com.google.android.gms.common.GooglePlayServicesRepairableException) this.getGInstance()).getConnectionStatusCode();
        }
    }
    
    public static org.xms.g.common.ExtensionPlayServicesRepairableException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionPlayServicesRepairableException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiServicesRepairableException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GooglePlayServicesRepairableException;
        }
    }
}