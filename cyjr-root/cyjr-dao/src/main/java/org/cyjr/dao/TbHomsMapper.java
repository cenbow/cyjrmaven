package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbHoms;
import org.cyjr.model.TbHomsExample;

public interface TbHomsMapper {
    long countByExample(TbHomsExample example);

    int deleteByExample(TbHomsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHoms record);

    int insertSelective(TbHoms record);

    List<TbHoms> selectByExample(TbHomsExample example);

    TbHoms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHoms record, @Param("example") TbHomsExample example);

    int updateByExample(@Param("record") TbHoms record, @Param("example") TbHomsExample example);

    int updateByPrimaryKeySelective(TbHoms record);

    int updateByPrimaryKey(TbHoms record);
}