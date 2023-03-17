package com.alicp.jetcache.anno;

import java.lang.annotation.*;

/**
 * @author <a href="scolia@qq.com">scolia</a>
 * 多个缓存获取策略配置
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheInvalidateContainer {

    CacheInvalidate[] value();
}
