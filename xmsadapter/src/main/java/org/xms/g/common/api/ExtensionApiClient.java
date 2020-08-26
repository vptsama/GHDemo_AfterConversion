package org.xms.g.common.api;

public abstract class ExtensionApiClient extends org.xms.g.utils.XObject {
    private boolean wrapper = true;

    public ExtensionApiClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    public ExtensionApiClient() {
        super((org.xms.g.utils.XBox) null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    public static int getSIGN_IN_MODE_OPTIONAL() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    public static int getSIGN_IN_MODE_REQUIRED() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    public abstract org.xms.g.common.ConnectionResult blockingConnect();

    public abstract org.xms.g.common.ConnectionResult blockingConnect(long param0, java.util.concurrent.TimeUnit param1);

    public abstract org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> clearDefaultAccountAndReconnect();

    public void connect(int param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).connect(param0)");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).connect(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).connect(param0)");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).connect(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                ((HImpl) ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance())).connectCallSuper(param0);
            } else {
                ((GImpl) ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance())).connectCallSuper(param0);
            }
        }
    }

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(java.lang.String param0, java.io.FileDescriptor param1, java.io.PrintWriter param2, java.lang.String[] param3);

    public static void dumpAll(java.lang.String param0, java.io.FileDescriptor param1, java.io.PrintWriter param2, java.lang.String[] param3) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    public abstract org.xms.g.common.ConnectionResult getConnectionResult(org.xms.g.common.api.Api<?> param0);

    public abstract boolean hasConnectedApi(org.xms.g.common.api.Api<?> param0);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0);

    public abstract boolean isConnectionFailedListenerRegistered(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0);

    public abstract void registerConnectionFailedListener(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0);

    public abstract void stopAutoManage(androidx.fragment.app.FragmentActivity param0) throws java.lang.IllegalStateException;

    public abstract void unregisterConnectionCallbacks(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0);

    public abstract void unregisterConnectionFailedListener(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0);

    public static org.xms.g.common.api.ExtensionApiClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.ExtensionApiClient) {
            return ((org.xms.g.common.api.ExtensionApiClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.GoogleApiClient gReturn = ((com.google.android.gms.common.api.GoogleApiClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.api.HuaweiApiClient hReturn = ((com.huawei.hms.api.HuaweiApiClient) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.api.ExtensionApiClient) param0);
    }

    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiApiClient;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.GoogleApiClient;
        }
    }

    private class GImpl extends com.google.android.gms.common.api.GoogleApiClient {

        public void connect(int param0) {
            org.xms.g.common.api.ExtensionApiClient.this.connect(param0);
        }

        public void connectCallSuper(int param0) {
            super.connect(param0);
        }

        public com.google.android.gms.common.ConnectionResult blockingConnect() {
            org.xms.g.common.ConnectionResult xResult = org.xms.g.common.api.ExtensionApiClient.this.blockingConnect();
            return ((com.google.android.gms.common.ConnectionResult) ((xResult) == null ? null : (xResult.getGInstance())));
        }

        public com.google.android.gms.common.ConnectionResult blockingConnect(long param0, java.util.concurrent.TimeUnit param1) {
            org.xms.g.common.ConnectionResult xResult = org.xms.g.common.api.ExtensionApiClient.this.blockingConnect(param0, param1);
            return ((com.google.android.gms.common.ConnectionResult) ((xResult) == null ? null : (xResult.getGInstance())));
        }

        public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
            org.xms.g.common.api.PendingResult xResult = org.xms.g.common.api.ExtensionApiClient.this.clearDefaultAccountAndReconnect();
            return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
        }

        public void connect() {
            org.xms.g.common.api.ExtensionApiClient.this.connect();
        }

        public void disconnect() {
            org.xms.g.common.api.ExtensionApiClient.this.disconnect();
        }

        public void dump(java.lang.String param0, java.io.FileDescriptor param1, java.io.PrintWriter param2, java.lang.String[] param3) {
            org.xms.g.common.api.ExtensionApiClient.this.dump(param0, param1, param2, param3);
        }

        public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> param0) {
            org.xms.g.common.ConnectionResult xResult = org.xms.g.common.api.ExtensionApiClient.this.getConnectionResult(((param0) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(param0, null)))));
            return ((com.google.android.gms.common.ConnectionResult) ((xResult) == null ? null : (xResult.getGInstance())));
        }

        public boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> param0) {
            return org.xms.g.common.api.ExtensionApiClient.this.hasConnectedApi(((param0) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(param0, null)))));
        }

        public boolean isConnected() {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnected();
        }

        public boolean isConnecting() {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnecting();
        }

        public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks param0) {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnectionCallbacksRegistered(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener param0) {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnectionFailedListenerRegistered(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void reconnect() {
            org.xms.g.common.api.ExtensionApiClient.this.reconnect();
        }

        public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks param0) {
            org.xms.g.common.api.ExtensionApiClient.this.registerConnectionCallbacks(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener param0) {
            org.xms.g.common.api.ExtensionApiClient.this.registerConnectionFailedListener(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void stopAutoManage(androidx.fragment.app.FragmentActivity param0) throws java.lang.IllegalStateException {
            org.xms.g.common.api.ExtensionApiClient.this.stopAutoManage(param0);
        }

        public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks param0) {
            org.xms.g.common.api.ExtensionApiClient.this.unregisterConnectionCallbacks(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener param0) {
            org.xms.g.common.api.ExtensionApiClient.this.unregisterConnectionFailedListener(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public GImpl() {
            super();
        }
    }

    private class HImpl extends com.huawei.hms.api.HuaweiApiClient {

        public void connect(int param0) {
            org.xms.g.common.api.ExtensionApiClient.this.connect(param0);
        }

        public void connectCallSuper(int param0) {
            super.connect(param0);
        }

        public com.huawei.hms.api.ConnectionResult holdUpConnect() {
            org.xms.g.common.ConnectionResult xResult = org.xms.g.common.api.ExtensionApiClient.this.blockingConnect();
            return ((com.huawei.hms.api.ConnectionResult) ((xResult) == null ? null : (xResult.getHInstance())));
        }

        public com.huawei.hms.api.ConnectionResult holdUpConnect(long param0, java.util.concurrent.TimeUnit param1) {
            org.xms.g.common.ConnectionResult xResult = org.xms.g.common.api.ExtensionApiClient.this.blockingConnect(param0, param1);
            return ((com.huawei.hms.api.ConnectionResult) ((xResult) == null ? null : (xResult.getHInstance())));
        }

        public com.huawei.hms.support.api.client.PendingResult<com.huawei.hms.support.api.client.Status> discardAndReconnect() {
            org.xms.g.common.api.PendingResult xResult = org.xms.g.common.api.ExtensionApiClient.this.clearDefaultAccountAndReconnect();
            return ((com.huawei.hms.support.api.client.PendingResult) ((xResult) == null ? null : (xResult.getHInstance())));
        }

        public void disconnect() {
            org.xms.g.common.api.ExtensionApiClient.this.disconnect();
        }

        public void print(java.lang.String param0, java.io.FileDescriptor param1, java.io.PrintWriter param2, java.lang.String[] param3) {
            org.xms.g.common.api.ExtensionApiClient.this.dump(param0, param1, param2, param3);
        }

        public com.huawei.hms.api.ConnectionResult getConnectionResult(com.huawei.hms.api.Api<?> param0) {
            org.xms.g.common.ConnectionResult xResult = org.xms.g.common.api.ExtensionApiClient.this.getConnectionResult(((param0) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(null, param0)))));
            return ((com.huawei.hms.api.ConnectionResult) ((xResult) == null ? null : (xResult.getHInstance())));
        }

        public boolean hasConnectedApi(com.huawei.hms.api.Api<?> param0) {
            return org.xms.g.common.api.ExtensionApiClient.this.hasConnectedApi(((param0) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(null, param0)))));
        }

        public boolean isConnected() {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnected();
        }

        public boolean isConnecting() {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnecting();
        }

        public boolean hasConnectionSuccessListener(com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks param0) {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnectionCallbacksRegistered(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public boolean hasConnectionFailureListener(com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener param0) {
            return org.xms.g.common.api.ExtensionApiClient.this.isConnectionFailedListenerRegistered(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void reconnect() {
            org.xms.g.common.api.ExtensionApiClient.this.reconnect();
        }

        public void setConnectionCallbacks(com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks param0) {
            org.xms.g.common.api.ExtensionApiClient.this.registerConnectionCallbacks(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void setConnectionFailedListener(com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener param0) {
            org.xms.g.common.api.ExtensionApiClient.this.registerConnectionFailedListener(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public java.util.List<com.huawei.hms.support.api.entity.auth.Scope> getScopes() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.util.List<com.huawei.hms.support.api.entity.auth.PermissionInfo> getPermissionInfos() {
            throw new java.lang.RuntimeException("Stub");
        }

        public void disableLifeCycleManagement(android.app.Activity param0) {
            throw new java.lang.RuntimeException("Stub");
        }

        public void removeConnectionSuccessListener(com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks param0) {
            org.xms.g.common.api.ExtensionApiClient.this.unregisterConnectionCallbacks(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void removeConnectionFailureListener(com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener param0) {
            org.xms.g.common.api.ExtensionApiClient.this.unregisterConnectionFailedListener(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void connect(android.app.Activity param0) {
            throw new java.lang.RuntimeException("Stub");
        }

        public void connectForeground() {
            throw new java.lang.RuntimeException("Stub");
        }

        public boolean setSubAppInfo(com.huawei.hms.support.api.client.SubAppInfo param0) {
            throw new java.lang.RuntimeException("Stub");
        }

        public void checkUpdate(android.app.Activity param0, com.huawei.hms.api.CheckUpdatelistener param1) {
            throw new java.lang.RuntimeException("Stub");
        }

        public void onResume(android.app.Activity param0) {
            throw new java.lang.RuntimeException("Stub");
        }

        public void onPause(android.app.Activity param0) {
            throw new java.lang.RuntimeException("Stub");
        }

        public android.app.Activity getTopActivity() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.util.Map<com.huawei.hms.api.Api<?>, com.huawei.hms.api.Api.ApiOptions> getApiMap() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.util.List<java.lang.String> getApiNameList() {
            throw new java.lang.RuntimeException("Stub");
        }

        public com.huawei.hms.core.aidl.d getService() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.lang.String getTransportName() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.lang.String getAppID() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.lang.String getCpID() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.lang.String getSessionId() {
            throw new java.lang.RuntimeException("Stub");
        }

        public java.lang.String getPackageName() {
            throw new java.lang.RuntimeException("Stub");
        }

        public com.huawei.hms.support.api.client.SubAppInfo getSubAppInfo() {
            throw new java.lang.RuntimeException("Stub");
        }

        public android.content.Context getContext() {
            throw new java.lang.RuntimeException("Stub");
        }

        public HImpl() {
            super();
        }
    }

    public static class XImpl extends org.xms.g.common.api.ExtensionApiClient {

        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        public org.xms.g.common.ConnectionResult blockingConnect() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).holdUpConnect()");
                com.huawei.hms.api.ConnectionResult hReturn = ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).holdUpConnect();
                return ((hReturn) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).blockingConnect()");
                com.google.android.gms.common.ConnectionResult gReturn = ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).blockingConnect();
                return ((gReturn) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public org.xms.g.common.ConnectionResult blockingConnect(long param0, java.util.concurrent.TimeUnit param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).holdUpConnect(param0, param1)");
                com.huawei.hms.api.ConnectionResult hReturn = ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).holdUpConnect(param0, param1);
                return ((hReturn) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).blockingConnect(param0, param1)");
                com.google.android.gms.common.ConnectionResult gReturn = ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).blockingConnect(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> clearDefaultAccountAndReconnect() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).discardAndReconnect()");
                com.huawei.hms.support.api.client.PendingResult hReturn = ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).discardAndReconnect();
                return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).clearDefaultAccountAndReconnect()");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).clearDefaultAccountAndReconnect();
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public void connect() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).connect(null);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).connect()");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).connect();
            }
        }

        public void disconnect() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).disconnect()");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).disconnect();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).disconnect()");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).disconnect();
            }
        }

        public void dump(java.lang.String param0, java.io.FileDescriptor param1, java.io.PrintWriter param2, java.lang.String[] param3) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).print(param0, param1, param2, param3)");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).print(param0, param1, param2, param3);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).dump(param0, param1, param2, param3)");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).dump(param0, param1, param2, param3);
            }
        }

        public org.xms.g.common.ConnectionResult getConnectionResult(org.xms.g.common.api.Api<?> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).getConnectionResult(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.api.ConnectionResult hReturn = ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).getConnectionResult(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).getConnectionResult(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.ConnectionResult gReturn = ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).getConnectionResult(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public boolean hasConnectedApi(org.xms.g.common.api.Api<?> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).hasConnectedApi(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))))");
                return ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).hasConnectedApi(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).hasConnectedApi(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))))");
                return ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).hasConnectedApi(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }

        public boolean isConnected() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).isConnected()");
                return ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).isConnected();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnected()");
                return ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnected();
            }
        }

        public boolean isConnecting() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).isConnecting()");
                return ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).isConnecting();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnecting()");
                return ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnecting();
            }
        }

        public boolean isConnectionCallbacksRegistered(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).hasConnectionSuccessListener(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())))");
                return ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).hasConnectionSuccessListener(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnectionCallbacksRegistered(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())))");
                return ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnectionCallbacksRegistered(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())));
            }
        }

        public boolean isConnectionFailedListenerRegistered(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).hasConnectionFailureListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())))");
                return ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).hasConnectionFailureListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnectionFailedListenerRegistered(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())))");
                return ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).isConnectionFailedListenerRegistered(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())));
            }
        }

        public void reconnect() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).reconnect()");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).reconnect();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).reconnect()");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).reconnect();
            }
        }

        public void registerConnectionCallbacks(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).setConnectionCallbacks(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())))");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).setConnectionCallbacks(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).registerConnectionCallbacks(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())))");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).registerConnectionCallbacks(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())));
            }
        }

        public void registerConnectionFailedListener(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).setConnectionFailedListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())))");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).setConnectionFailedListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).registerConnectionFailedListener(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())))");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).registerConnectionFailedListener(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())));
            }
        }

        public void stopAutoManage(androidx.fragment.app.FragmentActivity param0) throws java.lang.IllegalStateException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).disableLifeCycleManagement(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).stopAutoManage(param0)");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).stopAutoManage(param0);
            }
        }

        public void unregisterConnectionCallbacks(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).removeConnectionSuccessListener(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())))");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).removeConnectionSuccessListener(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).unregisterConnectionCallbacks(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())))");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).unregisterConnectionCallbacks(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())));
            }
        }

        public void unregisterConnectionFailedListener(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).removeConnectionFailureListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())))");
                ((com.huawei.hms.api.HuaweiApiClient) this.getHInstance()).removeConnectionFailureListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).unregisterConnectionFailedListener(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())))");
                ((com.google.android.gms.common.api.GoogleApiClient) this.getGInstance()).unregisterConnectionFailedListener(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())));
            }
        }
    }

    public static final class Builder extends org.xms.g.utils.XObject {

        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        public Builder(android.content.Context param0) {
            super((org.xms.g.utils.XBox) null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.api.HuaweiApiClient.Builder(param0));
            } else {
                this.setGInstance(new com.google.android.gms.common.api.GoogleApiClient.Builder(param0));
            }
        }

        public Builder(android.content.Context param0, org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param1, org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param2) {
            super((org.xms.g.utils.XBox) null);
        }

        public final <XO extends org.xms.g.common.api.Api.ApiOptions.HasOptions> org.xms.g.common.api.ExtensionApiClient.Builder addApi(org.xms.g.common.api.Api<XO> param0, XO param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.api.Api.ApiOptions.HasOptions hObj1 = ((com.huawei.hms.api.Api.ApiOptions.HasOptions) org.xms.g.utils.Utils.getInstanceInInterface(param1, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApi(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))), hObj1)");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApi(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))), hObj1);
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                com.google.android.gms.common.api.Api.ApiOptions.HasOptions gObj1 = ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) org.xms.g.utils.Utils.getInstanceInInterface(param1, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApi(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))), gObj1)");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApi(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))), gObj1);
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder addApi(org.xms.g.common.api.Api<? extends org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApi(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApi(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApi(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApi(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final <XO extends org.xms.g.common.api.Api.ApiOptions.HasOptions> org.xms.g.common.api.ExtensionApiClient.Builder addApiIfAvailable(org.xms.g.common.api.Api<XO> param0, XO param1, org.xms.g.common.api.Scope... param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.api.Api.ApiOptions.HasOptions hObj1 = ((com.huawei.hms.api.Api.ApiOptions.HasOptions) org.xms.g.utils.Utils.getInstanceInInterface(param1, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApiWithScope(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))), hObj1, ((com.huawei.hms.support.api.entity.auth.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param2, com.huawei.hms.support.api.entity.auth.Scope.class, x -> (com.huawei.hms.support.api.entity.auth.Scope)x.getHInstance())))");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApiWithScope(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))), hObj1, ((com.huawei.hms.support.api.entity.auth.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param2, com.huawei.hms.support.api.entity.auth.Scope.class, x -> (com.huawei.hms.support.api.entity.auth.Scope) x.getHInstance())));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                com.google.android.gms.common.api.Api.ApiOptions.HasOptions gObj1 = ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) org.xms.g.utils.Utils.getInstanceInInterface(param1, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApiIfAvailable(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))), gObj1, ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param2, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApiIfAvailable(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))), gObj1, ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param2, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope) x.getGInstance())));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder addApiIfAvailable(org.xms.g.common.api.Api<? extends org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions> param0, org.xms.g.common.api.Scope[] param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApiWithScope(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.support.api.entity.auth.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.huawei.hms.support.api.entity.auth.Scope.class, x -> (com.huawei.hms.support.api.entity.auth.Scope)x.getHInstance())))");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addApiWithScope(((com.huawei.hms.api.Api) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.support.api.entity.auth.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.huawei.hms.support.api.entity.auth.Scope.class, x -> (com.huawei.hms.support.api.entity.auth.Scope) x.getHInstance())));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApiIfAvailable(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addApiIfAvailable(((com.google.android.gms.common.api.Api) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope) x.getGInstance())));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder addConnectionCallbacks(org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addConnectionCallbacks(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())))");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addConnectionCallbacks(((param0) == null ? null : (param0.getHInstanceConnectionCallbacks())));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addConnectionCallbacks(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addConnectionCallbacks(((param0) == null ? null : (param0.getGInstanceConnectionCallbacks())));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder addOnConnectionFailedListener(org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addOnConnectionFailedListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())))");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addOnConnectionFailedListener(((param0) == null ? null : (param0.getHInstanceOnConnectionFailedListener())));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addOnConnectionFailedListener(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addOnConnectionFailedListener(((param0) == null ? null : (param0.getGInstanceOnConnectionFailedListener())));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder addScope(org.xms.g.common.api.Scope param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addScope(((com.huawei.hms.support.api.entity.auth.Scope) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).addScope(((com.huawei.hms.support.api.entity.auth.Scope) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addScope(((com.google.android.gms.common.api.Scope) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).addScope(((com.google.android.gms.common.api.Scope) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).build()");
                com.huawei.hms.api.HuaweiApiClient hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).build()");
                com.google.android.gms.common.api.GoogleApiClient gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity param0, org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param1) throws java.lang.NullPointerException, java.lang.IllegalStateException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = null;
                hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).allowLifeCycleManagement(param0, ((param1) == null ? null : (param1.getHInstanceOnConnectionFailedListener())));
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).enableAutoManage(param0, ((param1) == null ? null : (param1.getGInstanceOnConnectionFailedListener())))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).enableAutoManage(param0, ((param1) == null ? null : (param1.getGInstanceOnConnectionFailedListener())));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity param0, int param1, org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener param2) throws java.lang.NullPointerException, java.lang.NullPointerException, java.lang.IllegalStateException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = null;
                hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).allowLifeCycleManagement(param0, param1, ((param2) == null ? null : (param2.getHInstanceOnConnectionFailedListener())));
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).enableAutoManage(param0, param1, ((param2) == null ? null : (param2.getGInstanceOnConnectionFailedListener())))");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).enableAutoManage(param0, param1, ((param2) == null ? null : (param2.getGInstanceOnConnectionFailedListener())));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder setAccountName(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setAccountName(param0)");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setAccountName(param0);
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setAccountName(param0)");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setAccountName(param0);
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder setGravityForPopups(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setPopupsGravity(param0)");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setPopupsGravity(param0);
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setGravityForPopups(param0)");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setGravityForPopups(param0);
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder setHandler(android.os.Handler param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setHandler(param0)");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setHandler(param0);
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setHandler(param0)");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setHandler(param0);
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder setViewForPopups(android.view.View param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setViewForPopups(param0)");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).setViewForPopups(param0);
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setViewForPopups(param0)");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).setViewForPopups(param0);
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public final org.xms.g.common.api.ExtensionApiClient.Builder useDefaultAccount() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).applyDefaultAccount()");
                com.huawei.hms.api.HuaweiApiClient.Builder hReturn = ((com.huawei.hms.api.HuaweiApiClient.Builder) this.getHInstance()).applyDefaultAccount();
                return ((hReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).useDefaultAccount()");
                com.google.android.gms.common.api.GoogleApiClient.Builder gReturn = ((com.google.android.gms.common.api.GoogleApiClient.Builder) this.getGInstance()).useDefaultAccount();
                return ((gReturn) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        public static org.xms.g.common.api.ExtensionApiClient.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.common.api.ExtensionApiClient.Builder) param0);
        }

        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiApiClient.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.GoogleApiClient.Builder;
            }
        }
    }

    public static interface ConnectionCallbacks extends org.xms.g.utils.XInterface {

        public static int getCAUSE_NETWORK_LOST() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks.CAUSE_NETWORK_LOST");
                return com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks.CAUSE_NETWORK_LOST;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks.CAUSE_NETWORK_LOST");
                return com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks.CAUSE_NETWORK_LOST;
            }
        }

        public static int getCAUSE_SERVICE_DISCONNECTED() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks.CAUSE_SERVICE_DISCONNECTED");
                return com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks.CAUSE_SERVICE_DISCONNECTED;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks.CAUSE_SERVICE_DISCONNECTED");
                return com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks.CAUSE_SERVICE_DISCONNECTED;
            }
        }

        public void onConnected(android.os.Bundle param0);

        public void onConnectionSuspended(int param0);

        default com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks getGInstanceConnectionCallbacks() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

                public void onConnected(android.os.Bundle param0) {
                    org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.this.onConnected(param0);
                }

                public void onConnectionSuspended(int param0) {
                    org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.this.onConnectionSuspended(param0);
                }
            };
        }

        default com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks getHInstanceConnectionCallbacks() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks() {

                public void onConnectionSuspended(int param0) {
                    org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.this.onConnectionSuspended(param0);
                }

                public void onConnected() {
                    org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.this.onConnected(null);
                }
            };
        }

        public static org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks) {
                return ((org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks gReturn = ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks hReturn = ((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
            }
            return ((org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks) param0);
        }

        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
                }
            }
            return param0 instanceof org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks;
        }

        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.ExtensionApiClient.ConnectionCallbacks {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            public void onConnected(android.os.Bundle param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    ((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) this.getHInstance()).onConnected();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this.getGInstance()).onConnected(param0)");
                    ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this.getGInstance()).onConnected(param0);
                }
            }

            public void onConnectionSuspended(int param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) this.getHInstance()).onConnectionSuspended(param0)");
                    ((com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks) this.getHInstance()).onConnectionSuspended(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this.getGInstance()).onConnectionSuspended(param0)");
                    ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this.getGInstance()).onConnectionSuspended(param0);
                }
            }
        }
    }

    public static interface OnConnectionFailedListener extends org.xms.g.utils.XInterface {

        public void onConnectionFailed(org.xms.g.common.ConnectionResult param0);

        default com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener getGInstanceOnConnectionFailedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener() {

                public void onConnectionFailed(com.google.android.gms.common.ConnectionResult param0) {
                    org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.this.onConnectionFailed(((param0) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener getHInstanceOnConnectionFailedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener() {

                public void onConnectionFailed(com.huawei.hms.api.ConnectionResult param0) {
                    org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.this.onConnectionFailed(((param0) == null ? null : (new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        public static org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener) {
                return ((org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener gReturn = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener hReturn = ((com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
            }
            return ((org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener) param0);
        }

        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
                }
            }
            return param0 instanceof org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener;
        }

        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.ExtensionApiClient.OnConnectionFailedListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            public void onConnectionFailed(org.xms.g.common.ConnectionResult param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener) this.getHInstance()).onConnectionFailed(((com.huawei.hms.api.ConnectionResult) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener) this.getHInstance()).onConnectionFailed(((com.huawei.hms.api.ConnectionResult) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) this.getGInstance()).onConnectionFailed(((com.google.android.gms.common.ConnectionResult) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) this.getGInstance()).onConnectionFailed(((com.google.android.gms.common.ConnectionResult) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
}