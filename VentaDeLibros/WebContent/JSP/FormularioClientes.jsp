<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<FORM action="">

<label for="nombre">Nombre: </label>
<input type="text" id="nombre" name="nombre" placeholder="Ingrese su correo" /> <BR />
<label for="apellido">Apellido: </label>
<input type="text" id="apellido" name="apellido" placeholder="Ingrese su correo" /><BR />
<label for="cedula">Cedula: </label>
<input type="text" id="cedula" name="cedula" placeholder="Ingrese su correo" />
<label for="direcion">Direccion: </label>
<input type="text" id="direcion" name="direcion" placeholder="Ingrese su correo" /><BR />
<label for="id">ID: </label>
<input type="text" id="id" name="id" placeholder="Ingrese su correo" />
<label for="credito">Credito inicial: </label>
<input type="text" id="credito" name="credito" placeholder="Ingrese su correo" /><BR />

<input id="crear" type="submit" value="Registrar Cliente">

</FORM>



</body>
</html>