package org.xms.g.maps.model;

/**
 * xms A partial implementation of TileProvider that only requires a URL that points to an image to be provided..<br/>
 * Combination of com.google.android.gms.maps.model.UrlTileProvider and com.huawei.hms.maps.model.UrlTileProvider.<br/>
 * com.google.android.gms.maps.model.UrlTileProvider: A partial implementation of TileProvider that only requires a URL that points to an image to be provided.<br/>
 * com.huawei.hms.maps.model.UrlTileProvider: Represents the provider of TileOverlay. You only need to provide the URL of the desired image. When using this class, ensure that all images have the same size.<br/>
 */
public abstract class UrlTileProvider extends org.xms.g.utils.XObject implements org.xms.g.maps.model.TileProvider {
    private boolean wrapper = true;
    
    /**
     * org.xms.g.maps.model.UrlTileProvider.UrlTileProvider(org.xms.g.utils.XBox) constructor of UrlTileProvider<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 utils.XBox
     */
    public UrlTileProvider(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    /**
     * org.xms.g.maps.model.UrlTileProvider.UrlTileProvider(int,int) constructor of UrlTileProvider<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 int
     * @param  param1 int
     */
    public UrlTileProvider(int param0, int param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    /**
     * org.xms.g.maps.model.UrlTileProvider.getTile(int,int,int) Returns the tile to be used for this tile coordinate.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.UrlTileProvider.getTile(int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/UrlTileProvider#public-final-tile-gettile-int-x,-int-y,-int-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/UrlTileProvider#public-final-tile-gettile-int-x,-int-y,-int-zoom</a><br/>
     * com.huawei.hms.maps.model.UrlTileProvider.getTile(int,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-urltileprovider#getTile(int,int,int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-urltileprovider#getTile(int,int,int)</a><br/>
     * 
     * @param  param0 the param should be instanceof int
     * @param  param1 the param should be instanceof int
     * @param  param2 the param should be instanceof int
     * @return the return object is maps.model.Tile
     */
    public final org.xms.g.maps.model.Tile getTile(int param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTile(param0, param1, param2)");
            com.huawei.hms.maps.model.Tile hReturn = ((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTile(param0, param1, param2);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTile(param0, param1, param2)");
            com.google.android.gms.maps.model.Tile gReturn = ((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTile(param0, param1, param2);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.g.maps.model.UrlTileProvider.getTileUrl(int,int,int) Returns a URL that points to the image to be used for this tile. If no image is found on the initial request, further requests will be made with an exponential backoff. If you do not wish to provide an image for this tile coordinate, return null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.UrlTileProvider.getTileUrl(int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/UrlTileProvider#public-abstract-url-gettileurl-int-x,-int-y,-int-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/UrlTileProvider#public-abstract-url-gettileurl-int-x,-int-y,-int-zoom</a><br/>
     * com.huawei.hms.maps.model.UrlTileProvider.getTileUrl(int,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-urltileprovider#getTileUrl(int,int,int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-urltileprovider#getTileUrl(int,int,int)</a><br/>
     * 
     * @param  param0 the param should be instanceof int
     * @param  param1 the param should be instanceof int
     * @param  param2 the param should be instanceof int
     * @return the return object is java.net.URL
     */
    public abstract java.net.URL getTileUrl(int param0, int param1, int param2);
    
    /**
     * org.xms.g.maps.model.UrlTileProvider.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.UrlTileProvider<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the param should instanceof java.lang.Object
     * @return cast maps.model.UrlTileProvider object
     */
    public static org.xms.g.maps.model.UrlTileProvider dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.maps.model.UrlTileProvider) {
            return ((org.xms.g.maps.model.UrlTileProvider) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.maps.model.UrlTileProvider gReturn = ((com.google.android.gms.maps.model.UrlTileProvider) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.maps.model.UrlTileProvider hReturn = ((com.huawei.hms.maps.model.UrlTileProvider) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.maps.model.UrlTileProvider.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.maps.model.UrlTileProvider) param0);
    }
    
    /**
     * org.xms.g.maps.model.UrlTileProvider.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.UrlTileProvider;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.UrlTileProvider;
        }
    }
    
    private class GImpl extends com.google.android.gms.maps.model.UrlTileProvider {
        
        public java.net.URL getTileUrl(int param0, int param1, int param2) {
            return org.xms.g.maps.model.UrlTileProvider.this.getTileUrl(param0, param1, param2);
        }
        
        public GImpl(int param0, int param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.hms.maps.model.UrlTileProvider {
        
        public java.net.URL getTileUrl(int param0, int param1, int param2) {
            return org.xms.g.maps.model.UrlTileProvider.this.getTileUrl(param0, param1, param2);
        }
        
        public HImpl(int param0, int param1) {
            super(param0, param1);
        }
    }
    
    public static class XImpl extends org.xms.g.maps.model.UrlTileProvider {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.net.URL getTileUrl(int param0, int param1, int param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTileUrl(param0, param1, param2)");
                return ((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTileUrl(param0, param1, param2);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTileUrl(param0, param1, param2)");
                return ((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTileUrl(param0, param1, param2);
            }
        }
    }
}