package com.example.helloworlddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworlddemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello!");
        SpringApplication.run(HelloworlddemoApplication.class, args);
    }

}
