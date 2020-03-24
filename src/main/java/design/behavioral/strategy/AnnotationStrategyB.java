package design.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Strategic(value = "strategyB")
public class AnnotationStrategyB implements AnnotationStrategy{

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void doStrategy(){
        logger.info("doStrategy AnnotationStrategyB");
    }

}
