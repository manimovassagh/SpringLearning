package com.github.manimovassagh.springlearning;

import com.github.manimovassagh.springlearning.user.User;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnspringApplicationTests {
	Logger logger = LoggerFactory.getLogger(LearnspringApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Mani is Loading the context -> {}", User.class.getSimpleName());
		logger.info("Mani is Loading the context -> {}", User.class.getClassLoader());
		logger.info("Mani is Loading the context -> {}", User.class.getCanonicalName());
		logger.info("Mani is Loading the context -> {}", User.class.getComponentType());
	}
	

}
