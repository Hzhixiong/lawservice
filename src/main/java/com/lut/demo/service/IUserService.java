package com.lut.demo.service;

public interface IUserService {
    Object findBypwsid(int id);
    Object editproblem(int id,String problem,String answer);

    Object findLawyer(Integer pwsid);
    Object findOffice(Integer pwsid);
    Object findAll();
    Object findByWord(String word);

}
