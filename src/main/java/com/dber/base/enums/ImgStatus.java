package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>图片状态</li>
 * <pre>
 *     状态：1-可用，2-删除，3-过期
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ImgStatus {
    AVAILABLE(1,"可用"),
    DELETED(2,"已删除"),
    EXPIRED(3,"已过期"),
    COVER(4,"覆盖上传")
    ;

    private int value;

    private String label;

    private ImgStatus(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ImgStatus from(int value) {
        for (ImgStatus member : ImgStatus.values()) {
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
