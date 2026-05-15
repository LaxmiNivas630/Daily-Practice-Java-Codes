package com.javaprojects;

import java.util.Scanner;

public class AtmImplementation implements AtmInterface {
	Scanner sc = new Scanner(System.in);
	User u1;

	AtmImplementation(User u) {
		u1 = u;
	}

	@Override
	public void checkBalance() {
		System.out.println("Your balance : " + u1.getBalance());

	}

	@Override
	public void withdraw() {
		System.out.println("Enter amount");
		double wd = sc.nextDouble();
		if (wd > u1.getBalance()) {
			System.out.println("insuffient balance");

		} else {
			double bal = u1.getBalance() - wd;
			u1.setBalance(bal);
			System.out.println("balance : " + bal);
		}

	}

	@Override
	public void deposit() {
		System.out.println("Enter amount ");
		double dp = sc.nextDouble();
		double bal = u1.getBalance() + dp;
		u1.setBalance(bal);
		System.out.println("Balance" + bal);

	}

	@Override
	public void pinchange() {
		System.out.println("");
		int op=sc.nextInt();
		if(u1.getPin()==op) {
			System.out.println("Enter new pin");
			int np=sc.nextInt();
		}else {
			System.out.println("Invalid pin");
		}

	}

}
