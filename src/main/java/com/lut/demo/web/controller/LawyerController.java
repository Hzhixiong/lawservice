package com.lut.demo.web.controller;

import com.lut.demo.service.ILawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Lawyer")
public class LawyerController {

    @Autowired
    private ILawyerService iLawyerService;


    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Object findAll(){
        return iLawyerService.findAll();
    }

    @RequestMapping(value = "/addOffice",method = RequestMethod.POST)
    public Object addOffice(Integer lawyerid,Integer officeid){
        return iLawyerService.addOffice(lawyerid,officeid);
    }

    @RequestMapping(value = "/deleteOffice",method = RequestMethod.POST)
    public Object deleteOffice(Integer lawyerid){
        return iLawyerService.deleteOffice(lawyerid);
    }

}
