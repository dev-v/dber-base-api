package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>账户状态</li>
 * <pre>
 *     1-启用 2-绑定失效（被认证的其他账户绑定，数据已被迁移到其他账号上） 3-登录锁定
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum AccountStatus {
    ENABLED(1,"启用"),
    BIND_EXPIRED(2,"绑定失效"),
    LOGIN_LOCK(3,"锁定中")
    ;

    private int value;

    private String label;

    private AccountStatus(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static AccountStatus from(int value) {
        for (AccountStatus member : AccountStatus.values()) {
            if (member.getValue() == value) {
                return member;
            }
        }
        return null;
    }

    public boolean is(Integer value) {
        return value != null && this.value == value;
    }
}
