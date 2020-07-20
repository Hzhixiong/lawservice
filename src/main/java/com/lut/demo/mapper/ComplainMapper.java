package com.lut.demo.mapper;

import com.lut.demo.bean.Complain;
import com.lut.demo.bean.ComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainMapper {
    long countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(Integer complainid);

    int insert(Complain record);

    int insertSelective(Complain record);

    List<Complain> selectByExample(ComplainExample example);

    Complain selectByPrimaryKey(Integer complainid);

    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKey(Complain record);
}