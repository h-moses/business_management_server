package com.hary.service;

import com.hary.entity.Shop;

/**
 * @author 70982
 */
public interface ShopService {

    void addShop(Shop shop);

    Shop getInfo(Integer mcId);
}
