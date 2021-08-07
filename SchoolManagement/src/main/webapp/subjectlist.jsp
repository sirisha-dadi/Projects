<%@page import="com.model.Subject"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Utility.ServeUtility"%>
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

<form method="get" action="createSubject.jsp">

 <input type="submit" value="Add Subject"><br><br>
</form>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">SubID</th>
      <th scope="col">Name</th>
    </tr>
  </thead>
  <tbody>
   <%
      int index=1;
      List list=ServeUtility.getList(request);
      Iterator it=list.iterator();
      while(it.hasNext()){
      Subject sub=(Subject)it.next();
      
  %>
    <tr>
      <th scope="row"><%=index++ %></th>
      <td><%=sub.getId()%></td>
     
      <td><%=sub.getName()%></td>
      
    </tr>
<%} %>
  </tbody>
</table>
</body>
</html>