<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Formating Tag Library</h1>
	<% Date today=new Date();
	request.setAttribute("today",today);

	%>
	<h1>
	<c:out value="${today }"></c:out><br>
	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd"></fmt:formatDate>
	</h1>
	
	<h1>
	<c:out value="Today's date is: ${today }"></c:out>
	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd"></fmt:formatDate><br>
	<fmt:formatDate value="${today }" pattern="dd-MM-yy"></fmt:formatDate><br>
	</h1>
	
	<h1>
	Currency:-
	<c:set var="amount" value="1234.5"></c:set>
	<fmt:formatNumber value="${amount }" type="currency"></fmt:formatNumber>
	<fmt:setLocale value="value = "en_IN></fmt:setLocale>
	<fmt:formatNumber value="${amount }" type="currency"></fmt:formatNumber>
	</h1>
	

</body>
</html>