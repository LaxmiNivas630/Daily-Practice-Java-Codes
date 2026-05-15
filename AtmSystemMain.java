package com.javaprojects;

import java.util.Scanner;

public class AtmSystemMain {

	public static void main(String[] args) {
		User[] userArray= new User[5];
		userArray[0]= new User(1441,"Nivas",1234,6000.00);
		userArray[1]= new User(1442,"Nivas",1234,7000.00);
		userArray[2]= new User(1443,"Nivas",1234,8000.00);
		userArray[3]= new User(1444,"Nivas",1234,9000.00);
		userArray[4]= new User(1445,"Nivas",1234,10000.00);
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter your AccNo : ");
		int acc = sc.nextInt();
		System.out.println("Ente your PinNo : ");
		int pin = sc.nextInt();
		User u1 = null;
		boolean status = false;
		for(User user : userArray) {
			if(pin ==user.getPin() && acc == user.getAccno()) {
				status = true;
				u1=user;
				break;
				
			}
		}
		System.out.println(u1.getAccHolderName()+"Welcome to Indian bank services");
		AtmImplementation atm=new AtmImplementation(u1);
		while(status) {
			System.out.println("1.check Balance\n 2.withdraw\n 3.deposit\n 4.pin change\n 5.exit");
			System.out.println("Enter your choice.");
			int n= sc.nextInt();
			switch(n) {
			case 1->atm.checkBalance();
			case 2->atm.withdraw();
			case 3->atm.deposit();
			case 4->atm.pinchange();
			case 5->{
				status = false;
				System.out.println("thanks for choosing Indian bank services");
			}
			default->System.out.println("invalid choice your entered");
			}
		
	
	}

	}}
