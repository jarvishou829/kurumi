package com.example.demo.dao;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author phubing
 * @Description:
 * @time 2019/4/18 11:55
 */
public interface UserInfoMapper {

    UserInfo selectById(@Param("id") Integer id);
}
