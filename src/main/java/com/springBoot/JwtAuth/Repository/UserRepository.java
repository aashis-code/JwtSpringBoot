package com.springBoot.JwtAuth.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.JwtAuth.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	 Optional<User> findByEmail(String email);
	
}
