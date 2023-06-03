package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientApplication.class, args);
	}

}
