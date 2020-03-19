package guava;

import com.google.common.eventbus.EventBus;
import design.behavioral.observer.guava.AObserver;
import design.behavioral.observer.guava.BObserver;
import design.behavioral.observer.guava.EventBusUtil;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class TestEventBus{

    public static void main(String[] args){
        EventBus eventBus = EventBusUtil.getEventBus();
        eventBus.register(new AObserver());
        eventBus.register(new BObserver());

        for (int j = 0; j < 2; j ++){
            eventBus.post("hi, observer" + j);
        }
    }
}
