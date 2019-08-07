<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="resource/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<table>
	<tr>
		<td>学生编号</td>
		<td>学生姓名</td>
		<td>学生性别</td>
		<td>学生年龄</td>
	</tr>
	<c:forEach items="${list}" var="l">
		<tr>
			<td>${l.id}</td>
			<td>${l.name}</td>
			<td>${l.sex}</td>
			<td>${l.age}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
