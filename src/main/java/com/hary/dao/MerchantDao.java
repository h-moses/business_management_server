package com.hary.dao;

import com.hary.entity.Merchant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 70982
 */
@Repository
public interface MerchantDao {

    void addMerchant(@Param("merchant") Merchant merchant);

    Integer queryMcPhone(@Param("mcPhone") String mcPhone);

    String queryMcPwd(@Param("mcPhone") String mcPhone);

    String queryMcPwdById(@Param("mcId") Integer mcId);

    Merchant queryInfo(@Param("mcPhone") String mcPhone);

    void updatePwd(@Param("mcId") Integer mcId, @Param("mcPwd") String mcPwd);
}
