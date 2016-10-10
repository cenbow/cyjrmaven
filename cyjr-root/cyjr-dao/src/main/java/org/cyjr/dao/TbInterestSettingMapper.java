package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbInterestSetting;
import org.cyjr.model.TbInterestSettingExample;

public interface TbInterestSettingMapper {
    long countByExample(TbInterestSettingExample example);

    int deleteByExample(TbInterestSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInterestSetting record);

    int insertSelective(TbInterestSetting record);

    List<TbInterestSetting> selectByExample(TbInterestSettingExample example);

    TbInterestSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInterestSetting record, @Param("example") TbInterestSettingExample example);

    int updateByExample(@Param("record") TbInterestSetting record, @Param("example") TbInterestSettingExample example);

    int updateByPrimaryKeySelective(TbInterestSetting record);

    int updateByPrimaryKey(TbInterestSetting record);
}