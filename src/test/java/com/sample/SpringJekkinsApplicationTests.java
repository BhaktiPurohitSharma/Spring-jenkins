package com.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJekkinsApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SpringApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case excuting 1..");
		logger.info("Test case excuting 2..");
		assertEquals(true, true);
	}

}
