package com.orion.modding.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ModdingGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModdingGatewayApplication.class, args);
	}

}
