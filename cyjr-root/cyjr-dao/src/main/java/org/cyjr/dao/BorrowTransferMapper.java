package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.BorrowTransfer;
import org.cyjr.model.BorrowTransferExample;

public interface BorrowTransferMapper {
    long countByExample(BorrowTransferExample example);

    int deleteByExample(BorrowTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowTransfer record);

    int insertSelective(BorrowTransfer record);

    List<BorrowTransfer> selectByExample(BorrowTransferExample example);

    BorrowTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowTransfer record, @Param("example") BorrowTransferExample example);

    int updateByExample(@Param("record") BorrowTransfer record, @Param("example") BorrowTransferExample example);

    int updateByPrimaryKeySelective(BorrowTransfer record);

    int updateByPrimaryKey(BorrowTransfer record);
}