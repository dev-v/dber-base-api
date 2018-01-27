package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>店铺状态</li>
 * <pre>
 *     1-新注册 2-询问门店价格中 3-重新申请门店期望价格 4-通过认证 5-正常营业 6-休业 7-关闭
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ShopStatus {
    NEW(1,"新注册"),
    ENQUIRY(2,"询价中"),
    APPLY_PRICE(3,"申价中"),
    CERTIFICATED(4,"通过认证"),
    OPERATION(5,"营业中"),
    SUSPEND(6,"休业中"),
    CLOSED(7,"关闭")
    ;

    private int value;

    private String label;

    private ShopStatus(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ShopStatus from(int value) {
        for (ShopStatus member : ShopStatus.values()) {
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
