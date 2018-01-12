package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>是否</li>
 * <pre>
 *     
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum YesNo {
    YES(1,"是"),
    NO(2,"否")
    ;

    private int value;

    private String label;

    private YesNo(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public boolean is(int value) {
        return this.value == value;
    }
}
