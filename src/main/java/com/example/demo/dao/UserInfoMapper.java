package com.example.demo.dao;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

    UserInfo selectById(@Param("id") Integer id);

    Integer insertByUserName(@Param("userName") String userName);

    Integer deleteByUserName(@Param("userName") String userName);
}
