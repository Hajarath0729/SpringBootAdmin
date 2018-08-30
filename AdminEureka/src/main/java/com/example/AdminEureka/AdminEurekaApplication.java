package com.example.AdminEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdminEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminEurekaApplication.class, args);
	}
}
