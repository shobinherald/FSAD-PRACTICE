package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductOrder {
	private int orderid;
	private String customerName;
	private String productName;
	private int quantity;
	
	public ProductOrder(@Value("201")int orderId,@Value("shobin")String customerName) {
		this.orderid=orderId;
		this.customerName=customerName;
	}
	@Value("keyboard")
	public void setProductName(String productName) {
		this.productName=productName;
	}
	@Value("7")
	public void setQuantity(int quantity ) {
		this.quantity=quantity;
	}
	public void display() {
		System.out.println("Following the order details.....");
		System.out.println("orderId:"+orderid);
		System.out.println("customerName:"+customerName);
		System.out.println("productName:"+productName);
		System.out.println("quantity:"+quantity);
		
	}

}