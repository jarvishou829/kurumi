package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.CaseInfo;
import com.example.demo.service.CaseInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
@RestController
@RequestMapping("caseInfo")
public class CaseInfoController {

    @Resource
    private CaseInfoService caseInfoService;

    @PostMapping("/ohime")
    public String ohime() { return "O hi me sa ma"; }

    @PostMapping("/selectByCid")
    public RetResult<CaseInfo> selectByCid(String cid){
        CaseInfo caseInfo = caseInfoService.selectByCid(cid);
        return RetResponse.makeOKRsp(caseInfo);
    }
}
