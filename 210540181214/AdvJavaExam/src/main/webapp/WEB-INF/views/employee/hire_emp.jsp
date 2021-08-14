<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="employee">
		<table border="1">
		<tr ><th colspan="2" align="center" style="background-color:#2c92f2">Hire new employee</th></tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>Date of birth</td>
				<td><form:input type="date" path="dob" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Hire Employee"/></td>		
			</tr>
		</table>
	</form:form>
</body>
</html>