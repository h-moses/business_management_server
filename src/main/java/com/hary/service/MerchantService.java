package com.hary.service;

import com.hary.entity.Merchant;

public interface MerchantService {

    void registerMerchant(Merchant merchant);

    String validatePwd(String mcPhone);

    Merchant getInfo(String mcPhone);
}
