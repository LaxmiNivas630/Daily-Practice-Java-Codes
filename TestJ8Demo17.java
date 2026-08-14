package com.java8features;

import java.sql.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student {
	String name;
	double marks;

	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class TestJ8Demo17 {

	public static void main(String[] args) {

		Student s1 = new Student("Lokesh", 95);
		Student s2 = new Student("Vinay", 85);
		Student s3 = new Student("Swamy", 75);
		Student s4 = new Student("Sai Teja", 100);
		Student s5 = new Student("Parmodh", 70);
		Student s6 = new Student("Srikanth", 55);

		Student[] student = { s1, s2, s3, s4, s5, s6 };

		Function<Student, String> f1 = (st) -> {
			String grade = "";
			if (st.marks >= 100 || st.marks < 0) {
				grade = null;

			} else if (st.marks >= 90) {
				grade = "A";
			} else if (st.marks >= 80) {
				grade = "B";
			} else if (st.marks >= 70) {
				grade = "C";
			} else if (st.marks >= 60) {
				grade = "D";
			} else if (st.marks >= 35) {
				grade = "Just Pass";
			} else {
				grade = "failed";
			}

			return grade;

		};

		Supplier<Date> su = () -> new Date(0);

		Predicate<Double> p1 = m -> m >= 75;

		Consumer<Student> c1 = (s) -> {
			System.out.println(s.marks);
			System.out.println(s.marks);
			System.out.println(f1.apply(s));
			System.out.println(su.get());
			System.out.println("____________________________");

		};

		for (Student s : student) {
			if (p1.test(s.marks)) {
				c1.accept(s);

			}
		}

	}

}
