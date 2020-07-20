package com.lut.demo.service;

public interface IComplainService {
    Object insertcomplain(Integer userid,Integer applyid,String introduce,Integer lawyerid,String status);
    Object findByuserid(Integer userid);
    Object editcomplain(Integer complainid);
}
