package com.hary.controller;

import com.hary.entity.Shop;
import com.hary.service.ShopService;
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
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/shop/add")
    public JsonResult addShop(@RequestParam("mcId") Integer mcId,
                              @RequestParam("shopName") String shopName,
                              @RequestParam("majorBusiness") String majorBusiness,
                              @RequestParam("registerTime") String registerTime,
                              @RequestParam("legalPerson") String legalPerson) {
        Shop shop = new Shop(mcId, shopName, majorBusiness, legalPerson, registerTime);
        shopService.addShop(shop);
        return new JsonResult("添加成功", 200, null);
    }

    @PostMapping("/shop/info")
    public JsonResult getInfo(@RequestParam("mcId") Integer mcId) {
        Shop info = shopService.getInfo(mcId);
        if (info != null) {
            JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
            result.data("shopId", info.getShopId());
            result.data("shopName", info.getShopName());
            result.data("majorBusiness", info.getMajorBusiness());
            result.data("registerTime", info.getRegisterTime());
            result.data("legalPerson", info.getLegalPerson());
            return result;
        } else {
            return new JsonResult("获取失败", 201, null);
        }
    }
}
