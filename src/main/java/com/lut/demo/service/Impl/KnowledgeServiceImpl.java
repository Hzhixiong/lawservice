package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.Legalknowledge;
import com.lut.demo.bean.LegalknowledgeExample;
import com.lut.demo.mapper.LegalknowledgeMapper;
import com.lut.demo.service.IKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KnowledgeServiceImpl implements IKnowledgeService {

    @Autowired
    private LegalknowledgeMapper legalknowledgeMapper;


    @Override
    public Object findAll() {
        JSONObject jsonObject = new JSONObject();
        LegalknowledgeExample legalknowledgeExample = new LegalknowledgeExample();
        List<Legalknowledge>lists=legalknowledgeMapper.selectByExample(legalknowledgeExample);
        jsonObject.put("knowdata",lists);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findknowbylawyerid(Integer lawyerid) {
        JSONObject jsonObject = new JSONObject();
        LegalknowledgeExample legalknowledgeExample = new LegalknowledgeExample();
        legalknowledgeExample.createCriteria().andLawyeridEqualTo(lawyerid);
        List<Legalknowledge>legalknowledges=legalknowledgeMapper.selectByExample(legalknowledgeExample);
        jsonObject.put("knowdata",legalknowledges);
        System.out.println(legalknowledges);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object addknow(String title, String content, String pictureurl, Integer lawyerid) {
        JSONObject jsonObject = new JSONObject();
        Legalknowledge legalknowledge=new Legalknowledge();
        legalknowledge.setTitle(title);
        legalknowledge.setContent(content);
        legalknowledge.setPictureurl(pictureurl);
        legalknowledge.setLawyerid(lawyerid);
        Date date = new Date();
        legalknowledge.setSubmitdate(date);
        legalknowledge.setClicks(1);
        legalknowledgeMapper.insert(legalknowledge);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object deleteknow(Integer lawid) {
        JSONObject jsonObject = new JSONObject();
        legalknowledgeMapper.deleteByPrimaryKey(lawid);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findBylawid(Integer lawid) {
        JSONObject jsonObject = new JSONObject();
        Legalknowledge legalknowledge=legalknowledgeMapper.selectByPrimaryKey(lawid);
        legalknowledge.setClicks(legalknowledge.getClicks()+1);
        legalknowledgeMapper.updateByPrimaryKey(legalknowledge);
        jsonObject.put("knowdata",legalknowledge);
        jsonObject.put("err_code",0);
        System.out.println(legalknowledge);
        return jsonObject;
    }
}
