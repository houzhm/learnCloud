package com.example.learneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LearnEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaServerApplication.class, args);
    }
}
