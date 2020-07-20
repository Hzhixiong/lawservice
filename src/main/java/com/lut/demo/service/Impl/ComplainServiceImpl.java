package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.Complain;
import com.lut.demo.bean.ComplainExample;
import com.lut.demo.mapper.ComplainMapper;

import com.lut.demo.service.IComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ComplainServiceImpl implements IComplainService {

    @Autowired
    private ComplainMapper complainMapper;


    @Override
    public Object insertcomplain(Integer userid, Integer applyid, String introduce, Integer lawyerid, String status) {
        JSONObject jsonObject = new JSONObject();
        Complain complain = new Complain();
        complain.setApplyid(applyid);
        complain.setUserid(userid);
        complain.setIntroduce(introduce);
        complain.setStatsus("未受理");
        Date date = new Date();
        complain.setSubmitdate(date);
        complainMapper.insert(complain);
        jsonObject.put("err_code",0);
        jsonObject.put("complaindata",complain);
                                                    System.out.println(complain);
        return jsonObject;
    }

    @Override
    public Object findByuserid(Integer userid) {
        JSONObject jsonObject = new JSONObject();
        ComplainExample complainExample = new ComplainExample();
        complainExample.createCriteria().andUseridEqualTo(userid);
        List<Complain>lists=complainMapper.selectByExample(complainExample);
        jsonObject.put("complaindata",lists);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object editcomplain(Integer complainid) {
        JSONObject jsonObject = new JSONObject();
        Complain complain=complainMapper.selectByPrimaryKey(complainid);
        complain.setStatsus("已受理");
        complainMapper.updateByPrimaryKey(complain);
        jsonObject.put("err_code",0);
        return jsonObject;
    }
}
