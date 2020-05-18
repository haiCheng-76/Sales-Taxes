package website.lhc.goodsserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import website.lhc.commoserver.base.Resp;
import website.lhc.goodsserver.model.Goods;

import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.goodsserver.service
 * @ClassName: GoodsTaxService
 * @Author: lhc
 * @Description: 调用接口, 获取计算结果
 * @Date: 2020/5/17 上午 11:06
 */
@Component
@FeignClient(value = "calculate-server")
@RequestMapping(value = "/calculateController", produces = {"application/json;charset=UTF-8"})
public interface GoodsTaxService {

    /**
     * 调用接口
     * @param goodsList
     * @return
     */
    @PostMapping(value = "/getResult")
    Resp getGoodsTaxInfo(@RequestBody List<Goods> goodsList);
}
