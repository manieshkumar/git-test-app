package com.test.spring.api;

import lombok.Data;

@Data
public class Order {

	private String userName;
	private double amount;
	private String productName;
}
