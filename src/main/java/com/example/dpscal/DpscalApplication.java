package com.example.dpscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.dpscal" })
@EntityScan("com.example.dpscal")
public class DpscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpscalApplication.class, args);
	}

}
