<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/updateOffer"
		method="post">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" value="${offer.id}" name="id"
						 readonly="true"/></td>
			</tr>
			<tr>
				<td>FullName</td>
				<td><input type="text" name="fullname" value="${offer.fullname}" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" value="${offer.username}"  /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" value="${offer.password}"  /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Create" /></td>
			</tr>
		</table>
</body>
</html>