package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 将服务注册到注册中心
public class DemoApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication9527.class, args);
    }
}
