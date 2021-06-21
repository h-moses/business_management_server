package com.hary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 70982
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer orderId;
    private Integer shopId;
    private Integer csId;
    private String orderTime;
    private float orderAmount;
    private Integer orderState;
    private OrderNote notes;
}
