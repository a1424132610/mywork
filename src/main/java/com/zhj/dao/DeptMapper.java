package com.zhj.dao;

import com.zhj.entity.Dept;
import java.util.List;

public interface DeptMapper {
    int insert(Dept record);

    List<Dept> selectAll();
}