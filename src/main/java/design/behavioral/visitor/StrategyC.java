package design.behavioral.visitor;

public class StrategyC implements Strategy {

    @Override
    public void visitA() {
        System.out.println("visitorA visit C");
    }

    @Override
    public void visitB() {
        System.out.println("visitorB visit C");
    }
}
