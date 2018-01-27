package com.dber.base.enums;

/**
 * <li>修改记录: ...</li>
 * <li>图片业务类型</li>
 * <pre>
 *     1-店铺图片 3-系统健身运动服务项目图片 4-教练认证头像 5-用户认证头像等 6-店铺二维码 7-教练认证证书 8-体能测试结果
 * </pre>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public enum ImgType {


    SHOP(1, "店铺主图", 1),
    SHOP_ENV(2, "店铺环境图片", 100),
    SHOP_SERVICE(3, "店铺服务项目图片", 20),
    COACHER_IDENTIFICATION(4, "教练认证头像", 1),
    CUSTOMER_IDENTIFICATION(5, "用户认证头像", 1),
    MATRIX_CODE(6, "店铺二维码", 1),
    COACHER_CERTIFICATE(7, "教练认证证书", 20),
    FITNESS_TEST(8, "体能测试结果", 50),
    IDENTITY(9, "身份认证", 10),
    SHOP_SITE(10, "店铺场地图片", 10);


    private int value;

    private short maxCount;

    private String label;

    private ImgType(int value, String label, Integer maxCount) {
        this.value = value;
        this.label = label;
        this.maxCount = maxCount.shortValue();
    }

    public boolean isPublic() {
        return this == SHOP || this == SHOP_SERVICE || this == SHOP_SITE;
    }

    public short getMaxCount() {
        return maxCount;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public static ImgType from(int type) {
        for (ImgType imgType : ImgType.values()) {
            if (imgType.getValue() == type) {
                return imgType;
            }
        }
        return null;
    }

    public boolean is(Integer value) {
        return value != null && this.value == value;
    }
}
