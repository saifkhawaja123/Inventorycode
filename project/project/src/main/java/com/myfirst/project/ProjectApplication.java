package com.myfirst.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.myfirst.project.controller","com.myfirst.project.domain","com.myfirst.project.repository","com.myfirst.project.service"})

public class ProjectApplication {

	//Entry Point
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
