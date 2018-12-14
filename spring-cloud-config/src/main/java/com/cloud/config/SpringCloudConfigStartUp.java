package com.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigStartUp {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudConfigStartUp.class, args);
        System.out.println("配置中心启动成功！");

    }

}
