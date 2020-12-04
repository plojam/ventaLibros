<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="ec.edu.ups.modelo.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Menu simple de Biblioteca</h1>
<%  Empresa sta = (Empresa) request.getAttribute("Emp");   %>

	
	<form action="crearCliente" method="post">
        <input type="submit" value="Registrarse como cliente" >
    </form> <br>

	<form action="agregarCredito" method="post">
        <input type="submit" value="Agregar credito a un cliente" >
    </form> <br>
    
	<% Empresa empresa = (Empresa) request.getAttribute("empresa"); %>
	<section id="tablaFisico">
		<h1>Libros Fisicos</h1>
		<table>
			<tr>
		        <th class='tg-46ru'>ID</th>
		        <th class='tg-46ru'>Titulo</th>
		        <th class='tg-46ru'>Autores</th>
		        <th class='tg-46ru'>Edicion</th>
		        <th class='tg-46ru'>Precio</th>
		        <th class='tg-46ru'>Cantidad</th>
		        <th class='tg-46ru'></th>
		    </tr>
			<% for(Fisico fis:empresa.getListFisico()){
   					out.println("<tr><td>"+fis.getId()+"</td><td>"+fis.getTitulo()+"</td><td>"+fis.getAurotes().get(0).getAlias()+
   							"</td><td>"+fis.getEdicion()+"</td><td>"+fis.getPrecio()+"</td><td><td class='tg-y698'>"+
   							"</td><td><input type='text'></td><td><input type='button' value='Pedir' onclick='recogerDat(this)'></td>");	
	   		   }
	   		%>
		</table>
    </section>
    
    <section id="tablaDigital">
		<h1>Libros Digitales</h1>
		<table>
			<tr>
		        <th class='tg-46ru'>ID</th>
		        <th class='tg-46ru'>Titulo</th>
		        <th class='tg-46ru'>Autores</th>
		        <th class='tg-46ru'>Edicion</th>
		        <th class='tg-46ru'>Precio</th>
		        <th class='tg-46ru'>Cantidad</th>
		        <th class='tg-46ru'></th>
		    </tr>
			<% for(Digital digi:empresa.getListDigital()){
   					out.println("<tr><td>"+digi.getId()+"</td><td>"+digi.getTitulo()+"</td><td>"+digi.getAurotes().get(0).getAlias()+
   							"</td><td>"+digi.getEdicion()+"</td><td>"+digi.getPrecio()+"</td><td><td class='tg-y698'>"+
   							"</td><td><input type='text'></td><td><input type='button' value='Pedir' onclick='recogerDat(this)'></td>");	
	   		   }
	   		%>
		</table>
    </section>
</body>
</html>