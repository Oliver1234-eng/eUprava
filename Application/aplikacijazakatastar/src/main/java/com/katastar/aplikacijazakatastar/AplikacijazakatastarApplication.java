package com.katastar.aplikacijazakatastar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class AplikacijazakatastarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplikacijazakatastarApplication.class, args);
	}

}
