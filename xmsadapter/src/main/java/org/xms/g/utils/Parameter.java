package org.xms.g.utils;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Class for Parameter
 */
public final class Parameter {
    private Method method;

    private int parameterId;

    private Class<?> receiverClass;

    /**
     * org.xms.g.utils.Parameter.Parameter(Method m, int id, Class<?> clazz) constructor of Parameter.<br/>
     *
     * @param m     method
     * @param id    parameter index
     * @param clazz Class
     */
    Parameter(Method m, int id, Class<?> clazz) {
        assert m != null;
        assert id < m.getParameterTypes().length;
        this.method = m;
        this.parameterId = id;
        this.receiverClass = clazz;
    }

    /**
     * org.xms.g.utils.Parameter.getMethod() get the Method.<br/>
     *
     * @return method
     */
    public Method getMethod() {
        return this.method;
    }

    /**
     * org.xms.g.utils.Parameter.getDeclaringClass() get the Declaring Class.<br/>
     *
     * @return declaring class of method
     */
    public Class<?> getDeclaringClass() {
        return this.method.getDeclaringClass();
    }

    /**
     * org.xms.g.utils.Parameter.getParameterId() get the Parameter Id.<br/>
     *
     * @return parameter id
     */
    public int getParameterId() {
        return this.parameterId;
    }

    /**
     * org.xms.g.utils.Parameter.getReceiverClass() get the Receiver Class.<br/>
     *
     * @return receiver Class
     */
    public Class<?> getReceiverClass() {
        return this.receiverClass;
    }

    @Override
    public String toString() {
        return "method name : " + method.getName() + " paramter id : " + this.parameterId + " declaring class : "
                + method.getDeclaringClass().toString();
    }

    /**
     * org.xms.g.utils.Parameter.toGenericType() transformed to generic type.<br/>
     *
     * @return generic type
     */
    public Type toGenericType() {
        return this.method.getGenericParameterTypes()[this.parameterId];
    }
}
