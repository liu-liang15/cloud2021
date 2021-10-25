package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.model","com.controller"})
public class Hyj {

    public static void main(String[] args) {
        SpringApplication.run(Hyj.class, args);
    }

}
