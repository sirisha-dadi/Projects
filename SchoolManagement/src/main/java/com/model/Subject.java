package com.model;

public class Subject {

	private int id;
	private String name;
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
