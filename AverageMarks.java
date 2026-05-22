package exceptionhandling;

import java.util.Scanner;

public class AverageMarks  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
            System.out.print("Enter total marks: ");
            int totalMarks = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int numberOfSubjects = sc.nextInt();

            // Calculate average
            int average = totalMarks / numberOfSubjects;

            System.out.println("Average Marks = " + average);

        } catch (ArithmeticException e) {
            System.err.println("Error: Number of subjects cannot be 0."+e);
        }

        sc.close();
    }

}
