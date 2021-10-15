package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // 激活并开启feign
public class Inpatient {
    public static void main(String[] args) {
        SpringApplication.run(Inpatient.class, args);
    }
}
