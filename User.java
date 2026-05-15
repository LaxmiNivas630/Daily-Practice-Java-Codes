package com.javaprojects;

public class User {
	int accno;
	String accHolderName;
	int pin;
	double balance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public User(int accno, String accHolderName, int pin, double balance) {
		super();
		this.accno = accno;
		this.accHolderName = accHolderName;
		this.pin = pin;
		this.balance = balance;
	}
	
	

}
