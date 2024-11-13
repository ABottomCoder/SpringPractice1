package com.example.SpringPractice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringPractice1Application.class, args);
	}

	@GetMapping
	Customer getCustomer(){
		return new Customer(1L, "Rin Fate");
	}

	class Customer{
		private final Long id;
		private final String name;


        Customer(Long id, String name) {
            this.id = id;
            this.name = name;
        }

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	}
}
