<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Bienvenido <%=request.getSession().getAttribute("usuario") %></h1>
	
	<form action="/LoginServlet/CalculadoraServlet" method="post">
		numero 1 <input name="Numero 1" type="text"/>
		<select name="operador">
			<option value="+"> + </option>
			<option value="-"> - </option>
			<option value="*"> * </option>
			<option value="/"> / </option>
		</select><br>
		numero 2 <input name="Numero 2" type="text"/><br>
		<input type="submit" value="CALCULAR"/>
	</form>
	
	<a href="/LoginServlet/CerrarSesionServlet">Cerrar Sesion</a>

</body>
</html>