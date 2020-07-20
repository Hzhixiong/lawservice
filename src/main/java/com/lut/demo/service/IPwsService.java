package com.lut.demo.service;

public interface IPwsService {
    Object login(String account,String pwd);
    Object editpwd(int pwsid,String passwd);
    Object deleteById(int pwsid);
    Object Resigister(String account,String pw,String email,String sex);
    Object findusers();
    Object findoffices();
}
