package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>店铺状态</li>
 * <pre>
 *     1-新注册  2-审核中 3-询价中  4-营业中
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ShopStatus {
    NEW(11,"新注册"),
    AUDITING(21,"审核中"),
    AUDIT_FAILURE(22,"拒绝申请"),
    ENQUIRING(31,"询价中（待提交期望门店价）"),
    EVALUATE_BASE_PRICE(32,"评估基础价格中"),
    ENQUIRING_HIGHER(33,"期望价过高"),
    ENQUIRING_LOWER(34,"期望价过低"),
    BUSINESSING_NO_SERVICE(41,"营业中（无服务）"),
    BUSINESSING_WITH_SERVICE(42,"营业中（有服务）"),
    BUSINESS_SUSPEND(51,"休业中"),
    CLOSED(52,"已关店")
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
