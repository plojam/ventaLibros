<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@page import="java.io.PrintWriter"%>
<%@page import="ec.edu.ups.modelo.*"%>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
<script src="/VentaDeLibros/src/ec/edu/ups/controlador/menu.js"></script>
</head>
<body>
<h1>Menu simple de Biblioteca</h1>
<%  Empresa sta = (Empresa) request.getAttribute("Emp");   %>

	<%
		Empresa empresa= new Empresa();
		request.setAttribute("empresa", empresa);
	%>
	
	<form action="crearCliente" method="post">
        <input type="submit" value="Registrarse como cliente" >
    </form> <br>

	<form action="agregarCredito" method="post">
        <input type="submit" value="Agregar credito a un cliente" >
    </form> <br>
    
    <form action="ControladorGeneral" method="post">
    	<input type='hidden' name='op' value='1' />
        <input type="submit" value="Crear Pedido" >
    </form> <br>

	<% 
		for (int i=0;i<sta.getListCliente().size();i++){
			out.println("<p>"+sta.getListCliente().get(i)+"</p>");
			
		}
	%>
</body>
</html>