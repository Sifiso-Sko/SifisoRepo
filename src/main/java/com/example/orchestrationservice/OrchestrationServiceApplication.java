package com.example.orchestrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrchestrationServiceApplication {

	public static void main(String[] args) {
         SpringApplication.run(OrchestrationServiceApplication.class, args);

	}
	@GetMapping("/")
	public String home(){
		return "Hello from Orchestration and Deployment Management Microservice!!";
	}
}


