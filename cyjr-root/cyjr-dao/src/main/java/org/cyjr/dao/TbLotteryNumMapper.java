package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbLotteryNum;
import org.cyjr.model.TbLotteryNumExample;

public interface TbLotteryNumMapper {
    long countByExample(TbLotteryNumExample example);

    int deleteByExample(TbLotteryNumExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(TbLotteryNum record);

    int insertSelective(TbLotteryNum record);

    List<TbLotteryNum> selectByExample(TbLotteryNumExample example);

    TbLotteryNum selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") TbLotteryNum record, @Param("example") TbLotteryNumExample example);

    int updateByExample(@Param("record") TbLotteryNum record, @Param("example") TbLotteryNumExample example);

    int updateByPrimaryKeySelective(TbLotteryNum record);

    int updateByPrimaryKey(TbLotteryNum record);
}