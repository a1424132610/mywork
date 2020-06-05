package com.zhj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.zhj.web.model.dao"})
public class MyWorkApp
{

    public static void main( String[] args ) {
        SpringApplication.run(MyWorkApp.class,args);
    }




}
