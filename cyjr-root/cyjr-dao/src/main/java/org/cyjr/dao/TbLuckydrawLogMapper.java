package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbLuckydrawLog;
import org.cyjr.model.TbLuckydrawLogExample;

public interface TbLuckydrawLogMapper {
    long countByExample(TbLuckydrawLogExample example);

    int deleteByExample(TbLuckydrawLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLuckydrawLog record);

    int insertSelective(TbLuckydrawLog record);

    List<TbLuckydrawLog> selectByExample(TbLuckydrawLogExample example);

    TbLuckydrawLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLuckydrawLog record, @Param("example") TbLuckydrawLogExample example);

    int updateByExample(@Param("record") TbLuckydrawLog record, @Param("example") TbLuckydrawLogExample example);

    int updateByPrimaryKeySelective(TbLuckydrawLog record);

    int updateByPrimaryKey(TbLuckydrawLog record);
}