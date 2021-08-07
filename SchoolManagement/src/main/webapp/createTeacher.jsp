<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create new Teacher</h1>

<form action="CreateTeacher" method="post">

<label> Firstname </label>         
<input type="text" name="firstname" required/> <br> <br>  
<label> Lastname: </label>         
<input type="text" name="lastname" required/> <br> <br>  

<label> Mobile number </label>         
<input type="tel" name="mobile" pattern="[0-9]{10}" required/> <br> <br>   
   
<input type="submit" value="Add"/>
   

</form>
</body>
</html>