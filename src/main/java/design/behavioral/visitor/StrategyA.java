package design.behavioral.visitor;

public class StrategyA implements Strategy {

    @Override
    public void visitA() {
        System.out.println("visitorA visit A");
    }

    @Override
    public void visitB() {
        System.out.println("visitorB visit A");
    }
}
