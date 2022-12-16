package com.boot;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApp7591Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentApp7591Application.class, args);
	}
	@Bean
	public ModelMapper getModelMapper()
	{
		
		ModelMapper model=new ModelMapper();
		return model;
	
	}

}

