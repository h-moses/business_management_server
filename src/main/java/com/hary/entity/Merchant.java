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

    private Integer mcId;
    private String mcName;
    private String mcPwd;
    private String mcPhone;
    private String mcRealName;
    private String mcAvatar;
    private String mcEmail;
    private String mcRegister;
    private Float mcBalance;


    public Merchant(String mcName, String mcPwd, String mcPhone, String mcRealName, String mcEmail, String mcRegister) {
        this.mcName = mcName;
        this.mcPwd = mcPwd;
        this.mcPhone = mcPhone;
        this.mcRealName = mcRealName;
        this.mcEmail = mcEmail;
        this.mcRegister = mcRegister;
    }
}
