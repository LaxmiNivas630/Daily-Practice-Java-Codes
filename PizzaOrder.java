package com.oopsabstraction;

public class PizzaOrder extends OrderDetails implements FoodOrder{

	PizzaOrder(int orderid, String customerName, double price) {
		super(orderid, customerName, price);
	}

	@Override
	public void prepareFood() {
		System.out.println("Pizza is ready Kavya Garu ");
		
	}
	
//	 public void displayDetails(){
//		System.out.println("dis");
//	}
//	
	
	
}
