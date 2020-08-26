package org.xms.g.maps.model;

/**
 * xms Cap that is squared off after extending half the stroke width beyond the start or end vertex of a Polyline with solid stroke pattern..<br/>
 * Combination of com.google.android.gms.maps.model.SquareCap and com.huawei.hms.maps.model.SquareCap.<br/>
 * com.google.android.gms.maps.model.SquareCap: Cap that is squared off after extending half the stroke width beyond the start or end vertex of a Polyline with solid stroke pattern.<br/>
 * com.huawei.hms.maps.model.SquareCap: Extends Cap and sets the start or end vertex of a polyline to the square type.<br/>
 */
public final class SquareCap extends org.xms.g.maps.model.Cap {
    
    /**
     * org.xms.g.maps.model.SquareCap.SquareCap(org.xms.g.utils.XBox) constructor of SquareCap<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 utils.XBox
     */
    public SquareCap(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.maps.model.SquareCap.SquareCap() constructor of SquareCap<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     */
    public SquareCap() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.SquareCap());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.SquareCap());
        }
    }
    
    /**
     * org.xms.g.maps.model.SquareCap.toString() toString<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.SquareCap.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/SquareCap#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/SquareCap#public-string-tostring</a><br/>
     * com.huawei.hms.maps.model.SquareCap.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-squarecap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-squarecap</a><br/>
     * 
     * @return the return object is java.lang.String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.SquareCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.SquareCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.SquareCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.SquareCap) this.getGInstance()).toString();
        }
    }
    
    /**
     * org.xms.g.maps.model.SquareCap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.SquareCap<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.model.SquareCap object
     */
    public static org.xms.g.maps.model.SquareCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.SquareCap) param0);
    }
    
    /**
     * org.xms.g.maps.model.SquareCap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.SquareCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.SquareCap;
        }
    }
}