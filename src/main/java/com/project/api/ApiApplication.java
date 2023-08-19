package com.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApiApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);
	}

}
