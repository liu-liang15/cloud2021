package com.example;

import com.example.util.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;

@EnableScheduling //执行定时任务
@SpringBootApplication
@EnableFeignClients // 激活并开启feign
public class DemoApplicationation {
    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoApplicationation.class, args);
    }
}