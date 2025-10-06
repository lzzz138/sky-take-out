package com.sky.mapper;

import com.sky.entity.AddressBook;
import com.sky.entity.AddressBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressBookMapper {
    long countByExample(AddressBookExample example);

    int deleteByExample(AddressBookExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AddressBook record);

    int insertSelective(AddressBook record);

    List<AddressBook> selectByExample(AddressBookExample example);

    AddressBook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AddressBook record, @Param("example") AddressBookExample example);

    int updateByExample(@Param("record") AddressBook record, @Param("example") AddressBookExample example);

    int updateByPrimaryKeySelective(AddressBook record);

    int updateByPrimaryKey(AddressBook record);
}