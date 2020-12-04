<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
<script src="/VentaDeLibros/src/ec/edu/ups/controlador/menu.js"></script>
</head>
<body>

<h1>Menu simple de Biblioteca</h1>


	<form action="crearCliente" method="post">
        <input type="submit" value="Registrarse como cliente" >
    </form> <br>
    
    <form action="agregarCredito" method="post">
        <input type="submit" value="Agregar credito a un cliente" >
    </form> <br>


</body>
</html>