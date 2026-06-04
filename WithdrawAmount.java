package exceptionhandling;

import java.util.Scanner;

public class WithdrawAmount {

	public static void main(String[] args) {
		int balance = 5000;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter withdram Amount : ");

			int Amount = sc.nextInt();
			int rem = balance - Amount;

			if (Amount < balance) {
				System.out.println("remaining Balance" + rem);
			} else {
				throw new InsuffientBalanceException();

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
