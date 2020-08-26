package org.xms.g.common;

public class SupportErrorDialogFragment implements org.xms.g.utils.XGettable {
    private boolean wrapper = true;
    public com.google.android.gms.common.SupportErrorDialogFragment gInstance;
    public com.huawei.hms.common.ErrDlgFragmentForSupport hInstance;

    public SupportErrorDialogFragment(com.google.android.gms.common.SupportErrorDialogFragment param0, com.huawei.hms.common.ErrDlgFragmentForSupport param1) {
        gInstance = param0;
        hInstance = param1;
        wrapper = true;
    }

    public static org.xms.g.common.SupportErrorDialogFragment newInstance(android.app.Dialog param0, android.content.DialogInterface.OnCancelListener param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.ErrDlgFragmentForSupport.newInstance(param0, param1)");
            com.huawei.hms.common.ErrDlgFragmentForSupport hReturn = com.huawei.hms.common.ErrDlgFragmentForSupport.newInstance(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.common.SupportErrorDialogFragment(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SupportErrorDialogFragment.newInstance(param0, param1)");
            com.google.android.gms.common.SupportErrorDialogFragment gReturn = com.google.android.gms.common.SupportErrorDialogFragment.newInstance(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.common.SupportErrorDialogFragment(gReturn, null)));
        }
    }

    public static org.xms.g.common.SupportErrorDialogFragment newInstance(android.app.Dialog param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.ErrDlgFragmentForSupport.newInstance(param0)");
            com.huawei.hms.common.ErrDlgFragmentForSupport hReturn = com.huawei.hms.common.ErrDlgFragmentForSupport.newInstance(param0);
            return ((hReturn) == null ? null : (new org.xms.g.common.SupportErrorDialogFragment(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SupportErrorDialogFragment.newInstance(param0)");
            com.google.android.gms.common.SupportErrorDialogFragment gReturn = com.google.android.gms.common.SupportErrorDialogFragment.newInstance(param0);
            return ((gReturn) == null ? null : (new org.xms.g.common.SupportErrorDialogFragment(gReturn, null)));
        }
    }

    public void onCancel(android.content.DialogInterface param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ErrDlgFragmentForSupport) this.getHInstance()).onCancel(param0)");
            ((com.huawei.hms.common.ErrDlgFragmentForSupport) this.getHInstance()).onCancel(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SupportErrorDialogFragment) this.getGInstance()).onCancel(param0)");
            ((com.google.android.gms.common.SupportErrorDialogFragment) this.getGInstance()).onCancel(param0);
        }
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ErrDlgFragmentForSupport) this.getHInstance()).onCreateDialog(param0)");
            return ((com.huawei.hms.common.ErrDlgFragmentForSupport) this.getHInstance()).onCreateDialog(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SupportErrorDialogFragment) this.getGInstance()).onCreateDialog(param0)");
            return ((com.google.android.gms.common.SupportErrorDialogFragment) this.getGInstance()).onCreateDialog(param0);
        }
    }

    public void show(androidx.fragment.app.FragmentManager param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    public void setGInstance(com.google.android.gms.common.SupportErrorDialogFragment param0) {
        this.gInstance = param0;
    }

    public void setHInstance(com.huawei.hms.common.ErrDlgFragmentForSupport param0) {
        this.hInstance = param0;
    }

    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    public static org.xms.g.common.SupportErrorDialogFragment dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.SupportErrorDialogFragment) param0);
    }

    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.ErrDlgFragmentForSupport;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.SupportErrorDialogFragment;
        }
    }
}