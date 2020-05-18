package website.lhc.goodsserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import website.lhc.commoserver.base.Resp;
import website.lhc.commoserver.util.ValidatorUtil;
import website.lhc.goodsserver.dto.GoodsDto;
import website.lhc.goodsserver.model.Goods;
import website.lhc.goodsserver.service.GoodsTaxService;
import website.lhc.goodsserver.util.GoodsInfo;

import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.goodsserver
 * @ClassName: GoodsController
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/16 下午 10:00
 */

@RestController
@RequestMapping(value = "/goodsController")
public class GoodsController {

    private static final Logger log = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsTaxService goodsTaxService;

    @PostMapping(value = "/add")
    public Resp addGoods(@RequestBody GoodsDto vo) {
        ValidatorUtil.verify(vo);
        Goods goods1 = new Goods(vo.getName().trim(), vo.getCount(), vo.getType(), vo.getImported(), vo.getPrice());
        GoodsInfo.addGoods(goods1);
        return Resp.ok();
    }

    @GetMapping(value = "/list")
    public Resp listGoods() {
        List<Goods> goods = GoodsInfo.goodsList();
        return Resp.ok(goods);
    }

    @GetMapping(value = "/removeAll")
    public Resp removeAllGoods() {
        GoodsInfo.removeAllGoods();
        return Resp.ok();
    }

    @GetMapping(value = "/getTaxResult")
    public Resp getTaxResult() {
        return goodsTaxService.getGoodsTaxInfo(GoodsInfo.goodsList());
    }
}
