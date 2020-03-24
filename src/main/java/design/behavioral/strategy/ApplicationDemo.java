package design.behavioral.strategy;


import org.apache.commons.lang3.StringUtils;

public class ApplicationDemo {

    public static void main(String[] args){
        //不适用策略模式
        String type = "strategyA";
        if (StringUtils.equals(type, "strategyA")){
            new StrategyA().doStrategy();
        }else if (StringUtils.equals(type, "strategyB")){
            new StrategyB().doStrategy();
        }

        //使用策略模式
        Strategy strategy = StrategyNonStatefulFactory.getStrategy(type);
        strategy.doStrategy();

        //注解策略模式
        AnnotationStrategy annotationStrategy = AnnotationStrategyFactory.getAnnotationStrategy(type);
        annotationStrategy.doStrategy();
    }
}
