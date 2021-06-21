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
public class Browser {
    private Integer bsId;
    private Integer csId;
    private Integer shopId;
    private String bsTime;
}
