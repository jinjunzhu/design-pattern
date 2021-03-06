package design.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrategyA implements Strategy {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void doStrategy() {
        logger.info("doStrategy StrategyA");
    }
}
