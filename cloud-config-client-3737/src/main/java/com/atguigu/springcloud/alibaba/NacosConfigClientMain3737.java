package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2020-02-23 17:01
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3737
{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3737.class, args);
    }
}
