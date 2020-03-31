package design.behavioral.chain;

public class HandlerD extends AbstractHandler1{

    @Override
    public boolean doHandle(String event) {
        System.out.println("handler D handle, event:" + event);
        return false;
    }
}
