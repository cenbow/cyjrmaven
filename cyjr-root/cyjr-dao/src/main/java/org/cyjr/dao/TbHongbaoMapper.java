package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbHongbao;
import org.cyjr.model.TbHongbaoExample;

public interface TbHongbaoMapper {
    long countByExample(TbHongbaoExample example);

    int deleteByExample(TbHongbaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHongbao record);

    int insertSelective(TbHongbao record);

    List<TbHongbao> selectByExample(TbHongbaoExample example);

    TbHongbao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHongbao record, @Param("example") TbHongbaoExample example);

    int updateByExample(@Param("record") TbHongbao record, @Param("example") TbHongbaoExample example);

    int updateByPrimaryKeySelective(TbHongbao record);

    int updateByPrimaryKey(TbHongbao record);
}