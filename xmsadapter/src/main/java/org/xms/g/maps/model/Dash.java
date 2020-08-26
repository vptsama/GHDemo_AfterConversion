package org.xms.g.maps.model;

/**
 * xms  An immutable class representing a dash used in the stroke pattern for a Polyline or the outline of a Polygon or Circle..<br/>
 * Combination of com.google.android.gms.maps.model.Dash and com.huawei.hms.maps.model.Dash.<br/>
 * com.google.android.gms.maps.model.Dash: An immutable class representing a dash used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
 * com.huawei.hms.maps.model.Dash: Extends PatternItem and represents a dash used in the stroke pattern for a polyline or the outline of a polygon or circle.<br/>
 */
public final class Dash extends org.xms.g.maps.model.PatternItem {
    
    /**
     * org.xms.g.maps.model.Dash.Dash(org.xms.g.utils.XBox) constructor of Dash<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 utils.XBox
     */
    public Dash(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.maps.model.Dash.Dash(float) constructor of Dash<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 float
     */
    public Dash(float param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Dash(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Dash(param0));
        }
    }
    
    /**
     * org.xms.g.maps.model.Dash.getLength() Length in pixels (non-negative).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.Dash.length: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dash#public-final-float-length">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dash#public-final-float-length</a><br/>
     * com.huawei.hms.maps.model.Dash.length: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-dash">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-dash</a><br/>
     * 
     * @return the return object is float
     */
    public float getLength() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Dash) this.getHInstance()).length");
            return ((com.huawei.hms.maps.model.Dash) this.getHInstance()).length;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Dash) this.getGInstance()).length");
            return ((com.google.android.gms.maps.model.Dash) this.getGInstance()).length;
        }
    }
    
    /**
     * org.xms.g.maps.model.Dash.toString() toString<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.Dash.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dash#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dash#public-string-tostring</a><br/>
     * com.huawei.hms.maps.model.Dash.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-dash">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-dash</a><br/>
     * 
     * @return the return object is java.lang.String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Dash) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Dash) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Dash) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Dash) this.getGInstance()).toString();
        }
    }
    
    /**
     * XMS does not provide this api.
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.maps.model.Dash.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Dash<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.model.Dash object
     */
    public static org.xms.g.maps.model.Dash dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Dash) param0);
    }
    
    /**
     * org.xms.g.maps.model.Dash.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Dash;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Dash;
        }
    }
}