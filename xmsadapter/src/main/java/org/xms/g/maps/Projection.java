package org.xms.g.maps;

/**
 * xms A projection is used to translate between on screen location and geographic coordinates on the surface of the Earth (LatLng)..<br/>
 * Combination of com.google.android.gms.maps.Projection and com.huawei.hms.maps.Projection.<br/>
 * com.google.android.gms.maps.Projection: A projection is used to translate between on screen location and geographic coordinates on the surface of the Earth (LatLng). Screen location is in screen pixels (not display pixels) with respect to the top left corner of the map (and not necessarily of the whole screen).<br/>
 * com.huawei.hms.maps.Projection: A final class that extends Object and converts between the screen coordinates and longitude/latitude coordinates.<br/>
 */
public final class Projection extends org.xms.g.utils.XObject {
    
    /**
     * org.xms.g.maps.Projection.Projection(org.xms.g.utils.XBox) Converts screen coordinates to longitude/latitude coordinates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.Projection: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/Projection">https://developers.google.com/android/reference/com/google/android/gms/maps/Projection</a><br/>
     * com.huawei.hms.maps.Projection: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection</a><br/>
     * 
     * @param  param0 this is param0
     * @param  param0 the param 0
     * @param  param0 the param0
     */
    public Projection(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.maps.Projection.fromScreenLocation(android.graphics.Point) Returns the geographic location that corresponds to a screen location. The screen location is specified in screen pixels (not display pixels) relative to the top left of the map (not the top left of the whole screen).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.Projection.fromScreenLocation(android.graphics.Point): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/Projection#public-latlng-fromscreenlocation-point-point">https://developers.google.com/android/reference/com/google/android/gms/maps/Projection#public-latlng-fromscreenlocation-point-point</a><br/>
     * com.huawei.hms.maps.Projection.fromScreenLocation(android.graphics.Point): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection#fromScreenLocation(Point)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection#fromScreenLocation(Point)</a><br/>
     * 
     * @param  param0 android.graphics.Point
     * @return maps.model.LatLng
     */
    public final org.xms.g.maps.model.LatLng fromScreenLocation(android.graphics.Point param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.Projection) this.getHInstance()).fromScreenLocation(param0)");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.Projection) this.getHInstance()).fromScreenLocation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.Projection) this.getGInstance()).fromScreenLocation(param0)");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.Projection) this.getGInstance()).fromScreenLocation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.Projection.getVisibleRegion() Obtains the visible region after conversion between the screen coordinates and longitude/latitude coordinates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.Projection.getVisibleRegion(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/Projection#getVisibleRegion()">https://developers.google.com/android/reference/com/google/android/gms/maps/Projection#getVisibleRegion()</a><br/>
     * com.huawei.hms.maps.Projection.getVisibleRegion(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection#getVisibleRegion()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection#getVisibleRegion()</a><br/>
     * 
     * @return model.VisibleRegion
     */
    public final org.xms.g.maps.model.VisibleRegion getVisibleRegion() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.Projection) this.getHInstance()).getVisibleRegion()");
            com.huawei.hms.maps.model.VisibleRegion hReturn = ((com.huawei.hms.maps.Projection) this.getHInstance()).getVisibleRegion();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.VisibleRegion(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.Projection) this.getGInstance()).getVisibleRegion()");
            com.google.android.gms.maps.model.VisibleRegion gReturn = ((com.google.android.gms.maps.Projection) this.getGInstance()).getVisibleRegion();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.VisibleRegion(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.Projection.toScreenLocation(org.xms.g.maps.model.LatLng) Converts longitude/latitude coordinates to screen coordinates. You can call this method to obtain a location on the screen corresponding to a longitude and latitude. The location on the screen is specified in screen pixels (instead of display pixels) relative to the top left corner of the map (instead of the top left corner of the screen).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.Projection.toScreenLocation(org.xms.g.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/Projection#public-point-toscreenlocation-latlng-location">https://developers.google.com/android/reference/com/google/android/gms/maps/Projection#public-point-toscreenlocation-latlng-location</a><br/>
     * com.huawei.hms.maps.Projection.toScreenLocation(org.xms.g.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection#toScreenLocation(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-projection#toScreenLocation(LatLng)</a><br/>
     * 
     * @param  param0 maps.model.LatLng
     * @return android.graphics.Point
     */
    public final android.graphics.Point toScreenLocation(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.Projection) this.getHInstance()).toScreenLocation(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.Projection) this.getHInstance()).toScreenLocation(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.Projection) this.getGInstance()).toScreenLocation(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.Projection) this.getGInstance()).toScreenLocation(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    /**
     * org.xms.g.maps.Projection.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.Projection<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.Projection object
     */
    public static org.xms.g.maps.Projection dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.Projection) param0);
    }
    
    /**
     * org.xms.g.maps.Projection.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.Projection;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.Projection;
        }
    }
}