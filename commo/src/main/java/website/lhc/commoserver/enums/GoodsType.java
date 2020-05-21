package website.lhc.commoserver.enums;

/**
 * @ProjectName: homework
 * @Package: PACKAGE_NAME
 * @ClassName: GoodType
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/15 下午 11:20
 */
public enum GoodsType {
    /**
     * 书
     */
    BOOK(1),
    /**
     * 食品
     */
    FOOD(2),
    /**
     * 医疗用品
     */
    MEDICAL(3),
    /**
     * 其他种类
     */
    OTHERS(4);

    private int value;

    GoodsType(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
