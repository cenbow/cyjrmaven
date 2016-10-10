package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbMenu;
import org.cyjr.model.TbMenuExample;

public interface TbMenuMapper {
    long countByExample(TbMenuExample example);

    int deleteByExample(TbMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMenu record);

    int insertSelective(TbMenu record);

    List<TbMenu> selectByExampleWithBLOBs(TbMenuExample example);

    List<TbMenu> selectByExample(TbMenuExample example);

    TbMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByExample(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByPrimaryKeySelective(TbMenu record);

    int updateByPrimaryKeyWithBLOBs(TbMenu record);

    int updateByPrimaryKey(TbMenu record);
}