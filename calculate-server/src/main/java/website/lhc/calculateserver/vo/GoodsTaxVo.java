package website.lhc.calculateserver.vo;

import website.lhc.calculateserver.model.Goods;
import website.lhc.commoserver.base.AbstractModel;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.calculateserver.vo
 * @ClassName: GoodsTaxVo
 * @Author: lhc
 * @Description: 返回计算结果
 * @Date: 2020/5/17 上午 11:22
 */
public class GoodsTaxVo extends AbstractModel {

    private BigDecimal tax;
    private BigDecimal total;
    private List<Goods> goodsList;

    public GoodsTaxVo() {
    }

    public GoodsTaxVo(BigDecimal tax, BigDecimal total, List<Goods> goodsList) {
        this.tax = tax;
        this.total = total;
        this.goodsList = goodsList;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
