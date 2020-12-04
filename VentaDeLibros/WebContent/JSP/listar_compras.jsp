<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.io.PrintWriter"%>
<%@page import="ec.edu.ups.modelo.CompraCabecera"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Listar compras</title>
</head>
<body>
	
	<form action="/VentaDeLibros/listarCompra" method="post">
		<label for="cedula">Cedula: </label>
		<input type="text" name="cedula">
		
		<input type="submit" value="Listar Compras">
	</form>
	
	<% 
		List<CompraCabecera> lista_C = (List<CompraCabecera>) request.getAttribute("compras");
	
		for(int i = 0; i < lista_C.size(); i++) {
			
			out.println("<tr><td>" + lista_C.get(i).getId());
			
			for(int j = 0; j < lista_C.get(i).getDetalles().size(); j++){
				out.println("<tr><td>" + lista_C.get(i).getDetalles().get(j).);	
			}
			
	%>
	
</body>
</html>