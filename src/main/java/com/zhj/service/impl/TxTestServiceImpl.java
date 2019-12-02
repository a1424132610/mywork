package com.zhj.service.impl;

import com.zhj.dao.TxTestMapper;
import com.zhj.entity.TxTest;
import com.zhj.service.DeptService;
import com.zhj.service.TxTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 　　　　　　　   ┏┓　   ┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃ + + + +
 * 　　　　　　　　　┃　　　┃			God beast body, code no BUG
 * 　　　　　　　　　┃　　　┃ +			神兽护体,代码无BUG
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 *
 * @author zhonghaijun
 * @title:
 * @date 2019/11/29
 */
@Service
public class TxTestServiceImpl implements TxTestService {

    @Autowired
    private TxTestMapper txTestMapper;

    @Autowired
    private DeptService deptService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insert(TxTest txTest) {
        deptService.insert(txTest);
    }

    public void instartEntity(TxTest txTest){
        txTestMapper.insert(txTest);
    }
}
