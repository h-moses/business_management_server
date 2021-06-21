package com.hary.dao;

import com.hary.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface ShopDao {

    public void addShop(@Param("shop") Shop shop);

    public Shop queryInfo(@Param("mcId") Integer mcId);
}
