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
    private String goodsAvatar;
    private String mainCategory;
    private String secondaryCategory;
    private Integer sellingWay;
    private Float unitPrice;
    private Float boxSize;
    private Float boxPrice;
    private String subordinatedRate;
    private String originPlace;
    private Integer goodsState;
    private Integer goodsSales;
    private Integer shopId;
    private Integer goodStuff;
    private Integer storeQuantity;

    public Goods(Integer goodsId, String goodsName, String goodsAvatar, String mainCategory, String secondaryCategory, Integer sellingWay, Float unitPrice, Float boxSize, Float boxPrice, String subordinatedRate, String originPlace, Integer shopId, Integer goodsState, Integer goodStuff) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsAvatar = goodsAvatar;
        this.mainCategory = mainCategory;
        this.secondaryCategory = secondaryCategory;
        this.sellingWay = sellingWay;
        this.unitPrice = unitPrice;
        this.boxSize = boxSize;
        this.boxPrice = boxPrice;
        this.subordinatedRate = subordinatedRate;
        this.originPlace = originPlace;
        this.goodsState = goodsState;
        this.shopId = shopId;
        this.goodStuff = goodStuff;
    }
}
