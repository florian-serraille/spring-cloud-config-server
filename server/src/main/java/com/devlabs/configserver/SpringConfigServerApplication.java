package com.devlabs.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
	}
	
}
