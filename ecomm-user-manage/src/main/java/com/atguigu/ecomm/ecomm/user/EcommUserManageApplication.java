package com.atguigu.ecomm.ecomm.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.ecomm.ecomm.user.repo")
public class EcommUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommUserManageApplication.class, args);
    }

}
