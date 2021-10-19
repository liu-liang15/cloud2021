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
public class DemoApplicationation {
    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoApplicationation.class, args);
        Timer timer = new Timer();
        //timer.schedule(new Task(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-10-16 00:00:00"),10*1000);
    }
}