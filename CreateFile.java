package exceptionhandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		System.out.println("Main method Started!");

		File f = new File("C:\\Temp\\Nivas.txt");

		try {
			f.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();

		}
		System.out.println("Main method ended!!");

	}
	

}
