<%@page import="java.util.ArrayList"%>
<%@page import="Utility.ServeUtility"%>
<%@page import="com.model.sub_tea"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/dashboardcss.css" rel="stylesheet" type="text/css">
</head>
<body>

<div>
<form method="post" action="registerform.jsp">
<input type="hidden" name="classid" value=<%=request.getAttribute("classid") %>>
 <input type="submit" value="Add subjects">
</form>
</div>

<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">SNo</th>
      <th scope="col">Subject Name</th>
      <th scope="col">Teacher Name</th>
     
    </tr>
  </thead>
  <tbody>
   <%
      int index=1;
      List list=ServeUtility.getList(request);
      Iterator it=list.iterator();
      ArrayList<String> sub=new ArrayList<>();
      while(it.hasNext()){
      sub_tea st=(sub_tea)it.next();
      
  %>
    <tr>
      <th scope="row"><%=index++ %></th>
      <th><%=st.getName()%></th>
      <td><%=st.getFirstName() + " " + st.getLastName()%></td>
      <%
      sub.add(st.getName());
      %>
    </tr>
<%} %>
  <% request.setAttribute("subjects", sub); %>
  </tbody>
</table>

</body>
</html>