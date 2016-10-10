package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbUserAccount;
import org.cyjr.model.TbUserAccountExample;

public interface TbUserAccountMapper {
    long countByExample(TbUserAccountExample example);

    int deleteByExample(TbUserAccountExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userId") Integer userId);

    int insert(TbUserAccount record);

    int insertSelective(TbUserAccount record);

    List<TbUserAccount> selectByExample(TbUserAccountExample example);

    TbUserAccount selectByPrimaryKey(@Param("id") Integer id, @Param("userId") Integer userId);

    int updateByExampleSelective(@Param("record") TbUserAccount record, @Param("example") TbUserAccountExample example);

    int updateByExample(@Param("record") TbUserAccount record, @Param("example") TbUserAccountExample example);

    int updateByPrimaryKeySelective(TbUserAccount record);

    int updateByPrimaryKey(TbUserAccount record);
}