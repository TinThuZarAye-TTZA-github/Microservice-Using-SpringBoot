package com.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

}
