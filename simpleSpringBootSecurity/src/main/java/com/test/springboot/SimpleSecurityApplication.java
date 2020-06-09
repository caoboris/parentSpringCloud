package com.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSecurityApplication.class, args);
    }
}
