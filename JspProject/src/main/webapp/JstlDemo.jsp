<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<anyxmlelement xmlns:c="http://java.sun.com/jsp/jstl/core" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>JSTL Demo</h2>
	<c:out value="Hello Rajat"></c:out>
	
	<c:set var="myname" value="swapna"></c:set>
	<h1>
		<c:out value="${myname }"></c:out>
	</h1>

</body>
</html>