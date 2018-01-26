package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringcloudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigDemoApplication.class, args);
	}
}
