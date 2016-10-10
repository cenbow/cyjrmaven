package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbSite;
import org.cyjr.model.TbSiteExample;

public interface TbSiteMapper {
    long countByExample(TbSiteExample example);

    int deleteByExample(TbSiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSite record);

    int insertSelective(TbSite record);

    List<TbSite> selectByExample(TbSiteExample example);

    TbSite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSite record, @Param("example") TbSiteExample example);

    int updateByExample(@Param("record") TbSite record, @Param("example") TbSiteExample example);

    int updateByPrimaryKeySelective(TbSite record);

    int updateByPrimaryKey(TbSite record);
}