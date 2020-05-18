package website.lhc.goodsserver.util;

import website.lhc.goodsserver.model.Goods;

import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.goodsserver
 * @ClassName: GoodsInfo
 * @Author: lhc
 * @Description: 商品信息存于内存
 * @Date: 2020/5/16 下午 09:55
 */
public class GoodsInfo {
    private static List<Goods> GOODS_LIST = new LinkedList<>();

    public static void addGoods(Goods goods) {
        GOODS_LIST.add(goods);
    }

    public static List<Goods> goodsList() {
        return GOODS_LIST;
    }

    public static void removeAllGoods() {
        GOODS_LIST.clear();
    }
}
