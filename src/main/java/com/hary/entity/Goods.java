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
public class Goods {

    private Integer goodsId;
    private String goodsName;
    private Integer sellingWay;
    private Float unitPrice;
    private Float boxSize;
    private Float boxPrice;
    private String subordinatedRate;
    private String orginPlace;
    private Integer goodsState;
    private Integer goodsSales;
    private Integer shopId;
    private Integer goodStuff;
    private Integer storeQuantity;
}
