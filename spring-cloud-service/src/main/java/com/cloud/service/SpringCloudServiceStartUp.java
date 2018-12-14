package com.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SpringCloudServiceStartUp.class)
@EnableAutoConfiguration
public class SpringCloudServiceStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceStartUp.class, args);
        System.out.println("spring-cloud-service:启动成功");
    }


}
