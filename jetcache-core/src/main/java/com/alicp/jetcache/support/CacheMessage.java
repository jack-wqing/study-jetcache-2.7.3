/**
 * Created on 2019/6/22.
 */

package com.alicp.jetcache.support;

import java.io.Serializable;

/**
 * The CacheMessage is used for distributed message while CacheEvent used in single JVM.
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */

/**
 * 分布式缓存的情况下，缓存通知的消息抽象
 */
public class CacheMessage implements Serializable {
    private static final long serialVersionUID = -462475561129953207L;

    public static final int TYPE_PUT = 1;
    public static final int TYPE_PUT_ALL = 2;
    public static final int TYPE_REMOVE = 3;
    public static final int TYPE_REMOVE_ALL = 4;

    private String sourceId;

    private String area;

    private String cacheName;

    private int type;

    private Object[] keys;

    /**
     * this field is reserved.
     */
    private Object[] values;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object[] getKeys() {
        return keys;
    }

    public void setKeys(Object[] keys) {
        this.keys = keys;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCacheName() {
        return cacheName;
    }

    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
