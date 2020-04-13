package design.behavioral.visitor;

public class VisitableA extends AbstractVisitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
