package com.zhj.dao;

import com.zhj.entity.Salgrade;
import java.util.List;

public interface SalgradeMapper {
    int insert(Salgrade record);

    List<Salgrade> selectAll();
}