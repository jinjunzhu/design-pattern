package design.behavioral.visitor;

public class StrategyB implements Strategy {

    @Override
    public void visitA() {
        System.out.println("visitorA visit B");
    }

    @Override
    public void visitB() {
        System.out.println("visitorB visit B");
    }
}
