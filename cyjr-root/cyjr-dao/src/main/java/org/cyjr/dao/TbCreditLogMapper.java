package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbCreditLog;
import org.cyjr.model.TbCreditLogExample;

public interface TbCreditLogMapper {
    long countByExample(TbCreditLogExample example);

    int deleteByExample(TbCreditLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCreditLog record);

    int insertSelective(TbCreditLog record);

    List<TbCreditLog> selectByExample(TbCreditLogExample example);

    TbCreditLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCreditLog record, @Param("example") TbCreditLogExample example);

    int updateByExample(@Param("record") TbCreditLog record, @Param("example") TbCreditLogExample example);

    int updateByPrimaryKeySelective(TbCreditLog record);

    int updateByPrimaryKey(TbCreditLog record);
}