package org.xms.g.common;

public class ExtensionApiAvailability extends org.xms.g.utils.XObject {
    
    public ExtensionApiAvailability(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getGOOGLE_PLAY_SERVICES_PACKAGE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.SERVICES_PACKAGE");
            return com.huawei.hms.api.HuaweiApiAvailability.SERVICES_PACKAGE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_PACKAGE");
            return com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_PACKAGE;
        }
    }
    
    public static int getGOOGLE_PLAY_SERVICES_VERSION_CODE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE");
            return com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE");
            return com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> checkApiAvailability(org.xms.g.common.api.HasApiKey<?> param0, org.xms.g.common.api.HasApiKey<?>... param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> checkApiAvailability(org.xms.g.common.api.ExtensionApi<?> param0, org.xms.g.common.api.ExtensionApi<?>... param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public android.app.Dialog getErrorDialog(android.app.Activity param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2);
        }
    }
    
    public android.app.Dialog getErrorDialog(android.app.Activity param0, int param1, int param2, android.content.DialogInterface.OnCancelListener param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2, param3)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2, param3)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2, param3);
        }
    }
    
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context param0, org.xms.g.common.ConnectionResult param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))))");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))))");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }
    
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, param1, param2)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, param1, param2)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, param1, param2);
        }
    }
    
    public final java.lang.String getErrorString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorString(param0)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorString(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorString(param0)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorString(param0);
        }
    }
    
    public static org.xms.g.common.ExtensionApiAvailability getInstance() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.getInstance()");
            com.huawei.hms.api.HuaweiApiAvailability hReturn = com.huawei.hms.api.HuaweiApiAvailability.getInstance();
            return ((hReturn) == null ? null : (new org.xms.g.common.ExtensionApiAvailability(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GoogleApiAvailability.getInstance()");
            com.google.android.gms.common.GoogleApiAvailability gReturn = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            return ((gReturn) == null ? null : (new org.xms.g.common.ExtensionApiAvailability(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public int isGooglePlayServicesAvailable(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0);
        }
    }
    
    public int isGooglePlayServicesAvailable(android.content.Context param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0, param1)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0, param1)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0, param1);
        }
    }
    
    public final boolean isUserResolvableError(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isUserResolvableError(param0)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isUserResolvableError(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isUserResolvableError(param0)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isUserResolvableError(param0);
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getHuaweiServicesReady(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getHuaweiServicesReady(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).makeGooglePlayServicesAvailable(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).makeGooglePlayServicesAvailable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public void setDefaultNotificationChannelId(android.content.Context param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public boolean showErrorDialogFragment(android.app.Activity param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2);
        }
    }
    
    public boolean showErrorDialogFragment(android.app.Activity param0, int param1, int param2, android.content.DialogInterface.OnCancelListener param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2, param3)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2, param3)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2, param3);
        }
    }
    
    public void showErrorNotification(android.content.Context param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorNotification(param0, param1)");
            ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorNotification(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, param1)");
            ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, param1);
        }
    }
    
    public void showErrorNotification(android.content.Context param0, org.xms.g.common.ConnectionResult param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).popupErrNotification(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))))");
            ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).popupErrNotification(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))))");
            ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }
    
    public static org.xms.g.common.ExtensionApiAvailability dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionApiAvailability) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiApiAvailability;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GoogleApiAvailability;
        }
    }
}