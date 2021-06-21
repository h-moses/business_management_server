package com.hary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 70982
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    private String shopName;
    private String majorBusiness;
    private String legalPerson;
    private Date registerTime;
}
