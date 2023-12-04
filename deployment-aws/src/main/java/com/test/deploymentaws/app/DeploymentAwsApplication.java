package com.test.deploymentaws.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploymentAwsApplication {
	
	@GetMapping("/")
	public String home()
	{
		return "This is my Spring boot Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeploymentAwsApplication.class, args);
	}

}
