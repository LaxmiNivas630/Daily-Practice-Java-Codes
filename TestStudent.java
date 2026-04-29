package com.oops;

public class TestStudent {

	public static void main(String[] args) {
      
		Student s1 = new Student();
//		Modifying the data 
		s1.setSid(18);
	    s1.setSname("MSD");
	    s1.setPhone(9000258610L);
//	    Reading the data
	    System.out.println(s1.getSid());
	    System.out.println(s1.getSname());
	    System.out.println(s1.getPhone());
	    
		
		
//		s1.sid=7;
//		s1.sname="MSD";
//		s1.phone=9000258610L;
//		
//		s1.sid=9;
		
//		Accessing the data from outside of the classes directly
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.phone);
	}

}
