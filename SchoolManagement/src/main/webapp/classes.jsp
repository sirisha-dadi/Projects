<%@page import="com.model.Classes"%>
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
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Class Name</th>
      <th scope="col">Subjects</th>
      <th scope="col">Report</th>
     
      
    </tr>
  </thead>
  <tbody>
   <%
      int index=1;
      int id=0;
      List list=ServeUtility.getList(request);
      Iterator it=list.iterator();
      while(it.hasNext()){
      Classes classes=(Classes)it.next();
      id=classes.getClassId();
      
      
      
  %>
    <tr>
      <th scope="row"><%=index++ %></th>
      <td><%=classes.getName()%></td>
     
      <td>
      <form  method="post" action="viewSubjects">
       
       <input type="hidden" name="id" value=<%= id %>>
       <input type="submit" value="View Subjects" />
     
       </form>
      
      </td>
      <td>
      <form  method="post" action="classReport.jsp">
       <input type="hidden" name="id" value=<%= id %>>
       <input type="submit" value="Class Report" />
       </form>
      
      
      </td>
     
    </tr>
<%} %>
  </tbody>
</table>
</body>
</html>