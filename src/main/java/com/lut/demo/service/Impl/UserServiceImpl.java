package com.lut.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.lut.demo.bean.*;
import com.lut.demo.mapper.LawyerMapper;
import com.lut.demo.mapper.OfficeMapper;
import com.lut.demo.mapper.UserMapper;
import com.lut.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LawyerMapper lawyerMapper;
    @Autowired
    private OfficeMapper officeMapper;

    @Override
    public Object findBypwsid(int id) {
        JSONObject jsonObject=new JSONObject();
        UserExample userExample=new UserExample();
        userExample.createCriteria().andPwsidEqualTo(id);
        try{
            User user=userMapper.selectByExample(userExample).get(0);
            if (user==null){
                jsonObject.put("err_code",403);
                System.out.println("403");
            } else{
                jsonObject.put("userdata",user);
                System.out.println(user);
                jsonObject.put("err_code",0);
            }
        }catch (IndexOutOfBoundsException e){
            jsonObject.put("err_code",402);
            System.out.println("402");
        } catch (Exception e){
        jsonObject.put("err_code",400);
            System.out.println("400");
    }
        return jsonObject;

    }

    @Override
    public Object editproblem(int id,String problem, String answer) {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseridEqualTo(id);
        try{
            User user=userMapper.selectByExample(userExample).get(0);
            if (user==null){
                jsonObject.put("err_code",403);
                System.out.println("403");
            } else{
                user.setAnswer(answer);
                user.setProblem(problem);
                userMapper.updateByPrimaryKey(user);
                jsonObject.put("userdata",user);
                System.out.println(user);
                jsonObject.put("err_code",0);
            }
        }catch (IndexOutOfBoundsException e){
            jsonObject.put("err_code",402);
            System.out.println("402");
        } catch (Exception e){
            jsonObject.put("err_code",400);
            System.out.println("400");
        }
        return jsonObject;
    }

    @Override
    public Object findLawyer(Integer pwsid) {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample=new UserExample();
        userExample.createCriteria().andPwsidEqualTo(pwsid);
        try{
            User user=userMapper.selectByExample(userExample).get(0);
            if (user==null){
                jsonObject.put("err_code",403);
                System.out.println("403");
            } else{
                jsonObject.put("userdata",user);
                System.out.println(user);

            }
            LawyerExample lawyerExample=new LawyerExample();
            lawyerExample.createCriteria().andPwsidEqualTo(pwsid);
            Lawyer lawyer=lawyerMapper.selectByExample(lawyerExample).get(0);
            jsonObject.put("lawyerdata",lawyer);
            System.out.println(lawyer);
            jsonObject.put("err_code",0);

        }catch (IndexOutOfBoundsException e){
            jsonObject.put("err_code",402);
            System.out.println("402");
        } catch (Exception e){
            jsonObject.put("err_code",400);
            System.out.println("400");
        }
        return jsonObject;
    }

    @Override
    public Object findOffice(Integer pwsid) {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPwsidEqualTo(pwsid);
        User user=userMapper.selectByExample(userExample).get(0);
        jsonObject.put("userdata",user);
        OfficeExample officeExample = new OfficeExample();
        officeExample.createCriteria().andPwsidEqualTo(pwsid);
        Office office=officeMapper.selectByExample(officeExample).get(0);
        jsonObject.put("officedata",office);
        System.out.println(office);
        System.out.println("这里是UserServiceImpl的注释2");
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findAll() {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        List<User>users=userMapper.selectByExample(userExample);
        jsonObject.put("usersdata",users);
        jsonObject.put("err_code",0);
        return jsonObject;
    }

    @Override
    public Object findByWord(String word) {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameLike("%"+word+"%");
        List<User>users=userMapper.selectByExample(userExample);
        jsonObject.put("usersdata",users);
        jsonObject.put("err_code",0);
        System.out.println(users);
        System.out.println(word);
        return jsonObject;
    }


}
