package com.lut.demo.web.controller;

import com.lut.demo.service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/Apply")
public class ApplyController {

    @Autowired
    private IApplyService iApplyService;

    @RequestMapping(value = "/insertapply",method = RequestMethod.POST)
    public Object insertapply(Integer userid, String introduce,Integer lawyerid){
        Date submitdate=new Date();
        return iApplyService.insertapply(userid,introduce,submitdate,lawyerid);
    }

    @RequestMapping(value = "/findByuserid",method = RequestMethod.POST)
    public Object findByuserid(Integer userid){
        return iApplyService.findByuserid(userid);
    }

    @RequestMapping(value = "/findApply",method = RequestMethod.POST)
    public Object findApply(Integer lawyerid){
        return iApplyService.findApply(lawyerid);
    }
    @RequestMapping(value = "/editapplystatus",method = RequestMethod.POST)
    public Object editapplystatus(Integer applyid){
        return iApplyService.editapplystatus(applyid);
    }

}
