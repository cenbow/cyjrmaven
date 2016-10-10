package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbInterest;
import org.cyjr.model.TbInterestExample;

public interface TbInterestMapper {
    long countByExample(TbInterestExample example);

    int deleteByExample(TbInterestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbInterest record);

    int insertSelective(TbInterest record);

    List<TbInterest> selectByExample(TbInterestExample example);

    TbInterest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbInterest record, @Param("example") TbInterestExample example);

    int updateByExample(@Param("record") TbInterest record, @Param("example") TbInterestExample example);

    int updateByPrimaryKeySelective(TbInterest record);

    int updateByPrimaryKey(TbInterest record);
}