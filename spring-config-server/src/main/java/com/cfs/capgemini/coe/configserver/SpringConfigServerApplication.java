package com.cfs.capgemini.coe.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
		
	}
}
