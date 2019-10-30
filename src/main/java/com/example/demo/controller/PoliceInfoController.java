package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.PoliceInfo;
import com.example.demo.service.PoliceInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
@RestController
@RequestMapping("policeInfo")
public class PoliceInfoController {

    @Resource
    private PoliceInfoService policeInfoService;

    @PostMapping("/hi")
    public String hi() { return "hi xuyang"; }

    @PostMapping("/selectByPid")
    public RetResult<PoliceInfo> selectByPid(Integer pid){
        PoliceInfo policeInfo = policeInfoService.selectByPid(pid);
        return RetResponse.makeOKRsp(policeInfo);
    }
}
