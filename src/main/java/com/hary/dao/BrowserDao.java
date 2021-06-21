package com.hary.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface BrowserDao {

    Integer getTodayVisitor(@Param("shopId") Integer shopId);
}
