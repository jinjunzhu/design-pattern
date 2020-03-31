package design.behavioral.chain;

public class HandlerB implements Handler{

    @Override
    public void handle(String event) {
        System.out.println("handler B handle, event:" + event);
    }
}
