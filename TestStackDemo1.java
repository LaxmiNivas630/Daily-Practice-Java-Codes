package com.collections;

import java.util.List;
import java.util.Stack;

public class TestStackDemo1 {

//Queue :FIFO: First in First OUT 	
//	Stack : LIFO : Last In First Out
	public static void main(String[] args) {
		Stack<String> l1 = new Stack<>();

		l1.push("J2SE");
		l1.push("J2EE");
		l1.push("MYSQL");
		l1.push("HTML");
		l1.push("JAVASVRIPT");
		l1.push("SERVELTS");
		l1.push("SPRING");
		l1.push("SPRING BOOT");
		l1.push("MICROSERVICES");
		l1.push("JPA");
		
		
		System.out.println(l1.search("HTML"));
		
//		true if and only if this stack contains no items; false otherwise.
		System.out.println(l1.empty());
		

//	Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println(l1.pop());

// Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(l1.peek());

		System.out.println(l1);

	}

}
