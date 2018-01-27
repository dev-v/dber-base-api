package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>执行状态</li>
 * <pre>
 *     1-初始化，2-触发任务等待执行，3-执行中，4-过期失效，5-成功，6-失败
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum JobExecuteStatus {
    INIT(1,"初始化"),
    WAITING_EXECUTE(2,"等待执行"),
    EXECUTING(3,"执行中"),
    EXPIRED(4,"过期失效"),
    SUCCESS(5,"执行成功"),
    FAILURE(6,"执行失败")
    ;

    private int value;

    private String label;

    private JobExecuteStatus(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static JobExecuteStatus from(int value) {
        for (JobExecuteStatus member : JobExecuteStatus.values()) {
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
