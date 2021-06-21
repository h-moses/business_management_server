package com.hary.service.Impl;

import com.hary.dao.GoodsDao;
import com.hary.entity.Goods;
import com.hary.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Goods> getStoreList(Integer shopId, Integer condition) {
        return goodsDao.getStoreList(shopId, condition);
    }

    @Override
    public void updateStore(Integer goodsId, String goodsName, Integer storeQuantity) {
        goodsDao.updateStore(goodsId, goodsName, storeQuantity);
    }

    @Override
    public List<Goods> getGoodsByName(Integer shopId, String goodsName) {
        return goodsDao.getGoodsByName(shopId, goodsName);
    }

    @Override
    public List<Goods> getGoodsByState(Integer shopId, Integer goodsState) {
        return goodsDao.getGoodsByState(shopId, goodsState);
    }

    @Override
    public void deleteGoods(Integer goodsId) {
        goodsDao.deleteGoods(goodsId);
    }

    @Override
    public void updateState(Integer goodsId, Integer goodsState) {
        goodsDao.updateState(goodsId, goodsState);
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);
    }
}
