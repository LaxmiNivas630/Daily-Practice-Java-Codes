package com.oopsabstraction;

public class OrderDetails {
	int orderid;
	String customerName;
	double price;

	OrderDetails(int orderid, String customerName, double price) {
		this.orderid = orderid;
		this.customerName = customerName;
		this.price = price;

	}

	public void displayDetails() {
		System.out.println("Order ID : " + orderid);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Order Price : " + price);

	}

}
