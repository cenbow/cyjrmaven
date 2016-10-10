package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbArticle;
import org.cyjr.model.TbArticleExample;

public interface TbArticleMapper {
    long countByExample(TbArticleExample example);

    int deleteByExample(TbArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbArticle record);

    int insertSelective(TbArticle record);

    List<TbArticle> selectByExampleWithBLOBs(TbArticleExample example);

    List<TbArticle> selectByExample(TbArticleExample example);

    TbArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByExample(@Param("record") TbArticle record, @Param("example") TbArticleExample example);

    int updateByPrimaryKeySelective(TbArticle record);

    int updateByPrimaryKeyWithBLOBs(TbArticle record);

    int updateByPrimaryKey(TbArticle record);
}