package com.example.demochapter05;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demochapter05.dao")
public class Demochapter05Application {

    public static void main(String[] args) {
        SpringApplication.run(Demochapter05Application.class, args);
    }

}
