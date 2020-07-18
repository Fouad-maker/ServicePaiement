package com.spring.soap.api;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicePaypalApplication {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));

		SpringApplication.run(ServicePaypalApplication.class, args);
	}

}
