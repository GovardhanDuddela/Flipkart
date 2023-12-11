package com.example.shopping.Flipkart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Flipkart {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int orderId;
	@Column
	String customerName;
	@Column
	String orderName;
	@Column
	double price;
	public int getOrderId() {
		return orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getOrderName() {
		return orderName;
	}
	public double getPrice() {
		return price;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
 