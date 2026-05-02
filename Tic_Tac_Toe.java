package com.javaprojects;

import java.util.Arrays;
import java.util.Scanner;

public class Tic_Tac_Toe {
	static char[][] board = new char[3][3];
	private static char currentplay = 'X';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn="";
		do {
		intilize();
		while (true) {
			display();
			System.out.println("enter " + currentplay + " player of row ");
			int row = sc.nextInt();
			System.out.println("enter " + currentplay + " player of column ");
			int col = sc.nextInt();
			
			if(row<0 || row>2 || col<0 || col>2) {
				System.out.println("Player " + currentplay + " Try Again ");
				continue;
			}
			
			if(board[row][col] != ' ') {
				System.out.println("Cell Already occupied so Plz Enter Again ");
				continue;
			}

			board[row][col] = currentplay;
			
			
			if (winrow() || wincol() || windiag()) {
				display();
				System.out.println("Player " + currentplay + " Won The Game ");
				break;
			}
			if(draw()) {
				display();
				System.out.println("Draw the Game ");
				break;
			}

			currentplay = (currentplay == 'X') ? 'O' : 'X';

		}
		System.out.println("if you want to contiune enter y");
		yn=sc.next();
		
		}
		while(yn.equalsIgnoreCase("y"));
		sc.close();
		
		}


	private static void display() {
		System.out.println("------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("------------");
		}
	}

	private static void intilize() {
		for (char[] a : board) {
			Arrays.fill(a, ' ');
		}
	}

	private static boolean winrow() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentplay && board[i][1] == currentplay && board[i][2] == currentplay) {
				return true;

			}
		}
		return false;
	}

	private static boolean wincol() {
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == currentplay && board[1][j] == currentplay && board[2][j] == currentplay) {
				return true;

			}
		}
		return false;
	}

	private static boolean windiag() {
		if (board[0][0] == currentplay && board[1][1] == currentplay && board[2][2] == currentplay) {
			return true;

		}
		if (board[0][2] == currentplay && board[1][1] == currentplay && board[2][0] == currentplay) {
			return true;

		}
		return false;
	}
       private static boolean draw() {
    	   for(int i=0;i<3;i++) {
    		   for(int j=0;j<3;j++) {
    			   if(board[i][j] == ' ') {
    				   return false;
    			   }
    		   }
    	   }
    	   return true;
       }
 
}
