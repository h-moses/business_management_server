package com.hary.controller;

import com.hary.entity.Goods;
import com.hary.service.GoodsService;
import com.hary.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author 70982
 */
@RestController
@Transactional
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/store/count")
    public JsonResult getGoodsCount(@RequestParam("shopId") Integer shopId) {
        Integer goodsCount = goodsService.getGoodsCount(shopId);
        Integer warningStore = goodsService.getWarningStore(shopId);
        Integer zeroStore = goodsService.getZeroStore(shopId);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("goodsCount", goodsCount);
        result.data("warningStore", warningStore);
        result.data("zeroStore", zeroStore);
        return result;
    }

    @PostMapping("/store/list")
    public JsonResult getStoreList(@RequestParam("shopId") Integer shopId,
                                   @RequestParam(required = false, value = "condition") Integer condition) {
        System.out.println(condition);
        List<Goods> storeList = goodsService.getStoreList(shopId, condition);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("list", storeList);
        return result;
    }

    @PostMapping("/store/update")
    public JsonResult updateStore(@RequestParam("goodsId") Integer goodsId,
                                  @RequestParam("goodsName") String goodsName,
                                  @RequestParam("storeQuantity") Integer storeQuantity) {
        goodsService.updateStore(goodsId, goodsName, storeQuantity);
        return new JsonResult("修改成功", 200, null);
    }

    @PostMapping("/goods/add")
    public JsonResult addGoods(@RequestParam("goodsName") String goodsName,
                               @RequestParam(required = false, value = "goodsAvatar") String goodsAvatar,
                               @RequestParam("mainCategory") String mainCategory,
                               @RequestParam("secondaryCategory") String secondaryCategory,
                               @RequestParam("sellingWay") Integer sellingWay,
                               @RequestParam("unitPrice") Float unitPrice,
                               @RequestParam("boxSize") Float boxSize,
                               @RequestParam("boxPrice") Float boxPrice,
                               @RequestParam("subordinatedRate") String subordinatedRate,
                               @RequestParam("originPlace") String originPlace,
                               @RequestParam("shopId") Integer shopId,
                               @RequestParam("goodStuff") Integer goodStuff,
                               @RequestParam("goodsState") Integer goodsState) {
        Goods goods = new Goods(goodsName, goodsAvatar, mainCategory, secondaryCategory, sellingWay, unitPrice, boxSize, boxPrice, subordinatedRate, originPlace, shopId, goodsState, goodStuff);
        goodsService.addGoods(goods);
        return new JsonResult("添加成功", 200, null);
    }

    @PostMapping("/goods/update")
    public JsonResult updateGoods(@RequestParam("goodsName") String goodsName,
                                  @RequestParam("goodsAvatar") String goodsAvatar,
                                  @RequestParam("mainCategory") String mainCategory,
                                  @RequestParam("secondaryCategory") String secondaryCategory,
                                  @RequestParam("saleWay") Integer sellingWay,
                                  @RequestParam("unitPrice") Float unitPrice,
                                  @RequestParam("boxSize") Float boxSize,
                                  @RequestParam("boxPrice") Float boxPrice,
                                  @RequestParam("subordinatedRate") String subordinatedRate,
                                  @RequestParam("originPlace") String originPlace,
                                  @RequestParam("shopId") Integer shopId,
                                  @RequestParam("goodStuff") Integer goodStuff,
                                  @RequestParam("goodsState") Integer goodsState) {
        Goods goods = new Goods(goodsName, goodsAvatar, mainCategory, secondaryCategory, sellingWay, unitPrice, boxSize, boxPrice, subordinatedRate, originPlace, shopId, goodsState, goodStuff);
        goodsService.updateGoods(goods);
        return new JsonResult("添加成功", 200, null);
    }

    @PostMapping("/goods/delete")
    public JsonResult deleteGoods(@RequestParam("goodsId") Integer goodsId) {
        goodsService.deleteGoods(goodsId);
        return new JsonResult("删除成功", 200, null);
    }

    @PostMapping("/goods/state")
    public JsonResult updateState(@RequestParam("goodsId") Integer goodsId,
                                  @RequestParam("goodsState") Integer goodsState) {
        goodsService.updateState(goodsId, goodsState);
        return new JsonResult("修改成功", 200, null);
    }

    @PostMapping("/goods/by/name")
    public JsonResult getGoodsByName(@RequestParam("shopId") Integer shopId,
                                     @RequestParam(required = false, value = "goodsName") String goodsName) {
        List<Goods> goodsByName = goodsService.getGoodsByName(shopId, goodsName);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("goods", goodsByName);
        return result;
    }

    @PostMapping("/goods/by/state")
    public JsonResult getGoodsByName(@RequestParam("shopId") Integer shopId,
                                     @RequestParam("goodsState") Integer goodsState) {
        List<Goods> goodsByState = goodsService.getGoodsByState(shopId, goodsState);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("goods", goodsByState);
        return result;
    }

    @PostMapping("/goods/detail")
    public JsonResult getGoodsDetail(@RequestParam("goodsId") Integer goodsId) {
        Goods goodsDetail = goodsService.getGoodsDetail(goodsId);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("goodsDetail", goodsDetail);
        return result;
    }
}
