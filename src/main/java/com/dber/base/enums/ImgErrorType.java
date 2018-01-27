package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>异常图片类型</li>
 * <pre>
 *     1-没有回传token 2-超时或者token超容量后丢失token缓存 3-业务验证失败（滥用或攻击行为）
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ImgErrorType {
    NOTOKEN(1,"无回传TOKEN"),
    EXPIRE(2,"缓存验证TOKEN失效"),
    ATTACK(3,"滥用或攻击")
    ;

    private int value;

    private String label;

    private ImgErrorType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ImgErrorType from(int value) {
        for (ImgErrorType member : ImgErrorType.values()) {
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
