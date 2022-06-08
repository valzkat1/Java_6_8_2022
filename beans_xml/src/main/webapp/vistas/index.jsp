<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuarios</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>

<div class="container">

<form:form  action="/procesarUsuario"  method="POST"  modelAttribute="usu">

<fieldset >
<legend>Informacion personal</legend>
<label  class="form-label" >Nombre:</label>
<form:input type="text" name="nombre"  path="nombre"   class="form-control"/>

<label  class="form-label">Apellidos:</label>
<form:input type="text" name="apellidos" path="apellidos"  class="form-control"/>

</fieldset>
<hr/>
<center><button type="submit" class="btn btn-primary">Enviar</button>
</center>

</form:form>

</div>
${texto1 }

<br/>
${texto2 }

<br/>
${texto3 }
   
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>