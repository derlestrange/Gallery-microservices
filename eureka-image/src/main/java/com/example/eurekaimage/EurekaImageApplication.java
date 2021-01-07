package com.example.eurekaimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaImageApplication.class, args);
	}

}
