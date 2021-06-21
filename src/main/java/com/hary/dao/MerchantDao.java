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

    String queryMcPwd(@Param("mcPhone") String mcPhone);

    Merchant queryInfo(@Param("mcPhone") String mcPhone);
}
