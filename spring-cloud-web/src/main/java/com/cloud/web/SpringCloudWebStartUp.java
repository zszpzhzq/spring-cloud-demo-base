package com.cloud.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudWebStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudWebStartUp.class, args);
        System.out.println("spring-cloud-web启动成功");
    }


}
