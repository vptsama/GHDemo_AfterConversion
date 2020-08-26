package org.xms.g.maps.model;

/**
 * xms An immutable class that aggregates all camera position parameters such as location, zoom level, tilt angle, and bearing..<br/>
 * Combination of com.google.android.gms.maps.model.CameraPosition and com.huawei.hms.maps.model.CameraPosition.<br/>
 * com.google.android.gms.maps.model.CameraPosition: An immutable class that aggregates all camera position parameters such as location, zoom level, tilt angle, and bearing. Use CameraPosition.Builder to construct a CameraPosition instance, which you can then use in conjunction with CameraUpdateFactory. For more information, see Moving the camera.<br/>
 * com.huawei.hms.maps.model.CameraPosition: An immutable class that encapsulates all camera attributes.<br/>
 */
public final class CameraPosition extends org.xms.g.utils.XObject {
    
    /**
     * org.xms.g.maps.model.CameraPosition.CameraPosition(org.xms.g.utils.XBox) constructor of CameraPosition<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 utils.XBox
     */
    public CameraPosition(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.CameraPosition(org.xms.g.maps.model.LatLng,float,float,float) constructor of CameraPosition<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 maps.model.LatLng
     * @param  param1 float
     * @param  param2 float
     * @param  param3 float
     * @throws  java.lang.NullPointerException if target is null
     * @throws  java.lang.IllegalArgumentException if tilt is outside the range of 0 to 90 degrees inclusive.
     */
    public CameraPosition(org.xms.g.maps.model.LatLng param0, float param1, float param2, float param3) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CameraPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2, param3));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CameraPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2, param3));
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.getBearing() Direction that the camera is pointing in, in degrees clockwise from north.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.bearing: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-float-bearing</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.bearing: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @return the return object is float
     */
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).bearing;
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.getTarget() The location that the camera is pointing at.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.target: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-latlng-target">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-latlng-target</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.target: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @return the return object is maps.model.LatLng
     */
    public org.xms.g.maps.model.LatLng getTarget() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).target");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).target;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).target");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).target;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.getTilt() The angle, in degrees, of the camera angle from the nadir (directly facing the Earth). See tilt(float) for details of restrictions on the range of values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.tilt: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-float-tilt</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.tilt: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @return the return object is float
     */
    public float getTilt() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).tilt");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).tilt;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).tilt");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).tilt;
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.getZoom() Zoom level near the center of the screen. See zoom(float) for the definition of the camera's zoom level.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.zoom: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-final-float-zoom</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.zoom: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @return the return object is float
     */
    public float getZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).zoom");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).zoom;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).zoom");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).zoom;
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.builder(org.xms.g.maps.model.CameraPosition) Obtains a CameraPosition.Builder object for modifying camera attributes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.builder(org.xms.g.maps.model.CameraPosition): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition.builder-builder-cameraposition-camera">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition.builder-builder-cameraposition-camera</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.builder(org.xms.g.maps.model.CameraPosition): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#builder(CameraPosition)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#builder(CameraPosition)</a><br/>
     * 
     * @param  param0 the param should instanceof maps.model.CameraPosition
     * @return the return object is maps.model.CameraPosition.Builder
     */
    public static org.xms.g.maps.model.CameraPosition.Builder builder(org.xms.g.maps.model.CameraPosition param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.builder(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.CameraPosition.Builder hReturn = com.huawei.hms.maps.model.CameraPosition.builder(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.builder(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.CameraPosition.Builder gReturn = com.google.android.gms.maps.model.CameraPosition.builder(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.builder() Obtains a CameraPosition.Builder object for modifying camera attributes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition.builder-builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition.builder-builder</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.builder(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#builder()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#builder()</a><br/>
     * 
     * @return the return object is maps.model.CameraPosition.Builder
     */
    public static org.xms.g.maps.model.CameraPosition.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.builder()");
            com.huawei.hms.maps.model.CameraPosition.Builder hReturn = com.huawei.hms.maps.model.CameraPosition.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.builder()");
            com.google.android.gms.maps.model.CameraPosition.Builder gReturn = com.google.android.gms.maps.model.CameraPosition.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.createFromAttributes(android.content.Context,android.util.AttributeSet) Creates a CameraPosition object with specified attributes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.createFromAttributes(android.content.Context,android.util.AttributeSet): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition-createfromattributes-context-context,-attributeset-attrs">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition-createfromattributes-context-context,-attributeset-attrs</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.createFromAttributes(android.content.Context,android.util.AttributeSet): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#createFromAttributes(Context,AttributeSet)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#createFromAttributes(Context,AttributeSet)</a><br/>
     * 
     * @param  param0 the param should instanceof android.content.Context
     * @param  param1 the param should instanceof android.util.AttributeSet
     * @return the return object is maps.model.CameraPosition
     */
    public static final org.xms.g.maps.model.CameraPosition createFromAttributes(android.content.Context param0, android.util.AttributeSet param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.createFromAttributes(param0, param1)");
            com.huawei.hms.maps.model.CameraPosition hReturn = com.huawei.hms.maps.model.CameraPosition.createFromAttributes(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.createFromAttributes(param0, param1)");
            com.google.android.gms.maps.model.CameraPosition gReturn = com.google.android.gms.maps.model.CameraPosition.createFromAttributes(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.equals(java.lang.Object) equals<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-boolean-equals-object-o</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.equals(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return the return object is boolean
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).equals(param0);
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.fromLatLngZoom(org.xms.g.maps.model.LatLng,float) Constructs a CameraPosition pointed for a particular target and zoom level. The resultant bearing is North, and the viewing angle is perpendicular to the Earth's surface. i.e., directly facing the Earth's surface, with the top of the screen pointing North.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.LatLng.fromLatLngZoom(com.google.android.gms.maps.model.LatLng,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition-fromlatlngzoom-latlng-target,-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-static-cameraposition-fromlatlngzoom-latlng-target,-float-zoom</a><br/>
     * com.huawei.hms.maps.model.LatLng.fromLatLngZoom(com.huawei.hms.maps.model.LatLng,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#fromLatLngZoom(LatLng,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition#fromLatLngZoom(LatLng,float)</a><br/>
     * 
     * @param  param0 the param should instanceof maps.model.LatLng
     * @param  param1 the param should instanceof float
     * @return the return object is maps.model.CameraPosition
     */
    public static final org.xms.g.maps.model.CameraPosition fromLatLngZoom(org.xms.g.maps.model.LatLng param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.fromLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.model.CameraPosition hReturn = com.huawei.hms.maps.model.CameraPosition.fromLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.fromLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.model.CameraPosition gReturn = com.google.android.gms.maps.model.CameraPosition.fromLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.hashCode() hashCode<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-int-hashcode</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).hashCode();
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.toString() toString<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-string-tostring</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @return the return object is java.lang.String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).toString();
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.writeToParcel(android.os.Parcel,int) writeToParcel<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.CameraPosition.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CameraPosition#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     * com.huawei.hms.maps.model.CameraPosition.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraposition</a><br/>
     * 
     * @param  param0 the param should instanceof android.os.Parcel
     * @param  param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.CameraPosition<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.model.CameraPosition object
     */
    public static org.xms.g.maps.model.CameraPosition dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.CameraPosition) param0);
    }
    
    /**
     * org.xms.g.maps.model.CameraPosition.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CameraPosition;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CameraPosition;
        }
    }
    
/**
 * : Builds camera position..<br/>
 * Combination of com.google.android.gms.maps.model.CameraPosition.Builder and com.huawei.hms.maps.model.CameraPosition.Builder.<br/>
 * com.google.android.gms.maps.model.CameraPosition.Builder: Builds camera position.<br/>
 * com.huawei.hms.maps.model.CameraPosition.Builder: An internal API of the CameraPosition class. The API contains the build(), bearing(float bearing), target(LatLng location), tilt(float tilt), and zoom(float zoom) methods.<br/>
 */
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.CameraPosition.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.CameraPosition.Builder());
            }
        }
        
        public Builder(org.xms.g.maps.model.CameraPosition param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.CameraPosition.Builder(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.CameraPosition.Builder(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder bearing(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).bearing(param0)");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).bearing(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).bearing(param0)");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).bearing(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.CameraPosition hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.CameraPosition gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder target(org.xms.g.maps.model.LatLng param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).target(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).target(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).target(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).target(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder tilt(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).tilt(param0)");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).tilt(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).tilt(param0)");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).tilt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder zoom(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).zoom(param0)");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).zoom(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).zoom(param0)");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).zoom(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.maps.model.CameraPosition.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.CameraPosition.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CameraPosition.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CameraPosition.Builder;
            }
        }
    }
}