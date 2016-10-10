package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAdvice;
import org.cyjr.model.TbAdviceExample;

public interface TbAdviceMapper {
    long countByExample(TbAdviceExample example);

    int deleteByExample(TbAdviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdvice record);

    int insertSelective(TbAdvice record);

    List<TbAdvice> selectByExample(TbAdviceExample example);

    TbAdvice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdvice record, @Param("example") TbAdviceExample example);

    int updateByExample(@Param("record") TbAdvice record, @Param("example") TbAdviceExample example);

    int updateByPrimaryKeySelective(TbAdvice record);

    int updateByPrimaryKey(TbAdvice record);
}