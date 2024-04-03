package com.alicp.jetcache;

/**
 * Created on 2016/11/17.
 *
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */

/**
 * builder模式构建Cache
 */
public interface CacheBuilder {
    <K, V> Cache<K, V> buildCache();
}
