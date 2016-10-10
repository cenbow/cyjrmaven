package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbFlowOrder;
import org.cyjr.model.TbFlowOrderExample;

public interface TbFlowOrderMapper {
    long countByExample(TbFlowOrderExample example);

    int deleteByExample(TbFlowOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFlowOrder record);

    int insertSelective(TbFlowOrder record);

    List<TbFlowOrder> selectByExample(TbFlowOrderExample example);

    TbFlowOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFlowOrder record, @Param("example") TbFlowOrderExample example);

    int updateByExample(@Param("record") TbFlowOrder record, @Param("example") TbFlowOrderExample example);

    int updateByPrimaryKeySelective(TbFlowOrder record);

    int updateByPrimaryKey(TbFlowOrder record);
}