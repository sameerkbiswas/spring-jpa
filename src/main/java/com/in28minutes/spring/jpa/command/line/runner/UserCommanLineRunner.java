package com.in28minutes.spring.jpa.command.line.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.jpa.entity.User;
import com.in28minutes.spring.jpa.repository.UserRepository;

@Component
public class UserCommanLineRunner implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserCommanLineRunner.class);
	@Autowired
	private UserRepository userRepository;
		
	@Override
	public void run(String... args) throws Exception {
		User jack = new User("Jack", "Admin");
		userRepository.insert(jack);
		LOGGER.info("New user created :: " + jack);
	}
}
