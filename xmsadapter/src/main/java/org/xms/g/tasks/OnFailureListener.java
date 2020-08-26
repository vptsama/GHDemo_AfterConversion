package org.xms.g.tasks;

import org.xms.g.utils.Utils;

public interface OnFailureListener extends org.xms.g.utils.XInterface {

    public void onFailure(java.lang.Exception param0);

    default com.google.android.gms.tasks.OnFailureListener getGInstanceOnFailureListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.OnFailureListener) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.OnFailureListener() {

            public void onFailure(java.lang.Exception param0) {
                if (Utils.isGmsType(param0)) {
                    Object gobj = Utils.getXmsObjectWithGmsObject(param0);
                    org.xms.g.tasks.OnFailureListener.this.onFailure((Exception) gobj);
                } else {
                    org.xms.g.tasks.OnFailureListener.this.onFailure(param0);
                }
            }
        };
    }

    default com.huawei.hmf.tasks.OnFailureListener getHInstanceOnFailureListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.OnFailureListener) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.OnFailureListener() {

            public void onFailure(java.lang.Exception param0) {
                if (Utils.isHmsType(param0)) {
                    Object hobj = Utils.getXmsObjectWithHmsObject(param0);
                    org.xms.g.tasks.OnFailureListener.this.onFailure((Exception) hobj);
                } else {
                    org.xms.g.tasks.OnFailureListener.this.onFailure(param0);
                }
            }
        };
    }

    public static org.xms.g.tasks.OnFailureListener dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.tasks.OnFailureListener) {
            return ((org.xms.g.tasks.OnFailureListener) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.tasks.OnFailureListener gReturn = ((com.google.android.gms.tasks.OnFailureListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hmf.tasks.OnFailureListener hReturn = ((com.huawei.hmf.tasks.OnFailureListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.tasks.OnFailureListener.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.tasks.OnFailureListener) param0);
    }

    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.OnFailureListener;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.OnFailureListener;
            }
        }
        return param0 instanceof org.xms.g.tasks.OnFailureListener;
    }

    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.tasks.OnFailureListener {

        public XImpl(org.xms.g.utils.XBox xBox) {
            super(xBox);
        }

        public void onFailure(java.lang.Exception param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.OnFailureListener) this.getHInstance()).onFailure(param0)");
                ((com.huawei.hmf.tasks.OnFailureListener) this.getHInstance()).onFailure(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.OnFailureListener) this.getGInstance()).onFailure(param0)");
                ((com.google.android.gms.tasks.OnFailureListener) this.getGInstance()).onFailure(param0);
            }
        }
    }
}