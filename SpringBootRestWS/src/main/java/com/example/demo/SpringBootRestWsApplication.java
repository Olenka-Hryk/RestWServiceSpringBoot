package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.example"})
@EntityScan("com.example.Entity")
@EnableJpaRepositories("com.example.repository")
public class SpringBootRestWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestWsApplication.class, args);
	}
}
