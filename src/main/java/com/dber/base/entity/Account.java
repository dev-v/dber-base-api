package com.dber.base.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <li>文件名称: Account.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2017年12月21日
 */
@Data
public class Account implements Serializable {

    private static final long serialVersionUID = 5565421101691993291l;

    private Integer id;

    /**
     * 本平台昵称
     */
    private String name;

    private String cellphone;

    private String email;

    /**
     * 账号登录密码
     */
    private String password;

    /**
     * 本账户被绑定的账户id，被绑定后，本账户数据将迁移到被绑定账户上，并且实现本账户
     */
    private Integer bindId;

    /**
     * 账户状态：
     * 常规状态：
     * 1-启用
     * 2-绑定失效（被认证的其他账户绑定，数据已被迁移到其他账号上）
     * 3-登录锁定
     */
    private Integer status;

    private Integer pwExpired;

    /**
     * 所属平台
     */
    private Integer system;

    private VerifyWay verifyWay;

    /**
     * 验证码(图形或手机验证码)
     */
    private String captcha;
}


