package com.dber.base.login;

import com.dber.base.entity.Account;
import com.dber.util.CipherUtil;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/10
 */
public class DefaultLoginHelper implements ILoginHelper {
    @Override
    public Account getAccount(Account account) {
        account.setId(1);
        account.setCellphone("13111111111");
        account.setPassword(CipherUtil.SHAEncode("888888"));
        return account;
    }

    @Override
    public void saveAccount(Account account) {

    }
}
