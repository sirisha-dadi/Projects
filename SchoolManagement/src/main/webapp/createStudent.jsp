<%@page import="java.util.List"%>
<%@page import="com.model.Classes"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.dbconnection.DataCall"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create new Student</h1>

<form action="CreateStudent" method="post">

<label> Firstname </label>         
<input type="text" name="firstname" required/> <br> <br>  
<label> Lastname: </label>         
<input type="text" name="lastname" required/> <br> <br>  

<label> Date of Birth </label>         
<input type="date" name="dob" required/> <br> <br> 
<label>Class</label>
<select class="form-control" name="classes">
     <option value="-1">Select class</option>
     <%
     List classes=new ArrayList();
     classes=DataCall.getAllClasses();
     
     Iterator ite=classes.iterator();
     while(ite.hasNext()){
     Classes cla=(Classes)ite.next();
     
    %>
    
    <option value="<%=cla.getClassId()%>" ><%=cla.getName()%></option>
   
     
<%} %>
     
    
   </select></br>
   
   <input type="submit" value="Add"/>
   

</form>
</body>
</html>