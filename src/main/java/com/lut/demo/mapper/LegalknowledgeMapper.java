package com.lut.demo.mapper;

import com.lut.demo.bean.Legalknowledge;
import com.lut.demo.bean.LegalknowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LegalknowledgeMapper {
    long countByExample(LegalknowledgeExample example);

    int deleteByExample(LegalknowledgeExample example);

    int deleteByPrimaryKey(Integer lawid);

    int insert(Legalknowledge record);

    int insertSelective(Legalknowledge record);

    List<Legalknowledge> selectByExample(LegalknowledgeExample example);

    Legalknowledge selectByPrimaryKey(Integer lawid);

    int updateByExampleSelective(@Param("record") Legalknowledge record, @Param("example") LegalknowledgeExample example);

    int updateByExample(@Param("record") Legalknowledge record, @Param("example") LegalknowledgeExample example);

    int updateByPrimaryKeySelective(Legalknowledge record);

    int updateByPrimaryKey(Legalknowledge record);
}