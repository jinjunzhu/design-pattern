package design.behavioral.strategy;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class StrategyNonStatefulFactory {

    private static Map<String, Strategy> strategyMap = new HashMap<>(3);

    static {
        strategyMap.put("strategyA", new StrategyA());
        strategyMap.put("strategyB", new StrategyB());
    }

    public static Strategy getStrategy(String type){
        if (StringUtils.isEmpty(type)){
            throw new IllegalArgumentException("type must be not null");
        }
        return strategyMap.get(type);
    }
}
