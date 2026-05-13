package com.oopsabstraction;

public class Electronics implements Product {
	String product = "Refrigrator";
	double cost = 20000.00;
	@Override
	public double buy(int quantity) {
		System.out.println("Product Name : " + product);
		System.out.println("Cost of product : " + cost);
		return cost*quantity;
		
		
	}
	
	
	
	

}
