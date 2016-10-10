package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbHongbaoBorrowSetting;
import org.cyjr.model.TbHongbaoBorrowSettingExample;

public interface TbHongbaoBorrowSettingMapper {
    long countByExample(TbHongbaoBorrowSettingExample example);

    int deleteByExample(TbHongbaoBorrowSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHongbaoBorrowSetting record);

    int insertSelective(TbHongbaoBorrowSetting record);

    List<TbHongbaoBorrowSetting> selectByExample(TbHongbaoBorrowSettingExample example);

    TbHongbaoBorrowSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHongbaoBorrowSetting record, @Param("example") TbHongbaoBorrowSettingExample example);

    int updateByExample(@Param("record") TbHongbaoBorrowSetting record, @Param("example") TbHongbaoBorrowSettingExample example);

    int updateByPrimaryKeySelective(TbHongbaoBorrowSetting record);

    int updateByPrimaryKey(TbHongbaoBorrowSetting record);
}