<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="SignUpServlet" method="post">
        <label>UserName:</label>
        <input type="text" name="uname"><br>
        
        <label>Password:</label>
        <input type="password" name="pwd"><br>
        
        <label>E-mail:</label>
        <input type="email" name="mail"><br>
        
        <label>Mobile No:</label>
        <input type="tel" name="mobNo"><br>
        
        
        <button>Sign Up</button>
    </form>

</body>
</html>