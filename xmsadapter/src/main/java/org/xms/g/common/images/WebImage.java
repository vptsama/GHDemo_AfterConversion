package org.xms.g.common.images;

public final class WebImage extends org.xms.g.utils.XObject {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.common.images.WebImage createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.common.webserverpic.WebServerPic hReturn = com.huawei.hms.common.webserverpic.WebServerPic.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.images.WebImage(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.common.images.WebImage gReturn = com.google.android.gms.common.images.WebImage.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.images.WebImage(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.common.images.WebImage[] newArray(int param0) {
            return new org.xms.g.common.images.WebImage[param0];
        }
    };
    
    public WebImage(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public WebImage(android.net.Uri param0, int param1, int param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.common.webserverpic.WebServerPic(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.common.images.WebImage(param0, param1, param2));
        }
    }
    
    public WebImage(android.net.Uri param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.common.webserverpic.WebServerPic(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.images.WebImage(param0));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final int getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).getHeight();
        }
    }
    
    public final android.net.Uri getUrl() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getUrl()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getUrl();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).getUrl()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).getUrl();
        }
    }
    
    public final int getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).getWidth();
        }
    }
    
    public final int hashCode() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).toString()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).toString();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.common.images.WebImage) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.common.images.WebImage dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.images.WebImage) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.webserverpic.WebServerPic;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.images.WebImage;
        }
    }
}