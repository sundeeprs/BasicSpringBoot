package com.machinemindinnovation.basicspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BasicspringbootApplication implements CommandLineRunner {

	@Autowired
	DB db;

	public static void main(String[] args) {

		SpringApplication.run(BasicspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Printing from main method:: "+db.getData());
	}
}
