package com.lut.demo.web.controller;

import com.lut.demo.service.IUserService;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private IUserService iUserService;


    @RequestMapping(value = "/findBypwsid",method = RequestMethod.POST)
    public Object findBypwsid(Integer pwsid){
        System.out.println(pwsid);
        return iUserService.findBypwsid(pwsid);
    }

    @RequestMapping(value = "/editproblem",method = RequestMethod.POST)
    public Object editproble(int id,String problem,String answer){
        return iUserService.editproblem(id,problem,answer);
    }

    @RequestMapping(value = "/findlawyer",method = RequestMethod.POST)
    public Object findLawyer(Integer pwsid){
        return iUserService.findLawyer(pwsid);
    }

    @RequestMapping(value = "/findOffice",method = RequestMethod.POST)
    public Object findOffice(Integer pwsid){
        return iUserService.findOffice(pwsid);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Object findAll(){
        return iUserService.findAll();
    }

    @RequestMapping(value = "/findByWord",method = RequestMethod.POST)
    public Object findByWord(String word){
        return iUserService.findByWord(word);
    }
}
