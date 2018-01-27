package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>账户类型</li>
 * <pre>
 *     1-健身者，2-私教，3-店铺管理员
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum AccountType {
    CUSTOMER(1,"健身者"),
    COACHER(2,"教练"),
    SHOP_MANAGER(3,"店铺管理员")
    ;

    private int value;

    private String label;

    private AccountType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static AccountType from(int value) {
        for (AccountType member : AccountType.values()) {
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
