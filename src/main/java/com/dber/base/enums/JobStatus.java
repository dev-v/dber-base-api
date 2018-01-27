package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>任务状态</li>
 * <pre>
 *     1-新建，2-启用，3-停用
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum JobStatus {
    NEW(1,"新建"),
    ENABLED(2,"启用"),
    DISABLED(3,"禁用")
    ;

    private int value;

    private String label;

    private JobStatus(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static JobStatus from(int value) {
        for (JobStatus member : JobStatus.values()) {
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
