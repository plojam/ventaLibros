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
	<form action="FormularioClientes.jsp" method="post">
        <input type="submit" value="Registrarse como cliente" >
    </form> <br>

	<form action="credito.jsp" method="post">
        <input type="submit" value="Agregar credito a un cliente" >
    </form> <br>
    
    <form action="/VentaDeLibros/CrearCompra" method="post">
    	<input type='hidden' name='op' value='1' />
        <input type="submit" value="Crear Pedido" >
    </form> <br>
    
    <form action="listar_compras.jsp" method="post">
        <input type="submit" value="Ver Compras" >
    </form> <br>

	<form action="/VentaDeLibros/verDatos" method="post">
        <input type="submit" value="Ver datos" >
    </form> <br>
</body>
</html>