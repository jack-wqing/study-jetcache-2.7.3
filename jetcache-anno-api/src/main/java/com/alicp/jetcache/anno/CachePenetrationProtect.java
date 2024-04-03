/**
 * Created on 2018/4/27.
 */
package com.alicp.jetcache.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 * 多线程，缓存穿透保护
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CachePenetrationProtect {

    boolean value() default true;

    int timeout() default CacheConsts.UNDEFINED_INT;

    TimeUnit timeUnit() default TimeUnit.SECONDS;

}
