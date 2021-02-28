package com.in28minutes.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.spring.jpa.entity.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {

}
