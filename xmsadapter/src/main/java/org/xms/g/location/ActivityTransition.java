package org.xms.g.location;

/**
 * Represents an activity and the transition of it. For instance start to walk; stop running etc..<br/>
 * Combination of com.google.android.gms.location.ActivityTransition and com.huawei.hms.location.ActivityConversionInfo.<br/>
 * com.google.android.gms.location.ActivityTransition: Represents an activity and the transition of it. For instance start to walk; stop running etc.<br/>
 * com.huawei.hms.location.ActivityConversionInfo: Activity conversion.<br/>
 */
public class ActivityTransition extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.google.android.gms.location.ActivityTransition.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-static-final-creatoractivitytransition-creator">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-static-final-creatoractivitytransition-creator</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversioninfo-0000001050746165-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversioninfo-0000001050746165-V5</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.ActivityTransition createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.ActivityConversionInfo hReturn = com.huawei.hms.location.ActivityConversionInfo.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransition(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.ActivityTransition gReturn = com.google.android.gms.location.ActivityTransition.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransition(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.location.ActivityTransition[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransition[param0];
        }
    };
    
    /**
     * org.xms.g.location.ActivityTransition.ActivityTransition(org.xms.g.utils.XBox) Constructor of ActivityTransition with XBox<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The wrapper of xms instance
     */
    public ActivityTransition(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.location.ActivityTransition.getACTIVITY_TRANSITION_ENTER() Return the Constant Value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_ENTER: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-static-final-int-activity_transition_enter">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-static-final-int-activity_transition_enter</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.ENTER_ACTIVITY_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section1254213477129">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section1254213477129</a><br/>
     * 
     * @return The constant value that user enters the given activity
     */
    public static int getACTIVITY_TRANSITION_ENTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionInfo.ENTER_ACTIVITY_CONVERSION");
            return com.huawei.hms.location.ActivityConversionInfo.ENTER_ACTIVITY_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_ENTER");
            return com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_ENTER;
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.getACTIVITY_TRANSITION_EXIT() Return the Constant Value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_EXIT: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-static-final-int-activity_transition_exit">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-static-final-int-activity_transition_exit</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.EXIT_ACTIVITY_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section1528611994020">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section1528611994020</a><br/>
     * 
     * @return the constant value that user exits the given activity
     */
    public static int getACTIVITY_TRANSITION_EXIT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionInfo.EXIT_ACTIVITY_CONVERSION");
            return com.huawei.hms.location.ActivityConversionInfo.EXIT_ACTIVITY_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_EXIT");
            return com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_EXIT;
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-boolean-equals-object-object">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-boolean-equals-object-object</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.equals(java.lang.Object)
     * @param  param0 The other instance
     * @return True if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).equals(param0);
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.getActivityType() Gets the type of the activity to be detected.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.getActivityType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-int-getactivitytype">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-int-getactivitytype</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.getActivityType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section9194145513470">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section9194145513470</a><br/>
     * 
     * @return The type of the activity
     */
    public int getActivityType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getActivityType()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getActivityType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getActivityType()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getActivityType();
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.getTransitionType() Gets the interested transition type. It's one of the ACTIVITY_TRANSITION_xxx constants.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.getTransitionType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-int-gettransitiontype">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-int-gettransitiontype</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.getConversionType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section9254532817">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversioninfo-0000001050746165#EN-US_TOPIC_0000001050746165__section9254532817</a><br/>
     * 
     * @return The interested transition type
     */
    public int getTransitionType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getConversionType()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getConversionType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getTransitionType()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getTransitionType();
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-int-hashcode</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.hashCode()
     * @return A hash code value
     */
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).hashCode();
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-string-tostring</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.toString()
     * @return A character string after being converted
     */
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).toString();
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityTransition.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransition#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     * com.huawei.hms.location.ActivityConversionInfo.writeToParcel(android.os.Parcel,int)
     * @param  param0 Parcel to which this object is written
     * @param  param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    /**
     * org.xms.g.location.ActivityTransition.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityTransition.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The input object
     * @return Casted ActivityTransition object
     */
    public static org.xms.g.location.ActivityTransition dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransition) param0);
    }
    
    /**
     * org.xms.g.location.ActivityTransition.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionInfo;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransition;
        }
    }
    
/**
 * .<br/>
 * HMS does not provide in this Class. More details about the related GMS api can be seen in the reference below.<br/>
 * : <br/>
 */
    public static class Builder extends org.xms.g.utils.XObject {
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.ActivityConversionInfo.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.ActivityTransition.Builder());
            }
        }
        
        public org.xms.g.location.ActivityTransition build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.ActivityConversionInfo hReturn = ((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransition(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.ActivityTransition gReturn = ((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransition(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.location.ActivityTransition.Builder setActivityTransition(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setConversionType(param0)");
                com.huawei.hms.location.ActivityConversionInfo.Builder hReturn = ((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setConversionType(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityTransition(param0)");
                com.google.android.gms.location.ActivityTransition.Builder gReturn = ((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityTransition(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.location.ActivityTransition.Builder setActivityType(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setActivityType(param0)");
                com.huawei.hms.location.ActivityConversionInfo.Builder hReturn = ((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setActivityType(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityType(param0)");
                com.google.android.gms.location.ActivityTransition.Builder gReturn = ((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityType(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.location.ActivityTransition.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.ActivityTransition.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionInfo.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransition.Builder;
            }
        }
    }
}