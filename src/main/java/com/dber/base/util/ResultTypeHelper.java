package com.dber.base.util;

import com.alibaba.fastjson.TypeReference;
import com.dber.base.result.Page;
import com.dber.base.result.Result;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/18
 */
public class ResultTypeHelper {


    public static final Map<Class, Type> CACHE_RESPONSE_TYPE = new HashMap<>();
    public static final Map<Class, Type> CACHE_RESPONSE_COLLECTION_TYPE = new HashMap<>();
    public static final Map<Class, Type> CACHE_RESPONSE_PAGE_TYPE = new HashMap<>();

    public static final <E> Type getType(Class<E> clz) {
        Type type = CACHE_RESPONSE_TYPE.get(clz);
        if (type == null) {
            TypeReference<Result<E>> reference = new TypeReference<Result<E>>(clz) {
            };
            type = reference.getType();
            CACHE_RESPONSE_TYPE.put(clz, type);
        }
        return type;
    }

    public static final <E> Type getCollectionType(Class<E> clz) {
        Type type = CACHE_RESPONSE_COLLECTION_TYPE.get(clz);
        if (type == null) {
            TypeReference<Result<Collection<E>>> reference = new TypeReference<Result<Collection<E>>>(clz) {
            };
            type = reference.getType();
            CACHE_RESPONSE_COLLECTION_TYPE.put(clz, type);
        }
        return type;
    }

    public static final <E> Type getPageType(Class<E> clz) {
        Type type = CACHE_RESPONSE_PAGE_TYPE.get(clz);
        if (type == null) {
            TypeReference<Result<Page<E>>> reference = new TypeReference<Result<Page<E>>>(clz) {
            };
            type = reference.getType();
            CACHE_RESPONSE_PAGE_TYPE.put(clz, type);
        }
        return type;
    }
}
