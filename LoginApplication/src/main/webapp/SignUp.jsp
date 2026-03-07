<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body class="bg-dark d-flex justify-content-center align-items-center vh-100">

    <div class="card shadow-lg p-4 " style="width: 350px;">
        <form action="SignUpServlet" method="post">
        <label  class="form-label">UserName:</label>
        <input type="text" name="uname"><br>
        
        <label  class="form-label">Password:</label>
        <input type="password" name="pwd"><br>
        
        <label  class="form-label">E-mail:</label>
        <input type="email" name="mail"><br>
        
        <label  class="form-label">Mobile No:</label>
        <input type="tel" name="mobNo"><br>
        
        
        <div class="d-grid">
                <button class="btn btn-primary">Sign Up</button>
        </div>
    </form>
    </div>


</body>
</html>