package com.lut.demo.web.controller;

import com.lut.demo.service.IComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Complain")
public class ComplainController {

    @Autowired
    private IComplainService iComplainService;

    @RequestMapping(value = "/insertcomplain",method = RequestMethod.POST)
    public Object insertcomplain(Integer userid,Integer applyid,String introduce,Integer lawyerid,String status){
        return iComplainService.insertcomplain( userid, applyid, introduce, lawyerid, status);
    }

    @RequestMapping(value = "/findByuserid",method = RequestMethod.POST)
    public Object findByuserid(Integer userid){
        return iComplainService.findByuserid(userid);
    }
    @RequestMapping(value = "/editcomplain",method = RequestMethod.POST)
    public Object editcomplain(Integer complainid){
        return iComplainService.editcomplain(complainid);
    }

}
