package com.carmen.studying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyingApplication.class, args);
	}

	@GetMapping
	public String apiRoot() {
		return "Hello World!";
	}
}
