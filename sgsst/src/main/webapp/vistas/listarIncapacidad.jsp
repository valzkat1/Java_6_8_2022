<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="cabecera.jsp"/>

<div class="container">

<h3>Lista de Incapacidades</h3>

<a href="/form_incapacidad">Registrar Incapacidad</a>

<table class="table">

<thead>
<th>Nombre</th>

<th>Cargo</th>
<th>Fecha Inicial</th>

<th>Total Dias</th>

<th>SalarioDia</th>
<th>EPS</th>
<th>Diagnostico</th>
<th>Clasificacion</th>
<th>$ Empresa</th>
<th>$ EPS</th>
<th>$ ARL</th>
<c:if test="${permiso.getDelete()}">
<th>Editar</th>
<th>Eliminar</th>

</c:if>


</thead>
<tbody>
<c:forEach items="${listaIncapacidades}" var="emp" >

<tr>
<td>${emp.getNombre()} ${emp.getApellidos()}</td>

<td>${emp.getCargo()}</td>
<td style="font-size:60%">${emp.getFechaInicio()}</td>

<td>${emp.getTotalDias()}</td>

<td style="font-size:80%"><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getSalarioDia()}" /></td>
<td>${emp.getEPS()}</td>
<td style="font-size:60%">${emp.getDiagnostico().getDiagnostico()}</td>
<td>${emp.getClasificacion()}</td>
<td><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getAsumidoEmpresa()}" /></td>
<td><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getTotalEPS()}" /></td>
<td><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getTotalARL()}" /></td>
         
 <c:if test="${permiso.getDelete()}">        
<td><a href="/editar_incapacidad?id=${emp.getId()}"><button type="button" class="btn btn-primary">Editar</button></a></td>
<td><a href="/eliminar_incapacidad?id=${emp.getId()}"><button type="button" class="btn btn-danger">Eliminar</button></a></td>

</c:if>
</tr>


</c:forEach>

</tbody>


</table>



</div>




<jsp:include page="pie.jsp"/>