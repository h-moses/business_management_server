package com.hary.dao;

import com.hary.entity.OrderNote;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface OrderNoteDao {

    OrderNote getOrderNote(@Param("orderId") Integer orderId);
}
