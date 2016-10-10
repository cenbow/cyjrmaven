package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbBanner;
import org.cyjr.model.TbBannerExample;

public interface TbBannerMapper {
    long countByExample(TbBannerExample example);

    int deleteByExample(TbBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBanner record);

    int insertSelective(TbBanner record);

    List<TbBanner> selectByExample(TbBannerExample example);

    TbBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    int updateByExample(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    int updateByPrimaryKeySelective(TbBanner record);

    int updateByPrimaryKey(TbBanner record);
}