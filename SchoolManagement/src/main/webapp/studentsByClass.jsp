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
<title>Insert title here</title>
<link href="css/dashboardcss.css" rel="stylesheet" type="text/css">
</head>
<body>
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