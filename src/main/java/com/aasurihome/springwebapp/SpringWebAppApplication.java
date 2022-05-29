package com.aasurihome.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sample WebApp created using Spring Boot.
 * Add Spring Web to the dependencies when generating the Spring Boot project.
 * Also, add "TomCat Jasper" dependency to pom.xml directly to enable serving of JSP files.
 */

@SpringBootApplication
public class SpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

}
