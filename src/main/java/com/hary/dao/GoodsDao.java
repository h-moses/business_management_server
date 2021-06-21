package com.hary.dao;

import com.hary.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 70982
 */

@Repository
public interface GoodsDao {

    Integer getGoodsCount(@Param("shopId") Integer shopId);

    Integer getWarningStore(@Param("shopId") Integer shopId);

    Integer getZeroStore(@Param("shopId") Integer shopId);

    List<Goods> getStoreList(@Param("shopId") Integer shopId, @Param("condition") Integer condition);

    void updateStore(@Param("goodsId") Integer goodsId,@Param("goodsName") String goodsName,@Param("storeQuantity") Integer storeQuantity);

    List<Goods> getGoodsByName(@Param("shopId") Integer shopId,@Param("goodsName") String goodsName);

    List<Goods> getGoodsByState(@Param("shopId") Integer shopId,@Param("goodsState") Integer goodsState);

    void deleteGoods(@Param("goodsId") Integer goodsId);

    void updateState(@Param("goodsId") Integer goodsId,@Param("goodsState") Integer goodsState);

    void addGoods(@Param("goods") Goods goods);

    void updateGoods(@Param("goods") Goods goods);

    Integer getCountOnSale(@Param("shopId") Integer shopId);

}
