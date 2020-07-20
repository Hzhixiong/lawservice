package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.Judicialcase;
import com.lut.demo.bean.JudicialcaseExample;
import com.lut.demo.mapper.JudicialcaseMapper;
import com.lut.demo.service.ICaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CaseServiceImpl implements ICaseService {
    @Autowired
    private JudicialcaseMapper judicialcaseMapper;

    @Override
    public Object findAll() {
        JSONObject jsonObject = new JSONObject();
        JudicialcaseExample judicialcaseExample = new JudicialcaseExample();
        List<Judicialcase>lists=judicialcaseMapper.selectByExample(judicialcaseExample);
        jsonObject.put("casedata",lists);
        jsonObject.put("err_code",0);
        //System.out.println(lists);
        return jsonObject;
    }

    @Override
    public Object findcasebylawyerid(Integer lawyerid) {
        JSONObject jsonObject = new JSONObject();
        JudicialcaseExample judicialcaseExample = new JudicialcaseExample();
        judicialcaseExample.createCriteria().andLawyeridEqualTo(lawyerid);
        List<Judicialcase> judicialcases=judicialcaseMapper.selectByExample(judicialcaseExample);
        jsonObject.put("casedata",judicialcases);
        //System.out.println(judicialcases);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object addcase(String title, String introduce, String result, String analyzes, Integer lawyerid) {
        JSONObject jsonObject = new JSONObject();
        Judicialcase judicialcase=new Judicialcase();
        judicialcase.setTitle(title);
        judicialcase.setAnalyzes(analyzes);
        judicialcase.setResult(result);
        judicialcase.setIntroduce(introduce);
        judicialcase.setLawyerid(lawyerid);
        Date date = new Date();
        judicialcase.setSubmitdate(date);
        judicialcase.setClicks(1);
        judicialcaseMapper.insert(judicialcase);
        jsonObject.put("err_code",0);
        //System.out.println(judicialcase);
        //System.out.println("----------");
        return jsonObject;
    }

    @Override
    public Object deleteByid(Integer caseid) {
        JSONObject jsonObject = new JSONObject();
        judicialcaseMapper.deleteByPrimaryKey(caseid);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findBycaseid(Integer caseid) {
        JSONObject jsonObject = new JSONObject();
        Judicialcase judicialcase=judicialcaseMapper.selectByPrimaryKey(caseid);
        judicialcase.setClicks(judicialcase.getClicks()+1);
        judicialcaseMapper.updateByPrimaryKey(judicialcase);
        System.out.println(judicialcase.getClicks());
        System.out.println(judicialcase);
        jsonObject.put("casedata",judicialcase);
        jsonObject.put("err_code",0);
        return jsonObject;
    }
}
