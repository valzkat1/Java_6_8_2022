<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>

<div class="container">

<h2>Listado de usuarios</h2>

<table class="table">
<thead>
<th>Id</th>
<th>Nombre</th>
<th>Email</th>
<th>Edad</th>
<th>Editar</th>
<th>Eliminar</th>
</thead>

<tbody>
<c:forEach items="${listaUsuarios}" var="us" >
<tr>
<td><c:out value="${us.getId()}"></c:out>   </td>
<td><c:out value="${us.getNombre()}"></c:out>  </td>
<td><c:out value="${us.getEmail()}"></c:out></td>
<td><c:out value="${us.getEdad()}"></c:out>  </td>
<td> <input type="button" value="Editar" class="btn btn-secondary"/> </td>
<td> <input type="button" value="Eliminar" class="btn btn-danger"/> </td>

</tr>
</c:forEach>


</tbody>
</table>



</div>




 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</body>
</html>