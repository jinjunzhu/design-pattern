package design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<AbstractVisitable> abstractVisitables = new ArrayList<>();
        abstractVisitables.add(new VisitableA());
        abstractVisitables.add(new VisitableB());
        abstractVisitables.add(new VisitableC());

        VisitorB visitorB = new VisitorB();
        VisitorA visitorA = new VisitorA();
        for (AbstractVisitable abstractVisitable : abstractVisitables) {
            abstractVisitable.accept(visitorA);
            abstractVisitable.accept(visitorB);
        }
    }
}
