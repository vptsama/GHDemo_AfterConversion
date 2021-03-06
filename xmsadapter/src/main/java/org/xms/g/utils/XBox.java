package org.xms.g.utils;

/**
 * Class for XBox
 */
public class XBox {
    /**
     * java.lang.Object gInst instance of gms.<br/>
     */
    java.lang.Object gInst;

    /**
     * java.lang.Object hInst instance of hms.<br/>
     */
    java.lang.Object hInst;

    /**
     * org.xms.g.utils.XBox.XBox(java.lang.Object gInst, java.lang.Object hInst) constructor of xbox with gInstance and hInstance.<br/>
     *
     * @param gInst instance of gms
     * @param hInst instance of hms
     */
    public XBox(java.lang.Object gInst, java.lang.Object hInst) {
        this.gInst = gInst;
        this.hInst = hInst;
    }

    /**
     * org.xms.g.utils.getGInstance() get the gms instance from XBox object.<br/>
     *
     * @return gInstance
     */
    public Object getGInstance() {
        return gInst;
    }

    /**
     * org.xms.g.utils.getGInstance() get the hms instance from XBox object.<br/>
     *
     * @return hInstance
     */
    public Object getHInstance() {
        return hInst;
    }
}
