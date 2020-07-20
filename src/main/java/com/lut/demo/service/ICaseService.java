package com.lut.demo.service;

public interface ICaseService {
    Object findAll();
    Object findcasebylawyerid(Integer lawyerid);
    Object addcase(String title,String introduce,String result,String analyzes,Integer lawyerid);
    Object deleteByid(Integer caseid);
    Object findBycaseid(Integer caseid);
}
