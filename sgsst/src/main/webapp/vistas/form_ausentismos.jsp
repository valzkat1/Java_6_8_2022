<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<jsp:include page="cabecera.jsp"/>


<div class="container">
 
 <h3>Registrar Incapacidad</h3>
 <form:form modelAttribute="ausentismo" method="POST" action="/form_incapacidad">
 


 
 <br/>
    <label class="form-label" >Salario</label>
 <form:input type="text"  class="form-control form-control-lg" path="salario"
              />         
            <form:errors path="salario" class="errores"></form:errors>
            
    <br/>        
            
       <label class="form-label" >Cargo</label>
 <form:input type="text"  class="form-control form-control-lg" path="cargo"
              placeholder="Cargo" />         
            <form:errors path="cargo" class="errores"></form:errors>        
 
 <br/>
 
 
<%--         <label class="form-label" >Clave</label>
 <form:input type="text"  class="form-control form-control-lg" path="clave"
              placeholder="clave" />         
            <form:errors path="clave" class="errores"></form:errors> --%>        
 
 <br/>
 
 
         <label class="form-label" >Area de Trabajo</label>
 <form:select path="areaEmpleado" class="form-select">
  <form:option value="">Seleccionar</form:option>
 <form:option value="ADMINISTRACION">ADMINISTRACION</form:option>
 <form:option value="SISTEMAS">SISTEMAS</form:option>
 <form:option value="OFICIOS">OFICIOS</form:option>
 <form:option value="BRIGADA">BRIGADA DE EMERGENCIA</form:option>
 </form:select>         
            <form:errors path="areaEmpleado"></form:errors>    
 <!-- -->
 
       <label class="form-label" >Fecha Nacimiento</label>
 <form:input type="date"  class="form-control form-control-lg" path="fechaNacimiento"
               />         
            <form:errors path="fechaNacimiento" class="errores"></form:errors>        
 
 
 
 <br/>
 
 <form:button type="submit" class="btn btn-primary">Enviar</form:button>
 
 
 </form:form>


</div>



<jsp:include page="pie.jsp"/>