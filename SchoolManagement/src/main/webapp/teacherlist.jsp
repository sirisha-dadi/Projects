<%@page import="com.model.Teacher"%>
<%@page import="java.util.Iterator"%>
<%@page import="Utility.ServeUtility"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="css/dashboardcss.css" rel="stylesheet" type="text/css">
</head>
<body>

<form method="post" action="createTeacher.jsp">

 <input type="submit" value="Add Teacher"><br><br>
</form>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Mobile</th>
    </tr>
  </thead>
  <tbody>
   <%
      int index=1;
      List list=ServeUtility.getList(request);
      Iterator it=list.iterator();
      while(it.hasNext()){
      Teacher teacher=(Teacher)it.next();
      
  %>
    <tr>
      <th scope="row"><%=index++ %></th>
      <td><%=teacher.getFirstName()%></td>
     
      <td><%=teacher.getLastName()%></td>
      <td><%= teacher.getMobile() %></td>
    </tr>
<%} %>
  </tbody>
</table>
</body>
</html>