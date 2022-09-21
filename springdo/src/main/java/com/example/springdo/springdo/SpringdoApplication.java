package com.example.springdo.springdo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient()
@RestController()
@RequestMapping("/apiv1")
public class SpringdoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdoApplication.class, args);
	}

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/health")
	public ResponseEntity<?> health() {
		return ResponseEntity.ok(appName + "is live 🚀");
	}

}
