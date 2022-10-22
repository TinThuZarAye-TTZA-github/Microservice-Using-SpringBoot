package com.microservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	
	@Id
	int order_id;
	String name;
	int quantity;
	int price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int order_id, String name, int quantity, int price) {
		super();
		this.order_id = order_id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	

}
