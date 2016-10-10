package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAdminLog;
import org.cyjr.model.TbAdminLogExample;

public interface TbAdminLogMapper {
    long countByExample(TbAdminLogExample example);

    int deleteByExample(TbAdminLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAdminLog record);

    int insertSelective(TbAdminLog record);

    List<TbAdminLog> selectByExampleWithBLOBs(TbAdminLogExample example);

    List<TbAdminLog> selectByExample(TbAdminLogExample example);

    TbAdminLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAdminLog record, @Param("example") TbAdminLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAdminLog record, @Param("example") TbAdminLogExample example);

    int updateByExample(@Param("record") TbAdminLog record, @Param("example") TbAdminLogExample example);

    int updateByPrimaryKeySelective(TbAdminLog record);

    int updateByPrimaryKeyWithBLOBs(TbAdminLog record);

    int updateByPrimaryKey(TbAdminLog record);
}