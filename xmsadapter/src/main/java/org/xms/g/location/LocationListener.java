package org.xms.g.location;

/**
 * Used for receiving notifications from the FusedLocationProviderApi when the location has changed..<br/>
 * HMS does not provide in this Class. More details about the related GMS api can be seen in the reference below.<br/>
 * com.google.android.gms.location.LocationListener: Used for receiving notifications from the FusedLocationProviderApi when the location has changed.<br/>
 */
public interface LocationListener extends org.xms.g.utils.XInterface {
    
    /**
     * XMS does not provide this api.
     */
    public void onLocationChanged(android.location.Location param0);
    
    default java.lang.Object getZInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default com.google.android.gms.location.LocationListener getGInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.location.LocationListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the input object
     * @return casted LocationListener object
     */
    public static org.xms.g.location.LocationListener dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.location.LocationListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.LocationListener {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void onLocationChanged(android.location.Location param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}