package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>任务类型</li>
 * <pre>
 *     1-client(msg-key),2-http请求,3-本地Class实现
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum JobTaskType {
    CLIENT(1,"client(msg-key)"),
    HTTP(2,"httpUrl"),
    CLASS(3,"class")
    ;

    private int value;

    private String label;

    private JobTaskType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static JobTaskType from(int value) {
        for (JobTaskType member : JobTaskType.values()) {
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
