package com.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RatingServiceMircoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceMircoApplication.class, args);
	}

}
