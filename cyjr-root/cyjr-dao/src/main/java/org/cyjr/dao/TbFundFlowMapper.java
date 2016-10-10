package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbFundFlow;
import org.cyjr.model.TbFundFlowExample;

public interface TbFundFlowMapper {
    long countByExample(TbFundFlowExample example);

    int deleteByExample(TbFundFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFundFlow record);

    int insertSelective(TbFundFlow record);

    List<TbFundFlow> selectByExampleWithBLOBs(TbFundFlowExample example);

    List<TbFundFlow> selectByExample(TbFundFlowExample example);

    TbFundFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFundFlow record, @Param("example") TbFundFlowExample example);

    int updateByExampleWithBLOBs(@Param("record") TbFundFlow record, @Param("example") TbFundFlowExample example);

    int updateByExample(@Param("record") TbFundFlow record, @Param("example") TbFundFlowExample example);

    int updateByPrimaryKeySelective(TbFundFlow record);

    int updateByPrimaryKeyWithBLOBs(TbFundFlow record);

    int updateByPrimaryKey(TbFundFlow record);
}