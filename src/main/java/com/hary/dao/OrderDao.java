package com.hary.dao;

import com.hary.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 70982
 */
@Repository
public interface OrderDao {

    Float getTodayAmount(@Param("shopId") Integer shopId);

    Integer getNewCustomer(@Param("shopId") Integer shopId);

    Integer getSevenDayOrder(@Param("shopId") Integer shopId);

    Integer getTodayOrderCount(@Param("shopId") Integer shopId);

    Integer getTodayOrderBox(@Param("shopId") Integer shopId);

    Integer getOrderGoodsCount(@Param("shopId") Integer shopId);

    Integer getAllCustomers(@Param("shopId") Integer shopId);

    Integer getTodayCustomers(@Param("shopId") Integer shopId);

    Integer getOldCustomers(@Param("shopId") Integer shopId);

    List<Order> getOrder(@Param("shopId") Integer shopId, @Param("orderState") Integer orderState);
}
