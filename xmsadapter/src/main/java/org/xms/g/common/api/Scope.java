package org.xms.g.common.api;

public final class Scope extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.common.api.Scope createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.entity.auth.Scope hReturn = com.huawei.hms.support.api.entity.auth.Scope.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.common.api.Scope gReturn = com.google.android.gms.common.api.Scope.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.common.api.Scope[] newArray(int param0) {
            return new org.xms.g.common.api.Scope[param0];
        }
    };
    
    public Scope(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public Scope(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.api.entity.auth.Scope(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.api.Scope(param0));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.api.Scope) this.getGInstance()).equals(param0);
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.api.Scope) this.getGInstance()).hashCode();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).toString()");
            return ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.api.Scope) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.common.api.Scope) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.common.api.Scope dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Scope) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.entity.auth.Scope;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Scope;
        }
    }
}