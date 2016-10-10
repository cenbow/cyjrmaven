package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbUserRecharge;
import org.cyjr.model.TbUserRechargeExample;

public interface TbUserRechargeMapper {
    long countByExample(TbUserRechargeExample example);

    int deleteByExample(TbUserRechargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRecharge record);

    int insertSelective(TbUserRecharge record);

    List<TbUserRecharge> selectByExampleWithBLOBs(TbUserRechargeExample example);

    List<TbUserRecharge> selectByExample(TbUserRechargeExample example);

    TbUserRecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserRecharge record, @Param("example") TbUserRechargeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbUserRecharge record, @Param("example") TbUserRechargeExample example);

    int updateByExample(@Param("record") TbUserRecharge record, @Param("example") TbUserRechargeExample example);

    int updateByPrimaryKeySelective(TbUserRecharge record);

    int updateByPrimaryKeyWithBLOBs(TbUserRecharge record);

    int updateByPrimaryKey(TbUserRecharge record);
}