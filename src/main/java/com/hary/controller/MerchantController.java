package com.hary.controller;

import com.hary.entity.Merchant;
import com.hary.service.MerchantService;
import com.hary.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author 70982
 */
@RestController
@Transactional
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @PostMapping("/merchant/register")
    public JsonResult register(@RequestParam("mcName") String mcName,
                               @RequestParam("mcPwd") String mcPwd,
                               @RequestParam("mcPhone") String mcPhone,
                               @RequestParam("mcRealName") String mcRealName,
                               @RequestParam("mcEmail") String mcEmail) {
        Integer integer = merchantService.queryMcPhone(mcPhone);
        if (integer != 0) {
            return new JsonResult("用户已存在",201,null);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String registerTime = sdf.format(new Date());
        Merchant merchant = new Merchant(mcName, mcPwd, mcPhone, mcRealName, mcEmail, registerTime);
        merchantService.registerMerchant(merchant);
        return new JsonResult("注册成功", 200, null);
    }

    @PostMapping("/merchant/login")
    public JsonResult login(@RequestParam("mcPhone") String mcPhone,
                            @RequestParam("mcPwd") String mcPwd) {
        final String pwd = merchantService.validatePwd(mcPhone);
        if (mcPwd.equals(pwd)) {
            return new JsonResult("登录成功", 200, null);
        } else {
            return new JsonResult("登录失败", 201, null);
        }
    }

    @PostMapping("/merchant/info")
    public JsonResult getInfo(@RequestParam("mcPhone") String mcPhone) {
        Merchant info = merchantService.getInfo(mcPhone);
        if (info != null) {
            JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
            result.data("id", info.getMcId());
            result.data("name", info.getMcName());
            result.data("avatar", info.getMcAvatar());
            return result;
        } else {
            return new JsonResult("获取失败", 200, null);
        }
    }

    @PostMapping("/merchant/pwd")
    public JsonResult getPwd(@RequestParam("mcId") Integer mcId) {
        String pwd = merchantService.getPwd(mcId);
        JsonResult result = new JsonResult("获取成功", 200, new HashMap<>());
        result.data("pwd", pwd);
        return result;
    }

    @PostMapping("/merchant/pwd/amend")
    public JsonResult updatePwd(@RequestParam("mcId") Integer mcId,
                                @RequestParam("mcPwd") String mcPwd) {
        merchantService.amendPwd(mcId, mcPwd);
        return new JsonResult("修改成功", 200, null);
    }
}
