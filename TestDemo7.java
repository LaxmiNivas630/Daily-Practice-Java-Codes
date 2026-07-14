package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestDemo7 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\FileIo\\Sri");
		
		File f1 = new File(f,"Hello.txt");
		f1.createNewFile();


	}

}
