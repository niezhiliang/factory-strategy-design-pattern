package cn.isuyu.factory.strategy.design.pattern.strategys;

import cn.isuyu.factory.strategy.design.pattern.annotations.Type;
import org.springframework.stereotype.Component;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-09-05 19:20
 */
@Component("add")
@Type(type = "add")
public class StrategyAdd implements Strategy {
    @Override
    public void invoke() {
        System.out.println("--------加策略-----------");
    }
}
