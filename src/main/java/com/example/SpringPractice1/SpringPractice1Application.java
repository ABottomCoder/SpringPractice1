package com.example.SpringPractice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class SpringPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringPractice1Application.class, args);
	}

}
