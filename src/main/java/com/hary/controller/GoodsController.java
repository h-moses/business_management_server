package com.hary.controller;

import com.hary.entity.Goods;
import com.hary.service.GoodsService;
import com.hary.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 70982
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/store/count")
    public JsonResult getGoodsCount(@RequestParam("shopId") Integer shopId) {
        Integer goodsCount = goodsService.getGoodsCount(shopId);
        Integer warningStore = goodsService.getWarningStore(shopId);
        Integer zeroStore = goodsService.getZeroStore(shopId);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("goodsCount",goodsCount);
        result.data("warningStore",warningStore);
        result.data("zeroStore",zeroStore);
        return result;
    }

    @PostMapping("/store/list")
    public JsonResult getStoreList(@RequestParam("shopId") Integer shopId,
                                   @RequestParam(required = false,value = "condition") Integer condition) {
        Goods storeList = goodsService.getStoreList(shopId, condition);
        JsonResult result = new JsonResult("获取成功",200,new HashMap<>());
        result.data("list",storeList);
        return result;
    }

    @PostMapping("/store/update")
    public JsonResult updateStore(@RequestParam("goodsId") Integer goodsId,
                                  @RequestParam("goodsName") String goodsName,
                                  @RequestParam("storeQuantity") Integer storeQuantity) {
        goodsService.updateStore(goodsId, goodsName, storeQuantity);
        return new JsonResult("修改成功",200,null);
    }
}
