package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	
	public Order() {
		this.orderId=123;
		this.customerName="herald";
		this.quantity=5;
	}
	public void display() {
		System.out.println("the details of the order =>");
		System.out.println("Orderid : "+orderId);
		System.out.println("customerName : "+customerName);
		System.out.println("quantity : "+quantity);
		System.out.println("productId: "+product.getProductId());
		System.out.println("productNAme:"+product.getProductName());
		System.out.println("productprice:"+product.getPrice());
		System.out.println("category:"+product.getCategory());
	
	}
}
