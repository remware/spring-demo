package com.example.demo;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		EmailService emailService = new EmailService();
		ApplicationServices app = new ApplicationServices(emailService);
		app.processMessages("hello there", "run@remware.net");

		MessageServiceInjector injector = new EmailServiceInjector();
		Consumer consumer = injector.getConsumer();
		SpringApplication.run(DemoApplication.class, args);
	}
}
