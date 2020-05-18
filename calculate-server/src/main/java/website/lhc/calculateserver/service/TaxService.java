package website.lhc.calculateserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import website.lhc.calculateserver.model.Goods;
import website.lhc.calculateserver.util.MathUtil;
import website.lhc.calculateserver.vo.GoodsTaxVo;
import website.lhc.commoserver.enums.GoodsType;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.calculateserver.service
 * @ClassName: TaxService
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/17 上午 10:53
 */
@Service
public class TaxService {

    private static final Logger log = LoggerFactory.getLogger(TaxService.class);

    /**
     * 除特定商品的消费税
     */
    private static final BigDecimal EXCEPT_TAX = BigDecimal.valueOf(0.1);
    /**
     * 进口商品税
     */
    private static final BigDecimal IMPORT_TAX = BigDecimal.valueOf(0.05);

    public GoodsTaxVo getResult(List<Goods> goodsList) {
        BigDecimal total = BigDecimal.valueOf(0);
        BigDecimal tax = BigDecimal.valueOf(0);

        for (Goods goods : goodsList) {
            total = total.add(MathUtil.mult(goods.getPrice(), BigDecimal.valueOf(goods.getCount())));
            tax = tax.add(getPriceTax(goods));
        }
        log.info("total:{};tax:{}", total, tax);
        return new GoodsTaxVo(tax, total.add(tax), goodsList);
    }

    private static BigDecimal getPriceTax(Goods goods) {
        BigDecimal tax = BigDecimal.valueOf(0);
        // 获取除书，食品和药品的税
        tax = getExceptPrice(goods, tax);
        // 获取进口商品税
        tax = geteImportPrice(goods, tax);
        // 商品含税总价
        goods.setTaxIncludedPrice(MathUtil.add(tax, goods.getPrice()));
        return tax;
    }

    private static BigDecimal getExceptPrice(Goods goods, BigDecimal tax) {
        if (goods.getGoodType().equals(GoodsType.OTHERS.value())) {
            BigDecimal goodsTax = MathUtil.mult(goods.getPrice(), BigDecimal.valueOf(goods.getCount())).multiply(EXCEPT_TAX);
            return getMathResult(goodsTax);
        }
        return tax;
    }

    private static BigDecimal geteImportPrice(Goods goods, BigDecimal tax) {
        if (goods.getImported()) {
            BigDecimal importedTax = MathUtil.mult(goods.getPrice(), BigDecimal.valueOf(goods.getCount())).multiply(IMPORT_TAX);
            return getMathResult(importedTax).add(tax);
        }
        return tax;
    }


    private static BigDecimal getMathResult(BigDecimal tax) {
        return tax.divide(BigDecimal.valueOf(0.05)).setScale(0, RoundingMode.UP).multiply(BigDecimal.valueOf(0.05));
    }

}
