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
public class Shop {

    private Integer shopId;
    private Integer mcId;
    private String shopName;
    private String majorBusiness;
    private String legalPerson;
    private String registerTime;

    public Shop(Integer mcId, String shopName, String majorBusiness, String legalPerson, String registerTime) {
        this.mcId = mcId;
        this.shopName = shopName;
        this.majorBusiness = majorBusiness;
        this.legalPerson = legalPerson;
        this.registerTime = registerTime;
    }
}
