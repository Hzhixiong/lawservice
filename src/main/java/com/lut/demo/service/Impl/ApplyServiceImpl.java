package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.Apply;
import com.lut.demo.bean.ApplyExample;
import com.lut.demo.bean.Lawyer;
import com.lut.demo.bean.LawyerExample;
import com.lut.demo.mapper.ApplyMapper;
import com.lut.demo.service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ApplyServiceImpl implements IApplyService {
    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public Object insertapply(int userid, String introduce, Date submitdate, int lawyerid) {
        JSONObject jsonObject = new JSONObject();
        Apply apply=new Apply();
        apply.setIntroduce(introduce);
        apply.setSubmitdate(submitdate);
        apply.setLawyerid(lawyerid);
        apply.setUserid(userid);
        apply.setStatsus("未受理");
        applyMapper.insert(apply);
        System.out.println(apply);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findByuserid(int userid) {
        JSONObject jsonObject = new JSONObject();
        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andUseridEqualTo(userid);

            List<Apply> lists=applyMapper.selectByExample(applyExample);

                jsonObject.put("applydata",lists);
                System.out.println(lists);
                jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findApply(Integer lawyerid) {
        JSONObject jsonObject = new JSONObject();
        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andLawyeridEqualTo(lawyerid);
        List<Apply>applies=applyMapper.selectByExample(applyExample);
        jsonObject.put("applydata",applies);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object editapplystatus(Integer applyid) {
        JSONObject jsonObject = new JSONObject();
        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andApplyidEqualTo(applyid);
        Apply apply=applyMapper.selectByExample(applyExample).get(0);
        apply.setStatsus("受理中");
        applyMapper.updateByPrimaryKey(apply);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

}
