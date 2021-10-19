package com.example;

import com.example.util.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;

@EnableScheduling
@SpringBootApplication
@EnableFeignClients // 激活并开启feign
public class DemoApplication {
    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoApplication.class, args);
    }
}
