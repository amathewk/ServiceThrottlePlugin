package net.am


class ProxyWrapTest extends GroovyTestCase {

    ProxyWrap proxyWrap = new  ProxyWrap()


    void setUp() {

    }

    void tearDown() {

    }

//    @Test
    void testWrap() {

        String a = "123"
        println "first call"

        assertEquals "123", a.trim()

        DelegatingMetaClass.metaClass.invokeMethod =  { Object object, String methodName, Object[] arguments ->
            return "456";

        }

        proxyWrap.wrap(String, "trim")

        println "second call"
        assertEquals "456", a.trim()
    }
}
