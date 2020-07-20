package com.lut.demo.web.controller;


import com.lut.demo.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Office")
public class OfficeController {

    @Autowired
    private IOfficeService iOfficeService;



    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Object findAll(){
        return iOfficeService.findAll();
    }

    @RequestMapping(value = "findlawyer",method = RequestMethod.POST)
    public Object findlawyer(Integer officeid){
        return iOfficeService.findlawyer(officeid);
    }

    @RequestMapping(value = "/findBypwsid",method = RequestMethod.POST)
    public Object findBypwsid(Integer pwsid){
        return iOfficeService.findBypwsid(pwsid);
    }

    @RequestMapping(value = "/findComplain",method = RequestMethod.POST)
    public Object findComplain(Integer officeid){
        return iOfficeService.findComplain(officeid);
    }

    @RequestMapping(value = "/Registeroffice",method = RequestMethod.POST)
    public Object Registeroffice(String account, String pw, String introduce, String adress, String phone,String email){
        return iOfficeService.Registeroffice(account,pw,introduce,adress,phone,email);
    }
    @RequestMapping(value = "/deleteByofficeid",method = RequestMethod.POST)
    public Object deleteByofficeid(Integer officeid){
        return iOfficeService.deleteByofficeid(officeid);
    }
}
