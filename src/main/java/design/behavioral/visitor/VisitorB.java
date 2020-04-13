package design.behavioral.visitor;

public class VisitorB implements Visitor{

    @Override
    public void visit(VisitableA visitableA) {
        System.out.println("visitorB visit A");
    }

    @Override
    public void visit(VisitableB pdfFile) {
        System.out.println("visitorB visit B");
    }

    @Override
    public void visit(VisitableC pdfFile) {
        System.out.println("visitorB visit C");
    }
}
