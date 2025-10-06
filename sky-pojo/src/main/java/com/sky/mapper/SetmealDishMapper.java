package com.sky.mapper;

import com.sky.entity.SetmealDish;
import com.sky.entity.SetmealDishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetmealDishMapper {
    long countByExample(SetmealDishExample example);

    int deleteByExample(SetmealDishExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SetmealDish record);

    int insertSelective(SetmealDish record);

    List<SetmealDish> selectByExample(SetmealDishExample example);

    SetmealDish selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SetmealDish record, @Param("example") SetmealDishExample example);

    int updateByExample(@Param("record") SetmealDish record, @Param("example") SetmealDishExample example);

    int updateByPrimaryKeySelective(SetmealDish record);

    int updateByPrimaryKey(SetmealDish record);
}