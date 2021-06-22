package com.hary.controller;

import com.hary.entity.Goods;
import com.hary.service.GoodsService;
import com.hary.service.OrderService;
import com.hary.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 70982
 */
@RestController
@Transactional
public class BusinessController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/business/data")
    public JsonResult getBusinessData(@RequestParam("shopId") Integer shopId) {
        Float todayAmount = orderService.getTodayAmount(shopId);
        Integer todayOrderCount = orderService.getTodayOrderCount(shopId);
        Integer todayOrderBox = orderService.getTodayOrderBox(shopId);
        Integer orderGoodsCount = orderService.getOrderGoodsCount(shopId);
        Integer countOnSale = goodsService.getCountOnSale(shopId);
        Integer allCustomers = orderService.getAllCustomers(shopId);
        Integer todayCustomers = orderService.getTodayCustomers(shopId);
        Integer oldCustomers = orderService.getOldCustomers(shopId);
        JsonResult result = new JsonResult("获取成功",200,new HashMap<>());
        result.data("todayAmount",todayAmount);
        result.data("todayOrderCount",todayOrderCount);
        result.data("todayOrderBox",todayOrderBox);
        result.data("orderGoodsCount",orderGoodsCount);
        result.data("countOnSale",countOnSale);
        result.data("allCustomers",allCustomers);
        result.data("todayCustomers",todayCustomers);
        result.data("oldRate",oldCustomers / todayCustomers);
        return result;
    }
}
