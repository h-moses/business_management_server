package com.hary.controller;

import com.hary.entity.Order;
import com.hary.service.BrowserService;
import com.hary.service.OrderService;
import com.hary.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 70982
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private BrowserService browserService;

    @GetMapping("/index/data")
    public JsonResult getIndexData(@RequestParam("shopId") Integer shopId) {
        Float todayAmount = orderService.getTodayAmount(shopId);
        Integer newCustomer = orderService.getNewCustomer(shopId);
        Integer sevenDayOrder = orderService.getSevenDayOrder(shopId);
        Integer todayVisitor = browserService.getTodayVisitor(shopId);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("todayAmount", todayAmount);
        result.data("newCustomer", newCustomer);
        result.data("sevenDayOrder", sevenDayOrder);
        result.data("todayVisitor", todayVisitor);
        return result;
    }

    @PostMapping("/order/query")
    public JsonResult getOrderDetail(@RequestParam("shopId") Integer shopId,
                                     @RequestParam(required = false, value = "orderState") Integer orderState) {
        System.out.println(orderState);
        Order order = orderService.getOrders(shopId, orderState);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("order", order);
        return result;
    }
}
