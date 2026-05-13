package com.oopsabstraction;

public class Grocery implements Product{
	String product = "Pineapples";
	double cost = 100;
	@Override
	public double buy(int quantity) {
		System.out.println("Product Name : " + product);
		System.out.println("Cost of product : " + cost);
		return cost*quantity;
		
		
	}

}
