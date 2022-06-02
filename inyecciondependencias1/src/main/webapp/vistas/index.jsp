<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><h3>${estudiante.getNombre()}</h3></center>

${estudiante.toString()}

<br/>

<a href="/menu">Ir al menu</a>

<br/>

<a href="/usuarios/crear">Ir a Usuarios</a>


<br/>

<a href="/usuarios/crearMVC">Ir a Usuarios MVC</a>


</body>
</html>