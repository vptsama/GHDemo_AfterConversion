package org.xms.g.location;

/**
 * The main entry point for interacting with activity recognition..<br/>
 * Combination of com.google.android.gms.location.ActivityRecognitionClient and com.huawei.hms.location.ActivityIdentificationService.<br/>
 * com.google.android.gms.location.ActivityRecognitionClient: The main entry point for interacting with activity recognition.<br/>
 * com.huawei.hms.location.ActivityIdentificationService: Interaction access point of activity identification.<br/>
 */
public class ActivityRecognitionClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    private boolean wrapper = true;
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.ActivityRecognitionClient(org.xms.g.utils.XBox) Constructor of ActivityRecognitionClient with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The wrapper of xms instance
     */
    public ActivityRecognitionClient(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.ActivityRecognitionClient(android.app.Activity) Wrapper constructor of ActivityIdentificationService and ActivityRecognitionClient.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognitionClient(android.app.Activity): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient</a><br/>
     * com.huawei.hms.location.ActivityIdentificationService(android.app.Activity): <a href="https://developer.huawei.com/consumer/en/doc/activityidentificationservice">https://developer.huawei.com/consumer/en/doc/activityidentificationservice</a><br/>
     * 
     * @param  param0 Activity of android app
     */
    public ActivityRecognitionClient(android.app.Activity param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.ActivityRecognitionClient(android.content.Context) Create a new instance of Client for use in an Context.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognitionClient(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient</a><br/>
     * com.huawei.hms.location.ActivityIdentificationService(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/activityidentificationservice">https://developer.huawei.com/consumer/en/doc/activityidentificationservice</a><br/>
     * 
     * @param  param0 Context instance
     */
    public ActivityRecognitionClient(android.content.Context param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.removeActivityTransitionUpdates(android.app.PendingIntent) Removes activity transition updates associated with the given pendingIntent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognitionClient.removeActivityTransitionUpdates(android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-removeactivitytransitionupdates-pendingintent-pendingintent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-removeactivitytransitionupdates-pendingintent-pendingintent</a><br/>
     * com.huawei.hms.location.ActivityIdentificationService.deleteActivityConversionUpdates(android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section17434718321">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section17434718321</a><br/>
     * 
     * @param  param0 The associated PendingIntent of the activity transition request which is to be removed
     * @return A Task for apps to check the status of the call. If the task fails, the status code for the failure can be found by examining getStatusCode()
     */
    public org.xms.g.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(android.app.PendingIntent param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityConversionUpdates(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityConversionUpdates(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityTransitionUpdates(param0)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityTransitionUpdates(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityConversionUpdatesCallSuper(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityConversionUpdatesCallSuper(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityTransitionUpdatesCallSuper(param0)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityTransitionUpdatesCallSuper(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.removeActivityUpdates(android.app.PendingIntent) Removes all activity updates for the specified PendingIntent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognitionClient.removeActivityUpdates(android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-removeactivityupdates-pendingintent-callbackintent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-removeactivityupdates-pendingintent-callbackintent</a><br/>
     * com.huawei.hms.location.ActivityIdentificationService.deleteActivityIdentificationUpdates(android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section18411141614334">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section18411141614334</a><br/>
     * 
     * @param  param0 The PendingIntent that was used in requestActivityUpdates(long, PendingIntent) or is equal as defined by equals(Object)
     * @return A Task for apps to check the status of the call. If the task fails, the status code for the failure can be found by examining getStatusCode()
     */
    public org.xms.g.tasks.Task<java.lang.Void> removeActivityUpdates(android.app.PendingIntent param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityIdentificationUpdates(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityIdentificationUpdates(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityUpdates(param0)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityUpdates(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityIdentificationUpdatesCallSuper(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityIdentificationUpdatesCallSuper(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityUpdatesCallSuper(param0)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityUpdatesCallSuper(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.requestActivityTransitionUpdates(org.xms.g.location.ActivityTransitionRequest,android.app.PendingIntent) Activity Recognition Transition API provides an ability for apps to subscribe to activity transitional conditions (enter, exit).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognitionClient.requestActivityTransitionUpdates(com.google.android.gms.location.ActivityTransitionRequest,android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-requestactivitytransitionupdates-activitytransitionrequest-activitytransitionrequest,-pendingintent-pendingintent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-requestactivitytransitionupdates-activitytransitionrequest-activitytransitionrequest,-pendingintent-pendingintent</a><br/>
     * com.huawei.hms.location.ActivityIdentificationService.createActivityConversionUpdates(com.huawei.hms.location.ActivityConversionRequest,android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section461610311343">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section461610311343</a><br/>
     * 
     * @param  param0 The interested activity transitions
     * @param  param1 The PendingIntent used to generate the callback intent when one of the interested transition has happened
     * @return A Task for apps to check the status of the call. If the task fails, the status code for the failure can be found by examining getStatusCode()
     */
    public org.xms.g.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(org.xms.g.location.ActivityTransitionRequest param0, android.app.PendingIntent param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityConversionUpdates(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityConversionUpdates(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityTransitionUpdates(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityTransitionUpdates(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityConversionUpdatesCallSuper(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityConversionUpdatesCallSuper(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityTransitionUpdatesCallSuper(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityTransitionUpdatesCallSuper(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.requestActivityUpdates(long,android.app.PendingIntent) Register for activity recognition updates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognitionClient.requestActivityUpdates(long,android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-requestactivityupdates-long-detectionintervalmillis,-pendingintent-callbackintent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionClient#public-taskvoid-requestactivityupdates-long-detectionintervalmillis,-pendingintent-callbackintent</a><br/>
     * com.huawei.hms.location.ActivityIdentificationService.createActivityIdentificationUpdates(long,android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section177364246397">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationservice-0000001050986183#EN-US_TOPIC_0000001050986183__section177364246397</a><br/>
     * 
     * @param  param0 The desired time between activity detections. Larger values will result in fewer activity detections while improving battery life. A value of 0 will result in activity detections at the fastest possible rate
     * @param  param1 A PendingIntent to be sent for each activity detection
     * @return A Task for apps to check the status of the call. If the task fails, the status code for the failure can be found by examining getStatusCode()
     */
    public org.xms.g.tasks.Task<java.lang.Void> requestActivityUpdates(long param0, android.app.PendingIntent param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityIdentificationUpdates(param0, param1)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityIdentificationUpdates(param0, param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityUpdates(param0, param1)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityUpdates(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityIdentificationUpdatesCallSuper(param0, param1)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityIdentificationUpdatesCallSuper(param0, param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityUpdatesCallSuper(param0, param1)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityUpdatesCallSuper(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
    
    /**
     * XMS does not provide this api.
     */
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityRecognitionClient.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * 
     * @param  param0 The input object
     * @return Casted ActivityRecognitionClient object
     */
    public static org.xms.g.location.ActivityRecognitionClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.ActivityRecognitionClient) {
            return ((org.xms.g.location.ActivityRecognitionClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.ActivityRecognitionClient gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.ActivityIdentificationService hReturn = ((com.huawei.hms.location.ActivityIdentificationService) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.ActivityRecognitionClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.location.ActivityRecognitionClient) param0);
    }
    
    /**
     * org.xms.g.location.ActivityRecognitionClient.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentificationService;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityRecognitionClient;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.ActivityRecognitionClient {
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityTransitionUpdates(param0);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityUpdates(param0);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(com.google.android.gms.location.ActivityTransitionRequest param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityTransitionUpdates(((param0) == null ? null : (new org.xms.g.location.ActivityTransitionRequest(new org.xms.g.utils.XBox(param0, null)))), param1);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(long param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityUpdates(param0, param1);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.removeActivityTransitionUpdates(param0);
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.removeActivityUpdates(param0);
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdatesCallSuper(com.google.android.gms.location.ActivityTransitionRequest param0, android.app.PendingIntent param1) {
            return super.requestActivityTransitionUpdates(param0, param1);
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdatesCallSuper(long param0, android.app.PendingIntent param1) {
            return super.requestActivityUpdates(param0, param1);
        }
        
        public GImpl(android.app.Activity param0) {
            super(param0);
        }
        
        public GImpl(android.content.Context param0) {
            super(param0);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityIdentificationService {
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityConversionUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityTransitionUpdates(param0);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityIdentificationUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityUpdates(param0);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityConversionUpdates(com.huawei.hms.location.ActivityConversionRequest param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityTransitionUpdates(((param0) == null ? null : (new org.xms.g.location.ActivityTransitionRequest(new org.xms.g.utils.XBox(null, param0)))), param1);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityIdentificationUpdates(long param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityUpdates(param0, param1);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityConversionUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.deleteActivityConversionUpdates(param0);
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityIdentificationUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.deleteActivityIdentificationUpdates(param0);
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityConversionUpdatesCallSuper(com.huawei.hms.location.ActivityConversionRequest param0, android.app.PendingIntent param1) {
            return super.createActivityConversionUpdates(param0, param1);
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityIdentificationUpdatesCallSuper(long param0, android.app.PendingIntent param1) {
            return super.createActivityIdentificationUpdates(param0, param1);
        }
        
        public HImpl(android.content.Context param0) {
            super(param0);
        }
        
        public HImpl(android.app.Activity param0) {
            super(param0);
        }
    }
}