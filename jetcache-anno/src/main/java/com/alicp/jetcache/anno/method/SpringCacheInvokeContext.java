/**
 * Created on  13-10-07 23:25
 */
package com.alicp.jetcache.anno.method;

import org.springframework.context.ApplicationContext;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */

/**
 * Spring 支持缓存 cacheInvokeContext
 */
public class SpringCacheInvokeContext extends CacheInvokeContext {
    protected ApplicationContext context;

    public SpringCacheInvokeContext(ApplicationContext context) {
        this.context = context;
    }

    public Object bean(String name) {
        return context.getBean(name);
    }


}
