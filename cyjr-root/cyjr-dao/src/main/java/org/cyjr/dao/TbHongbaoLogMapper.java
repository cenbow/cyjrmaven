package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbHongbaoLog;
import org.cyjr.model.TbHongbaoLogExample;

public interface TbHongbaoLogMapper {
    long countByExample(TbHongbaoLogExample example);

    int deleteByExample(TbHongbaoLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHongbaoLog record);

    int insertSelective(TbHongbaoLog record);

    List<TbHongbaoLog> selectByExample(TbHongbaoLogExample example);

    TbHongbaoLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHongbaoLog record, @Param("example") TbHongbaoLogExample example);

    int updateByExample(@Param("record") TbHongbaoLog record, @Param("example") TbHongbaoLogExample example);

    int updateByPrimaryKeySelective(TbHongbaoLog record);

    int updateByPrimaryKey(TbHongbaoLog record);
}