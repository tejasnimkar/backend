package com.deccan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class DeccanSportsClub1Application {

	public static void main(String[] args) {
		SpringApplication.run(DeccanSportsClub1Application.class, args);
	}

}
