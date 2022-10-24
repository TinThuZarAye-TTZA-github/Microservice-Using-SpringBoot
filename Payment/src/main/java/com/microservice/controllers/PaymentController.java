package com.microservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.Payment;
import com.microservice.services.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService service;
	
	@GetMapping("/")
	public List<Payment> getAllPayment() {
		return service.getAllPayment();
	}
	
	@PostMapping("/add")
	public Payment doPayment(@RequestBody Payment newPayment) {
		return service.doPayment(newPayment);
	}
	
	@GetMapping("/{orderId}")
	public Payment findByOrderId(@PathVariable int orderId) {
		return service.findByOrderId(orderId);
	}

}
