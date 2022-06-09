<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<style type="text/css">

.errores{
color:red;
}

</style>
</head>
<body>
<br/>
<center>
<div id="container">

<form:form action="/validaciones" method="POST" modelAttribute="persona">

<div class="mb-3">
<label class="form-label">Nombre</label>
  <form:input name="nombre" path="nombre"  />
  <br/>
  <form:errors path="nombre" class="errores"></form:errors>
</div>

<div class="mb-3">
<label class="form-label">Apellidos</label>
<form:input name="apellidos" path="apellidos"  />
<br/>
<form:errors path="apellidos" class="errores"></form:errors>
</div>


<div class="mb-3">
<label class="form-label">Edad</label>
<form:input name="edad" path="edad"  />
<br/>
<form:errors path="edad" class="errores"></form:errors>
</div>


<div class="mb-3">
<label class="form-label">Email</label>
<form:input name="email" path="email"  />
<br/>
<form:errors path="email" class="errores"></form:errors>
</div>

<div class="mb-3">
<label class="form-label">Telefono</label>
<form:input name="telefono" path="telefono"  />
<br/>
<form:errors path="telefono" class="errores"></form:errors>
</div>


<div class="mb-3">
<label class="form-label">Expresion regular</label>
<form:input name="clave" path="clave"  />
<br/>
<form:errors path="clave" class="errores"></form:errors>
</div>


<button type="submit" value="Enviar" class="btn btn-primary">Enviar</button>


</form:form>


</div>

</center>


 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>