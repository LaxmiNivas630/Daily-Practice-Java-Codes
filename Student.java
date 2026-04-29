package com.oops;

//DTO : Data Transfer Object
// POJO : Plain Old Java Object
// Model Object :Same like your Database table
public class Student {
	
	private int sid;
	private String sname;
	private long phone;
	
	void setSid(int sid){
		this.sid=sid;
	}
	
	int getSid() {
		return sid;
	}
	
	void setSname(String sname) {
		this.sname=sname;
	}
	
	String getSname() {
		return sname;
	}
	
	void setPhone(Long phone) {
		this.phone=phone;
	}
	
	Long getPhone() {
		return phone;
	}

}
