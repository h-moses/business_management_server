package com.hary.service.Impl;

import com.hary.dao.ShopDao;
import com.hary.entity.Shop;
import com.hary.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 70982
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;


    @Override
    public void addShop(Shop shop) {
        shopDao.addShop(shop);
    }

    @Override
    public Shop getInfo(Integer mcId) {
        return shopDao.queryInfo(mcId);
    }
}
