package com.cxs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cxs.sys.mapper","com.cxs.bus.mapper"})
public class ErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class, args);
    }

}