package com.hary.dao;

import com.hary.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface OrderDao {

    Float getTodayAmount(@Param("shopId") Integer shopId);

    Integer getNewCustomer(@Param("shopId") Integer shopId);

    Integer getSevenDayOrder(@Param("shopId") Integer shopId);

    Order getOrder(@Param("shopId") Integer shopId,@Param("orderState") Integer orderState);
}
