<%@page import="com.model.sub_tea"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="Utility.ServeUtility"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.model.Student"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
    
    
  <form action="StudentsByClass" method="post">
  <input type="hidden" name="id" value=<%=request.getParameter("id") %>>
  <input type="submit" value="Students">
  
  </form>
    
    <form action="viewSubjects" method="post">
    
    <input type="hidden" name="id" value=<%=request.getParameter("id") %>>
    <input type="submit" value="Subjects">
    
    </form>
</div>

</body>
</html>