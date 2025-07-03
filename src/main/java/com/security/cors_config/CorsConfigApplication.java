package com.security.cors_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorsConfigApplication {

//	CORS stands for Cross-Origin Resource Sharing. It is a security feature implemented by browsers
//	that restricts web pages from making requests to a different domain than the one that served the original web page.
//	This is a security feature to prevent cross-site request forgery(XSRF) attacks.


	public static void main(String[] args) {
		SpringApplication.run(CorsConfigApplication.class, args);
	}

}
