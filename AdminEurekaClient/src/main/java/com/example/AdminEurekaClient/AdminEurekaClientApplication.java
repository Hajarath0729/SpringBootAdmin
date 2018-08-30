package com.example.AdminEurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class AdminEurekaClientApplication {
	
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(AdminEurekaClientApplication.class, args);
	}
	
	@RequestMapping("/greeting")
    public String greeting() {
        return "Hello from EurekaClient!";
    }
}
