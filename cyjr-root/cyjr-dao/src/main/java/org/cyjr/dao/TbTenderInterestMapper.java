package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbTenderInterest;
import org.cyjr.model.TbTenderInterestExample;

public interface TbTenderInterestMapper {
    long countByExample(TbTenderInterestExample example);

    int deleteByExample(TbTenderInterestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTenderInterest record);

    int insertSelective(TbTenderInterest record);

    List<TbTenderInterest> selectByExample(TbTenderInterestExample example);

    TbTenderInterest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTenderInterest record, @Param("example") TbTenderInterestExample example);

    int updateByExample(@Param("record") TbTenderInterest record, @Param("example") TbTenderInterestExample example);

    int updateByPrimaryKeySelective(TbTenderInterest record);

    int updateByPrimaryKey(TbTenderInterest record);
}