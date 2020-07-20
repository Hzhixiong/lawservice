package com.lut.demo.web.controller;

import com.lut.demo.service.Impl.PwsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pws")
public class PwsController {

    @Autowired
    private PwsServiceImpl pwsService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(String account,String pwd)
    {
        return pwsService.login(account, pwd);
    }

    @RequestMapping(value = "/editpwd",method = RequestMethod.POST)
    public Object editpwd(int pwsid,String passwd){
        return pwsService.editpwd(pwsid,passwd);
    }

    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public Object deleteById(int id){
        return pwsService.deleteById(id);
    }

    @RequestMapping(value = "/Resigister",method = RequestMethod.POST)
    public Object Resigister(String account, String pw, String email, String sex){
        return pwsService.Resigister(account,pw,email,sex);
    }

    @RequestMapping(value = "/findusers",method = RequestMethod.POST)
    public Object findusers(){
        return pwsService.findusers();
    }

    @RequestMapping(value = "/findoffices",method = RequestMethod.POST)
    public Object findoffices(){
        return pwsService.findoffices();
    }
}
