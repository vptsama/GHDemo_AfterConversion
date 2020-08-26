package org.xms.g.maps;

/**
 * xms Callback interface for when the Street View panorama is ready to be used..<br/>
 * Combination of com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback and com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback.<br/>
 * com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback: Callback interface for when the Street View panorama is ready to be used.<br/>
 * com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback: Called when a street view panorama is ready for use. Currently, street view panorama–related classes are not supported, including StreetViewPanoramaCamera, StreetViewPanoramaFragment, StreetViewPanoramaOptions, StreetViewPanoramaView, and SupportStreetViewPanoramaFragment.<br/>
 */
public interface OnStreetViewPanoramaReadyCallback extends org.xms.g.utils.XInterface {
    
    /**
     * org.xms.g.maps.OnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama) Callback interface for when the Street View panorama is ready to be used.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/OnStreetViewPanoramaReadyCallback#public-abstract-void-onstreetviewpanoramaready-streetviewpanorama-panorama">https://developers.google.com/android/reference/com/google/android/gms/maps/OnStreetViewPanoramaReadyCallback#public-abstract-void-onstreetviewpanoramaready-streetviewpanorama-panorama</a><br/>
     * com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onstreetviewpanoramareadyc#onStreetViewPanoramaReady(StreetViewPanorama)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onstreetviewpanoramareadyc#onStreetViewPanoramaReady(StreetViewPanorama)</a><br/>
     * 
     * @param  param0 the param 0
     */
    public void onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama param0);
    
    default java.lang.Object getZInstanceOnStreetViewPanoramaReadyCallback() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceOnStreetViewPanoramaReadyCallback();
        } else {
            return getGInstanceOnStreetViewPanoramaReadyCallback();
        }
    }
    
    default com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback getGInstanceOnStreetViewPanoramaReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback() {
            
            public void onStreetViewPanoramaReady(com.google.android.gms.maps.StreetViewPanorama param0) {
                org.xms.g.maps.OnStreetViewPanoramaReadyCallback.this.onStreetViewPanoramaReady(((param0) == null ? null : (new org.xms.g.maps.StreetViewPanorama(new org.xms.g.utils.XBox(param0, null)))));
            }
        };
    }
    
    default com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback getHInstanceOnStreetViewPanoramaReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback() {
            
            public void onStreetViewPanoramaReady(com.huawei.hms.maps.StreetViewPanorama param0) {
                org.xms.g.maps.OnStreetViewPanoramaReadyCallback.this.onStreetViewPanoramaReady(((param0) == null ? null : (new org.xms.g.maps.StreetViewPanorama(new org.xms.g.utils.XBox(null, param0)))));
            }
        };
    }
    
    /**
     * org.xms.g.maps.OnStreetViewPanoramaReadyCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.OnStreetViewPanoramaReadyCallback<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.OnStreetViewPanoramaReadyCallback object
     */
    public static org.xms.g.maps.OnStreetViewPanoramaReadyCallback dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.OnStreetViewPanoramaReadyCallback) param0);
    }
    
    /**
     * org.xms.g.maps.OnStreetViewPanoramaReadyCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
            }
        }
        return param0 instanceof org.xms.g.maps.OnStreetViewPanoramaReadyCallback;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.OnStreetViewPanoramaReadyCallback {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) this.getHInstance()).onStreetViewPanoramaReady(((com.huawei.hms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) this.getHInstance()).onStreetViewPanoramaReady(((com.huawei.hms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) this.getGInstance()).onStreetViewPanoramaReady(((com.google.android.gms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) this.getGInstance()).onStreetViewPanoramaReady(((com.google.android.gms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
}