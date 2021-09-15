<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />" >
  <link href="<c:url value="/resources/css/pdash_new.css" />" rel="stylesheet"> 
  <script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js" />" ></script>
  <script src="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" />" ></script>
  <link href="<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" />" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>Dashboard</h4>
      <ul class="nav nav-pills nav-stacked">
        <li>
        <a href="hdash"><i class="fa fa-home" aria-hidden="true"></i><span class="hidden-xs hidden-sm"> Home</span></a></li>
         <li ><a href="find_request"><i class="fa fa-calendar" aria-hidden="true"></i><span class="hidden-xs hidden-sm"> Find Request</span></a></li>
         <li><a href="Upload_results"><i class="fa fa-upload" aria-hidden="true"></i><span class="hidden-xs hidden-sm"> Upload Results</span></a></li>
         <li><a href="status&recommend"><i class="fa fa-tasks" aria-hidden="true"></i><span class="hidden-xs hidden-sm"> Status and Recommendations</span></a></li>
         <li class="active"><a href="#"><i class="fa fa-cog" aria-hidden="true"></i><span class="hidden-xs hidden-sm"> Settings</span></a></li>
      </ul><br>
    </div>

    <div class="col-sm-9">
      <div class="top" >
      <table id="head">
      <tr>
      <td><h1><small>HELLO USER</small></h1></td>
      <td>
      <button onclick="location.href = 'results';" id="logout" style="float:right;" >Logout</button>
      </td>
      </tr>
      </table>
     </div>
      <hr>
    </div>
     <div class="container mt-5">
    <div class="row">
       
        <!-- Profile Settings-->
        <div class="col-lg-8 pb-5">
            <form class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-fn">Name</label>
                        <input class="form-control" type="text" id="account-fn" placeholder="Daniel" required="">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-ln">Organisation</label>
                        <input class="form-control" type="text" id="account-ln" placeholder="Adams" required="">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-email">E-mail Address</label>
                        <input class="form-control" type="email" id="account-email" value="daniel.adams@example.com" disabled="">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-phone">Phone Number</label>
                        <input class="form-control" type="text" id="account-phone" value="+7 (805) 348 95 72" required="">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-pass">Designation</label>
                        <input class="form-control" type="text" id="account-pass" disabled="">
                    </div>
                </div>
                 <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-confirm-pass">Old Password</label>
                        <input class="form-control" type="password" id="account-confirm-pass">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-confirm-pass">New Password</label>
                        <input class="form-control" type="password" id="account-confirm-pass">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="account-pass">Confirm Password</label>
                        <input class="form-control" type="password" id="account-pass">
                    </div>
                </div>
               
                <div class="col-12">
                    <hr class="mt-2 mb-3">
                    <div class="d-flex flex-wrap justify-content-between align-items-center">
                        
                        <button style="margin-top:12%; margin-left:45%; " class="btn btn-style-1 btn-primary" type="button" data-toast="" data-toast-position="topRight" data-toast-type="success" data-toast-icon="fe-icon-check-circle" data-toast-title="Success!" data-toast-message="Your profile updated successfuly.">Update Profile</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
  </div>
</div>
</body>
</html>