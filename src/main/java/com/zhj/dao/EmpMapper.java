package com.zhj.dao;

import com.zhj.entity.Emp;
import java.util.List;

public interface EmpMapper {
    int insert(Emp record);

    List<Emp> selectAll();
}