package com.spring.basic.Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;


@Configuration
//@ComponentScan(basePackages = "com.spring.basic.Assignment2")
public class Config {
	
	 
	@Bean
	public Movie getMovie()
	{
		return new Movie();
	}

}
