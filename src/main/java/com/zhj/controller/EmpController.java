package com.zhj.controller;

import com.zhj.dao.DeptMapper;
import com.zhj.entity.TxTest;
import com.zhj.req.EmpReq;
import com.zhj.service.DeptService;
import com.zhj.service.TxTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
 * @title:
 * @author zhonghaijun
 * @date 2019/11/28
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private TxTestService txTestService;

    @PostMapping("/hello")
    public String getEmp(@RequestBody TxTest txTest){
        txTestService.insert(txTest);
        return null;
    }

    @GetMapping("/hello2")
    public String getHello(){

        return "hello";
    }

}
