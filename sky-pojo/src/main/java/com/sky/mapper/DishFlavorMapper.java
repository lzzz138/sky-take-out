package com.sky.mapper;

import com.sky.entity.DishFlavor;
import com.sky.entity.DishFlavorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishFlavorMapper {
    long countByExample(DishFlavorExample example);

    int deleteByExample(DishFlavorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DishFlavor record);

    int insertSelective(DishFlavor record);

    List<DishFlavor> selectByExample(DishFlavorExample example);

    DishFlavor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DishFlavor record, @Param("example") DishFlavorExample example);

    int updateByExample(@Param("record") DishFlavor record, @Param("example") DishFlavorExample example);

    int updateByPrimaryKeySelective(DishFlavor record);

    int updateByPrimaryKey(DishFlavor record);
}