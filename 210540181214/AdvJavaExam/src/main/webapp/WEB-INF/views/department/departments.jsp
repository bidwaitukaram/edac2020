<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>${requestScope.message}</h4>
	<table border="1 px solid black">
		<tr>
			<th>DeptName</th>
			<th>Location</th>
			<th>Strength</th>
		</tr>
		<c:forEach var="dept" items="${sessionScope.dept_details}">
		<tr>
			<td><a href="<spring:url value='/employee/hire_emp?deptName=${dept.deptName}'/>">${dept.deptName}</a></td>
			<td>${dept.location}</td>
			<td>${dept.strength}</td>
		</tr>
		</c:forEach>
	</table> 
</body>
</html>