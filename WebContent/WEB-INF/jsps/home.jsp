<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link rel="stylesheet" href="${pageContext.request.contextPath}/static/main.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap.min.css">
 
 
 
<title>Spring Mvc</title>


</head>


<body>

	<nav class="navbar navbar-inverse">
 
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#"> LogOut</a></li>
         </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/createOffer"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>





	<center>
		<h1>List of User</h1>
	</center>


	
	<center>
		<table id="customers"">
			<tr>
				<th>SN</th>
				<th>FullName</th>
				<th>UserName</th>
				<th>Password</th>
				<th>Action</th>
			</tr>
			<tr>


				<c:forEach var="row" items="${offers}">
					  <td> ${row.id}<br/></td>
					<td>${row.fullname}<br /></td>
					<td>${row.username}<br /></td>
					<td>${row.password}<br /></td>

					<td>
		<button type="button" class="btn btn-secondary">
			<a style="color: black;" href="editOffer?id=${row.id}">Edit</a>
		</button> 
		<button type="button" class="btn btn-danger">
			<a style="color: black;" onclick="return confirm('Are you sure you want to delete this user?')"
			href="deleteOffer?id=${row.id}">Remove</a>
		</button>
	</td>
			</tr>
			</c:forEach>
		</table>
	</center>

</body>
</html>