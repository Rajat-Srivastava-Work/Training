<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("Exception occured:" +exception+"<br>");
		out.println("Message:"+exception.getMessage()+"<br>");
		out.println("Exception class:"+exception.getClass()+"<br>");
		
		if(exception instanceof ArithmeticException){
			out.println("division by zero");
		} else if(exception instanceof NullPointerException) {
			out.println("Null pointer exception");
		} else if(exception instanceof ArrayIndexOutOfBoundsException){
			out.println("Index pointing out of array range");
		} else if(exception instanceof StringIndexOutOfBoundsException) {
			out.println("String index pointing out of length");
		} else {
			out.println("number format exception");
		}
	%>
</body>
</html>