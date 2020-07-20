package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.Lawyer;
import com.lut.demo.bean.LawyerExample;
import com.lut.demo.mapper.LawyerMapper;
import com.lut.demo.service.ILawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawyerServiceImpl implements ILawyerService {

    @Autowired
    private LawyerMapper lawyerMapper;

    @Override
    public Object findAll() {
        JSONObject jsonObject=new JSONObject();
        LawyerExample lawyerExample=new LawyerExample();
        List<Lawyer> lists=lawyerMapper.selectByExample(lawyerExample);
        jsonObject.put("lawyerdata",lists);
        System.out.println(lists);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object addOffice(Integer lawyerid, Integer officeid) {
        JSONObject jsonObject = new JSONObject();
        Lawyer lawyer=lawyerMapper.selectByPrimaryKey(lawyerid);
        lawyer.setOfficeid(officeid);
        lawyerMapper.updateByPrimaryKey(lawyer);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object deleteOffice(Integer lawyerid) {
        JSONObject jsonObject = new JSONObject();
        Lawyer lawyer=lawyerMapper.selectByPrimaryKey(lawyerid);
        lawyer.setOfficeid(-1);
        lawyerMapper.updateByPrimaryKey(lawyer);
        jsonObject.put("err_code",0);
        return jsonObject;
    }
}
