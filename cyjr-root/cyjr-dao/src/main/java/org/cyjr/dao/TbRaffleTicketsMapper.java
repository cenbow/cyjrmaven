package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbRaffleTickets;
import org.cyjr.model.TbRaffleTicketsExample;

public interface TbRaffleTicketsMapper {
    long countByExample(TbRaffleTicketsExample example);

    int deleteByExample(TbRaffleTicketsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRaffleTickets record);

    int insertSelective(TbRaffleTickets record);

    List<TbRaffleTickets> selectByExample(TbRaffleTicketsExample example);

    TbRaffleTickets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRaffleTickets record, @Param("example") TbRaffleTicketsExample example);

    int updateByExample(@Param("record") TbRaffleTickets record, @Param("example") TbRaffleTicketsExample example);

    int updateByPrimaryKeySelective(TbRaffleTickets record);

    int updateByPrimaryKey(TbRaffleTickets record);
}