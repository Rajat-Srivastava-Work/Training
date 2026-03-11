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
<body class="bg-dark d-flex justify-content-center align-items-center vh-100">
	<div class="card shadow-lg p-4" style="width:400px">
		<h3 class="text-center mb-4 text-primary">Login Form</h3>
		<form action="login" method="post">
			<div class="mb-3">
				<label class="form-label">Username:</label>
				<input type="text" name="username" class="form-control"><br>
			</div>
			<div class="mb-3">
				<label class="form-label">Password:</label>
				<input type="password" name="password" class="form-control"><br>
			</div>
			<div class="d-grid">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>