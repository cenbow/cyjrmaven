package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbCity;
import org.cyjr.model.TbCityExample;

public interface TbCityMapper {
    long countByExample(TbCityExample example);

    int deleteByExample(TbCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCity record);

    int insertSelective(TbCity record);

    List<TbCity> selectByExample(TbCityExample example);

    TbCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCity record, @Param("example") TbCityExample example);

    int updateByExample(@Param("record") TbCity record, @Param("example") TbCityExample example);

    int updateByPrimaryKeySelective(TbCity record);

    int updateByPrimaryKey(TbCity record);
}