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
public class Merchant {

    private String businessId;
    private String businessName;
    private String businessMobile;
    private String registerTime;
}
