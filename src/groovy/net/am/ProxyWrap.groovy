package net.am

import org.codehaus.groovy.runtime.InvokerHelper

class ProxyWrap {

    void wrap(def clazz, String methodName) {

        println  "Wrapping $clazz.name:$methodName"

        InvokerHelper.metaRegistry.setMetaClass(clazz, new net.am.DelegatingMetaClass(clazz) )



//        clazz.metaClass.trim = {
//            println "in!"
//            delegate."methodName"()
//        }

        /*clazz.metaClass."$methodName" = {
            println "in!"
            delegate."$methodName"()
        }*/

    }



}
