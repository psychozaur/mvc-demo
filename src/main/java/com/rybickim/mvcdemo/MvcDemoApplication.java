package com.rybickim.mvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

//@Lazy
@SpringBootApplication
public class MvcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcDemoApplication.class, args);
    }

}
