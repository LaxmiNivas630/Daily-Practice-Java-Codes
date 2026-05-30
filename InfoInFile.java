package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InfoInFile {

	public static void main(String[] args) {

		File f = new File("C:\\Temp\\Nivas_1.txt");

		try {
			FileReader fr = new FileReader(f);

			try {
				int i = fr.read();

				while (i != -1) {
					System.out.print((char) i);
					i = fr.read();
				}

			} catch (IOException e) {
				e.printStackTrace();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
