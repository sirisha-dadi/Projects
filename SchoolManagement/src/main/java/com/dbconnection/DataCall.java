package com.dbconnection;

import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.Classes;
import com.model.Student;
import com.model.Subject;
import com.model.Teacher;
import com.model.sub_tea;

public class DataCall {
	public static List getlist()
	{
		ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement students= Validate.con.prepareStatement("select * from student");
			ResultSet rs=students.executeQuery();
			while (rs.next()) {
			    Student student=new Student();
			    student.setId(rs.getInt("stu_id"));
			    student.setFirstName(rs.getString("first_name"));
			    student.setLastname(rs.getString("last_name"));
			    student.setDob(rs.getDate("dob"));
			    
			    list.add(student);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static List getAllTeachers()
	{
		ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement students= Validate.con.prepareStatement("select * from teacher");
			ResultSet rs=students.executeQuery();
			while (rs.next()) {
			    Teacher teacher=new Teacher();
			    teacher.setTid(rs.getInt("tid"));
			    teacher.setFirstName(rs.getString("first_name"));
			    teacher.setLastName(rs.getString("last_name"));
			    teacher.setMobile(rs.getLong("mobile"));
			    
			    list.add(teacher);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static List getAllSubjects()
	{
		ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement subjects= Validate.con.prepareStatement("select * from subject");
			ResultSet rs=subjects.executeQuery();
			while (rs.next()) {
			    Subject sub=new Subject();
			    sub.setId(rs.getInt("sub_id"));
			    sub.setName(rs.getString("name"));
			
			    
			    list.add(sub);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static List getAllClasses()
	{
		ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement cla= Validate.con.prepareStatement("select * from classes");
			ResultSet rs=cla.executeQuery();
			while (rs.next()) {
			    Classes classes=new Classes();
			    classes.setClassId(rs.getInt("class_id"));
			    classes.setName(rs.getString("name"));
			
			    
			    list.add(classes);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static List viewSubjects(int id)
	{
ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement cla= Validate.con.prepareStatement("select s.name,t.first_name,t.last_name from subject s inner join class_sub_tea csb on csb.sub_id=s.sub_id inner join teacher t on t.tid=csb.tid where csb.classid="+id);
			ResultSet rs=cla.executeQuery();
			while (rs.next()) {
			    sub_tea st=new sub_tea();
			    
			    st.setName(rs.getString("s.name"));
			    st.setFirstName(rs.getString("t.first_name"));
			    st.setLastName(rs.getString("t.last_name"));
			
			    
			    list.add(st);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static void addSubTea(int classid,int sid,int tid)
	{
    
		
		
		try {
			
			 
			PreparedStatement cla= Validate.con.prepareStatement("insert into class_sub_tea (classid,sub_id,tid) values(?,?,?)");
			cla.setInt(1, classid);
			cla.setInt(2, sid);
			cla.setInt(3, tid);
			cla.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static List getClassSubjects(int classid)
	{
		ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement subjects= Validate.con.prepareStatement("select sub_id,name from subject where sub_id not in (select s.sub_id from subject s inner join class_sub_tea cbt on s.sub_id=cbt.sub_id where cbt.classid ="+classid +")");
			ResultSet rs=subjects.executeQuery();
			while (rs.next()) {
			    Subject sub=new Subject();
			    sub.setId(rs.getInt("sub_id"));
			    sub.setName(rs.getString("name"));
			
			    
			    list.add(sub);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static List getStudentsByClass(int classid)
	{
		ArrayList list=new ArrayList();
		
		
		try {
			
			 
			PreparedStatement subjects= Validate.con.prepareStatement("select s.stu_id,s.first_name,s.last_name,s.dob from student s inner join student_class sc on s.stu_id=sc.sid where sc.classid=" +classid);
			ResultSet rs=subjects.executeQuery();
			while (rs.next()) {
			    Student student=new Student();
			    student.setId(rs.getInt("s.stu_id"));
			    student.setFirstName(rs.getString("s.first_name"));
			    student.setLastname(rs.getString("s.last_name"));
			    student.setDob(rs.getDate("s.dob"));
			
			    
			    list.add(student);
			    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public static int addStudent(String firstName,String lastName,Date date,int classid)
	{
    
		DateFormat dateFormatYMD = new SimpleDateFormat("yyyy/MM/dd");
		 
		 String vDateYMD = dateFormatYMD.format(date);
		 java.sql.Date date1 = new java.sql.Date(0000-00-00);
		 int sid=0;
		
		try {
			
			
			PreparedStatement cla= Validate.con.prepareStatement("insert into student (first_name,last_name,dob) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
			cla.setString(1, firstName);
			cla.setString(2, lastName);
			cla.setDate(3, date1);
			cla.executeUpdate();
			//PreparedStatement stmt=Validate.con.prepareStatement("select stu_id from student where first_name=" +firstName +"and last_name=" +lastName) ;
			ResultSet rs=cla.getGeneratedKeys();
			if(rs.next())
			{
				sid=rs.getInt(1);
			}
			
			PreparedStatement add= Validate.con.prepareStatement("insert into student_class (classid,sid) values(?,?)");
			add.setInt(1, classid);
			add.setInt(2, sid);
			add.executeUpdate();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return sid;
		
	}
	
	public static void addTeacher(String firstName,String lastName,long mobile)
	{
    
		
		
		
		try {
			
			PreparedStatement add= Validate.con.prepareStatement("insert into teacher (first_name,last_name,mobile) values(?,?,?)");
			add.setString(1, firstName);
			add.setString(2, lastName);
			add.setLong(3, mobile);
			add.executeUpdate();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void insertSubject(String name)
	{
    
		
		
		
		try {
			
			PreparedStatement add= Validate.con.prepareStatement("insert into subject (name) values(?)");
			add.setString(1, name);
			add.executeUpdate();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
