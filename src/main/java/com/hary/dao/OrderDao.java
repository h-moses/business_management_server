package com.hary.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface OrderDao {

    Float getTodayAmount();

    Integer getNewCustomer();

    Integer getSevenDayOrder();
}
