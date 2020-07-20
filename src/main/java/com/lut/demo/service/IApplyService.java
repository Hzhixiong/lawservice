package com.lut.demo.service;

import java.util.Date;

public interface IApplyService {
    Object insertapply(int userid, String introduce, Date submitdate,int lawyerid);
    Object findByuserid(int userid);
    Object findApply(Integer lawyerid);
    Object editapplystatus(Integer applyid);
}
