/**
 * Created on 2018/2/1.
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
 * 支持缓存的定时刷新
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CacheRefresh {

    int refresh();

    int stopRefreshAfterLastAccess() default CacheConsts.UNDEFINED_INT;

    int refreshLockTimeout() default CacheConsts.UNDEFINED_INT;

    TimeUnit timeUnit() default TimeUnit.SECONDS;

}
