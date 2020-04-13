package design.behavioral.visitor;

public interface Visitor {

    void visit(VisitableA visitableA);

    void visit(VisitableB visitableB);

    void visit(VisitableC visitableC);
}
