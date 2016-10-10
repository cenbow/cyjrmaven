package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbMarket;
import org.cyjr.model.TbMarketExample;

public interface TbMarketMapper {
    long countByExample(TbMarketExample example);

    int deleteByExample(TbMarketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMarket record);

    int insertSelective(TbMarket record);

    List<TbMarket> selectByExample(TbMarketExample example);

    TbMarket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMarket record, @Param("example") TbMarketExample example);

    int updateByExample(@Param("record") TbMarket record, @Param("example") TbMarketExample example);

    int updateByPrimaryKeySelective(TbMarket record);

    int updateByPrimaryKey(TbMarket record);
}