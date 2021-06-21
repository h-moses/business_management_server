package com.hary.service;

import com.hary.entity.Merchant;

public interface MerchantService {

    void registerMerchant(Merchant merchant);

    String validatePwd(String mcPhone);

    String getPwd(Integer mcId);

    Merchant getInfo(String mcPhone);

    void amendPwd(Integer mcId,String mcPwd);
}
