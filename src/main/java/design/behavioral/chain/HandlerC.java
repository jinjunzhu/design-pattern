package design.behavioral.chain;

public class HandlerC extends AbstractHandler1{

    @Override
    public boolean doHandle(String event) {
        System.out.println("handler C handle, event:" + event);
        return false;
    }
}
