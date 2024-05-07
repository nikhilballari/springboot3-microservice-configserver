package com.dailypractise.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Springboot3MicroserviceConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3MicroserviceConfigserverApplication.class, args);
	}

}
