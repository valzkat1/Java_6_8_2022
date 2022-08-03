<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="cabecera.jsp"/>

<div class="container">

<h3>Lista de Usuarios</h3>



<table class="table">

<thead>
<th>Nombre Usuario</th>
<th>Clave</th>
<c:if test="${permiso.getDelete()}">
<th>Eliminar</th>
<th>Editar</th>
</c:if>


</thead>
<tbody>
<c:forEach items="${listaEmpleados}" var="emp" >

<tr>
<td>${emp.getUsername()}</td>
<td>${emp.getPassword()}</td>
<c:if test="${permiso.getDelete()}">
<td><button type="button" onclick="confirmarEliminaUser(${emp.getId()})" class="btn btn-danger">Eliminar</button></td>
<td><a href="/editar_user?id=${emp.getId()}"><button type="button" class="btn btn-success">Editar</button></a></td>
</c:if>

</tr>


</c:forEach>

</tbody>


</table>



</div>

<script>

function confirmarEliminaUser(idEm){
	console.log(idEm);
	
	if(confirm("Esta seguro de eliminar el usuario?")){
		window.location.href="/eliminar_user?id="+idEm;
	}else{}
	
	//return Confirm("Esta seguro de eliminar el usuario?");
	
}

</script>


<jsp:include page="pie.jsp"/>