package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>团体课程排课状态</li>
 * <pre>
 *     1-已发布； 2-已撤销； 3-已过期；
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum GroupCourseBooking {
    ENABLE(1,"已发布"),
    CANCEL(2,"已撤销"),
    EXPIRED(3,"已过期")
    ;

    private int value;

    private String label;

    private GroupCourseBooking(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static GroupCourseBooking from(int value) {
        for (GroupCourseBooking member : GroupCourseBooking.values()) {
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
