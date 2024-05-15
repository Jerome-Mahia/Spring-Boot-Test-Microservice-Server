package com.example.testmicroservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/test")
public class TestMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestMicroserviceApplication.class, args);
    }

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/say")
    public String getMethodName() {
        return "Hi, I am from Microservice " + serverPort;
    }
}