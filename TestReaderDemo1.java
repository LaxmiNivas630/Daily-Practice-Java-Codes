package com.fileio;

import java.io.FileReader;
import java.io.IOException;

public class TestReaderDemo1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileReader fr = new FileReader("D:\\FileIo\\Nivas1.txt");

		// reads a single character
		int i = fr.read();// 71

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
			Thread.sleep(500);

		}
		fr.close();

	}

}
