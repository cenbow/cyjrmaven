package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbBorrowTender;
import org.cyjr.model.TbBorrowTenderExample;

public interface TbBorrowTenderMapper {
    long countByExample(TbBorrowTenderExample example);

    int deleteByExample(TbBorrowTenderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBorrowTender record);

    int insertSelective(TbBorrowTender record);

    List<TbBorrowTender> selectByExample(TbBorrowTenderExample example);

    TbBorrowTender selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBorrowTender record, @Param("example") TbBorrowTenderExample example);

    int updateByExample(@Param("record") TbBorrowTender record, @Param("example") TbBorrowTenderExample example);

    int updateByPrimaryKeySelective(TbBorrowTender record);

    int updateByPrimaryKey(TbBorrowTender record);
}