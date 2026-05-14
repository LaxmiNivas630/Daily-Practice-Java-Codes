package com.oopsabstraction;

public  class BurgerOrder extends OrderDetails implements FoodOrder{

	BurgerOrder(int orderid, String customerName, double price) {
		super(orderid, customerName, price);
	}

	@Override
	public void prepareFood() {
		System.out.println("Burger is also Ready kavya Garu ");
		
	}
	
	

	

}
