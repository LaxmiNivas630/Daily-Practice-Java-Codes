package exceptionhandling;

import java.io.File;
import java.io.IOException;

public class UpdateFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method ended !");

		File f = new File("C:\\Temp\\Nivas_1.txt");

		Boolean status = f.createNewFile();

		if (status) {
			System.out.println("File has been created successfully ");

		} else {
			System.out.println("Something went wrong ");
		}

	}

}
