package com.example.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursojava.entities.Category;
import com.example.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
