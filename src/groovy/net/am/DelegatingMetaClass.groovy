package net.am

import org.apache.log4j.Logger

class DelegatingMetaClass extends groovy.lang.DelegatingMetaClass {

    Logger log = Logger.getLogger(DelegatingMetaClass.class)

    DelegatingMetaClass(Class theClass) {
        super(theClass)
    }

    @Override
    Object invokeMethod(Object object, String methodName, Object[] arguments) {
        log.debug "in invoke method"
        return super.invokeMethod(object, methodName, arguments)
    }
}
