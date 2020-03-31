package design.behavioral.chain;

public class HandlerChain1 {

    public Handler1 head = new HandlerC();
    public void handle(){
        head.setNext(new HandlerD());
        head.handle("event1");
    }
}
