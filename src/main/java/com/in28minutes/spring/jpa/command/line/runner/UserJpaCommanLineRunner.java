package com.in28minutes.spring.jpa.command.line.runner;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.jpa.entity.User;
import com.in28minutes.spring.jpa.repository.UserJpaRepository;

@Component
public class UserJpaCommanLineRunner implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserJpaCommanLineRunner.class);
	@Autowired
	private UserJpaRepository userJpaRepository;
		
	@Override
	public void run(String... args) throws Exception {
		User jill = new User("Jill", "Human Resource");
		userJpaRepository.save(jill);
		LOGGER.info("New user created via JPA :: " + jill);
		
		Optional<User> findById = userJpaRepository.findById(1L);
		LOGGER.info("User retrieved by ID via JPA :: " + findById);
		
		List<User> users = userJpaRepository.findAll();
		LOGGER.info("All users retrieved via JPA :: " + users);
	}
}
