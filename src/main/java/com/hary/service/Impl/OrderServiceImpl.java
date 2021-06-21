package com.hary.service.Impl;

import com.hary.dao.OrderDao;
import com.hary.entity.Order;
import com.hary.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 70982
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Float getTodayAmount(Integer shopId) {
        return orderDao.getTodayAmount(shopId);
    }

    @Override
    public Integer getNewCustomer(Integer shopId) {
        return orderDao.getNewCustomer(shopId);
    }

    @Override
    public Integer getSevenDayOrder(Integer shopId) {
        return orderDao.getSevenDayOrder(shopId);
    }

    @Override
    public Integer getTodayOrderCount(Integer shopId) {
        return orderDao.getTodayOrderCount(shopId);
    }

    @Override
    public Integer getTodayOrderBox(Integer shopId) {
        return orderDao.getTodayOrderBox(shopId);
    }

    @Override
    public Integer getOrderGoodsCount(Integer shopId) {
        return orderDao.getOrderGoodsCount(shopId);
    }

    @Override
    public Integer getAllCustomers(Integer shopId) {
        return orderDao.getAllCustomers(shopId);
    }

    @Override
    public Integer getTodayCustomers(Integer shopId) {
        return orderDao.getTodayCustomers(shopId);
    }

    @Override
    public Integer getOldCustomers(Integer shopId) {
        return orderDao.getOldCustomers(shopId);
    }

    @Override
    public Order getOrders(Integer shopId, Integer orderState) {
        return orderDao.getOrder(shopId, orderState);
    }
}
