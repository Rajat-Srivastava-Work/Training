<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form>
		<label>First Number:</label>
		<input type="text" name="num1">
		<label>Second Number:</label>
		<input type="text" name="num2">
		<button value="add">Add</button>
		<button value="sub">Sub</button>
		<button value="mul">Mul</button>
		<button value="div">Div</button>
		
	</form>
	<c:set var="op" value="+"></c:set>
	<c:set var="num1" value="45"></c:set>
	<c:set var="num2" value="35"></c:set>
	<c:choose>
		<c:when test="${param.op=='+' }">
			<c:out value="${num1+num2 }"></c:out>
		</c:when>
		<c:when test="${param.op=='-' }">
			<c:out value="${num1-num2 }"></c:out>
		</c:when>
		<c:when test="${param.op=='*' }">
			<c:out value="${num1*num2 }"></c:out>
		</c:when>
		<c:when test="${param.op=='/' }">
			<c:out value="${num1/num2 }"></c:out>
		</c:when>
	</c:choose>

</body>
</html>