package com.onevault.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onevault.services.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {
	
	User findByUsername(String username);
	
	User findByConfirmationToken(String confirmationToken);
}