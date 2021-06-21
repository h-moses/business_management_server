package com.hary.dao;

import com.hary.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface ShopDao {

    void addShop(@Param("shop") Shop shop);

    Shop queryInfo(@Param("mcId") Integer mcId);
}
