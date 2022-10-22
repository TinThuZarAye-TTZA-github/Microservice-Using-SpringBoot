package com.microservice.common;

import com.microservice.entities.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

	private Order order;
	private int amount;
	private String transactionId;
	String message;
	

}
