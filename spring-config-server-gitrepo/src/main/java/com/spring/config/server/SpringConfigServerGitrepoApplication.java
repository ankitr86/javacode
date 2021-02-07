package com.spring.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerGitrepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerGitrepoApplication.class, args);
		System.out.println("Inside Main method of SpringConfigServerGitrepoApplication");
	}

}
