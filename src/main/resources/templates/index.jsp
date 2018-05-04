<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
	</head>
<body>
<h2>Hello World!</h2>
<table>
	<c:forEach items="${sessionScope.list}" var="stu">
		<tr>
			<td>${stu.studentNo}</td>
			<td>${stu.studentName}</td>
			<td>${stu.sex}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
