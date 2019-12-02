package com.zhj.dao;

import com.zhj.entity.TxTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TxTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TxTest record);

    TxTest selectByPrimaryKey(Integer id);

    List<TxTest> selectAll();

    int updateByPrimaryKey(TxTest record);
}