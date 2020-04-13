package design.behavioral.visitor;

public class VisitableC extends AbstractVisitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
