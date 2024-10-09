package com.shizubro.cardorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CardIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardIntegrationApplication.class, args);
	}

}
