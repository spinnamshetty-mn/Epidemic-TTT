<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />" >
  <link href="<c:url value="/resources/css/pdash.css" />" rel="stylesheet"> 
  <script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js" />" ></script>
  <script src="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" />" ></script>
  <link href="<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" />" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
</head>
<body>
	 <%
 	 String name=(String)request.getAttribute("name");
	 String address=(String)request.getAttribute("address");
	 int id=(Integer)request.getAttribute("id");
	 
 			%>
<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>Dashboard</h4>
      <ul class="nav nav-pills nav-stacked">
        <li class="active">
        <a href="p_home"><i class="fa fa-home" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Home</span></a></li>
         <li><a href="test_request"><i class="fa fa-calendar" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Request Test</span></a></li>
         <li><a href="results"><i class="fa fa-bar-chart" aria-hidden="true"></i><span class="hidden-xs hidden-sm">View Results</span></a></li>
         <li><a href="update"><i class="fa fa-user" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Update Health Status</span></a></li>
         <li><a href="recommendations"><i class="fa fa-tasks" aria-hidden="true"></i><span class="hidden-xs hidden-sm">View Recommendations</span></a></li>
         <li><a href="settings"><i class="fa fa-cog" aria-hidden="true"></i><span class="hidden-xs hidden-sm">Settings</span></a></li>
      </ul><br>
    </div>

    <div class="col-sm-9">
    <div class="top">
      <table id="head">
      <tr>
      <td><h1><small>HELLO ${name}</small></h1></td>
      <td>
      <button onclick="location.href = 'results';" id="logout" style="float:right;" >Logout</button>
      </td>
      </tr>
      </table>
     </div>
      <hr>
      <div class="table">
      	<table id="body">
    <tr>
        <td><b>Patient Id:</b> ${id} </td>
        <td><b>Location:</b> ${address}</td>
    </tr>
    <tr class ="blank_row"></tr>
    <tr class ="blank_row"></tr>
    <tr class ="blank_row"></tr>
    <tr class ="blank_row"></tr>
    <tr>
        <td><b>Current health Status:</b> for later</td>
        <td><b>Current Recommendations:</b> for later</td>
    </tr>
    <tr class ="blank_row"></tr>
    <tr class ="blank_row"></tr>
    <tr class ="blank_row"></tr>
    <tr class ="blank_row"></tr>
    <tr>
        <td><b>Present Health Worker</b> for later</td>
        <td><b>Last Tested on :</b> for later </td>
    </tr>
</table>
      </div>
    </div>
  </div>
</div>

</body>
</html>
    