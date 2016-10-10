package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbInterestBorrowSetting;
import org.cyjr.model.TbInterestBorrowSettingExample;

public interface TbInterestBorrowSettingMapper {
    long countByExample(TbInterestBorrowSettingExample example);

    int deleteByExample(TbInterestBorrowSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInterestBorrowSetting record);

    int insertSelective(TbInterestBorrowSetting record);

    List<TbInterestBorrowSetting> selectByExample(TbInterestBorrowSettingExample example);

    TbInterestBorrowSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInterestBorrowSetting record, @Param("example") TbInterestBorrowSettingExample example);

    int updateByExample(@Param("record") TbInterestBorrowSetting record, @Param("example") TbInterestBorrowSettingExample example);

    int updateByPrimaryKeySelective(TbInterestBorrowSetting record);

    int updateByPrimaryKey(TbInterestBorrowSetting record);
}