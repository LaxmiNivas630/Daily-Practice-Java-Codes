package exceptionhandling;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method Started");

		int[] arr = new int[3];

		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("main method ended");

	}

}
