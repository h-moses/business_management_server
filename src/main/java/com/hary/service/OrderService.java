package com.hary.service;

import com.hary.entity.Order;

import java.util.List;

/**
 * @author 70982
 */
public interface OrderService {

    Float getTodayAmount(Integer shopId);

    Integer getNewCustomer(Integer shopId);

    Integer getSevenDayOrder(Integer shopId);

    Integer getTodayOrderCount(Integer shopId);

    Integer getTodayOrderBox(Integer shopId);

    Integer getOrderGoodsCount(Integer shopId);

    Integer getAllCustomers(Integer shopId);

    Integer getTodayCustomers(Integer shopId);

    Integer getOldCustomers(Integer shopId);

    List<Order> getOrders(Integer shopId, Integer orderState);

}
