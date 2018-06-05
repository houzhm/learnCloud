package com.example.learnconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LearnConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnConfigClientApplication.class, args);
    }
}
