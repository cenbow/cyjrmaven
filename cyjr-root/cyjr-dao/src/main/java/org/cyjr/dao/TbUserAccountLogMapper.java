package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbUserAccountLog;
import org.cyjr.model.TbUserAccountLogExample;

public interface TbUserAccountLogMapper {
    long countByExample(TbUserAccountLogExample example);

    int deleteByExample(TbUserAccountLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserAccountLog record);

    int insertSelective(TbUserAccountLog record);

    List<TbUserAccountLog> selectByExample(TbUserAccountLogExample example);

    TbUserAccountLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserAccountLog record, @Param("example") TbUserAccountLogExample example);

    int updateByExample(@Param("record") TbUserAccountLog record, @Param("example") TbUserAccountLogExample example);

    int updateByPrimaryKeySelective(TbUserAccountLog record);

    int updateByPrimaryKey(TbUserAccountLog record);
}