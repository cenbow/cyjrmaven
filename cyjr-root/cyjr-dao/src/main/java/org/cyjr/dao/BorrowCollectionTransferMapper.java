package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.BorrowCollectionTransfer;
import org.cyjr.model.BorrowCollectionTransferExample;

public interface BorrowCollectionTransferMapper {
    long countByExample(BorrowCollectionTransferExample example);

    int deleteByExample(BorrowCollectionTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowCollectionTransfer record);

    int insertSelective(BorrowCollectionTransfer record);

    List<BorrowCollectionTransfer> selectByExample(BorrowCollectionTransferExample example);

    BorrowCollectionTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowCollectionTransfer record, @Param("example") BorrowCollectionTransferExample example);

    int updateByExample(@Param("record") BorrowCollectionTransfer record, @Param("example") BorrowCollectionTransferExample example);

    int updateByPrimaryKeySelective(BorrowCollectionTransfer record);

    int updateByPrimaryKey(BorrowCollectionTransfer record);
}