package com.javalogicalstatements;

import java.util.Scanner;

public class JobBasedApp {

	public static void main(String[] args) {
		System.out.println("Cricket info");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Jersey Number to get the details ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("Thala for a Reason ");
			System.out.println("The one & only the best & cool captian Mr. MSD");
			break;

		case 18:
			System.out.println("The KING Kohli");
			System.out.println("The MOst consistent Cricket player in India");
			break;

		case 45:
			System.out.println("The HIT MAN");
			System.out.println("A good Captain & also A Good Hitter ");
			break;

		default:
			System.out.println("Entered Jersy number details not added here ");

		}

	}

}
