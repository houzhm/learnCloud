package com.example.learnzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class LearnZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnZipkinServerApplication.class, args);
    }
}
