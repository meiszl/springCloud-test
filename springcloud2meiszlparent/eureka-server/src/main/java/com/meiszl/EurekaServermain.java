package com.meiszl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableEurekaServer
public class EurekaServermain {
    public static void main(String[] args){
        SpringApplication.run(EurekaServermain.class,args);
    }
}
