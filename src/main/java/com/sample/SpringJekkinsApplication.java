package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJekkinsApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("Application Started.....");	
	}
	
	public static void main(String[] args) {
		logger.info("Application Excecuted.....");	
		SpringApplication.run(SpringJekkinsApplication.class, args);
	}

}
