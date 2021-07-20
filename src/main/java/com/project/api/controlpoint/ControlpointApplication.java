package com.project.api.controlpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.*;

@SpringBootApplication
@EnableSwagger2
public class ControlpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlpointApplication.class, args);

		System.out.println("API Started!");
	}

}
