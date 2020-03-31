package design.behavioral.chain;

public class TestChain {

    public static void main(String[] args){
        HandlerChain1 handlerChain1 = new HandlerChain1();
        handlerChain1.handle();
    }
}
