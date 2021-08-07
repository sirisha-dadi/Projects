<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.model.Student"%>
<%@page import="java.util.Iterator"%>
<%@page import="Utility.ServeUtility"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="css/dashboardcss.css" rel="stylesheet" type="text/css">
</head>
<body>

<div>
<form method="post" action="createStudent.jsp">

 <input type="submit" value="Add students"><br><br>
</form>
</div>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Roll no</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Date of Birth</th>
      
    </tr>
  </thead>
  <tbody>
   <%
      int index=1;
      List list=ServeUtility.getList(request);
      Iterator it=list.iterator();
      while(it.hasNext()){
      Student student=(Student)it.next();
      DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
      String formattedDate =null;
  %>
    <tr>
      <th scope="row"><%=index++ %></th>
      <th><%=student.getId()%></th>
      <td><%=student.getFirstName()%></td>
     
      <td><%=student.getLastname()%></td>
      <td><%= df.format(student.getDob()) %></td>
      
    </tr>
<%} %>
  </tbody>
</table>
</body>
</html>