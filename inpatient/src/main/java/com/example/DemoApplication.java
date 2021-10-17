package com.example;

import com.example.util.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;

@SpringBootApplication
@EnableFeignClients // 激活并开启feign
public class DemoApplication {
    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoApplication.class, args);
        Timer timer = new Timer();
        //timer.schedule(new Task(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-10-16 00:00:00"),10*1000);
    }
}
