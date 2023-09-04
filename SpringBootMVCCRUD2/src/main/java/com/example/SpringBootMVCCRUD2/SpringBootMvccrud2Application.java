package com.example.SpringBootMVCCRUD2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@EnableJpaRepositories("com.example.*")
@EntityScan("com.example.*")
public class SpringBootMvccrud2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvccrud2Application.class, args);
	}

}
