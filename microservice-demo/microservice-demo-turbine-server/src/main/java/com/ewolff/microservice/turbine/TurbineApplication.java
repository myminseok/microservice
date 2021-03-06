package com.ewolff.microservice.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableAutoConfiguration
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbineStream
public class TurbineApplication {
	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication.class, args);
	}

	//org.springframework.integration.dsl.core.MessageProducerSpec;
	//org.springframework.cloud.netflix.turbine.stream.TurbineStreamProperties;


}
