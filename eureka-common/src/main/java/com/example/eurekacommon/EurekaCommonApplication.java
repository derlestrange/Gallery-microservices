package com.example.eurekacommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCommonApplication.class, args);
	}

}
