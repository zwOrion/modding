package com.orion.modding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ModdingConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModdingConfigApplication.class, args);
	}

}
