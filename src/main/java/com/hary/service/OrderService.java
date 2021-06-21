package com.hary.service;

import com.hary.entity.Order;

/**
 * @author 70982
 */
public interface OrderService {

    Float getTodayAmount(Integer shopId);

    Integer getNewCustomer(Integer shopId);

    Integer getSevenDayOrder(Integer shopId);

    Order getOrders(Integer shopId, Integer orderState);
}
