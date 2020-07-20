package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.*;
import com.lut.demo.mapper.*;
import com.lut.demo.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfficeServiceImpl implements IOfficeService {
    @Autowired
    private OfficeMapper officeMapper;

    @Autowired
    private LawyerMapper lawyerMapper;

    @Autowired
    private ComplainMapper complainMapper;
    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private PwsMapper pwsMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Object findAll() {
        JSONObject jsonObject=new JSONObject();
        OfficeExample officeExample=new OfficeExample();
        List<Office> offices=officeMapper.selectByExample(officeExample);
        jsonObject.put("officedata",offices);
        System.out.println(offices);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findlawyer(Integer officeid) {
        JSONObject jsonObject = new JSONObject();
        LawyerExample lawyerExample=new LawyerExample();
        lawyerExample.createCriteria().andOfficeidEqualTo(officeid);
        List<Lawyer>lists=lawyerMapper.selectByExample(lawyerExample);
        jsonObject.put("lawyerdata",lists);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findBypwsid(Integer pwsid) {
        JSONObject jsonObject = new JSONObject();
        OfficeExample officeExample = new OfficeExample();
        officeExample.createCriteria().andPwsidEqualTo(pwsid);
        try{
            Office office=officeMapper.selectByExample(officeExample).get(0);
            jsonObject.put("officedata",office);
            jsonObject.put("err_code",0);
            System.out.println(office);
        }catch (IndexOutOfBoundsException e){
            jsonObject.put("err_code",404);
        }
        return jsonObject;
    }

    @Override
    public Object findComplain(Integer officeid) {
        JSONObject jsonObject = new JSONObject();
        List<Complain>complains=new ArrayList<>();
        LawyerExample lawyerExample = new LawyerExample();
        lawyerExample.createCriteria().andOfficeidEqualTo(officeid);
        List<Lawyer>lawyers=lawyerMapper.selectByExample(lawyerExample);
        for(Lawyer lawyer :lawyers){
            ApplyExample applyExample = new ApplyExample();
            applyExample.createCriteria().andLawyeridEqualTo(lawyer.getLawyerid());
            List<Apply>applies=applyMapper.selectByExample(applyExample);
            for(Apply apply:applies){
                try{
                    ComplainExample complainExample = new ComplainExample();
                    complainExample.createCriteria().andApplyidEqualTo(apply.getApplyid());
                    Complain complain=complainMapper.selectByExample(complainExample).get(0);
                    complains.add(complain);
                }catch (IndexOutOfBoundsException e){
                    jsonObject.put("err_code",402);
                }

            }
        }
        jsonObject.put("complaindata",complains);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object Registeroffice(String account, String pw, String introduce, String adress, String phone,String email) {
        JSONObject jsonObject = new JSONObject();
        Pws pws=new Pws();
        pws.setAccount(account);
        pws.setPw(pw);
        pws.setAuthority(2);
        pwsMapper.insert(pws);
        PwsExample pwsExample = new PwsExample();
        pwsExample.createCriteria().andAccountEqualTo(account);
        Pws pws1=pwsMapper.selectByExample(pwsExample).get(0);
        Office office = new Office();
        office.setAdress(adress);
        office.setIntroduce(introduce);
        office.setOfficename(account);
        office.setPhone(phone);
        office.setPwsid(pws1.getPwsid());
        officeMapper.insert(office);
        User user=new User();
        user.setUsername(account);
        user.setPwsid(pws1.getPwsid());
        user.setEmail(email);
        user.setProblem("1+1");
        user.setAnswer("2");
        userMapper.insert(user);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object deleteByofficeid(Integer officeid) {
        JSONObject jsonObject = new JSONObject();
        Office office=officeMapper.selectByPrimaryKey(officeid);
        pwsMapper.deleteByPrimaryKey(office.getPwsid());
        officeMapper.deleteByPrimaryKey(officeid);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPwsidEqualTo(office.getPwsid());
        User user=userMapper.selectByExample(userExample).get(0);
        userMapper.deleteByPrimaryKey(user.getUserid());
        jsonObject.put("err_code",0);
        return jsonObject;
    }


}
