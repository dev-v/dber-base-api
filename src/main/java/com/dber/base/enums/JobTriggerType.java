package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>触发类型</li>
 * <pre>
 *     1-cron表达式，2-秒
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum JobTriggerType {
    SECOND(2,"秒"),
    CRON(1,"CRON")
    ;

    private int value;

    private String label;

    private JobTriggerType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static JobTriggerType from(int value) {
        for (JobTriggerType member : JobTriggerType.values()) {
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
