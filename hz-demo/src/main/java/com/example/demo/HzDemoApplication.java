package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class HzDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzDemoApplication.class, args);
	}


	@Bean
	@LoadBalanced
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}





