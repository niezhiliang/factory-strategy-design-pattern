package cn.isuyu.factory.strategy.design.pattern.controller;

import cn.isuyu.factory.strategy.design.pattern.factory.StrategyFactory;
import cn.isuyu.factory.strategy.design.pattern.strategys.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-09-05 19:31
 */
@RestController
public class TestController {
    @Autowired
    private StrategyFactory strategyFactory;

    @RequestMapping(value = "/{type}")
    public String doInvoke(@PathVariable("type")String type) {
        System.out.println(type);
        Strategy strategy = strategyFactory.getStrategy(type);
        strategy.invoke();
        return "success";
    }
}
