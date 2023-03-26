package com;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject1DependentInjectionApplication
{

	static
	{
		System.out.println("SpringBootProject1DependentInjectionApplication.class is loading");
	}

	@Bean
	public LocalDateTime createLocalDateTime()
	{
		System.out.println("createLocalDateTime Bean method");
		return LocalDateTime.now();
	}

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootProject1DependentInjectionApplication.class, args);
	}

}
