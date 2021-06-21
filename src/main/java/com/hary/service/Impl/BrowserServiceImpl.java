package com.hary.service.Impl;

import com.hary.dao.BrowserDao;
import com.hary.service.BrowserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 70982
 */
@Service
public class BrowserServiceImpl implements BrowserService {

    @Autowired
    private BrowserDao browserDao;

    @Override
    public Integer getTodayVisitor(Integer shopId) {
        return browserDao.getTodayVisitor(shopId);
    }
}
