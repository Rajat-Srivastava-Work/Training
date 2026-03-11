<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
	<%
		String email=(String)session.getAttribute("email");
		if(email==null){
			response.sendRedirect("login.jsp");
			return;
		}
	%>
	<div>
		<h1>
			<%="Welcome "+email %>
			Session Id=<%=session.getId() %>
			Session CreationTime=<%= new java.util.Date(session.getCreationTime()) %>
			Session Last Accessed Time: <%= new java.util.Date(session.getLastAccessedTime()) %>
		</h1>
	</div>
	<div>
		<a href="logout.jsp" class="btn btn-success">Logout</a>
	</div>



</body>
</html>