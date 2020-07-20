package com.lut.demo.service;


import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

public interface IOfficeService {
    Object findAll();
    Object findlawyer(Integer officeid);
    Object findBypwsid(Integer pwsid);
    Object findComplain(Integer officeid);
    Object Registeroffice(String account,String pw,String introduce,String adress,String phone,String email);
    Object deleteByofficeid(Integer officeid);
}
