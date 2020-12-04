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
	
	<form action="/VentaDeLibros/listarCompras" method="post">
		<label for="cedula">Cedula: </label>
		<input type="text" name="cedula">
		
		<input type="submit" value="Listar Compras">
	</form>
	
	
	
	
	<% 
		List<CompraCabecera> lista_C = (List<CompraCabecera>) request.getAttribute("compras");
		
		if(lista_C != null){
			for(int i = 0; i < lista_C.size(); i++) {
				
				out.println("<h1>Pedidos</h1>");
				out.println("<p>------------------------------------------------------------------------------------------</p>");
				
				out.println("<table><tr>"
							+"<td><strong>Id</strong></td>"
							+"<td><strong>Total</strong></td>"
							+"</tr>");
				
				
				out.println("<tr><td>" + lista_C.get(i).getId()
							+"</td><td>"+lista_C.get(i).getTotal()
							+"</td></table>");
				
				out.println("<table><tr>"
						+"<td><strong>Id</strong></td>"
						+"<td><strong>Tipo</strong></td>"
						+"<td><strong>Libro</strong></td>"
						+"<td><strong>Cantidad</strong></td>"
						+"<td><strong>Subtotal</strong></td>"
						+"</tr>");
				
				for(int j = 0; j < lista_C.get(i).getDetalles().size(); j++){
					
					if(lista_C.get(i).getDetalles().get(j).getDigital() == null){
						out.println("<tr><td>" + lista_C.get(i).getDetalles().get(j).getId()
								+"</td><td>Fisico"
								+"</td><td>"+lista_C.get(i).getDetalles().get(j).getFisico().getTitulo()
								+"</td><td>"+lista_C.get(i).getDetalles().get(j).getCantidad()
								+"</td><td>"+lista_C.get(i).getDetalles().get(j).getSubtotal()
								+"</td>");
					}else{
						out.println("<tr><td>" + lista_C.get(i).getDetalles().get(j).getId()
								+"</td><td>Fisico"
								+"</td><td>"+lista_C.get(i).getDetalles().get(j).getDigital().getTitulo()
								+"</td><td>"+lista_C.get(i).getDetalles().get(j).getCantidad()
								+"</td><td>"+lista_C.get(i).getDetalles().get(j).getSubtotal()
								+"</td>");
					}
				}
						
				out.println("</table>");
			}
		}
			
	%>
	
	
</body>
</html>