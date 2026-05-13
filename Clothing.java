package com.oopsabstraction;

public class Clothing implements Product{
	String product = "T-shirt";
	double cost = 800;
	@Override
	public double buy(int quantity) {
		System.out.println("Product Name : " + product);
		System.out.println("Cost of product : " + cost);
		return cost*quantity;
		
		
	}

}
