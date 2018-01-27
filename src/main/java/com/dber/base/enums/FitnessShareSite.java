package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>是否场地共享</li>
 * <pre>
 *     系统健身服务设置选项
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum FitnessShareSite {
    YES(1,"是"),
    NO(2,"否"),
    SELECT(3,"店铺选择")
    ;

    private int value;

    private String label;

    private FitnessShareSite(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static FitnessShareSite from(int value) {
        for (FitnessShareSite member : FitnessShareSite.values()) {
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
