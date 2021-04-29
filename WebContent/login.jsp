<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/LoginServlet/LoginServlet" method="post">
		Usuario: <input type="text" name="usuario"><br>
		Contraseña: <input type="password" name="password"><br><br> 
		<input type="submit" value="Enviar">
	</form>

</body>
</html>