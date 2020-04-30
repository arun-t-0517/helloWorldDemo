import arun.test.helloworlddemo.model.HelloWorld

def call(user) {

    def helloWorld = new HelloWorld(user);
    echo "${helloWorld.get_message()}"
}