package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>文件错误类型</li>
 * <pre>
 *     状态： 1-有效（对于attack类型，需要拦截） 2-失效（对于attack类型，不再拦截或者问题已解决） 3-删除（文件已从云端删除）
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ImgErrorStatus {
    VALID(1,"有效"),
    INVALID(2,"失效"),
    DELETE(3,"已删除")
    ;

    private int value;

    private String label;

    private ImgErrorStatus(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ImgErrorStatus from(int value) {
        for (ImgErrorStatus member : ImgErrorStatus.values()) {
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
