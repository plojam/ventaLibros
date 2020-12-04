<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/VentaDeLibros/agregarCredito" method="post">
		<label>Ingrese la cedula del cliente: </label>
		<input type="text" name="cedula" value="jelp">
		<br>
		<label>Ingrese la cantidad de creditos que desea agregar: </label>
		<input type="text" name="creditos">
        <input type="submit" value="Agregar credito a un cliente" >
    </form> <br>

</body>
</html>