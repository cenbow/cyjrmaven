package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAuthRule;
import org.cyjr.model.TbAuthRuleExample;

public interface TbAuthRuleMapper {
    long countByExample(TbAuthRuleExample example);

    int deleteByExample(TbAuthRuleExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    int insert(TbAuthRule record);

    int insertSelective(TbAuthRule record);

    List<TbAuthRule> selectByExampleWithBLOBs(TbAuthRuleExample example);

    List<TbAuthRule> selectByExample(TbAuthRuleExample example);

    TbAuthRule selectByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    int updateByExampleSelective(@Param("record") TbAuthRule record, @Param("example") TbAuthRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAuthRule record, @Param("example") TbAuthRuleExample example);

    int updateByExample(@Param("record") TbAuthRule record, @Param("example") TbAuthRuleExample example);

    int updateByPrimaryKeySelective(TbAuthRule record);

    int updateByPrimaryKeyWithBLOBs(TbAuthRule record);

    int updateByPrimaryKey(TbAuthRule record);
}