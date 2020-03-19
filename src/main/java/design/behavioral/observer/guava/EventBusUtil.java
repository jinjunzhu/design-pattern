package design.behavioral.observer.guava;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.google.common.util.concurrent.MoreExecutors;
import design.support.LocalThreadPoolExecutor;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class EventBusUtil {

    public static EventBus getEventBus(){
        return EventBusFactory.getAsyncInstance();
    }

    public static class EventBusFactory{
        private static EventBus asyncEventBus = new AsyncEventBus(LocalThreadPoolExecutor.getExecutor());
        private static EventBus syncEventBus = new AsyncEventBus(MoreExecutors.directExecutor());

        public static EventBus getAsyncInstance(){
            return asyncEventBus;
        }

        public static EventBus getyncInstance(){
            return syncEventBus;
        }

    }
}
