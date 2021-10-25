package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient // 将服务注册到注册中心
public class System {
    public static void main(String[] args) {
        SpringApplication.run(System.class, args);
    }
}
