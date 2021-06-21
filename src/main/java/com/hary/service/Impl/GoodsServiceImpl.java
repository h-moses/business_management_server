package com.hary.service.Impl;

import com.hary.dao.GoodsDao;
import com.hary.entity.Goods;
import com.hary.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 70982
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Integer getGoodsCount(Integer shopId) {
        return goodsDao.getGoodsCount(shopId);
    }

    @Override
    public Integer getWarningStore(Integer shopId) {
        return goodsDao.getWarningStore(shopId);
    }

    @Override
    public Integer getZeroStore(Integer shopId) {
        return goodsDao.getZeroStore(shopId);
    }

    @Override
    public Goods getStoreList(Integer shopId, Integer condition) {
        return goodsDao.getStoreList(shopId, condition);
    }

    @Override
    public void updateStore(Integer goodsId, String goodsName, Integer storeQuantity) {
        goodsDao.updateStore(goodsId, goodsName, storeQuantity);
    }
}
