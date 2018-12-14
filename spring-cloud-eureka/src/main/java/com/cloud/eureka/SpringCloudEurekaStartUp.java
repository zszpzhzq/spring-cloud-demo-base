package com.cloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = SpringCloudEurekaStartUp.class)
@EnableEurekaServer
@EnableAutoConfiguration
public class SpringCloudEurekaStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaStartUp.class, args);
        System.out.println("spring-cloud-eureka启动成功");
    }


}
