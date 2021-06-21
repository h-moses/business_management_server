package com.hary.dao;

import com.hary.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author 70982
 */
@Repository
public interface ShopDao {

    public void addShop(@Param("shopName") String shopName, @Param("mcId") Integer mcId, @Param("majorBusiness") String majorBusiness, @Param("registerTime") Date registerTime, @Param("legalPerson") String legalPerson);

    public Shop queryInfo(@Param("mcId") Integer mcId);
}
