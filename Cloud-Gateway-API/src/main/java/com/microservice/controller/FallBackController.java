package com.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
	
	@RequestMapping("/orderFallBack")
	public Mono<String> orderFallBack() {
		return Mono.just("Order service is taking to long to response");
	}
	
	@RequestMapping("/paymentFallBack")
	public Mono<String> paymentFallBack() {
		return Mono.just("Payment service is taking to long to response");
	}
}
