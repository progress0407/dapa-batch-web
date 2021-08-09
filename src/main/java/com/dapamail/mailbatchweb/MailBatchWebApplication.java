package com.dapamail.mailbatchweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MailBatchWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailBatchWebApplication.class, args);
	}

}
