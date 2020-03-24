package design.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Strategic(value = "strategyA")
public class AnnotationStrategyA implements AnnotationStrategy{

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void doStrategy(){
        logger.info("doStrategy AnnotationStrategyA");
    }
}
