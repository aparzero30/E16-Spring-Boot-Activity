package com.example.E16.Spring.Boot.Activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication


@EntityScan(basePackages = "com/example/E16/Spring/Boot/Activity")
@EnableJpaRepositories(basePackages = "com.example.E16.Spring.Boot.Activity")
public class E16SpringBootActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(E16SpringBootActivityApplication.class, args);
	}

}
