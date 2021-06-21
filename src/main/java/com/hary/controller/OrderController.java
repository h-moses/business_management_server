package com.hary.controller;

import com.hary.service.OrderService;
import com.hary.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 70982
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/index/data")
    public JsonResult getIndexData() {
        Float todayAmount = orderService.getTodayAmount();
        Integer newCustomer = orderService.getNewCustomer();
        Integer sevenDayOrder = orderService.getSevenDayOrder();
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("todayAmount", todayAmount);
        result.data("newCustomer", newCustomer);
        result.data("sevenDayOrder", sevenDayOrder);
        return result;
    }
}
