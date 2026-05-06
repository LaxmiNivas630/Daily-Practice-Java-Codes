package com.oopsinheritance;

class Account {
	String ISFCcode;
	double balance;

	Account(String ISFCcode, double balance) {
		this.ISFCcode = ISFCcode;
		this.balance = balance;
	}

	void calculateInterest() {
		System.out.println("Interest Calculation");

	}
}

class SavingAccount extends Account {
	SavingAccount(String ISFCcode, double balance) {
		super(ISFCcode, balance);
	}

	@Override
	void calculateInterest() {
		double interest = balance * 0.2;
		System.out.println("ISFCCODE : " + ISFCcode);
		System.out.println("Savings Account Interest : " + interest);
	}

}

class CurrentAccount extends Account {
	CurrentAccount(String ISFCcode, double balance) {
		super(ISFCcode, balance);

	}

	@Override
	void calculateInterest() {
		double interest = balance * 0.6;
		System.out.println("ISFCCODE : " + ISFCcode);
		System.out.println("Current Account Interest : " + interest);
	}
}

public class BankingSystem {

	public static void main(String[] args) {

		CurrentAccount CA = new CurrentAccount("INBI0001234", 10000.0);
		SavingAccount SA = new SavingAccount("HDFC0004321", 10000.0);

		CA.calculateInterest();
		SA.calculateInterest();

	}

}
