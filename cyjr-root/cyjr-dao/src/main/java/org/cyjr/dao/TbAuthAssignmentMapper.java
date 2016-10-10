package org.cyjr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cyjr.model.TbAuthAssignment;
import org.cyjr.model.TbAuthAssignmentExample;

public interface TbAuthAssignmentMapper {
    long countByExample(TbAuthAssignmentExample example);

    int deleteByExample(TbAuthAssignmentExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("itemName") String itemName, @Param("userId") String userId);

    int insert(TbAuthAssignment record);

    int insertSelective(TbAuthAssignment record);

    List<TbAuthAssignment> selectByExample(TbAuthAssignmentExample example);

    TbAuthAssignment selectByPrimaryKey(@Param("id") Integer id, @Param("itemName") String itemName, @Param("userId") String userId);

    int updateByExampleSelective(@Param("record") TbAuthAssignment record, @Param("example") TbAuthAssignmentExample example);

    int updateByExample(@Param("record") TbAuthAssignment record, @Param("example") TbAuthAssignmentExample example);

    int updateByPrimaryKeySelective(TbAuthAssignment record);

    int updateByPrimaryKey(TbAuthAssignment record);
}