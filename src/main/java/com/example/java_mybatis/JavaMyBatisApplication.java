package com.example.java_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.java_mybatis.mapper")
public class JavaMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMyBatisApplication.class, args);
    }

}
