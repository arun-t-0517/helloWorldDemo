package arun.test.helloworlddemo.model

class HelloWorldTest extends GroovyTestCase {

    void testGetMessage() {
        def helloWorld = new HelloWorld("Arun")
        assertEquals("Hello, world.Arun", helloWorld.get_message())
    }
}