package com.cognixia.jump.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	// custom query for finding user by username
	// will be used to load in user and check credentials when sending requests to the API
	// Optional -> we don't know if a user with this username exists
	public Optional<User> findByUsername(String username);
	
}
