package com.alicp.jetcache.external;

import com.alicp.jetcache.anno.CacheConsts;

/**
 * mock 远程缓存
 */
public class MockRemoteCacheConfig<K, V> extends ExternalCacheConfig<K, V> {
    private int limit = CacheConsts.DEFAULT_LOCAL_LIMIT;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
