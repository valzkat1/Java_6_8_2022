<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/promedios" method="POST">
<h3>Calculo de promedios 2</h3>
<p>
Nombre:  <input type="text"  name="nombre"/>
</p>

<p>
Cantidad Notas:  <input type="number"  name="cantidad" />
</p>


<button type="submit">Enviar</button>

</form>


<hr/>
${estudiante}  ->  ${promedio }




</body>
</html>