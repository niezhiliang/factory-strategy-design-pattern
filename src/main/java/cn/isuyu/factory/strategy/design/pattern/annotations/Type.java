package cn.isuyu.factory.strategy.design.pattern.annotations;

import java.lang.annotation.*;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-09-05 19:21
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Type {

    String type() default "";
}
