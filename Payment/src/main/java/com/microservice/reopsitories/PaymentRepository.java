package com.microservice.reopsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
