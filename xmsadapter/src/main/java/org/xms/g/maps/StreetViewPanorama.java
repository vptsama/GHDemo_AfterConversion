package org.xms.g.maps;

/**
 * xms This is the main class of the Street View feature in the Maps SDK for Android and is the entry point for all methods related to Street View panoramas..<br/>
 * Combination of com.google.android.gms.maps.StreetViewPanorama and com.huawei.hms.maps.StreetViewPanorama.<br/>
 * com.google.android.gms.maps.StreetViewPanorama: This is the main class of the Street View feature in the Google Maps SDK for Android and is the entry point for all methods related to Street View panoramas. You cannot instantiate a StreetViewPanorama object directly, rather, you must obtain one from the #getStreetViewPanoramaAsync() method on a StreetViewPanoramaFragment or StreetViewPanoramaView that you have added to your application.<br/>
 * com.huawei.hms.maps.StreetViewPanorama: This is the main class of the Street View feature in the Huawei Maps SDK for Android and is the entry point for all methods related to Street View panoramas.<br/>
 */
public class StreetViewPanorama extends org.xms.g.utils.XObject {
    
    /**
     * org.xms.g.maps.StreetViewPanorama.StreetViewPanorama(org.xms.g.utils.XBox) constructor of StreetViewPanorama<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 utils.XBox
     */
    public StreetViewPanorama(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.animateTo(org.xms.g.maps.model.StreetViewPanoramaCamera,long) Changes the current camera position, orientation and zoom, to a given position over a specified duration<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.animateTo(org.xms.g.maps.model.StreetViewPanoramaCamera,long): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-animateto-streetviewpanoramacamera-camera,-long-duration">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-animateto-streetviewpanoramacamera-camera,-long-duration</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.animateTo (com.huawei.hms.maps.model.StreetViewPanoramaCamera,long)
     * @param  param0 model.StreetViewPanoramaCamera
     * @param  param1 long
     */
    public void animateTo(org.xms.g.maps.model.StreetViewPanoramaCamera param0, long param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).animateTo(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).animateTo(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).animateTo(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).animateTo(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))), param1);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.getLocation() Returns the current location of the user and information regarding the current panorama's adjacent panoramas<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.getLocation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramalocation-getlocation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramalocation-getlocation</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.getLocation()
     * @return maps.model.StreetViewPanoramaLocation location
     */
    public org.xms.g.maps.model.StreetViewPanoramaLocation getLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getLocation()");
            com.huawei.hms.maps.model.StreetViewPanoramaLocation hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getLocation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getLocation()");
            com.google.android.gms.maps.model.StreetViewPanoramaLocation gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getLocation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.getPanoramaCamera() Returns the current orientation and zoom<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.getPanoramaCamera(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramacamera-getpanoramacamera">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramacamera-getpanoramacamera</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.getPanoramaCamera()
     * @return maps.model.StreetViewPanoramaCamera panorama camera
     */
    public org.xms.g.maps.model.StreetViewPanoramaCamera getPanoramaCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getPanoramaCamera()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getPanoramaCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getPanoramaCamera()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getPanoramaCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.isPanningGesturesEnabled() Returns whether or not the panning gestures are enabled for the user<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.isPanningGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.isPanningGesturesEnabled()
     * @return boolean boolean
     */
    public boolean isPanningGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isPanningGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isPanningGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isPanningGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isPanningGesturesEnabled();
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.isStreetNamesEnabled() Returns whether or not the street names appear on the panorama<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.isStreetNamesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.isStreetNamesEnabled()
     * @return boolean boolean
     */
    public boolean isStreetNamesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isStreetNamesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isStreetNamesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isStreetNamesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isStreetNamesEnabled();
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.isUserNavigationEnabled() Returns whether or not the panning gestures are enabled for the user<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.isUserNavigationEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.isUserNavigationEnabled()
     * @return boolean boolean
     */
    public boolean isUserNavigationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isUserNavigationEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isUserNavigationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isUserNavigationEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isUserNavigationEnabled();
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.isZoomGesturesEnabled() Returns whether or not the zoom gestures are enabled for the user<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.isZoomGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-iszoomgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-iszoomgesturesenabled</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.isZoomGesturesEnabled()
     * @return boolean boolean
     */
    public boolean isZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isZoomGesturesEnabled();
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.orientationToPoint(org.xms.g.maps.model.StreetViewPanoramaOrientation) Returns a screen location that corresponds to an orientation (StreetViewPanoramaOrientation). The screen location is in screen pixels (not display pixels) relative to the top left of the Street View panorama (not of the whole screen).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-point-orientationtopoint-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-point-orientationtopoint-streetviewpanoramaorientation-orientation</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.orientationToPoint (com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
     * @param  param0 maps.model.StreetViewPanoramaOrientation
     * @return android.graphics.Point android.graphics.point
     */
    public android.graphics.Point orientationToPoint(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).orientationToPoint(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).orientationToPoint(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).orientationToPoint(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).orientationToPoint(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.pointToOrientation(android.graphics.Point) Returns the orientation that corresponds to a screen location. The screen location is specified in screen pixels (not display pixels) relative to the top left of the Street View panorama (not the top left of the whole screen).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.pointToOrientation(android.graphics.Point): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramaorientation-pointtoorientation-point-point">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramaorientation-pointtoorientation-point-point</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.pointToOrientation (android.graphics.Point)
     * @param  param0 android.graphics.Point
     * @return maps.model.StreetViewPanoramaOrientation return object is maps.model.StreetViewPanoramaOrientation
     */
    public org.xms.g.maps.model.StreetViewPanoramaOrientation pointToOrientation(android.graphics.Point param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).pointToOrientation(param0)");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).pointToOrientation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).pointToOrientation(param0)");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).pointToOrientation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaCameraChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) Sets a callback that's invoked when the camera changes<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaCameraChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramacamerachangelistener-streetviewpanorama.onstreetviewpanoramacamerachangelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramacamerachangelistener-streetviewpanorama.onstreetviewpanoramacamerachangelistener-listener</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setOnStreetViewPanoramaCameraChangeListener (com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener)
     * @param  param0 maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
     */
    public void setOnStreetViewPanoramaCameraChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaCameraChangeListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaCameraChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaCameraChangeListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaCameraChangeListener())));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) Sets a callback that's invoked when the panorama changes<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramachangelistener-streetviewpanorama.onstreetviewpanoramachangelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramachangelistener-streetviewpanorama.onstreetviewpanoramachangelistener-listener</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setOnStreetViewPanoramaChangeListener (com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener)
     * @param  param0 maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
     */
    public void setOnStreetViewPanoramaChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaChangeListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaChangeListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaChangeListener())));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) Sets a callback that's invoked when the panorama is tapped.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramaclicklistener-streetviewpanorama.onstreetviewpanoramaclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramaclicklistener-streetviewpanorama.onstreetviewpanoramaclicklistener-listener</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setOnStreetViewPanoramaClickListener (com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener)
     * @param  param0 the param 0
     */
    public void setOnStreetViewPanoramaClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaClickListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaClickListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaClickListener())));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaLongClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) Sets a callback that's invoked when the panorama is long-pressed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaLongClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramalongclicklistener-streetviewpanorama.onstreetviewpanoramalongclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramalongclicklistener-streetviewpanorama.onstreetviewpanoramalongclicklistener-listener</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setOnStreetViewPanoramaLongClickListener (com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener)
     * @param  param0 maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
     */
    public void setOnStreetViewPanoramaLongClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaLongClickListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaLongClickListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaLongClickListener())));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setPanningGesturesEnabled(boolean) Sets whether the user is able to use panning gestures<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setPanningGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setpanninggesturesenabled-boolean-enablepanning">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setpanninggesturesenabled-boolean-enablepanning</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPanningGesturesEnabled (boolean)
     * @param  param0 boolean
     */
    public void setPanningGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPanningGesturesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPanningGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPanningGesturesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPanningGesturesEnabled(param0);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,org.xms.g.maps.model.StreetViewSource) Sets the StreetViewPanorama to a given location<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,org.xms.g.maps.model.StreetViewSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-streetviewsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-streetviewsource-source</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition (com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.StreetViewSource)
     * @param  param0 the param should be instanceof maps.model.LatLng
     * @param  param1 the param should be instanceof maps.model.StreetViewSource
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.StreetViewSource param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng) Sets the StreetViewPanorama to a given location<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition (com.huawei.hms.maps.model.LatLng)
     * @param  param0 the param should be instanceof maps.model.LatLng
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,int) Sets the StreetViewPanorama to a given location<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition (com.huawei.hms.maps.model.LatLng,int)
     * @param  param0 the param should be instanceof maps.model.LatLng
     * @param  param1 the param should be instanceof int
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,int,org.xms.g.maps.model.StreetViewSource) Sets the StreetViewPanorama to a given location<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng,int,com.google.android.gms.maps.model.StreetViewSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius,-streetviewsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius,-streetviewsource-source</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition (com.huawei.hms.maps.model.LatLng,int,com.huawei.hms.maps.model.StreetViewSource)
     * @param  param0 the param should be instanceof maps.model.LatLng
     * @param  param1 the param should be instanceof int
     * @param  param2 the param should be instanceof maps.model.StreetViewSource
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0, int param1, org.xms.g.maps.model.StreetViewSource param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))));
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(java.lang.String) Sets the StreetViewPanorama to a given location<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-string-panoid">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-string-panoid</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition (java.lang.String)
     * @param  param0 the param should be instanceof java.lang.String
     */
    public void setPosition(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(param0);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setStreetNamesEnabled(boolean) Sets whether the user is able to see street names on panoramas<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setStreetNamesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setstreetnamesenabled-boolean-enablestreetnames">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setstreetnamesenabled-boolean-enablestreetnames</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setStreetNamesEnabled (boolean)
     * @param  param0 the param should be instanceof boolean
     */
    public void setStreetNamesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setStreetNamesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setStreetNamesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setStreetNamesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setStreetNamesEnabled(param0);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setUserNavigationEnabled(boolean) Sets whether the user is able to move to another panorama<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setUserNavigationEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setusernavigationenabled-boolean-enableusernavigation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setusernavigationenabled-boolean-enableusernavigation</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setUserNavigationEnabled (boolean)
     * @param  param0 the param should be instanceof boolean
     */
    public void setUserNavigationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setUserNavigationEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setUserNavigationEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setUserNavigationEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setUserNavigationEnabled(param0);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.setZoomGesturesEnabled(boolean) Sets whether the user is able to use zoom gestures<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setZoomGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setzoomgesturesenabled-boolean-enablezoom">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setzoomgesturesenabled-boolean-enablezoom</a><br/>
     * com.huawei.hms.maps.StreetViewPanorama.setZoomGesturesEnabled (boolean)
     * @param  param0 the param should be instanceof boolean
     */
    public void setZoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setZoomGesturesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setZoomGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setZoomGesturesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setZoomGesturesEnabled(param0);
        }
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanorama<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.StreetViewPanorama object
     */
    public static org.xms.g.maps.StreetViewPanorama dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanorama) param0);
    }
    
    /**
     * org.xms.g.maps.StreetViewPanorama.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama;
        }
    }
    
/**
 * A listener for when the StreetViewPanoramaCamera changes.<br/>
 * Combination of com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener and com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.<br/>
 * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener: A listener for when the StreetViewPanoramaCamera changes<br/>
 * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener: A listener for when the StreetViewPanoramaCamera changes<br/>
 */
    public static interface OnStreetViewPanoramaCameraChangeListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera param0);
        
        default java.lang.Object getZInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaCameraChangeListener();
            } else {
                return getGInstanceOnStreetViewPanoramaCameraChangeListener();
            }
        }
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener getGInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() {
                
                public void onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.this.onStreetViewPanoramaCameraChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener getHInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() {
                
                public void onStreetViewPanoramaCameraChange(com.huawei.hms.maps.model.StreetViewPanoramaCamera param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.this.onStreetViewPanoramaCameraChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getHInstance()).onStreetViewPanoramaCameraChange(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getHInstance()).onStreetViewPanoramaCameraChange(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getGInstance()).onStreetViewPanoramaCameraChange(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getGInstance()).onStreetViewPanoramaCameraChange(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
/**
 * A listener for when the Street View panorama loads a new panorama.<br/>
 * Combination of com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener and com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.<br/>
 * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener: A listener for when the Street View panorama loads a new panorama<br/>
 * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener: A listener for when the Street View panorama loads a new panorama<br/>
 */
    public static interface OnStreetViewPanoramaChangeListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation param0);
        
        default java.lang.Object getZInstanceOnStreetViewPanoramaChangeListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaChangeListener();
            } else {
                return getGInstanceOnStreetViewPanoramaChangeListener();
            }
        }
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener getGInstanceOnStreetViewPanoramaChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() {
                
                public void onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.this.onStreetViewPanoramaChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener getHInstanceOnStreetViewPanoramaChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() {
                
                public void onStreetViewPanoramaChange(com.huawei.hms.maps.model.StreetViewPanoramaLocation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.this.onStreetViewPanoramaChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getHInstance()).onStreetViewPanoramaChange(((com.huawei.hms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getHInstance()).onStreetViewPanoramaChange(((com.huawei.hms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getGInstance()).onStreetViewPanoramaChange(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getGInstance()).onStreetViewPanoramaChange(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
/**
 * Callback interface for when the user taps on the panorama..<br/>
 * Combination of com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener and com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.<br/>
 * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener: Callback interface for when the user taps on the panorama.<br/>
 * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener: Callback interface for when the user taps on the panorama.<br/>
 */
    public static interface OnStreetViewPanoramaClickListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0);
        
        default java.lang.Object getZInstanceOnStreetViewPanoramaClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaClickListener();
            } else {
                return getGInstanceOnStreetViewPanoramaClickListener();
            }
        }
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener getGInstanceOnStreetViewPanoramaClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() {
                
                public void onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.this.onStreetViewPanoramaClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener getHInstanceOnStreetViewPanoramaClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() {
                
                public void onStreetViewPanoramaClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.this.onStreetViewPanoramaClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getHInstance()).onStreetViewPanoramaClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getHInstance()).onStreetViewPanoramaClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getGInstance()).onStreetViewPanoramaClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getGInstance()).onStreetViewPanoramaClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
/**
 * Callback interface for when the user long presses on the panorama..<br/>
 * Combination of com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener and com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.<br/>
 * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener: Callback interface for when the user long presses on the panorama.<br/>
 * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener: Callback interface for when the user long presses on the panorama.<br/>
 */
    public static interface OnStreetViewPanoramaLongClickListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0);
        
        default java.lang.Object getZInstanceOnStreetViewPanoramaLongClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaLongClickListener();
            } else {
                return getGInstanceOnStreetViewPanoramaLongClickListener();
            }
        }
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener getGInstanceOnStreetViewPanoramaLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() {
                
                public void onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.this.onStreetViewPanoramaLongClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener getHInstanceOnStreetViewPanoramaLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() {
                
                public void onStreetViewPanoramaLongClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.this.onStreetViewPanoramaLongClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getHInstance()).onStreetViewPanoramaLongClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getHInstance()).onStreetViewPanoramaLongClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getGInstance()).onStreetViewPanoramaLongClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getGInstance()).onStreetViewPanoramaLongClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
}