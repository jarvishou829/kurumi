package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.PoliceInfoMapper;
import com.example.demo.model.PoliceInfo;
import com.example.demo.service.PoliceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PoliceInfoServiceImpl implements PoliceInfoService {

    @Resource
    private PoliceInfoMapper policeInfoMapper;

    @Override
    public PoliceInfo selectByPid(Integer pid){
        PoliceInfo policeInfo = policeInfoMapper.selectByPid(pid);
        if(policeInfo == null){
            throw new ServiceException("暂无该警员");
        }
        return policeInfo;
    }
}
