package org.xms.g.location;

/**
 * The main entry point for interacting with activity recognition..<br/>
 * HMS does not provide in this Class. More details about the related GMS api can be seen in the reference below.<br/>
 * com.google.android.gms.location.ActivityRecognitionApi: The main entry point for interacting with activity recognition.<br/>
 */
public interface ActivityRecognitionApi extends org.xms.g.utils.XInterface {
    
    /**
     * XMS does not provide this api.
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);
    
    /**
     * XMS does not provide this api.
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, long param1, android.app.PendingIntent param2);
    
    default java.lang.Object getZInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default com.google.android.gms.location.ActivityRecognitionApi getGInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionApi.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityRecognitionApi.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The input object
     * @return Casted ActivityRecognitionApi object
     */
    public static org.xms.g.location.ActivityRecognitionApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionApi.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.ActivityRecognitionApi {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, long param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}