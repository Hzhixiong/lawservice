package com.lut.demo.web.controller;

import com.lut.demo.service.IKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Know")
public class LegalknowledgeController {
    @Autowired
    private IKnowledgeService iKnowledgeService;


    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Object findAll(){
        return iKnowledgeService.findAll();
    }

    @RequestMapping(value = "/findknowbylawyerid",method = RequestMethod.POST)
    public Object findknowbylawyerid(Integer lawyerid){
        return iKnowledgeService.findknowbylawyerid(lawyerid);
    }
    @RequestMapping(value = "/addknow",method = RequestMethod.POST)
    public Object addknow(String title, String content, String pictureurl, Integer lawyerid){
        return iKnowledgeService.addknow(title,content,pictureurl,lawyerid);
    }
    @RequestMapping(value = "/deleteknow",method = RequestMethod.POST)
    public Object deleteknow(Integer lawid){
        return iKnowledgeService.deleteknow(lawid);
    }
    @RequestMapping(value = "/findBylawid",method = RequestMethod.POST)
    public Object findBylawid(Integer lawid){
        return iKnowledgeService.findBylawid(lawid);
    }
}
