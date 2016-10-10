package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbUserWithdraw;
import org.cyjr.model.TbUserWithdrawExample;

public interface TbUserWithdrawMapper {
    long countByExample(TbUserWithdrawExample example);

    int deleteByExample(TbUserWithdrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserWithdraw record);

    int insertSelective(TbUserWithdraw record);

    List<TbUserWithdraw> selectByExample(TbUserWithdrawExample example);

    TbUserWithdraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserWithdraw record, @Param("example") TbUserWithdrawExample example);

    int updateByExample(@Param("record") TbUserWithdraw record, @Param("example") TbUserWithdrawExample example);

    int updateByPrimaryKeySelective(TbUserWithdraw record);

    int updateByPrimaryKey(TbUserWithdraw record);
}