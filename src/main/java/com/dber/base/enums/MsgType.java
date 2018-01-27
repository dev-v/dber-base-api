package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>消息类型</li>
 * <pre>
 *     
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum MsgType {
    SYS(1,"系统消息")
    ;

    private int value;

    private String label;

    private MsgType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static MsgType from(int value) {
        for (MsgType member : MsgType.values()) {
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
