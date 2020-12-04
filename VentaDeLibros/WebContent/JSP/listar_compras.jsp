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
	
	<table>
	<tr>
		<td><strong>Id</strong></td>
		<td><strong>Titulo</strong></td>
		<td><strong>Autor</strong></td>
		<td><strong>Cantidad</strong></td>
		<td><strong>Subtotal</strong></td>
		<td><strong>Total</strong></td>
	</tr>
	
	<% 
		List<CompraCabecera> lista_C = (List<CompraCabecera>) request.getAttribute("compras");
	
		for(int i = 0; i < lista_C.size(); i++) {
			
			out.println("<tr><td>" + lista_C.get(i).getId());
			
			for(int j = 0; j < lista_C.get(i).getDetalles().size(); j++){
				
				if(lista_C.get(i).getDetalles().get(j).getDigital() == null){
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getFisico().getTitulo() + "</td>");
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getFisico().getAurotes().get(0).getAlias() + "</td>");
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getCantidad() + "</td>");
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getSubtotal() + "</td>");
				}else{
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getDigital().getTitulo() + "</td>");
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getDigital().getAurotes().get(0).getAlias() + "</td>");
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getCantidad() + "</td>");
					out.println("<td>" + lista_C.get(i).getDetalles().get(j).getSubtotal() + "</td>");
				}
			}
					
			out.println("<td>" + lista_C.get(i).getTotal() + "</td></tr>");
		}
			
	%>
	
	</table>
</body>
</html>