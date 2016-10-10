package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbDebtTransfer;
import org.cyjr.model.TbDebtTransferExample;

public interface TbDebtTransferMapper {
    long countByExample(TbDebtTransferExample example);

    int deleteByExample(TbDebtTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDebtTransfer record);

    int insertSelective(TbDebtTransfer record);

    List<TbDebtTransfer> selectByExample(TbDebtTransferExample example);

    TbDebtTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDebtTransfer record, @Param("example") TbDebtTransferExample example);

    int updateByExample(@Param("record") TbDebtTransfer record, @Param("example") TbDebtTransferExample example);

    int updateByPrimaryKeySelective(TbDebtTransfer record);

    int updateByPrimaryKey(TbDebtTransfer record);
}