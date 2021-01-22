package com.hand.junshi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//项目启动类

@SpringBootApplication
@MapperScan("com.hand.junshi.mapper")
public class JunshiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunshiApplication.class, args);
    }

}
