package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.*;
import com.lut.demo.mapper.OfficeMapper;
import com.lut.demo.mapper.PwsMapper;
import com.lut.demo.mapper.UserMapper;
import com.lut.demo.service.IPwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PwsServiceImpl implements IPwsService {

    @Autowired
    private PwsMapper pwsMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OfficeMapper officeMapper;

    @Override
    public Object login(String account, String pwd) {
        JSONObject jsonObject=new JSONObject();
        try {
            PwsExample pwsExample=new PwsExample();
            pwsExample.createCriteria().andAccountEqualTo(account);
            try{
                Pws pws=pwsMapper.selectByExample(pwsExample).get(0);
                if (pws==null){
                    jsonObject.put("err_code",402);
                }
                if (pws.getPw().equals(pwd)){
                    jsonObject.put("err_code",0);
                    jsonObject.put("pwsdata",pws);
                }else{
                    jsonObject.put("err_code",403);
                }
            }catch (IndexOutOfBoundsException e){
                jsonObject.put("err_code",402);
            }
        }catch (Exception e){
            jsonObject.put("err_code",400);
        }
        return jsonObject;
    }

    @Override
    public Object editpwd(int pwsid, String passwd) {
        JSONObject jsonObject = new JSONObject();
        try {
            PwsExample pwsExample=new PwsExample();
            pwsExample.createCriteria().andPwsidEqualTo(pwsid);
            try{
                Pws pws=pwsMapper.selectByExample(pwsExample).get(0);
                if (pws==null){
                    jsonObject.put("err_code",402);
                }else{
                    pws.setPw(passwd);
                    pwsMapper.updateByPrimaryKey(pws);
                    jsonObject.put("err_code",0);
                    jsonObject.put("pwsdata",pws);
                }

            }catch (IndexOutOfBoundsException e){
                jsonObject.put("err_code",402);
            }
        }catch (Exception e){
            jsonObject.put("err_code",400);
        }
        return jsonObject;

    }

    @Override
    public Object deleteById(int pwsid) {
        JSONObject jsonObject = new JSONObject();
        pwsMapper.deleteByPrimaryKey(pwsid);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPwsidEqualTo(pwsid);
        userMapper.deleteByExample(userExample);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object Resigister(String account, String pw, String email, String sex) {
        JSONObject jsonObject = new JSONObject();
        Pws pws=new Pws();
        pws.setPw(pw);
        pws.setAccount(account);
        pws.setAuthority(1);
        pwsMapper.insert(pws);
        PwsExample pwsExample = new PwsExample();
        pwsExample.createCriteria().andAccountEqualTo(account);
        Pws pws1=pwsMapper.selectByExample(pwsExample).get(0);
        User user=new User();
        user.setEmail(email);
        user.setPwsid(pws1.getPwsid());
        user.setSex(sex);
        user.setUsername(account);
        userMapper.insert(user);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findusers() {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        List<User>users=userMapper.selectByExample(userExample);
        jsonObject.put("usersdata",users);
        jsonObject.put("err_code",0);
        System.out.println(users);
        return jsonObject;

    }

    @Override
    public Object findoffices() {
        JSONObject jsonObject = new JSONObject();
        OfficeExample officeExample = new OfficeExample();
        List<Office> offices=officeMapper.selectByExample(officeExample);
        jsonObject.put("officesdata",offices);
        jsonObject.put("err_code",0);
        return jsonObject;
    }
}
