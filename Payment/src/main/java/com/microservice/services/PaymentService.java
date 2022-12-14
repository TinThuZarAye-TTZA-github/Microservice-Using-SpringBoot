package com.microservice.services;

import java.util.List;

import com.microservice.entities.Payment;

public interface PaymentService {
	
	public Payment doPayment(Payment newPayment);
	public List<Payment> getAllPayment();
	
	public String paymentProcessing();
	public Payment findByOrderId(int orderId);

}
