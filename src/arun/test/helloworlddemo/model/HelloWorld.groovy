package arun.test.helloworlddemo.model

class HelloWorld implements Serializable {
    private String _message

    HelloWorld(String _message) {
        this._message = _message
    }

    String get_message() {
        return "Hello, world." + _message
    }

    void set_message(String _message) {
        this._message = _message
    }


    @Override
    public String toString() {
        return "HelloWorld{" +
                "_message='" + _message + '\'' +
                '}';
    }
}