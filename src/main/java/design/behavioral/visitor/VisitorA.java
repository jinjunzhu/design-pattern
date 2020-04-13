package design.behavioral.visitor;

public class VisitorA implements Visitor{

    @Override
    public void visit(VisitableA visitableA) {
        System.out.println("visitorA visit A");
    }

    @Override
    public void visit(VisitableB visitableB) {
        System.out.println("visitorA visit B");
    }

    @Override
    public void visit(VisitableC visitableC) {
        System.out.println("visitorA visit C");
    }
}
