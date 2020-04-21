package com.db.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringConfigCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigCloudServerApplication.class, args);
	}

}
