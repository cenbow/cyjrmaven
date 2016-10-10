package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbLoanOrder;
import org.cyjr.model.TbLoanOrderExample;

public interface TbLoanOrderMapper {
    long countByExample(TbLoanOrderExample example);

    int deleteByExample(TbLoanOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLoanOrder record);

    int insertSelective(TbLoanOrder record);

    List<TbLoanOrder> selectByExample(TbLoanOrderExample example);

    TbLoanOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLoanOrder record, @Param("example") TbLoanOrderExample example);

    int updateByExample(@Param("record") TbLoanOrder record, @Param("example") TbLoanOrderExample example);

    int updateByPrimaryKeySelective(TbLoanOrder record);

    int updateByPrimaryKey(TbLoanOrder record);
}