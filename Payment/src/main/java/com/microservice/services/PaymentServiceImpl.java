package com.microservice.services;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.entities.Payment;
import com.microservice.reopsitories.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentRepository repo;

	@Override
	public Payment doPayment(Payment newPayment) {
		
		newPayment.setPaymentStatus(paymentProcessing());

		// UUID - transactionId auto-generated
		newPayment.setTransactionId(UUID.randomUUID().toString());
		Payment payment = repo.save(newPayment);
		return payment;
	}

	@Override
	public List<Payment> getAllPayment() {
		List<Payment> pList = repo.findAll();
		return pList;
	}

	@Override
	public String paymentProcessing() {
		
		return new Random().nextBoolean()?"success":"false";
	}

	
	
	
}
