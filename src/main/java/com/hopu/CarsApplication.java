package com.hopu;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hopu.dao")
public class CarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsApplication.class, args);
    }

}
