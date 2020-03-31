package design.behavioral.chain;

public class HandlerA implements Handler{

    @Override
    public void handle(String event) {
        System.out.println("handler A handle, event:" + event);
    }
}
