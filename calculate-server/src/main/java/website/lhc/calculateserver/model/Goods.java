package website.lhc.calculateserver.model;

import website.lhc.commoserver.base.AbstractModel;

import java.math.BigDecimal;

/**
 * @ProjectName: goodsserver
 * @Package: PACKAGE_NAME
 * @ClassName: Goods
 * @Author: lhc
 * @Description: 商品
 * @Date: 2020/5/15 下午 11:10
 */
public class Goods extends AbstractModel {

    /**
     * 商品名称
     */
    private String goodName;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 商品类型
     */
    private Integer goodType;
    /**
     * 是否为进口
     */
    private Boolean imported;
    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 含税价格
     */
    private BigDecimal taxIncludedPrice;

    public Goods() {
    }

    public Goods(String goodName, Integer count, Integer goodType, Boolean imported, BigDecimal price) {
        this.goodName = goodName;
        this.count = count;
        this.goodType = goodType;
        this.imported = imported;
        this.price = price;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    public Boolean getImported() {
        return imported;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public BigDecimal getTaxIncludedPrice() {
        return taxIncludedPrice;
    }

    public void setTaxIncludedPrice(BigDecimal taxIncludedPrice) {
        this.taxIncludedPrice = taxIncludedPrice;
    }
}
