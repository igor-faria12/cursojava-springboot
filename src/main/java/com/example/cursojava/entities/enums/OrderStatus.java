package com.example.cursojava.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	SHIPPED(3),
	PAID(2),
	CANCELED(5),
	DELIVERED(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code)
				return value;
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code");
	}
}
