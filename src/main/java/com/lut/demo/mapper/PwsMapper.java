package com.lut.demo.mapper;

import com.lut.demo.bean.Pws;
import com.lut.demo.bean.PwsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PwsMapper {
    long countByExample(PwsExample example);

    int deleteByExample(PwsExample example);

    int deleteByPrimaryKey(Integer pwsid);

    int insert(Pws record);

    int insertSelective(Pws record);

    List<Pws> selectByExample(PwsExample example);

    Pws selectByPrimaryKey(Integer pwsid);

    int updateByExampleSelective(@Param("record") Pws record, @Param("example") PwsExample example);

    int updateByExample(@Param("record") Pws record, @Param("example") PwsExample example);

    int updateByPrimaryKeySelective(Pws record);

    int updateByPrimaryKey(Pws record);
}