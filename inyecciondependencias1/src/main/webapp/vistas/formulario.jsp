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

<form  action="/usuarios/crear" method="POST">

<p>
Nombre: <input type="text" name="nombre"/>

</p>
<p>
Edad: <input type="number" name="edad"/>

</p>

<p>
<button type="submit">Enviar</button>
</p>

</form>

</body>
</html>