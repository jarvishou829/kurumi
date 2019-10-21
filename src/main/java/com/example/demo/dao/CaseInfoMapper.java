package com.example.demo.dao;

import com.example.demo.model.CaseInfo;
import org.apache.ibatis.annotations.Param;

public interface CaseInfoMapper {

    CaseInfo selectByCid(@Param("cid") String cid);
}
