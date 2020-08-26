package org.xms.g.actions;

public class SearchIntents extends org.xms.g.utils.XObject {
    
    public SearchIntents(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getACTION_SEARCH() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.actions.SearchIntents.ACTION_SEARCH");
            return com.huawei.hms.actions.SearchIntents.ACTION_SEARCH;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.actions.SearchIntents.ACTION_SEARCH");
            return com.google.android.gms.actions.SearchIntents.ACTION_SEARCH;
        }
    }
    
    public static java.lang.String getEXTRA_QUERY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.actions.SearchIntents.EXTRA_QUERY");
            return com.huawei.hms.actions.SearchIntents.EXTRA_QUERY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.actions.SearchIntents.EXTRA_QUERY");
            return com.google.android.gms.actions.SearchIntents.EXTRA_QUERY;
        }
    }
    
    public static org.xms.g.actions.SearchIntents dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.actions.SearchIntents) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.actions.SearchIntents;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.actions.SearchIntents;
        }
    }
}