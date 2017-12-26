package com.ashish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootH2ControllerRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2ControllerRepositoryApplication.class, args);
	}
}
