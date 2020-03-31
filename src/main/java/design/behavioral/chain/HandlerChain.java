package design.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>(5);

    public void addHandler(Handler handler){
        handlers.add(handler);
    }

    public void handle(String event){
        handlers.forEach(r -> r.handle(event));
    }

}
