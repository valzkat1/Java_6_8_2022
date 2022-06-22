<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>

<div class="container">

<h2>Editar Usuario</h2>

<form:form modelAttribute="usuario" method="POST" action="/formuluario">

<label>Nombre:</label>
<form:input path="nombre" type="text"  class="form-control"/>

<label>Email:</label>
<form:input path="email" type="text"  class="form-control"/>


<label>Edad:</label>
<form:input path="edad" type="text"  class="form-control"/>

<label>Clave:</label>
<form:input path="clave" type="text"  class="form-control"/>



<form:hidden path="id"  />

<hr/>
<button value="Guardar" class="btn btn-primary">Guardar</button>


</form:form>


</div>




 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>