package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbBorrowRepayment;
import org.cyjr.model.TbBorrowRepaymentExample;

public interface TbBorrowRepaymentMapper {
    long countByExample(TbBorrowRepaymentExample example);

    int deleteByExample(TbBorrowRepaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBorrowRepayment record);

    int insertSelective(TbBorrowRepayment record);

    List<TbBorrowRepayment> selectByExample(TbBorrowRepaymentExample example);

    TbBorrowRepayment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBorrowRepayment record, @Param("example") TbBorrowRepaymentExample example);

    int updateByExample(@Param("record") TbBorrowRepayment record, @Param("example") TbBorrowRepaymentExample example);

    int updateByPrimaryKeySelective(TbBorrowRepayment record);

    int updateByPrimaryKey(TbBorrowRepayment record);
}