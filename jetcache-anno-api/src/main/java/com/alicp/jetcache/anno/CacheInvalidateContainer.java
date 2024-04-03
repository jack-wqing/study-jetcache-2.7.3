package com.alicp.jetcache.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="scolia@qq.com">scolia</a>
 * 支持缓存不可能的多个设置
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheInvalidateContainer {

    CacheInvalidate[] value();
}
