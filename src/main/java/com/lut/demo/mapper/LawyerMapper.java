package com.lut.demo.mapper;

import com.lut.demo.bean.Lawyer;
import com.lut.demo.bean.LawyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawyerMapper {
    long countByExample(LawyerExample example);

    int deleteByExample(LawyerExample example);

    int deleteByPrimaryKey(Integer lawyerid);

    int insert(Lawyer record);

    int insertSelective(Lawyer record);

    List<Lawyer> selectByExample(LawyerExample example);

    Lawyer selectByPrimaryKey(Integer lawyerid);

    int updateByExampleSelective(@Param("record") Lawyer record, @Param("example") LawyerExample example);

    int updateByExample(@Param("record") Lawyer record, @Param("example") LawyerExample example);

    int updateByPrimaryKeySelective(Lawyer record);

    int updateByPrimaryKey(Lawyer record);
}