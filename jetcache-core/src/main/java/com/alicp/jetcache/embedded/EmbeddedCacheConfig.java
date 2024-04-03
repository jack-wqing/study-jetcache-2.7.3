package com.alicp.jetcache.embedded;

import com.alicp.jetcache.CacheConfig;
import com.alicp.jetcache.anno.CacheConsts;

/**
 * Created on 16/9/7.
 *
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */

/**
 * 本地缓存顶层配置
 * @param <K>
 * @param <V>
 */
public class EmbeddedCacheConfig<K, V> extends CacheConfig<K, V> {
    private int limit = CacheConsts.DEFAULT_LOCAL_LIMIT;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
