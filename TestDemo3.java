package exceptionhandling;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("Main method Started ");

		String s = "Nivas";
		System.out.println(s.length());

		String s2 = "";
		System.out.println(s2.length());

		try {
			System.out.println("in try");
			String s3 = null;
			System.out.println(s3.length());
		} catch (NullPointerException e) {
			System.out.println("in catch");
			e.printStackTrace();

		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}

}
