package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAdminMenuAuthitem;
import org.cyjr.model.TbAdminMenuAuthitemExample;

public interface TbAdminMenuAuthitemMapper {
    long countByExample(TbAdminMenuAuthitemExample example);

    int deleteByExample(TbAdminMenuAuthitemExample example);

    int insert(TbAdminMenuAuthitem record);

    int insertSelective(TbAdminMenuAuthitem record);

    List<TbAdminMenuAuthitem> selectByExample(TbAdminMenuAuthitemExample example);

    int updateByExampleSelective(@Param("record") TbAdminMenuAuthitem record, @Param("example") TbAdminMenuAuthitemExample example);

    int updateByExample(@Param("record") TbAdminMenuAuthitem record, @Param("example") TbAdminMenuAuthitemExample example);
}