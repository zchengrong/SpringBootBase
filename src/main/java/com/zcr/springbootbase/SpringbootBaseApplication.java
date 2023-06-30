package com.zcr.springbootbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zcr.springbootbase.mapper")
public class SpringbootBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBaseApplication.class, args);
    }

}
