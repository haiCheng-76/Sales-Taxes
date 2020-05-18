package website.lhc.calculateserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import website.lhc.calculateserver.model.Goods;
import website.lhc.calculateserver.service.TaxService;
import website.lhc.calculateserver.vo.GoodsTaxVo;
import website.lhc.commoserver.base.Resp;

import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.calculateserver
 * @ClassName: CalculateController
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/17 上午 01:48
 */
@RestController
@RequestMapping(value = "/calculateController")
public class TaxController {

    @Autowired
    private TaxService taxService;

    @PostMapping(value = "/getResult")
    public Resp getResult(@RequestBody List<Goods> goodsList) {
        if (CollectionUtils.isEmpty(goodsList)) {
            return Resp.error("数据为空");
        }
        GoodsTaxVo vo = taxService.getResult(goodsList);
        return Resp.ok(vo);
    }
}
