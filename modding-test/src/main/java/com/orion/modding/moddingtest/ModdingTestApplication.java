package com.orion.modding.moddingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ModdingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModdingTestApplication.class, args);
    }

}
