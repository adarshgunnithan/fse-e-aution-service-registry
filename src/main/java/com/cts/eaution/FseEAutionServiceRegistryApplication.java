package com.cts.eaution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FseEAutionServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FseEAutionServiceRegistryApplication.class, args);
	}

}
