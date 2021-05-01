package com.orion.modding.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ModdingTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(ModdingTest2Application.class, args);
	}

}
