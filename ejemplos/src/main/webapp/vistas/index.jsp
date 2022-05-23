<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/formulario" method="POST">
<h3>Calculo de promedios</h3>
<p>
Nombre:  <input type="text"  name="nombre"/>
</p>

<p>
Nota 1:  <input type="number"  name="n1" step="0.1"/>
</p>

<p>
Nota 2:  <input type="number"  name="n2" step="0.1"/>
</p>

<p>
Nota 3:  <input type="number"  name="n3" step="0.1"/>
</p>

<button type="submit">Enviar</button>

</form>


<hr/>
${estudiante}  ->  ${promedio }

<br/>
<a href="/promedios">Promedios 2</a>

</body>
</html>