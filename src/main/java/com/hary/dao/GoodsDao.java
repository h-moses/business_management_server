package com.hary.dao;

import com.hary.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */

@Repository
public interface GoodsDao {

    Integer getGoodsCount(@Param("shopId") Integer shopId);

    Integer getWarningStore(@Param("shopId") Integer shopId);

    Integer getZeroStore(@Param("shopId") Integer shopId);

    Goods getStoreList(@Param("shopId") Integer shopId,@Param("condition") Integer condition);

    void updateStore(@Param("goodsId") Integer goodsId,@Param("goodsName") String goodsName,@Param("storeQuantity") Integer storeQuantity);
}
