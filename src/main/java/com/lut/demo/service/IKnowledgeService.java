package com.lut.demo.service;

public interface IKnowledgeService {
    Object findAll();
    Object findknowbylawyerid(Integer lawyerid);
    Object addknow(String title,String content,String pictureurl,Integer lawyerid);
    Object deleteknow(Integer lawid);
    Object findBylawid(Integer lawid);
}
