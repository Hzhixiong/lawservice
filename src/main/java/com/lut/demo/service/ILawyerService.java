package com.lut.demo.service;

public interface ILawyerService {
    Object findAll();
    Object addOffice(Integer lawyerid,Integer officeid);
    Object deleteOffice(Integer lawyerid);
}
