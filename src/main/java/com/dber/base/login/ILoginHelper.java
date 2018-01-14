package com.dber.base.login;

import com.dber.base.entity.Account;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author chenw
 * @version 1.0
 * @since 2018/1/14
 */
public interface ILoginHelper {
    /**
     * 获取真实用户信息
     * 若没有该用户返回null
     *
     * @param account
     * @return
     */
    Account getAccount(Account account);

    /**
     * 保存Account账户
     *
     * @param account
     */
    void saveAccount(Account account);
}
