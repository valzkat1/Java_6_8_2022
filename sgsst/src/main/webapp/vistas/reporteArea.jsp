<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="cabecera.jsp"/>

<center><h3>Reporte por Area de Trabajo</h3></center>

<br/>
<hr/>
<form action="/reporteAreas" method="POST">
<div class="container">
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Seleccionar Area de trabajo</span>
  <select class="form-select" name="area">
     <option value="ADMINISTRACION">ADMINISTRACION</option>
     <option value="SISTEMAS">SISTEMAS</option>
     <option value="OFICIOS">OFICIOS</option>
     <option value="BRIGADA">BRIGADA DE EMERGENCIA</option> 
     
    <!--   <option value="0">ADMINISTRACION</option>
     <option value="1">SISTEMAS</option>
     <option value="2">OFICIOS</option>
     <option value="3">BRIGADA DE EMERGENCIA</option> -->
  </select>
</div>
</div>
<br/>
<center><button type="submit" class="btn btn-primary">Enviar</button></center>c
</form>



<jsp:include page="pie.jsp"/>