package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAdminMenu;
import org.cyjr.model.TbAdminMenuExample;

public interface TbAdminMenuMapper {
    long countByExample(TbAdminMenuExample example);

    int deleteByExample(TbAdminMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdminMenu record);

    int insertSelective(TbAdminMenu record);

    List<TbAdminMenu> selectByExampleWithBLOBs(TbAdminMenuExample example);

    List<TbAdminMenu> selectByExample(TbAdminMenuExample example);

    TbAdminMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdminMenu record, @Param("example") TbAdminMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAdminMenu record, @Param("example") TbAdminMenuExample example);

    int updateByExample(@Param("record") TbAdminMenu record, @Param("example") TbAdminMenuExample example);

    int updateByPrimaryKeySelective(TbAdminMenu record);

    int updateByPrimaryKeyWithBLOBs(TbAdminMenu record);

    int updateByPrimaryKey(TbAdminMenu record);
}