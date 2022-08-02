<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="cabecera.jsp"/>

<div class="container">

<h3>Reporte por Tipo de Incapacidad (${area})</h3>



<table class="table">

  <thead class="table-dark">
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



</tr>


</c:forEach>

</tbody>


</table>



</div>




<jsp:include page="pie.jsp"/>