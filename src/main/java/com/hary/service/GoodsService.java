package com.hary.service;

import com.hary.entity.Goods;

import java.util.List;

/**
 * @author 70982
 */
public interface GoodsService {

    Integer getGoodsCount(Integer shopId);

    Integer getWarningStore(Integer shopId);

    Integer getZeroStore(Integer shopId);

    List<Goods> getStoreList(Integer shopId, Integer condition);

    void updateStore(Integer goodsId, String goodsName, Integer storeQuantity);

    List<Goods> getGoodsByName(Integer shopId, String goodsName);

    List<Goods> getGoodsByState(Integer shopId, Integer goodsState);

    void deleteGoods(Integer goodsId);

    void updateState(Integer goodsId, Integer goodsState);

    void addGoods(Goods goods);

    void updateGoods(Goods goods);

    Integer getCountOnSale(Integer shopId);

    Goods getGoodsDetail(Integer goodsId);
}
