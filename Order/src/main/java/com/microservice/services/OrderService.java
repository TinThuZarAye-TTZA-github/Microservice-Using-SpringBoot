package com.microservice.services;

import java.util.List;

import com.microservice.common.TransactionRequest;
import com.microservice.common.TransactionResponse;
import com.microservice.entities.Order;

public interface OrderService {
	
	public TransactionResponse doOrder(TransactionRequest request);
	public List<Order> getAllOrder();
	

}
