<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="cabecera.jsp"/>

<div class="container">

<h3>Lista de Incapacidades</h3>

<a href="/form_incapacidad">Registrar Incapacidad</a>

<table class="table">

<thead>
<th>Nombre</th>
<th>Apellidos</th>
<th>Cargo</th>
<th>Fecha Inicial</th>
<th>Fecha Final</th>
<th>Total Dias</th>
<th>Salario</th>
<th>SalarioDia</th>
<th>EPS</th>
<th>Diagnostico</th>
<th>Clasificacion</th>
<th>$ Empresa</th>
<th>$ EPS</th>
<th>$ ARL</th>
<th>Clasificacion</th>
<th>Editar</th>
<th>Eliminar</th>




</thead>
<tbody>
<c:forEach items="${listaIncapacidades}" var="emp" >

<tr>
<td>${emp.getNombre()}</td>
<td>${emp.getApellidos()}</td>
<td>${emp.getCargo()}</td>
<td style="font-size:60%">${emp.getFechaInicio()}</td>
<td style="font-size:60%">${emp.getFechaFin()}</td>
<td>${emp.getTotalDias()}</td>
<td>${emp.getSalario()}</td>
<td style="font-size:70%">${emp.getSalarioDia()}</td>
<td>${emp.getEPS()}</td>
<td style="font-size:60%">${emp.getDiagnostico().getDiagnostico()}</td>
<td>${emp.getClasificacion()}</td>
<td>${emp.getAsumidoEmpresa()}</td>
<td>${emp.getTotalEPS()}</td>
<td>${emp.getTotalARL()}</td>
<td><a href="/editar_incapacidad?id=${emp.getId()}"><button type="button" class="btn btn-primary">Editar</button></a></td>


</tr>


</c:forEach>

</tbody>


</table>



</div>




<jsp:include page="pie.jsp"/>