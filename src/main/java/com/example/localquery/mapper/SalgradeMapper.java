package com.example.localquery.mapper;

import com.example.localquery.model.Salgrade;
import com.example.localquery.model.SalgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalgradeMapper {
    long countByExample(SalgradeExample example);

    int deleteByExample(SalgradeExample example);

    int insert(Salgrade record);

    int insertSelective(Salgrade record);

    List<Salgrade> selectByExample(SalgradeExample example);

    int updateByExampleSelective(@Param("record") Salgrade record, @Param("example") SalgradeExample example);

    int updateByExample(@Param("record") Salgrade record, @Param("example") SalgradeExample example);
}