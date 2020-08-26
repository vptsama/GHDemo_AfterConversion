package org.xms.g.location;

/**
 * Specifies the types of location services the client is interested in using..<br/>
 * Combination of com.google.android.gms.location.LocationSettingsRequest and com.huawei.hms.location.LocationSettingsRequest.<br/>
 * com.google.android.gms.location.LocationSettingsRequest: Specifies the types of location services the client is interested in using.<br/>
 * com.huawei.hms.location.LocationSettingsRequest: Class for specifying the location service types and checking the location settings to obtain optimal functionality of all requested services.<br/>
 */
public final class LocationSettingsRequest extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.google.android.gms.location.LocationSettingsRequest.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-static-final-creatorlocationsettingsrequest-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-static-final-creatorlocationsettingsrequest-creator</a><br/>
     * com.huawei.hms.location.LocationSettingsRequest.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsrequest-0000001050986191-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsrequest-0000001050986191-V5</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationSettingsRequest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationSettingsRequest hReturn = com.huawei.hms.location.LocationSettingsRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationSettingsRequest gReturn = com.google.android.gms.location.LocationSettingsRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.location.LocationSettingsRequest[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsRequest[param0];
        }
    };
    
    /**
     * org.xms.g.location.LocationSettingsRequest.LocationSettingsRequest(org.xms.g.utils.XBox) constructor of LocationSettingsRequest with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the wrapper of xms instance
     */
    public LocationSettingsRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.location.LocationSettingsRequest.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.LocationSettingsRequest.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     * com.huawei.hms.location.LocationSettingsRequest.writeToParcel(android.os.Parcel,int)
     * @param  param0 Parcel to which this object is written
     * @param  param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    /**
     * org.xms.g.location.LocationSettingsRequest.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsRequest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the input object
     * @return casted LocationSettingsRequest object
     */
    public static org.xms.g.location.LocationSettingsRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsRequest) param0);
    }
    
    /**
     * org.xms.g.location.LocationSettingsRequest.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsRequest;
        }
    }
    
/**
 * .<br/>
 * HMS does not provide in this Class. More details about the related GMS api can be seen in the reference below.<br/>
 * : <br/>
 */
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.LocationSettingsRequest.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.LocationSettingsRequest.Builder());
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest.Builder addAllLocationRequests(java.util.Collection<org.xms.g.location.LocationRequest> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.location.LocationSettingsRequest.Builder addLocationRequest(org.xms.g.location.LocationRequest param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addLocationRequest(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addLocationRequest(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addLocationRequest(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addLocationRequest(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.LocationSettingsRequest hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.LocationSettingsRequest gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest.Builder setAlwaysShow(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setAlwaysShow(param0)");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setAlwaysShow(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setAlwaysShow(param0)");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setAlwaysShow(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest.Builder setNeedBle(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setNeedBle(param0)");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setNeedBle(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setNeedBle(param0)");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setNeedBle(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.location.LocationSettingsRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.LocationSettingsRequest.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsRequest.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsRequest.Builder;
            }
        }
    }
}