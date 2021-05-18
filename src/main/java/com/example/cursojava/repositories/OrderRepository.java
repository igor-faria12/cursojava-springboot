package com.example.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
