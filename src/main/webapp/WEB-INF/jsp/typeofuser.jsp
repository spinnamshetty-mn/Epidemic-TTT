<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <form action="signup" method="post">  
     <label for="category">Choose your category:</label>
    <select name="category" id="Type">
    <option value="Patient">Patient</option>
    <option value="Health Worker">Health Worker</option>
    <option value="Government">Government</option>
  </select><br/><br/> 
    <input type="submit" value="Next"/>  
   
    </form>  
</body>
</html>