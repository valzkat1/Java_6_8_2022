<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="cabecera.jsp"/>

<div class="container">

<h3>Reporte Estado de cuentas (${fechas})</h3>



<table class="table">

  <thead class="table-dark">
<th>EPS</th>

<th>ARL</th>
<th>Fondo Pensiones</th>

<th>Empresa</th>









</thead>
<tbody>
<c:forEach items="${listaIncapacidades}" var="emp" >

<tr>




<td style="font-size:80%"><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getEPS()}" /></td>

<td ><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getEPS()}" /></td>

<td><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getEPS()}" /></td>
<td><fmt:formatNumber type = "number" 
         maxFractionDigits = "2" value = "${emp.getEPS()}" /></td>




</tr>


</c:forEach>

</tbody>


</table>



</div>




<jsp:include page="pie.jsp"/>