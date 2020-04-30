import arun.test.helloworlddemo.model.HelloWorld
import arun.test.helloworlddemo.model.Constants

def call(user) {

    def helloWorld = new HelloWorld(user);
    def Constants
    echo "${helloWorld.get_message()}"
    echo Constants.EMAIL_MESSAGE
}