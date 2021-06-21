package com.hary.service.Impl;

import com.hary.dao.OrderDao;
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
    public Float getTodayAmount() {
        return orderDao.getTodayAmount();
    }

    @Override
    public Integer getNewCustomer() {
        return orderDao.getNewCustomer();
    }

    @Override
    public Integer getSevenDayOrder() {
        return orderDao.getSevenDayOrder();
    }
}
