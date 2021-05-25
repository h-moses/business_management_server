package com.hary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 70982
 */
@RestController
public class MerchantController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}
