package com.lut.demo.mapper;

import com.lut.demo.bean.Judicialcase;
import com.lut.demo.bean.JudicialcaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JudicialcaseMapper {
    long countByExample(JudicialcaseExample example);

    int deleteByExample(JudicialcaseExample example);

    int deleteByPrimaryKey(Integer caseid);

    int insert(Judicialcase record);

    int insertSelective(Judicialcase record);

    List<Judicialcase> selectByExample(JudicialcaseExample example);

    Judicialcase selectByPrimaryKey(Integer caseid);

    int updateByExampleSelective(@Param("record") Judicialcase record, @Param("example") JudicialcaseExample example);

    int updateByExample(@Param("record") Judicialcase record, @Param("example") JudicialcaseExample example);

    int updateByPrimaryKeySelective(Judicialcase record);

    int updateByPrimaryKey(Judicialcase record);
}