package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author phubing
 * @Description:
 * @time 2019/4/18 11:55
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(Integer id){
        UserInfo userInfo = userInfoMapper.selectById(id);
        if(userInfo == null){
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }

    @Override
    public Integer insertByUserName(String userName){
        Integer state = userInfoMapper.insertByUserName(userName);
        if(state == null){
            throw new ServiceException("插入未成功");
        }
        return state;
    }

    @Override
    public Integer deleteByUserName(String userName){
        Integer state = userInfoMapper.deleteByUserName(userName);
        if(state == null){
            throw new ServiceException("删除失败");
        }
        return state;
    }
}
