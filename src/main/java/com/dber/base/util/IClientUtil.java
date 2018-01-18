package com.dber.base.util;

import com.dber.base.result.Result;
import org.apache.http.HttpEntity;

import java.lang.reflect.Type;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author chenw
 * @version 1.0
 * @since 2018/1/11
 */
public interface IClientUtil {

    /**
     * @param path   使用带"/"的根路径
     * @param params map or pojo
     * @return
     */
    String getString(String path, Object params);

    /**
     * @param path 使用带"/"的根路径
     * @return
     */
    String getString(String path);

    /**
     * @param path   使用带"/"的根路径
     * @param params map or pojo
     * @param clz
     * @param <E>
     * @return
     */
    <E> Result<E> get(String path, Object params, Type type);

    /**
     * @param path 使用带"/"的根路径
     * @param clz
     * @param <E>
     * @return
     */
    <E> Result<E> get(String path, Type type);

    /**
     * @param path 使用带"/"的根路径
     * @return
     */
    Result<String> get(String path);

    /**
     * @param path   使用带"/"的根路径
     * @param params map or pojo
     * @return
     */
    String postString(String path, Object params);

    /**
     * @param path   使用带"/"的根路径
     * @param params map or pojo
     * @param clz
     * @param <E>
     * @return
     */
    <E> Result<E> post(String path, Object params, Type type);

    /**
     * @param path   使用带"/"的根路径
     * @param params map or pojo
     * @return
     */
    Result<String> post(String path, Object params);

    /**
     * @param path   使用带"/"的根路径
     * @param params map or pojo
     * @return
     */
    HttpEntity gize(String path, Object params);
}
