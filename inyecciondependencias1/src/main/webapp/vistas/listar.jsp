<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<ul>
<c:forEach  items="${listaEstudiantes}" var="estu">
<li> ${estu.toString()} </li>

</c:forEach>
</ul>

<br/>
<a href="/usuarios/crear">Formulario</a>

<br/>
<a href="/usuarios/crearMVC">Formulario2</a>


</body>
</html>