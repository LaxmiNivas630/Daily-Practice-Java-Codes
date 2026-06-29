package com.stringhandling;

public class TestStrDem05 {

	public static void main(String[] args) {
		String str = "Java Srikanth";
//		Returns the character (Unicode code point) at the specified index. The index refers to char values (Unicode code units) and ranges from 0 to length() - 1.
		System.out.println(str.codePointAt(1));
//		Returns the character (Unicode code point) before the specified index.
//		The index refers to char values (Unicode code units) and ranges from 1 to length.
//		StringIndexOutOfBoundsException
		System.out.println(str.codePointBefore(1));
//		Returns the number of Unicode code points in the specified text range of this String. The text range begins at the specified beginIndex and extends to the char at index endIndex - 1.
		System.out.println(str.codePointCount(1, 6));

	}

}
