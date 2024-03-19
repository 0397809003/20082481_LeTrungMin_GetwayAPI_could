package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.Controller"})
public class ProjectSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSeviceApplication.class, args);
		System.out.println("nguyễn Ngân ");
	}

}
