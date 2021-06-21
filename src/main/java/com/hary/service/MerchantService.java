package com.hary.service;

import com.hary.entity.Merchant;

/**
 * @author 70982
 */
public interface MerchantService {

    void registerMerchant(Merchant merchant);

    String validatePwd(String mcPhone);

    String getPwd(Integer mcId);

    Merchant getInfo(String mcPhone);

    void amendPwd(Integer mcId, String mcPwd);
}
