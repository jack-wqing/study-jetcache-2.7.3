/**
 * Created on 2019/6/23.
 */
package com.alicp.jetcache.anno.config;

import com.alicp.jetcache.anno.support.ConfigMap;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */

/**
 * ConfigMap 全局定义 jetCache缓存注解的缓存
 */
@Configuration
public class CommonConfiguration {

    @Bean
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public ConfigMap jetcacheConfigMap() {

        return new ConfigMap();

    }

}
