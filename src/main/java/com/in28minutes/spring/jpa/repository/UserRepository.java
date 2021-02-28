/**
 * 
 */
package com.in28minutes.spring.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.spring.jpa.entity.User;

/**
 * @author Sameer
 *
 */
@Repository
@Transactional
public class UserRepository {
	
	@PersistenceContext	// To autowire the EntityManager interface
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
