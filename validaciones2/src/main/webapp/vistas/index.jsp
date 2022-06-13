<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>

<div class="container">
 
 <h2>Validaciones Propias</h2>
 
 <form:form method="POST" action="/validar" modelAttribute="persona" >
 
 Nombre: <form:input type="text" name="nombre" path="nombre" class="form-control"/>
 <form:errors path="nombre"></form:errors>
 Telefono: <form:input path="telefono" name="telefono" class="form-control"/>
 <form:errors path="telefono"></form:errors>
 
 Email: <form:input path="email" name="email" class="form-control"/>
 <form:errors path="email"></form:errors>
 
 <hr/>
 
 <input type="submit" value="Enviar" class="btn btn-primary" />
 </form:form>


</div>



 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>