package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>运动类型</li>
 * <pre>
 *     
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum FitnessType {
    HOT(1,"热门"),
    BALL(2,"球类")
    ;

    private int value;

    private String label;

    private FitnessType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static FitnessType from(int value) {
        for (FitnessType member : FitnessType.values()) {
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
