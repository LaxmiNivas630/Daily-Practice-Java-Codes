package com.oopsabstraction;

public class Main1 {

	public static void main(String[] args) {
		PizzaOrder po = new PizzaOrder(20, "kavya", 120);
		po.prepareFood();
		po.displayDetails();
		System.out.println();
		BurgerOrder bo = new BurgerOrder(30, "Kavya", 200);
		bo.prepareFood();
		bo.displayDetails();

	}

}
