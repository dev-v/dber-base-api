package com.dber.base.util;

import com.dber.base.enums.DberSystem;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/12
 */
public class BaseKeyUtil {
    public static final String auth_params_system = "auth_params_system";
    public static final String auth_params_key = "auth_params_key";

    public static final String getBaseKey(DberSystem system) {
        return "dber_service_url_for_" + system.name();
    }

    public static final boolean isAuthKey(String key) {
        return key == null ? false : (auth_params_key.equals(key) || auth_params_system.equals(key));
    }
}
