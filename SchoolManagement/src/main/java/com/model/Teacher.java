package com.model;

public class Teacher {
private int tid;
private String firstName;
private String lastName;
private long mobile;

public Teacher() {
	
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public Teacher(int tid, String firstName, String lastName, long mobile) {
	super();
	this.tid = tid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobile = mobile;
}


	
}
