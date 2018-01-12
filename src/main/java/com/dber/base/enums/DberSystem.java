package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>系统</li>
 * <pre>
 *     1-平台、2-账单、3-店铺、4-会员、5-教练等
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum DberSystem {
    PLAT(1,"平台"),
    BILL(2,"账单"),
    SHOP(3,"店铺"),
    CUSTOMER(4,"会员"),
    COACHER(5,"教练")
    ;

    private int value;

    private String label;

    private DberSystem(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public boolean is(int value) {
        return this.value == value;
    }


}
