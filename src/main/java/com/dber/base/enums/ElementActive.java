package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>元素活跃指数</li>
 * <pre>
 *     
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ElementActive {
    VERY_ACTIVE(1,"极活跃"),
    ACTIVE(2,"活跃"),
    STABLY(3,"稳定"),
    INERTIAL(4,"惰性")
    ;

    private int value;

    private String label;

    private ElementActive(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ElementActive from(int value) {
        for (ElementActive member : ElementActive.values()) {
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
