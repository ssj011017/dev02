package com.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

// 当前SpringBoot项目的启动类
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        SpringApplication.run(MyApplication.class, args);
    }
}

