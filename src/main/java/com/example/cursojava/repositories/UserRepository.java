package com.example.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
