package com.dong.WebNetFlix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.core.SpringSecurityCoreVersion;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WebNetFlixApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebNetFlixApplication.class, args);
	}

}
