<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	    String username=request.getParameter("uname");
 		if(username!=null && username.equals("rajat"))
 			response.sendRedirect("success.jsp?uname=" +username);
 		else
 			response.sendRedirect("error.jsp");
	%>

</body>
</html>