package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbBankCard;
import org.cyjr.model.TbBankCardExample;

public interface TbBankCardMapper {
    long countByExample(TbBankCardExample example);

    int deleteByExample(TbBankCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBankCard record);

    int insertSelective(TbBankCard record);

    List<TbBankCard> selectByExample(TbBankCardExample example);

    TbBankCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBankCard record, @Param("example") TbBankCardExample example);

    int updateByExample(@Param("record") TbBankCard record, @Param("example") TbBankCardExample example);

    int updateByPrimaryKeySelective(TbBankCard record);

    int updateByPrimaryKey(TbBankCard record);
}