package cn.isuyu.factory.strategy.design.pattern.factory;

import cn.isuyu.factory.strategy.design.pattern.strategys.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-09-05 19:20
 */
@Service
public class StrategyFactory {
    @Autowired
    private final Map<String, Strategy> strategyMap = new ConcurrentHashMap<>(3);

    public Strategy getStrategy(String type) {
        Strategy strategy = strategyMap.get(type);
        if (strategy == null) {
            throw new RuntimeException("no strategy defined");
        }
        return strategy;
    }
}
