import java.util.Scanner;

public class TCSQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;

		System.out.println("Enter No. Tickets : ");
		int a = sc.nextInt();

		System.out.println("Enter Prices of all tickets : ");
		int arr[] = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Prices of all tickets :");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("Odd Number Ticket Price : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");

			}

		}
		System.out.println();
		System.out.print("Sum of Odd Prices Tickets : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
				count++;

			}
		}
		System.out.println(sum + " ");
		if (count > 0) {
			double avg = (double) sum / count;
			System.out.println("Avg of Odd Tickets Price : " + avg);

		}
		sc.close();
	}

}
