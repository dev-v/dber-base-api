package com.dber.base.login;

import com.dber.base.entity.Account;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: 标记接口，标记了该接口的Controller访问必须通过登录认证后方能访问</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/18
 */
public interface ILoginCheckController {

    public Account getAccount();

    public Integer getAccountId();
}