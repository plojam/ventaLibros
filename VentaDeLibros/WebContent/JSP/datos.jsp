<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%@page import="ec.edu.ups.modelo.Empresa"%>
	<%	Empresa empresa = (Empresa) request.getAttribute("empresa"); %>
	
	<section id="tablaAutores">
		<h1>Autores</h1>
		<table>
			<tr>
		        <th class='tg-46ru'>ID</th>
		        <th class='tg-46ru'>Nombre</th>
		        <th class='tg-46ru'>Apellido</th>
		        <th class='tg-46ru'>Alias</th>
		    </tr>
			<% for(int i=0; i<empresa.getListAutor().size(); i++){
   					out.println("<tr><td>"+empresa.getListAutor().get(i).getId()+"</td><td>"+empresa.getListAutor().get(i).getNombre()
   							+"</td><td>"+empresa.getListAutor().get(i).getApellido()+"</td><td>"+empresa.getListAutor().get(i).getAlias()
   							+"</td></tr>");	
	   		   }
	   		%>
		</table>
    </section>
    
    <section id="tablaLibros">
		<h1>Libros</h1>
		<table>
			<tr>
		        <th class='tg-46ru'>ID</th>
		        <th class='tg-46ru'>Titulo</th>
		        <th class='tg-46ru'>Autor</th>
		        <th class='tg-46ru'>Edicion</th>
		        <th class='tg-46ru'>Precio</th>
		        <th class='tg-46ru'>Precio Final</th>
		    </tr>
			<% for(int i=0; i<empresa.getListDigital().size(); i++){
   					out.println("<tr><td>"+empresa.getListDigital().get(i).getId()+"</td><td>"
						+empresa.getListDigital().get(i).getTitulo()+"</td><td>"+empresa.getListDigital().get(i).getAurotes().get(0).getAlias()
						+"</td><td>"+empresa.getListDigital().get(i).getEdicion()+"</td><td>"+empresa.getListDigital().get(i).getPrecio()
						+"</td><td>"+empresa.getListDigital().get(i).calcularPrecioFinal()+"</td></tr>");	
	   		   }
			
				for(int i=0; i<empresa.getListFisico().size(); i++){
					out.println("<tr><td>"+empresa.getListFisico().get(i).getId()+"</td><td>"
					+empresa.getListFisico().get(i).getTitulo()+"</td><td>"+empresa.getListFisico().get(i).getAurotes().get(0).getAlias()
					+"</td><td>"+empresa.getListFisico().get(i).getEdicion()+"</td><td>"+empresa.getListFisico().get(i).getPrecio()
					+"</td><td>"+empresa.getListFisico().get(i).calcularPrecioFinal()+"</td></tr>");	
   		   		}
	   		%>
		</table>
    </section>
	
	<section id="tablaClientes">
		<h1>Clientes</h1>
		<table>
			<tr>
		        <th class='tg-46ru'>ID</th>
		        <th class='tg-46ru'>Nombre</th>
		        <th class='tg-46ru'>Apellido</th>
		        <th class='tg-46ru'>Cedula</th>
		        <th class='tg-46ru'>Direccion</th>
		        <th class='tg-46ru'>Credito</th>
		    </tr>
			<% for(int i=0; i<empresa.getListCliente().size(); i++){
   					out.println("<tr><td>"+empresa.getListCliente().get(i).getId()+"</td><td>"+empresa.getListCliente().get(i).getNombre()
   							+"</td><td>"+empresa.getListCliente().get(i).getApellido()+"</td><td>"+empresa.getListCliente().get(i).getCedula()
   							+"</td><td>"+empresa.getListCliente().get(i).getDireccion()+"</td><td>"+empresa.getListCliente().get(i).getCredito()
   							+"</td></tr>");	
	   		   }
	   		%>
		</table>
    </section>
    
    <form action="JSP/menu.jsp" method="post">
        <input type="submit" value="Volver" >
    </form> <br>
	
	
	
</body>
</html>