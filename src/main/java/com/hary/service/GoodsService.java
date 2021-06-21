package com.hary.service;

import com.hary.entity.Goods;
import org.apache.ibatis.annotations.Param;

/**
 * @author 70982
 */
public interface GoodsService {

    Integer getGoodsCount(Integer shopId);

    Integer getWarningStore(Integer shopId);

    Integer getZeroStore(Integer shopId);

    Goods getStoreList(Integer shopId,Integer condition);

    void updateStore(Integer goodsId,String goodsName,Integer storeQuantity);
}
