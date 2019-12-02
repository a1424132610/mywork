package com.zhj.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class TxTest {

    @Id
    private Integer id;

    private String name;

    private String value;

}