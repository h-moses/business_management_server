package com.hary.service.Impl;

import com.hary.dao.MerchantDao;
import com.hary.entity.Merchant;
import com.hary.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 70982
 */

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantDao merchantDao;

    @Override
    public void registerMerchant(Merchant merchant) {
        merchantDao.addMerchant(merchant);
    }

    @Override
    public String validatePwd(String mcPhone) {
        return merchantDao.queryMcPwd(mcPhone);
    }

    @Override
    public String getPwd(Integer mcId) {
        return merchantDao.queryMcPwdById(mcId);
    }

    @Override
    public Merchant getInfo(String mcPhone) {
        return merchantDao.queryInfo(mcPhone);
    }

    @Override
    public void amendPwd(Integer mcId, String mcPwd) {
        merchantDao.updatePwd(mcId,mcPwd);
    }
}
