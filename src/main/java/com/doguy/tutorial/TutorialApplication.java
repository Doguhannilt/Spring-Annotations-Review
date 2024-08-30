package com.doguy.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TutorialApplication.class, args);
		Alien alien = context.getBean(Alien.class);

		alien.code();


	}

}
