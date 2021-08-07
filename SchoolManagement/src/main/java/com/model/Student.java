package com.model;

import java.util.Date;



public class Student {
	
	
	private int id;
	private String firstName;
	private String lastname;
	private Date dob;
	public Student() {
		
	}
	public Student(int id, String firstName, String lastname, Date dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
