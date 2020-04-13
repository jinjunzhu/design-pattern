package design.behavioral.visitor;

public class VisitableB extends AbstractVisitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
