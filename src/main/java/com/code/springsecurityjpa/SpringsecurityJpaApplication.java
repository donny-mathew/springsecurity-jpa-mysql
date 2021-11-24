package com.code.springsecurityjpa;

import com.code.springsecurityjpa.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityJpaApplication.class, args);
	}

}
