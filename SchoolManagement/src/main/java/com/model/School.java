package com.model;

import java.util.List;

public class School {
	
	private List<Student> students;
	
	private List<Teacher> teachers;
	private List<Classes> classes;
	private List<Subject> subjects;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(List<Student> students, List<Teacher> teachers, List<Classes> classes, List<Subject> subject) {
		super();
		this.students = students;
		this.teachers = teachers;
		this.classes = classes;
		this.subjects = subject;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	//adding student
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	// adding teacher
	
	public void addTeacher(Teacher teacher )
	{
		teachers.add(teacher);
	}
	
	//add subject
	
	public void addSubject(Subject subject)
	{
		subjects.add(subject);
	}
	
	// add class
	
	public void addClasses(Classes classes1)
	{
		classes.add(classes1);
	}
	
	
	

}
