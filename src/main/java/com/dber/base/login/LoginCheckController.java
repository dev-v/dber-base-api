package com.dber.base.login;

import com.dber.base.entity.Account;
import com.dber.base.exception.system.login.NotLoginException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/25
 */
public class LoginCheckController implements ILoginCheckController {

    @Autowired
    private ILoginService loginService;

    @Override
    public Account getAccount() throws NotLoginException {
        return loginService.getAccount();
    }

    @Override
    public Integer getAccountId() throws NotLoginException {
        return loginService.getAccountId();
    }
}
