package design.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class BObserver {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Subscribe
    public void handleMessage(String msg){
        logger.info("b obsesrver receive message:{}", msg);
    }
}
