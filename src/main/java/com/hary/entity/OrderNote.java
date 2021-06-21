package com.hary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 70982
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderNote {

    private Integer noteId;
    private Integer orderId;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsQuantity;
    private Float unitPrice;
    private Float goodsAmount;
}
