package com.example.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
