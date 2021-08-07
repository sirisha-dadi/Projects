<%@page import="com.model.Teacher"%>
<%@page import="com.model.Subject"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
<h1>Add subjects and assign teachers</h1>
<form action="AddSubTea" method="post">

<%
int classid=Integer.parseInt((String)request.getParameter("classid"));
%>
<input type="hidden" name="classid" value=<%=classid %> class="field left" readonly>
<br>

<label style="margin-right :200px;">Subject name</label>
  <select class="form-control" name="subject" style="width : 250px;">
     <option value="-1">Select subject</option>
     <%
     List list=new ArrayList();
     list=DataCall.getClassSubjects(classid);
     
     Iterator it=list.iterator();
     while(it.hasNext()){
     Subject sub=(Subject)it.next();
     
    %>
    
    <option value="<%=sub.getId()%>" ><%=sub.getName() %></option>
   
     
<%} %>
     
    
   </select></br>
   
   <label style="margin-right :200px;">Teacher</label>
  <select class="form-control" name="teacher"style="width : 250px;">
     <option value="-1">Select Teacher</option>
     <%
     List listteacher=new ArrayList();
     listteacher=DataCall.getAllTeachers();
     
     Iterator ite=listteacher.iterator();
     while(ite.hasNext()){
     Teacher tea=(Teacher)ite.next();
     
    %>
    
    <option value="<%=tea.getTid()%>" ><%=tea.getFirstName() +" " +tea.getLastName() %></option>
   
     
<%} %>
     
    
   </select></br>
   
   <input type="submit" value="Add"/>
   

</form>

</body>
</html>