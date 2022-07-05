<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="cabecera.jsp"/>

<div class="container">

<h3>Lista de Empleados</h3>

<a href="/form_empleado">Crear Empleado</a>

<table class="table">

<thead>
<th>Nombre</th>
<th>Apellidos</th>
<th>Cargo</th>
<th>Fecha Nacimiento</th>
<th>Salario</th>
<th>Tipo ID</th>
<th>No Identificacion</th>
<th>Editar</th>
<th>Eliminar</th>
<th>Usuario</th>



</thead>
<tbody>
<c:forEach items="${listaEmpleados}" var="emp" >

<tr>
<td>${emp.getNombre()}</td>
<td>${emp.getApellidos()}</td>
<td>${emp.getCargo()}</td>
<td>${emp.getFechaNacimiento()}</td>
<td>${emp.getSalario()}</td>
<td>${emp.getTipoID()}</td>
<td>${emp.getId_user()}</td>
<td><a href="/editar_empleado?id=${emp.getId()}"><button type="button" class="btn btn-primary">Editar</button></a></td>
<td><a href="/eliminar_empleado?id=${emp.getId()}"><button type="button" class="btn btn-danger">Eliminar</button></a></td>
<td><a href="/crear_user?id=${emp.getId()}"><button type="button" class="btn btn-success">Usuario</button></a></td>


</tr>


</c:forEach>

</tbody>


</table>



</div>




<jsp:include page="pie.jsp"/>