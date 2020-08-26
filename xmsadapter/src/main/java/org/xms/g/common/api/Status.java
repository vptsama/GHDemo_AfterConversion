package org.xms.g.common.api;

public final class Status extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result, android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.common.api.Status createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.common.api.Status gReturn = null;
            com.huawei.hms.support.api.client.Status hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.support.api.client.Status.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.common.api.Status.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, hReturn));
        }

        public org.xms.g.common.api.Status[] newArray(int param0) {
            return new org.xms.g.common.api.Status[param0];
        }
    };

    public Status(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    public Status(int param0) {
        super((org.xms.g.utils.XBox) null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.api.client.Status(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.api.Status(param0));
        }
    }

    public Status(int param0, java.lang.String param1) {
        super((org.xms.g.utils.XBox) null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.api.client.Status(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.common.api.Status(param0, param1));
        }
    }

    public Status(int param0, java.lang.String param1, android.app.PendingIntent param2) {
        super((org.xms.g.utils.XBox) null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.api.client.Status(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.common.api.Status(param0, param1, param2));
        }
    }

    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).equals(param0);
        }
    }

    public final android.app.PendingIntent getResolution() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).getResolution()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).getResolution();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).getResolution()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).getResolution();
        }
    }

    public final org.xms.g.common.api.Status getStatus() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).getStatus()");
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.support.api.client.Status) this.getHInstance()).getStatus();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).getStatus()");
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.common.api.Status) this.getGInstance()).getStatus();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    public final int getStatusCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).getStatusCode()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).getStatusCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).getStatusCode()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).getStatusCode();
        }
    }

    public final java.lang.String getStatusMessage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).getStatusMessage()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).getStatusMessage();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).getStatusMessage()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).getStatusMessage();
        }
    }

    public final boolean hasResolution() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).hasResolution()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).hasResolution();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).hasResolution()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).hasResolution();
        }
    }

    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).hashCode();
        }
    }

    public final boolean isCanceled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).isCanceled()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).isCanceled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).isCanceled()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).isCanceled();
        }
    }

    public final boolean isInterrupted() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).isInterrupted()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).isInterrupted();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).isInterrupted()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).isInterrupted();
        }
    }

    public final boolean isSuccess() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).isSuccess()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).isSuccess();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).isSuccess()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).isSuccess();
        }
    }

    public void startResolutionForResult(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).startResolutionForResult(param0, param1)");
            ((com.huawei.hms.support.api.client.Status) this.getHInstance()).startResolutionForResult(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).startResolutionForResult(param0, param1)");
            ((com.google.android.gms.common.api.Status) this.getGInstance()).startResolutionForResult(param0, param1);
        }
    }

    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).toString()");
            return ((com.huawei.hms.support.api.client.Status) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.api.Status) this.getGInstance()).toString();
        }
    }

    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Status) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.support.api.client.Status) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Status) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.common.api.Status) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    public static org.xms.g.common.api.Status dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.Status) {
            return ((org.xms.g.common.api.Status) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.common.api.Status) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.support.api.client.Status) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        if (param0 instanceof com.google.android.gms.common.api.Status) {
            return new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(param0, null));
        }
        if (param0 instanceof com.huawei.hms.support.api.client.Status) {
            return new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, param0));
        }
        return ((org.xms.g.common.api.Status) param0);
    }

    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.Status;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Status;
        }
    }
}