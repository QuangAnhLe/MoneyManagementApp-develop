package com.java.mentor.moneymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoneyManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyManagementApplication.class, args);
	}

	@GetMapping
	public String helloWorld()
	{
		return "Hello World";
	}

}
