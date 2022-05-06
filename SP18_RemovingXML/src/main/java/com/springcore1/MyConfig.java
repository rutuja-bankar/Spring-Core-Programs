package com.springcore1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore1")		// optional
public class MyConfig 
{
	
	public Address getAddress()
	{
		Address obj = new Address();
		return obj;
	}

	@Bean
	public Student getStudent()
	{
		Student obj = new Student(getAddress());
		return obj;
	}
}
