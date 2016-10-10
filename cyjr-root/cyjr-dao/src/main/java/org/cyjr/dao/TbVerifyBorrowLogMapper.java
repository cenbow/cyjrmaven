package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbVerifyBorrowLog;
import org.cyjr.model.TbVerifyBorrowLogExample;

public interface TbVerifyBorrowLogMapper {
    long countByExample(TbVerifyBorrowLogExample example);

    int deleteByExample(TbVerifyBorrowLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbVerifyBorrowLog record);

    int insertSelective(TbVerifyBorrowLog record);

    List<TbVerifyBorrowLog> selectByExample(TbVerifyBorrowLogExample example);

    TbVerifyBorrowLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbVerifyBorrowLog record, @Param("example") TbVerifyBorrowLogExample example);

    int updateByExample(@Param("record") TbVerifyBorrowLog record, @Param("example") TbVerifyBorrowLogExample example);

    int updateByPrimaryKeySelective(TbVerifyBorrowLog record);

    int updateByPrimaryKey(TbVerifyBorrowLog record);
}