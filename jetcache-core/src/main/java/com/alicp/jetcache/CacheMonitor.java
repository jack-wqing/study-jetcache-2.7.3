package com.alicp.jetcache;

import com.alicp.jetcache.event.CacheEvent;

/**
 * Created on 2016/10/25.
 *
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */

/**
 * 缓存操作监视器
 */
@FunctionalInterface
public interface CacheMonitor {

    void afterOperation(CacheEvent event);

}
