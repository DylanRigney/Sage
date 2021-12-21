package com.dylan.sageBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.dylan.sageBE")
@EntityScan("com.dylan.sageBE.models")
@EnableJpaRepositories("com.dylan.sageBE.repositories")
public class SageBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SageBeApplication.class, args);
	}

}
