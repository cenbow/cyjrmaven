package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAuthItemChild;
import org.cyjr.model.TbAuthItemChildExample;

public interface TbAuthItemChildMapper {
    long countByExample(TbAuthItemChildExample example);

    int deleteByExample(TbAuthItemChildExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAuthItemChild record);

    int insertSelective(TbAuthItemChild record);

    List<TbAuthItemChild> selectByExample(TbAuthItemChildExample example);

    TbAuthItemChild selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAuthItemChild record, @Param("example") TbAuthItemChildExample example);

    int updateByExample(@Param("record") TbAuthItemChild record, @Param("example") TbAuthItemChildExample example);

    int updateByPrimaryKeySelective(TbAuthItemChild record);

    int updateByPrimaryKey(TbAuthItemChild record);
}