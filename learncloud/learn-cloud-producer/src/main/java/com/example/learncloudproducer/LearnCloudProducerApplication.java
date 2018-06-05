package com.example.learncloudproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LearnCloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnCloudProducerApplication.class, args);
    }
}
