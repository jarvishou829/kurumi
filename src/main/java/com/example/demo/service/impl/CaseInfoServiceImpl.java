package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.CaseInfoMapper;
import com.example.demo.model.CaseInfo;
import com.example.demo.service.CaseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CaseInfoServiceImpl implements CaseInfoService {

    @Resource
    private CaseInfoMapper caseInfoMapper;

    @Override
    public CaseInfo selectByCid(String cid){
        CaseInfo caseInfo = caseInfoMapper.selectByCid(cid);
        if (caseInfo == null){
            throw new ServiceException("暂无该案件");
        }
        return caseInfo;
    }
}
