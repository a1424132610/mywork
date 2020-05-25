package com.zhj;

import com.zhj.model.dao.User;
import com.zhj.runable.TestRunable;
import org.apache.lucene.store.RandomAccessInput;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.zhj.model.dao"})
public class MyWorkApp
{
    public static void main( String[] args ) throws IOException {

        List<User> objects = new ArrayList<>();

        User user1 = new User(1L,2,"3");
        User user2 = new User(1L,2,"4");
        User user3 = new User(2L,2,"5");
        objects.add(user1);
        objects.add(user2);
        objects.add(user3);

        List<User> users = objects.stream().filter(user -> user.getSysno().equals(1L)).collect(Collectors.toList());
        Map<Long, List<User>> collect = objects.stream().collect(Collectors.groupingBy(User::getSysno));
        System.out.println(collect);

    }




}
