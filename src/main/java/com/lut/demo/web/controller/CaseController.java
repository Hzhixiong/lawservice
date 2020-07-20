package com.lut.demo.web.controller;

import com.lut.demo.service.ICaseService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Case")
public class CaseController {

    @Autowired
    private ICaseService iCaseService;


    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Object findAll(){
        return iCaseService.findAll();
    }

    @RequestMapping(value = "/findcasebylawyerid",method = RequestMethod.POST)
    public Object findcasebylawyerid(Integer lawyerid){
        return iCaseService.findcasebylawyerid(lawyerid);
    }

    @RequestMapping(value = "/addcase",method = RequestMethod.POST)
    public Object addcase(String title,String introduce,String result,String analyzes,Integer lawyerid){
        return iCaseService.addcase(title,introduce,result,analyzes,lawyerid);
    }

    @RequestMapping(value = "/deleteByid",method = RequestMethod.POST)
    public Object deleteByid(Integer caseid){
        return iCaseService.deleteByid(caseid);
    }

    @RequestMapping(value = "/findBycaseid",method = RequestMethod.POST)
    public Object findBycaseid(Integer caseid){
        return iCaseService.findBycaseid(caseid);
    }
}
