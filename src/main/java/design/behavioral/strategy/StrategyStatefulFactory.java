package design.behavioral.strategy;

import org.springframework.util.StringUtils;

public class StrategyStatefulFactory {

    public static Strategy getStatefulStrategy(String type){
        if (StringUtils.isEmpty(type)){
            throw new IllegalArgumentException("type must be not null");
        }

        if(StringUtils.pathEquals(type, "A")){
            return new StrategyA();
        }else if(StringUtils.pathEquals(type, "B")){
            return new StrategyB();
        }else{
            return null;
        }
    }
}
