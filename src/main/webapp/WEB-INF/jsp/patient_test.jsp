<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient </title>
</head>
<body>
	<form action="signup/patient" method="post">  
    name:<input type="text" name="name"/>
    <br/><br/>  
    address:<input type="text" name="address"/>
    <br/><br/> 
    email:<input type="text" name="email"/>
    <br/><br/> 
    mobile:<input type="number" name="mobile"/>
    <br/><br/> 
    password:<input type="password" name="password"/>
    <br/><br/>  
    <input type="submit" value="signup"/>  
    </form> 
</body>
</html>